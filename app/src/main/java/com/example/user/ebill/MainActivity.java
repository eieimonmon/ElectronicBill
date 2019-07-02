package com.example.user.ebill;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edtunit;
    private Button btncalculate;
    private TextView tvunit, tvunitprice, tvtotalcost, tvunitresult, tvunitpriceresult, tvtotalcostresult;
   String unit;
   double cost;
   long costunit;
private LinearLayout lnlResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtunit=findViewById(R.id.edtunit);
        tvunit=findViewById(R.id.tvunit);
        tvunitprice=findViewById(R.id.tvunitprice);
        tvtotalcost=findViewById(R.id.tvtotalcost);
        btncalculate=findViewById(R.id.btncalculate);
        tvunitresult=findViewById(R.id.tvunitresult);
        tvunitpriceresult=findViewById(R.id.tvunitpriceresult);
        tvtotalcostresult=findViewById(R.id.tvtotalcostresult);
        lnlResult=findViewById(R.id.lnlresult);



        btncalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unit= edtunit.getText().toString();
               costunit=Long.parseLong(unit);
               if(costunit>=0) {
                   cost = costunit * 200;
               }
                lnlResult.setVisibility(View.VISIBLE);
               tvunitresult.setText(edtunit.getText().toString());
               tvunitpriceresult.setText("200"+"Kyats");
               tvtotalcostresult.setText(String.valueOf(cost)+"Kyats");}


        });

    }
}
