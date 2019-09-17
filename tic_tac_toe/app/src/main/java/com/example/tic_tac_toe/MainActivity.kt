package com.example.tic_tac_toe

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun resetGame(view: View){

    }
    fun buttonClick(view: View){
        val butSelected = view as Button
        var cellID = 0
        when(butSelected.id){
            R.id.b01 -> cellID = 1
            R.id.b02 -> cellID = 2
            R.id.b03 -> cellID = 3
            R.id.b04 -> cellID = 4
            R.id.b05 -> cellID = 5
            R.id.b06 -> cellID = 6
            R.id.b07 -> cellID = 7
            R.id.b08 -> cellID = 8
            R.id.b09 -> cellID = 9
        }
        playGame(cellID, butSelected)
    }
    var p1 = ArrayList<Int>()
    var p2 = ArrayList<Int>()
    var count = 0

    var activePlayer = 1

    private fun playGame(cellID: Int, buttonSelected: Button) {
        if(activePlayer == 1){
            buttonSelected.text = "X"
            buttonSelected.setBackgroundColor(Color.parseColor("#F39C12"))
            count ++
            p1.add(cellID)
            activePlayer = 2
        }
        else{
            buttonSelected.text = "O"
            count++
            buttonSelected.setBackgroundColor(Color.parseColor("#EBF5FB"))
            p2.add(cellID)
            activePlayer = 1
        }

        buttonSelected.isEnabled = false
        checkWinner()
    }

    private fun checkWinner() {
        var winner = -1
        //row1
        if(p1.contains(1) && p1.contains(2) && p1.contains(3)){
            winner = 1
        }
        if(p2.contains(1) && p2.contains(2) && p2.contains(3)){
            winner = 2
        }
//        row2
        if(p1.contains(4) && p1.contains(5) && p1.contains(6)){
            winner = 1
        }
        if(p2.contains(4) && p2.contains(5) && p2.contains(6)){
            winner = 2
        }
//        row3
        if(p1.contains(7) && p1.contains(8) && p1.contains(9)){
            winner = 1
        }
        if(p2.contains(7) && p2.contains(8) && p2.contains(9)){
            winner = 2
        }
//        right diagonal
        if(p1.contains(1) && p1.contains(5) && p1.contains(9)){
            winner = 1
        }
        if(p2.contains(1) && p2.contains(5) && p2.contains(9)){
            winner = 2
        }
//        left diagnal
        if(p1.contains(3) && p1.contains(5) && p1.contains(7)){
            winner = 1
        }
        if(p2.contains(3) && p2.contains(5) && p2.contains(7)){
            winner = 2
        }
        //column 1
        if(p1.contains(1) && p1.contains(4) && p1.contains(7)){
            winner = 1
        }
        if(p2.contains(1) && p2.contains(4) && p2.contains(7)){
            winner = 2
        }
//       column2
        if(p1.contains(4) && p1.contains(2) && p1.contains(8)){
            winner = 1
        }
        if(p2.contains(4) && p2.contains(2) && p2.contains(8)){
            winner = 2
        }
//       column3
        if(p1.contains(3) && p1.contains(6) && p1.contains(9)){
            winner = 1
        }
        if(p2.contains(3) && p2.contains(6) && p2.contains(9)){
            winner = 2
        }

        if(winner != -1){
            Toast.makeText(this, "Player "+winner+" WINS!!!", Toast.LENGTH_LONG).show()
        }
        else if (winner == -1 && count == 9){
            Toast.makeText(this, "DRAW!!!", Toast.LENGTH_LONG).show()
        }
    }

}
