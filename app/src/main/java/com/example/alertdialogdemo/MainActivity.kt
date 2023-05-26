package com.example.alertdialogdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun fun1(view: View) {
        var b=AlertDialog.Builder(this)
        b.setTitle("Confirm?")
        b.setMessage("Are you realy want to submit?")
        b.setIcon(R.drawable.cocsitlogo)
        b.setPositiveButton("Yes"){
            dialoginterface,
            which->Toast.makeText(applicationContext,"You Selected Yes",
            Toast.LENGTH_LONG).show()
            var i=Intent(applicationContext,MainActivity2::class.java)
            startActivity(i)
        }
        b.setNegativeButton("No"){
                dialoginterface,
                which->Toast.makeText(applicationContext,"You Selected No",
            Toast.LENGTH_LONG).show()
        }
        var d=b.create()
        d.show()
    }
}