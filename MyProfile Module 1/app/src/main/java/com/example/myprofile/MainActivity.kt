package com.example.myprofile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
          var photo: ImageView?=null
          var edubutton: Button?=null
           var workButton: Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homescreen)
        photo=findViewById(R.id.profileText)
        photo?.setOnClickListener({
            var clickIntent=Intent(this@MainActivity,profilePhoto::class.java)
            startActivity(clickIntent)
        })
        edubutton=findViewById((R.id.eductationId))
        edubutton?.setOnClickListener({
            var clickIntent=Intent(this@MainActivity,education::class.java)
            startActivity((clickIntent))
        })
        workButton=findViewById(R.id.workexpId)
        workButton?.setOnClickListener({
            var clickIntent=Intent(this@MainActivity,workexperience::class.java)
            startActivity(clickIntent)
        })
    }
}
