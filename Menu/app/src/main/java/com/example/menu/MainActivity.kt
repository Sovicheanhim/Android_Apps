package com.example.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate(R.menu.my_menu, menu)
//        return super.onCreateOptionsMenu(menu)
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        when(item.itemId){
//            R.id.option1 ->{
//                Toast.makeText(this, "You clicked Pizza", Toast.LENGTH_LONG).show()
//                val i = Intent(this, PizzaActivity::class.java)
//                startActivity(i)
//            }
//            R.id.option2 ->{
//                Toast.makeText(this, "You clicked Salad", Toast.LENGTH_LONG).show()
//                val i = Intent(this, SaladActivity::class.java)
//                startActivity(i)
//            }
//            R.id.option3 ->{
//                Toast.makeText(this, "You clicked Hamburger", Toast.LENGTH_LONG).show()
//                val i = Intent(this, HamburgerActivity::class.java)
//                startActivity(i)
//            }
//
//        }
//        return super.onOptionsItemSelected(item)
//    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.my_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.option1 ->{
                Toast.makeText(this, "Pizza", Toast.LENGTH_SHORT).show()
            }
            R.id.option2 ->{
                Toast.makeText(this, "Salad", Toast.LENGTH_SHORT).show()
            }
            R.id.option3 ->{
                Toast.makeText(this, "Hamburger", Toast.LENGTH_SHORT).show()
            }
        }
        return super.onOptionsItemSelected(item)
    }


}
