package com.example.deyvison.aula08;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Deyvison on 10/03/2016.
 */
public class Fragment01 extends Fragment {

    private TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_01,container,false);

        textView = (TextView) view.findViewById(R.id.textView);
        textView.setText("Olá mobral!");

        return view;
    }
}
