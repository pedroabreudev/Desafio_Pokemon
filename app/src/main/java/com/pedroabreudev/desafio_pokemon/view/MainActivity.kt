package com.pedroabreudev.desafio_pokemon.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pedroabreudev.desafio_pokemon.R
import com.pedroabreudev.desafio_pokemon.domain.Pokemon

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.pokemon_recyclerView)

        val pikachu = Pokemon(
            25,
            "Pikachu"
        )

        val pokemons = listOf(pikachu, pikachu, pikachu, pikachu, pikachu, pikachu)

        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = PokemonAdapter(pokemons)
    }
}