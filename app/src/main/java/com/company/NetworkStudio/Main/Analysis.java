package com.company.NetworkStudio.Main;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vivek.myapplication.R;

/**
 * Created by vivek on 13/1/16.
 */
public class Analysis extends Fragment {
    View viewRoot;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.analysis,container,false);
    }

}
