package com.feranstirman.colorlabo.fragmentos



import android.app.Fragment
import android.os.Bundle

import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import com.feranstirman.colorlabo.R


class StaticFrag : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, vg: ViewGroup, savedInstanceState: Bundle): View {
        return inflater.inflate(R.layout.frag1, vg, false)

    }
}