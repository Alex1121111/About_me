package com.example.about_me

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.Button).setOnClickListener{
            addNickname(it)
        }
    }
    private fun  addNickname(view: View)
    {
        val editText=findViewById<EditText>(R.id.edit)
        val  textView=findViewById<TextView>(R.id.nick_name)
        textView.text=editText.text
        editText.visibility=View.GONE
        textView.visibility=View.VISIBLE
        findViewById<Button>(R.id.Button).visibility=View.GONE
    val imm=getSystemService(Context.INPUT_METHOD_SERVICE)as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken,0)
    }

}
