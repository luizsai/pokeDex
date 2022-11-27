package br.com.up.pokedex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import br.com.up.pokedex.network.PokeApi
import com.google.android.material.chip.Chip
import com.squareup.picasso.Picasso

class PokemonDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokemon_details)

        val pokemon = intent.getStringExtra("pokemon")

        PokeApi().getPokemonByName(pokemon!!){
                pokemon ->

            if(pokemon != null){

                val url = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/${pokemon.id}.png"

                val imageView : ImageView = findViewById(R.id.PokeImagem)
                Picasso.get().load(url).into(imageView)

                val textName : TextView = findViewById(R.id.TextName)
                textName.text = pokemon.name


                val chipName : Chip = findViewById(R.id.ChipNome)
                chipName.text = pokemon.name









            }
        }
    }
}