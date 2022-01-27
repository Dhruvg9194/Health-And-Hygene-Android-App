package com.example.healthandhygene;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id==R.id.menu_contact){
            Toast.makeText(this, "Opening Contact Us.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this,MainActivity6.class);
            startActivity(i);
        }
        if(id==R.id.menu_about){
            Toast.makeText(this, "Opening About Us.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this,MainActivity8.class);
            startActivity(i);
        }
        if(id==R.id.menu_home){
            recreate();
        }
        return super.onOptionsItemSelected(item);

    }

    public void open(View view){
        Intent i = new Intent(this,MainActivity2.class);
        Toast.makeText(this, "Taking to next page...", Toast.LENGTH_SHORT).show();
        startActivity(i);
    }
    public void open1(View view){
        Intent i = new Intent(this,MainActivity3.class);
        startActivity(i);
    }
    public void open4(View view){
        Intent i = new Intent(this,MainActivity4.class);
        startActivity(i);
    }
    public void open2(View view){
        Intent i = new Intent(this,MainActivity7.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }
    public void open8(View view){
        Intent i = new Intent(this,MainActivity10.class);
        startActivity(i);
    }
    public void open3(View view){
        Intent i = new Intent(this,MainActivity11.class);
        startActivity(i);
    }
}