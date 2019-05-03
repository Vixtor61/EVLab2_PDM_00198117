package com.feranstirman.colorlabo.actividades

import android.graphics.Color
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.feranstirman.colorlabo.R
import com.feranstirman.colorlabo.fragmentos.ColorFrag
import com.feranstirman.colorlabo.fragmentos.ColorFrag.OnFragmentInteractionListener
import com.feranstirman.colorlabo.fragmentos.StaticFrag


class MainActivity : AppCompatActivity(), OnFragmentInteractionListener{
    lateinit var frag1: StaticFrag
    lateinit var frag2: ColorFrag

    override fun onFragmentInteraction(btn: Button) {

          Toast.makeText(this,btn.drawingCacheBackgroundColor.toLong().toString(),Toast.LENGTH_LONG).show()

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        frag2 = ColorFrag.newInstance("#0000ff")






    }


}
