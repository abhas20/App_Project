package com.example.avaine

import android.content.Intent
import android.opengl.ETC1.isValid
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class sign : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign)
        val btn=findViewById<MaterialButton>(R.id.btnSign)
        val t1=findViewById<EditText>(R.id.name)
        val t2=findViewById<EditText>(R.id.uname)
        val t3=findViewById<EditText>(R.id.pass)
        val t4=findViewById<EditText>(R.id.conPass)
        btn.setOnClickListener{
            if(isValid(t1,t2,t3,t4)){
                Toast.makeText(this, "Successfully! Registered", Toast.LENGTH_SHORT).show()
                var intent= Intent(this,MainActivity::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(this,"Please fill all the fields",Toast.LENGTH_SHORT).show()
            }
        }

    }
    private fun isValid(vararg editTexts:EditText): Boolean {
        var isValid = true

        for (editText in editTexts) {
            if (editText.text.isNullOrEmpty()) {
                editText.error = "This field is required"
                isValid = false
            } else {
                editText.error = null
            }
        }

        return isValid
    }

}
