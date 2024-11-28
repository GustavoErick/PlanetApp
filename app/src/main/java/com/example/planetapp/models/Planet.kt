package com.example.planetapp.models

import com.example.planetapp.R

data class Planet(
    val id: Int,
    val name: String,
    val type: String,
    val galaxy: String,
    val distanceFromSun: String,
    val diameter: String,
    val characteristics: String,
    val imageRes: Int,
    var isFavorite: Boolean = false
)

val planetList = listOf(
    Planet(
        id = 1,
        name = "Terra",
        type = "Terrestre",
        galaxy = "Via Láctea",
        distanceFromSun = "149,6 milhões de km",
        diameter = "12.742 km",
        characteristics = "Suporta vida, possui água e atmosfera.",
        imageRes = R.drawable.terra
    ),
    Planet(
        id = 2,
        name = "Mercúrio",
        type = "Terrestre",
        galaxy = "Via Láctea",
        distanceFromSun = "57,91 milhões de km",
        diameter = "4.880 km",
        characteristics = "Planeta mais próximo do Sol, sem atmosfera, temperaturas extremas.",
        imageRes = R.drawable.mercurio
    ),
    Planet(
        id = 3,
        name = "Vênus",
        type = "Terrestre",
        galaxy = "Via Láctea",
        distanceFromSun = "108,2 milhões de km",
        diameter = "12.104 km",
        characteristics = "Tamanho semelhante ao da Terra, atmosfera densa, superfície extremamente quente.",
        imageRes = R.drawable.venus
    ),
    Planet(
        id = 4,
        name = "Marte",
        type = "Terrestre",
        galaxy = "Via Láctea",
        distanceFromSun = "227,9 milhões de km",
        diameter = "6.779 km",
        characteristics = "Conhecido como 'Planeta Vermelho', possui o maior vulcão do sistema solar.",
        imageRes = R.drawable.marte
    ),
    Planet(
        id = 5,
        name = "Júpiter",
        type = "Gigante Gasoso",
        galaxy = "Via Láctea",
        distanceFromSun = "778,5 milhões de km",
        diameter = "139.820 km",
        characteristics = "Maior planeta, possui a Grande Mancha Vermelha, várias luas.",
        imageRes = R.drawable.jupiter
    ),
    Planet(
        id = 6,
        name = "Saturno",
        type = "Gigante Gasoso",
        galaxy = "Via Láctea",
        distanceFromSun = "1,43 bilhões de km",
        diameter = "116.460 km",
        characteristics = "Famoso por seus anéis, possui várias luas.",
        imageRes = R.drawable.saturno
    ),
    Planet(
        id = 7,
        name = "Urano",
        type = "Gigante de Gelo",
        galaxy = "Via Láctea",
        distanceFromSun = "2,87 bilhões de km",
        diameter = "50.724 km",
        characteristics = "Roda de lado, cor azul pálida.",
        imageRes = R.drawable.urano
    ),
    Planet(
        id = 8,
        name = "Netuno",
        type = "Gigante de Gelo",
        galaxy = "Via Láctea",
        distanceFromSun = "4,50 bilhões de km",
        diameter = "49.244 km",
        characteristics = "Cor azul intensa, ventos mais rápidos do sistema solar.",
        imageRes = R.drawable.netuno
    ),
    Planet(
        id = 9,
        name = "Plutão",
        type = "Planeta Anão",
        galaxy = "Via Láctea",
        distanceFromSun = "5,91 bilhões de km",
        diameter = "2.377 km",
        characteristics = "Pequeno e gelado, não é mais classificado como planeta.",
        imageRes = R.drawable.plutao
    )
)


