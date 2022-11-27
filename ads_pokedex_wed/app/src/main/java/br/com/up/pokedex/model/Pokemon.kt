package br.com.up.pokedex.model

import javax.net.ssl.SSLEngineResult.Status

data class Pokemon(
    val url : String,
    val name : String,
    val id : String,
    val types : String

)

