package com.sarahfauziahlestari.msg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class Activity1 extends AppCompatActivity {
    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        Intent intent = getIntent();
        String message =intent.getStringExtra("pesan_saya");
        TextView textView = (TextView) findViewById(R.id.reply);
        et = (EditText) findViewById(R.id.msg2);
        textView.setText(message);

    }

    public void SEND(View view) {
        Intent intent = new Intent(this, Activity2.class);
        String message = et.getText().toString();
        if (TextUtils.isEmpty(message)) {
            et.setError("Harus diisi");
        }
        else{
            intent.putExtra("pesan_saya", message);
            startActivity(intent);
        }

    }
}
