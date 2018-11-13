package com.nishapandey.hellonisha

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      for ( i in 0..100)
      {

          if ( i%15==0)
          {

              Log.i("Fizzbuzz",i.toString());
          }


          if ( i%3==0)
          {

              Log.i("Fizz",i.toString());
          }
          if ( i%5==0)
          {

              Log.i("Buzz",i.toString());
          }

      }

    }


    fun loginClick(view : View){

        Log.i("Hi","hinisha");

        Toast.makeText(this,"yay",Toast.LENGTH_SHORT).show()

    }


    fun newClick(view : View) {

      val intent = Intent(this,Main2Activity::class.java);

        startActivity(intent)


    }




}
