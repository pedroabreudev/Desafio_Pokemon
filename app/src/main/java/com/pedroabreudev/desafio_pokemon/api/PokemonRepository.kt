package com.pedroabreudev.desafio_pokemon.api

import com.pedroabreudev.desafio_pokemon.api.model.PokemonApiResult
import com.pedroabreudev.desafio_pokemon.api.model.PokemonsApiResult
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object PokemonRepository {
    private val service: PokemonService
    private const val BASE_URL = "https://pokeapi.co/api/v2/"
    private const val POKEMON_LIMIT = 151

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        service = retrofit.create(PokemonService::class.java)
    }

    fun listPokemons(limit: Int = POKEMON_LIMIT): PokemonsApiResult? {
        val call = service.listPokemons(limit)

        return call.execute().body()
    }

    fun getPokemon(number: Int): PokemonApiResult? {
        val call = service.getPokemon(number)

        return call.execute().body()
    }

}