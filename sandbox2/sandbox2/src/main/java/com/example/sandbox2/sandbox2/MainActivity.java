package com.example.sandbox2.sandbox2;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;

import java.lang.reflect.Array;


public class MainActivity extends Activity {
    private ButtonOnClickListener theListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageButton topLeftButton = (ImageButton) this.findViewById(R.id.b00);
        final ImageButton topMidButton = (ImageButton) this.findViewById(R.id.b01);
        final ImageButton topRightButton = (ImageButton) this.findViewById(R.id.b02);

        final ImageButton midLeftButton = (ImageButton) this.findViewById(R.id.b10);
        final ImageButton midMidButton = (ImageButton) this.findViewById(R.id.b11);
        final ImageButton midRightButton = (ImageButton) this.findViewById(R.id.b12);

        final ImageButton bottomLeftButton = (ImageButton) this.findViewById(R.id.b20);
        final ImageButton bottomMidButton = (ImageButton) this.findViewById(R.id.b21);
        final ImageButton bottomRightButton = (ImageButton) this.findViewById(R.id.b22);


        Button reset = (Button) this.findViewById(R.id.reset);
        final TextView output = (TextView) this.findViewById(R.id.textView);

        theListener = new ButtonOnClickListener();
        topLeftButton.setOnClickListener(theListener);
        topMidButton.setOnClickListener(theListener);
        topRightButton.setOnClickListener(theListener);

        midLeftButton.setOnClickListener(theListener);
        midMidButton.setOnClickListener(theListener);
        midRightButton.setOnClickListener(theListener);

        bottomLeftButton.setOnClickListener(theListener);
        bottomMidButton.setOnClickListener(theListener);
        bottomRightButton.setOnClickListener(theListener);


        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                topLeftButton.setImageResource(R.drawable.blank);
                topLeftButton.setContentDescription(null);
                topLeftButton.setClickable(true);

                topMidButton.setImageResource(R.drawable.blank);
                topMidButton.setContentDescription(null);
                topMidButton.setClickable(true);

                topRightButton.setImageResource(R.drawable.blank);
                topRightButton.setContentDescription(null);
                topRightButton.setClickable(true);

                midLeftButton.setImageResource(R.drawable.blank);
                midLeftButton.setContentDescription(null);
                midLeftButton.setClickable(true);

                midMidButton.setImageResource(R.drawable.blank);
                midMidButton.setContentDescription(null);
                midMidButton.setClickable(true);

                midRightButton.setImageResource(R.drawable.blank);
                midRightButton.setContentDescription(null);
                midRightButton.setClickable(true);

                bottomLeftButton.setImageResource(R.drawable.blank);
                bottomLeftButton.setContentDescription(null);
                bottomLeftButton.setClickable(true);

                bottomMidButton.setImageResource(R.drawable.blank);
                bottomMidButton.setContentDescription(null);
                bottomMidButton.setClickable(true);

                bottomRightButton.setImageResource(R.drawable.blank);
                bottomRightButton.setContentDescription(null);
                bottomRightButton.setClickable(true);

                theListener.resetCounter();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }



}
