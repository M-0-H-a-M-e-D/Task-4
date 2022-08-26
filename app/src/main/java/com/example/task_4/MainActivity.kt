package com.example.task_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.lang.Integer.parseInt

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val resetButton=findViewById<Button>(R.id.reset)
        val a3=findViewById<Button>(R.id.teamA3points)
        val a2=findViewById<Button>(R.id.teamA2points)
        val aF=findViewById<Button>(R.id.teamAFree)
        val b3=findViewById<Button>(R.id.teamB3points)
        val b2=findViewById<Button>(R.id.teamB2points)
        val bF=findViewById<Button>(R.id.teamBFree)
        val sA=findViewById<TextView>(R.id.scoreA)
        val sB=findViewById<TextView>(R.id.scoreB)
        resetButton.setOnClickListener {
            sA.setText("0")
            sB.setText("0")
        }
        a3.setOnClickListener{
            sA.setText("${parseInt(sA.text as String)+3}")
        }
        a2.setOnClickListener{
            sA.setText("${parseInt(sA.text as String)+2}")
        }
        aF.setOnClickListener{
            sA.setText("${parseInt(sA.text as String)+1}")
        }
        b3.setOnClickListener{
            sB.setText("${parseInt(sB.text as String)+3}")
        }
        b2.setOnClickListener{
            sB.setText("${parseInt(sB.text as String)+2}")
        }
        bF.setOnClickListener{
            sB.setText("${parseInt(sB.text as String)+1}")
        }

    }
        override fun onClick(v: View?) {
    }
}