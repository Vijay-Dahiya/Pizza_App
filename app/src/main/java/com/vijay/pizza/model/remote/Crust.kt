package com.vijay.pizza.model.remote

import android.util.Size
import com.google.gson.annotations.SerializedName

data class Crust(
    @SerializedName("defaultSize")
    val defaultSize: Int,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("sizes")
    val sizes: List<Size>
)