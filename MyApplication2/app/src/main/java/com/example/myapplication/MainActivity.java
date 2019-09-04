package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    double num1;
    double num2;
    double sum;
    TextView summ;
    EditText number1;
    EditText number2;

    FirebaseDatabase mref = FirebaseDatabase.getInstance("https://mobileappsandservices.firebaseio.com/");
    DatabaseReference summm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button1 = findViewById(R.id.button);
        FirebaseDatabase mref = FirebaseDatabase.getInstance("https://mobileappsandservices.firebaseio.com/");
        summ = findViewById(R.id.textView);
        number1 = findViewById(R.id. textView2);
        number2 = findViewById(R.id. textView3);
        String text = "ADD";
        button1.setText(text);
        summm = mref.getReference("Sum");
        sum = 0.0;
        num1 = 0.0;
        num2 = 0.0;
        number1.setText(String.format("%.1f", num1));
        number2.setText(String.format("%.1f", num2));
        summ.setText(String.format("%.2f", sum));

    }
    public void Increment(View v) {
        num1 = Double.valueOf(number1.getText().toString());
        num2 = Double.valueOf(number2.getText().toString());
        sum = num1 + num2;
        number1.setText(String.format("%.2f", num1));
        number2.setText(String.format("%.2f", num2));
        summ.setText(String.format("%f", sum));
        summm.setValue(sum);
    }
}
