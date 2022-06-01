package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate (R.menu.menu, menu);

        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.About:
                Toast.makeText(this,"This is about",Toast.LENGTH_LONG).show();

                Intent intent = new Intent(this, AboutActivity.class);
                startActivity(intent);

                break;


            case R.id.Calculation:
                Toast.makeText(this,"This is calculation page",Toast.LENGTH_LONG).show();

                Intent intent1 = new Intent(this,CalculationActivity.class);
                startActivity(intent1);


                break;

        }

        return super.onOptionsItemSelected(item);
    }
}