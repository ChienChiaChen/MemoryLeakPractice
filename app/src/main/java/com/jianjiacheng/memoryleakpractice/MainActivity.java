package com.jianjiacheng.memoryleakpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private MyFirstCallback myFirstCallback = new MyFirstCallback();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TAG("onCreate");

        setContentView(R.layout.activity_main);
        myFirstCallback.addMySecondCallback(this);
        findViewById(R.id.my_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoLogin() ;
                finish();
            }
        });
    }

    public void gotoLogin(){
        startActivity(LoginActivity.from(this));
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
//        myFirstCallback.removeMySecondCallback(this);
        TAG("onDestroy");
    }

    public void TAG(String tag){
        Log.e("Jason", tag);
    }
}
