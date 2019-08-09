package com.lambdaschool.android.organization.model

import java.util.*

class Product (
    var productName: String = "Shirt",
    var productDescription: String = "Red and White Flowers",
    var productPrice: Double = 8.50,
    var productTax: Double = 0.01,
    var productDiscount: Double = 0.25,
    val orderDate: Date = Date()
    )