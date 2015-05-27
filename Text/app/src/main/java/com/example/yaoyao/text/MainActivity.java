package com.example.yaoyao.text;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;


public class MainActivity extends Activity {
    private ToggleButton tb;
    private ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       tb =(ToggleButton) findViewById(R.id.Button1);

       img = (ImageView) findViewById(R.id.imageView1);


        public void onCheckedChanged (CompoundButton buttonView, boolean is Checked){

//                Intent intent = new Intent();
//                intent.setClass(MainActivity.this,TwoActivity.class);
//                startActivity(intent);

            }
        });
    }

}