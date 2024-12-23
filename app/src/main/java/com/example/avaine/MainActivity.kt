package com.example.avaine

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var btn=findViewById<MaterialButton>(R.id.btnLogin)
        var btn2=findViewById<MaterialButton>(R.id.btnSign)
        var fwd=findViewById<ImageButton>(R.id.imageButton2)
        var bck=findViewById<ImageButton>(R.id.imageButton1)
        btn.setOnClickListener{
            Toast.makeText(this, "WELCOME", Toast.LENGTH_SHORT).show()
            var intent=Intent(this,login::class.java)
            startActivity(intent)
        }
        btn2.setOnClickListener{
            var intent=Intent(this,sign::class.java)
            startActivity(intent)
        }
        fwd.setOnClickListener{
            findViewById<ImageView>(R.id.change).setImageResource(R.drawable.car)
        }
        bck.setOnClickListener{
            findViewById<ImageView>(R.id.change).setImageResource(R.drawable.img)
        }
    }
}