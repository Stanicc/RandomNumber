package stanic.randomnumber

import android.app.Activity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onAboveClick(view: View) {
        number.text = RandomNumber().getAbove().toString()
    }

    fun onBelowClick(view: View) {
        number.text = RandomNumber().getBelow().toString()
    }

}