package com.GuyL.strartup

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import android.view.View
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
     /*   FindAgeBtn.setOnClickListener {
            var year:Int = DOBTxt.text!!.toString().toInt()
            val crntYR:Int =  Calendar.getInstance().get(Calendar.YEAR)
            var age = crntYR- year
            txtAge.text ="Your age is $age years"
        }
        */
    }
   fun findAge (view:View){
       var year:Int = DOBTxt.text!!.toString().toInt()
       val crntYR:Int =  Calendar.getInstance().get(Calendar.YEAR)
       var age = crntYR- year
       txtAge.text ="Your age is $age years"
   }
}
