package com.example.admin.challenge_mvp_002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PassCallback{

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText editText = findViewById(R.id.inputEt);

        textView = findViewById(R.id.validationTv);

        Button button = findViewById(R.id.resultBtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String value = editText.getText().toString();
                new PassValue(MainActivity.this).validate(value);
            }
        });





    }

    @Override
    public void passResult(String value) {

        textView.setText(value);

    }

    @Override
    public void blankInput() {

        Toast.makeText(this, "Ingresa una Password", Toast.LENGTH_SHORT).show();

    }
}
