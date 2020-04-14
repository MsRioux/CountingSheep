package com.example.countingsheep;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int num1 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickAddOne(View v)
    {
        num1++; //instance variable declared in class
        TextView tallyTextView = (TextView) findViewById(R.id.tallyTV); //tally is TV
        tallyTextView.setText("Counting sheep. I can count to " + num1);
//        Toast.makeText(this, tallySays + num1, Toast.LENGTH_SHORT).show();
    }//end method addOne

    public void onClickSubtractOne(View v)
    {
        num1--; //instance variable declared in class
        TextView tallyTextView = (TextView) findViewById(R.id.tallyTV); //tally is TV
        tallyTextView.setText("Counting sheep backwards now. " + num1);
    }//end method  to subtract one



    public void onClickResetCount(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Confirm reset count");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
//onclick Handler
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "yeppers", Toast.LENGTH_LONG).show();
                num1 = 0;
                TextView tallyTextView = (TextView) findViewById(R.id.tallyTV);
                tallyTextView.setText("Are you sleepy? Time to start counting sheep: " + num1);
            }//end onClick overridden method
        });//end set positive button


        builder.setNegativeButton("Nopers", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {


            }//end onclick
        });//end set negative button


        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }// end method to open dialog

}
