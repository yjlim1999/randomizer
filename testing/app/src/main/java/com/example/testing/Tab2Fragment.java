package com.example.testing;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

/**
 * Created by User on 2/28/2017.
 */

public class Tab2Fragment extends Fragment {

    //NEW CODE/////////////////////////
    private ImageView imageViewDice;
    private Random rng = new Random();
    //NEW CODE////////////////////////////////////////

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab2_fragment, container, false);
        /////NEW CODE///////////////////////////

        imageViewDice = view.findViewById(R.id.image_view_dice);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });
        return view;
    }

    private void rollDice() {
    int randomNumber = rng.nextInt(6) + 1;

    switch (randomNumber) {
        case 1:
            imageViewDice.setImageResource(R.drawable.dice1);
            break;
        case 2:
            imageViewDice.setImageResource(R.drawable.dice2);
            break;
        case 3:
            imageViewDice.setImageResource(R.drawable.dice3);
            break;
        case 4:
            imageViewDice.setImageResource(R.drawable.dice4);
            break;
        case 5:
            imageViewDice.setImageResource(R.drawable.dice5);
            break;
        case 6:
            imageViewDice.setImageResource(R.drawable.dice6);
            break;
    }
    //NEW CODE////////////////////////////////


    }
}
