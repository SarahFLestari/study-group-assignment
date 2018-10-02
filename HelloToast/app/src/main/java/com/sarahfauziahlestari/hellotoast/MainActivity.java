package com.sarahfauziahlestari.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, "Hello, toast", Toast.LENGTH_LONG);
        toast.show();
    }

    public void countUp(View view) {
        TextView tv = (TextView) findViewById(R.id.textView);
        String a = tv.getText().toString();
        int count = Integer.parseInt(a);
        count = count + 1;
        tv.setText(count);
    }
}
