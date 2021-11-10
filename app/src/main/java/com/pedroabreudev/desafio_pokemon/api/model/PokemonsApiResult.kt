package com.pedroabreudev.desafio_pokemon.api.model

data class PokemonsApiResult(
    val results: List<PokemonResult>
)

data class PokemonResult(
    val name: String,
    val url: String
)

data class PokemonApiResult(
    val id: Int,
    val name: String,
)