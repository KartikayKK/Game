package com.example.pictut;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    int random;

public void convert(View view){
    EditText c = (EditText) findViewById(R.id.editText2);
    int x=Integer.parseInt(c.getText().toString());


        if(x<random){

            Toast.makeText(MainActivity.this, "go higher", Toast.LENGTH_LONG).show();

        }else if(x>random){

            Toast.makeText(MainActivity.this, "go lower", Toast.LENGTH_LONG).show();

        }else{
            Toast.makeText(MainActivity.this, "Thats right ,gusess again", Toast.LENGTH_LONG).show();
            random = (int )(Math.random() * 10 + 1);
        }

}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        random = (int )(Math.random() * 10 + 1);
    }
}
