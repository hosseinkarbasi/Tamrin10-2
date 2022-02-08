package com.example.netflix

import android.view.View
import androidx.databinding.BindingAdapter

@BindingAdapter("visibilityCardView")
fun goneUnless(view: View, visible: Boolean) {
    view.visibility = if (visible) View.VISIBLE else View.GONE
}