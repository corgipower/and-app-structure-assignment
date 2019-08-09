package com.lambdaschool.android.organization.util

import java.text.NumberFormat
import java.util.*

class TextUtils {
    companion object {
        // TODO: format the currency using NumberFormat.getCurrencyInstance - refer to the docs
        fun formatCurrency(price : Double) : String {
            val nf = NumberFormat.getCurrencyInstance(Locale.US)
            return nf.format(price)
        }

        // TODO: format the percent using NumberFormat.getPercentInstance - refer to the docs
        fun formatPercent(discount : Double) : String {
            val nf = NumberFormat.getPercentInstance(Locale.US)
            return nf.format(discount)
        }
    }
}