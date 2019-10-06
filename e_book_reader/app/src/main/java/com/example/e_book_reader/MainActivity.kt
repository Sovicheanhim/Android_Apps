package com.example.e_book_reader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var currentPage = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayBook.setImageResource(R.drawable.hp_hc_new_1)
    }
    fun buttonClick(view: View){

        if(currentPage>=1 && currentPage <=5){
            when(view.id){
                R.id.backButton -> {
                    Log.d("asdf","asdf")
                    if(currentPage == 1) currentPage = 5 else currentPage -= 1
                    openPage(currentPage)
                }
                R.id.nextButton -> {
                    Log.d("nextPage", "nextButton")
                    if(currentPage == 5) currentPage = 1 else currentPage += 1
                    openPage(currentPage)
                }
                R.id.gotoPage ->{
                    if (!pageNumber.text.isEmpty()) currentPage = pageNumber.text.toString().toInt()
                    openPage(currentPage)
                }
            }
        }

    }
    fun openPage(currentPage:Int){
        when(currentPage){
            1 -> displayBook.setImageResource(R.drawable.hp_hc_new_1)
            2 -> displayBook.setImageResource(R.drawable.hp_hc_new_2)
            3 -> displayBook.setImageResource(R.drawable.hp_hc_new_3)
            4 -> displayBook.setImageResource(R.drawable.hp_hc_new_4)
            5 -> displayBook.setImageResource(R.drawable.hp_hc_new_5)
        }
    }
}
