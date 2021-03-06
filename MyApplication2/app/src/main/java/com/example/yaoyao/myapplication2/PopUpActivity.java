package com.example.yaoyao.myapplication2;
import android.app.Activity;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

import com.example.yaoyao.myapplication2.R;


public class PopUpActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LayoutInflater inflater = LayoutInflater.from(this);
        // 引入窗口配置文件
        View view = inflater.inflate(R.layout.main2, null);
        // 创建PopupWindow对象
        final PopupWindow pop = new PopupWindow(view, LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, false);
        Button btn = (Button) findViewById(R.id.btn);
        // 需要设置一下此参数，点击外边可消失
        pop.setBackgroundDrawable(new BitmapDrawable());
        //设置点击窗口外边窗口消失
        pop.setOutsideTouchable(true);
        // 设置此参数获得焦点，否则无法点击
        pop.setFocusable(true);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(pop.isShowing()) {
                    // 隐藏窗口，如果设置了点击窗口外小时即不需要此方式隐藏
                    pop.dismiss();
                } else {
                    // 显示窗口
                    pop.showAtLocation(findViewById(R.id.btn), Gravity.CENTER, 20, 20);
                }

            }
        });
    }
}