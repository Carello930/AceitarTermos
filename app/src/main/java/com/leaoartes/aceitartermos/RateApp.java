package com.leaoartes.aceitartermos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class RateApp extends AppCompatActivity {

    TextView textViewValueKnows, textViewValueRecommends, textViewValueStar;
    SeekBar seekBarRecommends, seekBarKnows;
    RatingBar ratingBarStar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rateapp);

        //TextView
        textViewValueKnows = findViewById(R.id.textViewValueKnows);
        textViewValueRecommends = findViewById(R.id.textViewValueRecommends);
        textViewValueStar = findViewById(R.id.textViewValueStar);

        //SeekBar
        seekBarKnows = findViewById(R.id.seekBarKnows);
        seekBarRecommends = findViewById(R.id.seekBarRecommends);

        //RatingBar
        ratingBarStar = findViewById(R.id.ratingBarStar);


        seekBarKnows.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textViewValueKnows.setText("" + progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBarRecommends.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textViewValueRecommends.setText("" + progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        ratingBarStar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

                textViewValueStar.setText("" + rating);

            }
        });
    }


}
