package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText ed1,ed2;
private Button submit;
private String s1,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.editText);
        ed2 = findViewById(R.id.editText2);
        submit = findViewById(R.id.button);

    }

    public void submit(View view){
        s1 = ed1.getText().toString();
        s2 = ed2.getText().toString();
        Toast toast = Toast.makeText(this,"HI " + s1,Toast.LENGTH_SHORT);
        toast.show();
    }

}
