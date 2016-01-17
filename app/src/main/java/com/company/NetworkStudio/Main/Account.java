package com.company.NetworkStudio.Main;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import com.example.vivek.myapplication.R;


/**
 * Created by vivek on 13/1/16.
 */
public class Account extends Fragment {

    View viewRoot;
    TextView mTextView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       viewRoot = inflater.inflate(R.layout.account,container,false);
        Switch s = (Switch) viewRoot.findViewById(R.id.switch1
        );
        if (s != null) {
            s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        //Do all the save and start Monitoring Activity here
                        System.out.println("Vivek");
                    }
                }
            });
        }
        return viewRoot;
    }

    @Override
    public void onStart() {


        super.onStart();
    }
}
