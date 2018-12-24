package com.home.currency;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edNTD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }

    private void findViews() {
        edNTD = findViewById(R.id.ntd);
    }

    public void go(View view) {
        String n = edNTD.getText().toString();
        if (n.equals("")) {
            new AlertDialog.Builder(this)
                    .setTitle("Problem")
                    .setMessage("Please enter you NTD amount")
                    .setPositiveButton("OK", null)
                    .show();
        } else {
            float ntd = Float.parseFloat(n);
            new AlertDialog.Builder(this)
                    .setTitle("Result")
                    .setMessage("USD is " + ntd / 30.9f)
                    .setPositiveButton("OK", null)
                    .show();
        }
    }
}
