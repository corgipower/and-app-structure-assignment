package com.lambdaschool.android.organization.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.lambdaschool.android.organization.R
import com.lambdaschool.android.organization.application.LambdaApplication
import com.lambdaschool.android.organization.model.Product
import com.lambdaschool.android.organization.util.DateUtils
import com.lambdaschool.android.organization.util.TextUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Product Details"
        setContentView(R.layout.activity_main)
        displayProductDetails((application as LambdaApplication).appProduct)
    }

    private fun displayProductDetails(product: Product) {
        // set each of the fields on the corresponding TextViews from the layout
        // use the appropriate Util methods for formatting the fields
        val tax = product.productPrice * product.productTax
        val priceWithTax = product.productPrice + tax

        productName.text = product.productName
        productDescription.text = product.productDescription
        productPrice.text = TextUtils.formatCurrency(product.productPrice)
        productTax.text = TextUtils.formatPercent(product.productTax)
        totalProductPrice.text = TextUtils.formatCurrency(priceWithTax)
        productDiscount.text = TextUtils.formatPercent(product.productDiscount)
        orderDate.text = DateUtils.formatDate(product.orderDate)
    }
}
