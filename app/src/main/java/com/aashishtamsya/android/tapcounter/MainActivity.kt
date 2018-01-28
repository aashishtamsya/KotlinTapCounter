package com.aashishtamsya.android.tapcounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
  }

  protected fun plusButtonSelected(view: View) {
    var currentNumber = textViewCount.text.toString().toInt()
    currentNumber = currentNumber + 1
    textViewCount.setText(currentNumber.toString())
  }

  protected fun minusButtonSelected(view: View) {
    var currentNumber = textViewCount.text.toString().toInt()
    currentNumber = currentNumber - 1
    textViewCount.setText(currentNumber.toString())
  }

  protected fun resetButtonSelected(view: View) {
    textViewCount.setText(0.toString())
  }
}