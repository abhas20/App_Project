package com.example.avaine

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class login : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        val btn=findViewById<MaterialButton>(R.id.btnLogin)
        val uname=findViewById<EditText>(R.id.uname)
        val pass=findViewById<EditText>(R.id.pass)

        btn.setOnClickListener{
            if(isValid(uname,pass)){
                Toast.makeText(this, "Welcome ${uname.text}", Toast.LENGTH_SHORT).show()
                var intent=Intent(this,MainActivity::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(this, "All fields are required", Toast.LENGTH_SHORT).show()
            }
        }
    }
    private fun isValid(vararg editText:EditText): Boolean {
        var isValid=true
        for ( i in editText){
            if(i.text.isNullOrEmpty()){
                i.error="This field is required"
                isValid=false
            }
        }
        return isValid
    }
}