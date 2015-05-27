package com.example.yaoyao.choesetime;

import android.app.TimePickerDialog;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;


public class ChooseTime extends ActionBarActivity {
    private Button btnChooseTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnChooseTime=(Button)findViewById(R.id.btnChooseTime);
        btnChooseTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 new TimePickerDialog(ChooseTime.this,new TimePickerDialog.OnTimeSetListener() {
                     @Override
                     public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                         String theTime=String.format("%d:%d",hourOfDay,minute);
                         System.out.println(theTime);
                         btnChooseTime.setText(theTime);

                     }
                 },0,0,true).show();
            }
        });
    }



}
