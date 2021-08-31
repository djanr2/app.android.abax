package com.djanr.abax;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;


import com.djanr.abax.utils.Utils;

public class MainActivity extends AppCompatActivity {

    private ImageView main_bid_five;

    private int ypos_bid_five;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Utils.fullScreen(this);
        setContentView(R.layout.activity_main);

        main_bid_five=findViewById(R.id.main_bid_five);
        main_bid_five.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                final int x = (int) event.getRawX();
                final int y = (int) event.getRawY();

                switch (event.getAction() & MotionEvent.ACTION_MASK){
                    case MotionEvent.ACTION_DOWN:
                        RelativeLayout.LayoutParams  lay = (RelativeLayout.LayoutParams) v.getLayoutParams();
                        //_xDelta = x - lay.leftMargin;
                        ypos_bid_five = y - lay.topMargin;
                        break;
                    case MotionEvent.ACTION_MOVE:
                        RelativeLayout.LayoutParams  lay2 = (RelativeLayout.LayoutParams) v.getLayoutParams();
                        //lay2.leftMargin = x - _xDelta;
                        lay2.topMargin = y - ypos_bid_five;
                        lay2.rightMargin = -250;
                        lay2.bottomMargin = -250;
                        v.setLayoutParams(lay2);
                        break;
                }
                return true;
            }
        });

    }
}
