package com.example.colourmyview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color for the background


            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.GREEN)
            R.id.box_six_text -> view.setBackgroundColor(Color.CYAN)
            R.id.box_seven_text -> view.setBackgroundColor(Color.RED)
            R.id.box_eight_text -> view.setBackgroundColor(Color.YELLOW)
            R.id.box_nine_text -> view.setBackgroundColor(Color.BLACK)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

    private fun setListeners() {

        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)
        val boxSixText = findViewById<TextView>(R.id.box_six_text)
        val boxSevenText = findViewById<TextView>(R.id.box_seven_text)
        val boxEightText = findViewById<TextView>(R.id.box_eight_text)
        val boxNineText = findViewById<TextView>(R.id.box_nine_text)
        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)


            val clickableViews: List<View> =
                listOf(
                    boxOneText, boxTwoText, boxThreeText,
                    boxFourText, boxFiveText, boxSixText,
                    boxSevenText, boxEightText, boxNineText, rootConstraintLayout
                )

            for (item in clickableViews) {
                item.setOnClickListener { makeColored(it) }
            }

    }

}

