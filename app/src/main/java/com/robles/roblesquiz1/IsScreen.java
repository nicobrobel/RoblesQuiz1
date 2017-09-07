package com.robles.roblesquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IsScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_is_screen);
    }
    public void callMainScreen (View view){
        Intent intent = new Intent(this,MainScreen.class);
        startActivity(intent);
    }
    public void callCsScreen (View view){
        Intent intent = new Intent(this,CsScreen.class);
        startActivity(intent);
    }
    public void callItScreen (View view){
        Intent intent = new Intent(this,ItScreen.class);
        startActivity(intent);
    }
}
