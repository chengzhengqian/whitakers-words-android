package com.ids1024.whitakerswords

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.View 
import android.view.ViewGroup
import android.view.LayoutInflater

public class AboutFragment : Fragment() {
    public override fun onCreateView(inflater: LayoutInflater,
                                     container: ViewGroup?,
                                     savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.about, container, false)
    }
}