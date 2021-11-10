package com.pedroabreudev.desafio_pokemon.view


import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.pedroabreudev.desafio_pokemon.R
import com.pedroabreudev.desafio_pokemon.domain.Pokemon

class PokemonAdapter(
    private val items: List<Pokemon?>
) : RecyclerView.Adapter<PokemonAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.pokemon_item, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]

        holder.bindView(item)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(item: Pokemon?) = with(itemView) {
            val pokemonImage = findViewById<ImageView>(R.id.pokemon_image)
            val pokemonName = findViewById<TextView>(R.id.pokemon_name)
            val pokemonNumber = findViewById<TextView>(R.id.pokemon_number)

            item?.let {
                Glide.with(itemView.context).load(it.imageUrl).into(pokemonImage)

                pokemonName.text = item.name
                pokemonNumber.text = "${item.number}"

            }
        }
    }
}