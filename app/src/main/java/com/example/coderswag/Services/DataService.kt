package com.example.coderswag.Services

import com.example.coderswag.Models.Category
import com.example.coderswag.Models.Product

object DataService {

    val categories = listOf(

        Category("SHIRTS", "shirtimage"),
        Category("HATS", "hatimage"),
        Category("HOODIES", "hoodieimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(

        Product("Graphic Beanie black", "$18", "hat01"),
        Product("Graphic Beanie white", "$20", "hat02"),
        Product("Beanie Snapback", "$22", "hat03"),
        Product("Cammo Beanie green", "$18", "hat04")
    )
    val hoodies = listOf(

        Product("Simple grey Hoodie", "$35", "hoodie01"),
        Product("Simple black Hoodie", "$35", "hoodie02"),
        Product("graphic cammo Hoodie", "$28", "hoodie03"),
        Product("My rules graphic Hoodie", "$37", "hoodie04")
    )
    val shirts = listOf(

        Product("Grey Shirt", "$25", "shirt01"),
        Product("Black Shirt", "$25", "shirt02"),
        Product("Graphic logo Shirt", "$28", "shirt03"),
        Product("'My rules' graphic Shirt", "$28", "shirt04"),
        Product("Kickflip Studios", "$30", "shirt05")
    )
}