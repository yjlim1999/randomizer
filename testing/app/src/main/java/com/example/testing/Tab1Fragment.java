package com.example.testing;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

/**
 * Created by User on 2/28/2017.
 */

public class Tab1Fragment extends Fragment {
    private static final String TAG = "Tab1Fragment";

    private Button btnTEST;

    //NEW CODE/////////////////////////////

    EditText et_min, et_max;
    Button b_generate;
    TextView tv_output, error_output;

    Random r;
    int min, max, output;
    //NEW CODE///////////////////////////

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab1_fragment,container,false);
        btnTEST = (Button) view.findViewById(R.id.btnTEST);

        btnTEST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "TESTING BUTTON CLICK 1",Toast.LENGTH_SHORT).show();
            }
        });

        ///NEW CODE/////////////////////////


        r = new Random();

        et_min = (EditText) view.findViewById(R.id.et_min);
        et_max = (EditText) view.findViewById(R.id.et_max);
        b_generate = (Button) view.findViewById(R.id.b_generate);
        tv_output = (TextView) view.findViewById(R.id.tv_output);
        error_output = (TextView) view.findViewById(R.id.error_output);

        b_generate.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                String tempMin, tempMax;
                tempMin = et_min.getText().toString();
                tempMax = et_max.getText().toString();
                if(!tempMin.equals("") && !tempMax.equals("")) {

                    min = Integer.parseInt(tempMin);
                    max = Integer.parseInt(tempMax);
                    if(max > min) {
                        output = r.nextInt((max - min) + 1) + min;

                        tv_output.setText("" + output);
                        error_output.setError(null);
                        error_output.setText(null);
                    }

                    else
                    {
                        //error_output.setError("");
                        //error_output.setText("error please make sure that max is greater than min");
                        Toast.makeText(getActivity(), "ERROR",Toast.LENGTH_SHORT).show();
                    }


                }
            }

        });
        ////NEW CODE/////////////////////////////////



        return view;
    }




}

