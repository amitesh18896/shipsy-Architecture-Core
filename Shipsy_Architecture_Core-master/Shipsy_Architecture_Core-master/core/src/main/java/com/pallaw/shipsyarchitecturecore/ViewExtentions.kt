package com.pallaw.shipsyarchitecturecore

import android.view.View

fun View.toggleVisibilityGone(isVisible : Boolean){
    this.visibility = if (isVisible) View.VISIBLE else View.GONE
}

fun View.toggleVisibilityInvisible(isVisible : Boolean){
    this.visibility = if (isVisible) View.VISIBLE else View.INVISIBLE
}