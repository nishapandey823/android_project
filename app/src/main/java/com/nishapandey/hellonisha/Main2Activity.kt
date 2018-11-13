package com.nishapandey.hellonisha

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun toastClick (view : View){

        Toast.makeText(this,"Hay",Toast.LENGTH_SHORT).show()


    }



}
