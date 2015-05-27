package com.example.yaoyao.sms;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {
    private EditText numberText;
    private EditText contentText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberText=(EditText)findViewById(R.id.number);
        contentText=(EditText)findViewById(R.id.content);
        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new ButtonClickListener() );


    }
    private  final class ButtonClickListener implements View.OnClickListener{
        public void onClick(View v){
            String number=numberText.getText().toString();
            String context=contentText.getText().toString();
            SmsManager manager=SmsManager.getDefault();
            ArrayList<String> texts=manager.divideMessage(context);
            for(String text:texts) {
                manager.sendTextMessage(number, null, text, null, null);
            }
            Toast.makeText(MainActivity.this,R.string.success,Toast.LENGTH_LONG).show();

        }
    }



}
