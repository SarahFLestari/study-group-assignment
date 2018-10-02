package com.sarahfauziahlestari.msg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
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
        Log.d("Halo", "-------"); Log.d("Saya lagi di", "onCreate");

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
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Saya lagi di","onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Saya lagi di","onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Saya lagi di","onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Saya lagi di","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Saya lagi di","onDestroy");
    }
}
