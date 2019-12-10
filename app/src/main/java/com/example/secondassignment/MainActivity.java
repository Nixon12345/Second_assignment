package com.example.secondassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.secondassignment.R;
import com.example.secondassignment.fragments.Area_Circle;
import com.example.secondassignment.fragments.Auto_morphic;
import com.example.secondassignment.fragments.Swap_number;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button btnSwaofragment;
    private Button btnAreaOfCircle;
    private Button AutoMorphic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btnSwaofragment=findViewById(R.id.btnSwapfragments);
        btnAreaOfCircle=findViewById(R.id.btnAreaCirclefragments);
        AutoMorphic=findViewById(R.id.btnAutoMorphic);
        AutoMorphic.setOnClickListener(this);





        btnSwaofragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                Swap_number tf=new Swap_number();

                fragmentTransaction.replace((R.id.fragmentContainner) ,tf);
                fragmentTransaction.commit();

            }
        });
        btnAreaOfCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                Area_Circle second_fragments=new Area_Circle();
                fragmentTransaction.replace((R.id.fragmentContainner),second_fragments);
                fragmentTransaction.commit();

            }
        });
    }


    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        Auto_morphic autoMorphic=new Auto_morphic();
        fragmentTransaction.replace(R.id.fragmentContainner,autoMorphic);
        fragmentTransaction.commit();
    }
}




