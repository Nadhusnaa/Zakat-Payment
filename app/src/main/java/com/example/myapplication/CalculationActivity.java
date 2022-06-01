package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class CalculationActivity extends AppCompatActivity implements View.OnClickListener{

    EditText etWeight;
    Button btnCalculate;
    TextView tvOutput;
    TextView etvalue;
    Spinner sp1 ;
    TextView tvOutput2 ;
    TextView tvOutput3 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculation);

        etWeight = (EditText) findViewById(R.id.editTextNumberDecimal);
        btnCalculate = (Button) findViewById(R.id.button);
        tvOutput = (TextView) findViewById(R.id.tvOutput);
        etvalue= (TextView) findViewById(R.id.editTextNumberDecimal2) ;
        sp1= findViewById(R.id.spinner) ;
        tvOutput2 = (TextView) findViewById(R.id.tvOutput2) ;
        tvOutput3 = (TextView) findViewById(R.id.tvOutput3) ;

        if(etWeight.getText().toString().equals(""))
        {
            etWeight.setError("Enter Gold Weight");
        } if (etvalue.getText().toString().equals(""))
        {
            etvalue.setError("Enter Current Value");
        }

        String[] option = {"Select Option","Wear","Keep"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,option);
        sp1.setAdapter(ad1);


        btnCalculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button:
                double weight = Double.parseDouble(etWeight.getText().toString());
                double value = Double.parseDouble(etvalue.getText().toString());
                double total = weight * value;
                double tot ;
                double zakat ;


                if(sp1.getSelectedItem().toString() == "Wear") {
                    tot = (weight - 200) * value ;
                    zakat = tot * 0.025 ;
                    tvOutput.setText("Gold Value : RM " + total);
                    tvOutput2.setText("Zakat Payable : RM " + tot);
                    tvOutput3.setText("Total Zakat : RM " + zakat);

                }

                else if(sp1.getSelectedItem().toString() == "Keep")
                {
                    tot = (weight -85 ) * value;
                    zakat = tot * 0.025 ;
                    tvOutput.setText("Gold Value  : RM " + total);
                    tvOutput2.setText("Zakat Payable : RM " + tot);
                    tvOutput3.setText("Total Zakat : RM " + zakat);
                }



                break;
        }
    }
}

