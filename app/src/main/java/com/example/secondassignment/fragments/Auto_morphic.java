package com.example.secondassignment.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.secondassignment.R;

public class Auto_morphic extends Fragment implements View.OnClickListener {


    EditText etMorphicNumber;
    Button btnAutoMorphic;
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_auto_morphic,container,false);
        etMorphicNumber=view.findViewById(R.id.etMornum);
        btnAutoMorphic=view.findViewById(R.id.btnAutoMorphic);
        btnAutoMorphic.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int square, num, results = 0;
        num = Integer.parseInt(etMorphicNumber.getText().toString());
        square = num * num;
        results = square % 10;
        if (results == num) {
            Toast.makeText(getActivity(), "This is auto morphic number", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getActivity(), "This is not auto morphic number", Toast.LENGTH_SHORT).show();

        }


    }

    }
