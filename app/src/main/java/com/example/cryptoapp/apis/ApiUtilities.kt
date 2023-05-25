package com.example.cryptoapp.apis

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object ApiUtilities {

     fun grtInstance() : Retrofit {
         return Retrofit.Builder()
             .baseUrl("https://api.coinmarketcap.com")
             .addConverterFactory(GsonConverterFactory.create())
             .build()
     }
}