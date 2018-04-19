package com.startup.decoviewexample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.chrisbanes.photoview.PhotoView;
import com.hookedonplay.decoviewlib.DecoView;
import com.hookedonplay.decoviewlib.charts.SeriesItem;

public class MainActivity extends AppCompatActivity {

    private DecoView decoViewCoin;
    private DecoView decoViewReferral;
    private final int mSeriesMax = 500;
    private int mBackIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        decoViewCoin = findViewById(R.id.deco_view_coin);
        decoViewReferral = findViewById(R.id.deco_referral);
        coinView();
        referralView();
    }

    private void coinView() {
        SeriesItem seriesItem = new SeriesItem.Builder(Color.parseColor("#ffffff"))
                .setRange(0, mSeriesMax, mSeriesMax)
                .setInitialVisibility(true)
                .build();
        mBackIndex = decoViewCoin.addSeries(seriesItem);

        SeriesItem seriesItem1 = new SeriesItem.Builder(Color.parseColor("#1DB954"))
                .setRange(0, mSeriesMax, 400)
                .build();
        mBackIndex = decoViewCoin.addSeries(seriesItem1);

//        SeriesItem seriesItem2 = new SeriesItem.Builder(Color.parseColor("#F5A623"))
//                .setRange(0, mSeriesMax, 50)
//                .build();
//        mBackIndex = decoViewCoin.addSeries(seriesItem2);
    }

    private void referralView() {
        SeriesItem seriesItem = new SeriesItem.Builder(Color.parseColor("#4ce5e9"))
                .setRange(0, mSeriesMax, mSeriesMax)
                .setInitialVisibility(true)
                .build();
        mBackIndex = decoViewReferral.addSeries(seriesItem);

        SeriesItem seriesItem1 = new SeriesItem.Builder(Color.parseColor("#F5A623"))
                .setRange(0, mSeriesMax, 200)
                .build();
        mBackIndex = decoViewReferral.addSeries(seriesItem1);
    }
}
