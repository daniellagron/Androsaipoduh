package com.example.user.doonik;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton tb1;
    Switch s1;
    LinearLayout ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ll=(LinearLayout)findViewById(R.id.ll);
        tb1=(ToggleButton)findViewById(R.id.tb1);
        s1 = (Switch)findViewById(R.id.s1);
    }

    public void Setcolor(View view) {
        ll.setBackgroundColor(Color.YELLOW);

        if(s1.isChecked()&&tb1.isChecked())
            ll.setBackgroundColor(Color.BLACK );

        else if (s1.isChecked())
            ll.setBackgroundColor(Color.BLUE);

        else if(tb1.isChecked())
            ll.setBackgroundColor(Color.GREEN);

    }
}
