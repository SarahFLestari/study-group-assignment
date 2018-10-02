package com.sarahfauziahlestari.msg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        String message =intent.getStringExtra("pesan_saya");
        TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setText(message);
        et = (EditText) findViewById(R.id.Msg3);
        Log.d("Halo", "-------"); Log.d("Saya lagi di", "onCreate");
    }

    public void REPLY(View view) {
        Intent intent = new Intent(this, Activity1.class);
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
