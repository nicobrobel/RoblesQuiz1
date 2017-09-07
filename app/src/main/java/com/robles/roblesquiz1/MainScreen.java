package com.robles.roblesquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
    }
    public void callCsScreen (View view){
        Intent intent = new Intent(this,CsScreen.class);
        startActivity(intent);
    }
    public void callItScreen (View view){
        Intent intent = new Intent(this,ItScreen.class);
        startActivity(intent);
    }
    public void callIsScreen (View view){
        Intent intent = new Intent(this,IsScreen.class);
        startActivity(intent);
    }
}
