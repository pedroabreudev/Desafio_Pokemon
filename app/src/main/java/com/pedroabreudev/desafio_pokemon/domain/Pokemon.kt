package com.pedroabreudev.desafio_pokemon.domain

data class Pokemon(
    val number: Int,
    val name: String,
){
    val imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/$number.png"
}
