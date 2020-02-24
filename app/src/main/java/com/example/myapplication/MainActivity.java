package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.shareId){
            Intent intent=new Intent(Intent.ACTION_SEND);
            intent.setType("Text/plain");

            String subject= "C Programming App";
            String body= "This app is very useful to learn programming.\n com.example.myapplication";

            intent.putExtra(Intent.EXTRA_SUBJECT,subject);
            intent.putExtra(Intent.EXTRA_TEXT,body);

            startActivity(Intent.createChooser(intent,"Share With"));
        }
        if(item.getItemId()==R.id.settingId){
            Toast.makeText(this, "Share is selected", Toast.LENGTH_SHORT).show();
            return true;
        }
        if(item.getItemId()==R.id.feedbackId){
            Toast.makeText(this, "Feedback is selected", Toast.LENGTH_SHORT).show();
            return true;
        }
        if(item.getItemId()==R.id.aboutusId){
            Toast.makeText(this, "About Us is selected", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
