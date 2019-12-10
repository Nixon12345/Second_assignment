package com.example.secondassignment.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.secondassignment.R;


public class Swap_number extends Fragment implements View.OnClickListener {
    EditText etFirstNo,etSecondNo;
    Button btnSwap;
    TextView swapResults;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_third_fragments, container, false);

        etFirstNo = view.findViewById(R.id.etnum1);
        etSecondNo = view.findViewById(R.id.etnum2);
        btnSwap = view.findViewById(R.id.btnSwap);
        btnSwap.setOnClickListener(this);
        return view;

    }


    @Override
    public void onClick(View v) {
        int first,second;
        int[] results;

        first=Integer.parseInt(etFirstNo.getText().toString());
        second=Integer.parseInt(etSecondNo.getText().toString());

        com.ggi.fragments.Calculation arithmetic= new com.ggi.fragments.Calculation(first,second);
        results=arithmetic.SwapNumber();
        etFirstNo.setText(results[0]+"");
        etSecondNo.setText(results[1]+"");


        Toast.makeText(getActivity(), "The swap has been sucess", Toast.LENGTH_SHORT).show();





    }


}
