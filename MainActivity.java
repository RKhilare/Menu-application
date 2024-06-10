//main_activity.java file
package com.example.menu2application;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId=item.getItemId();

        if(itemId == R.id.menuProfile)
        {
            Toast.makeText(this, "Profile Clicked", Toast.LENGTH_SHORT).show();
        }
        if(itemId == R.id.menuSettings)
        {
            Toast.makeText(this, "Setting Clicked", Toast.LENGTH_SHORT).show();
        }
        if(itemId == R.id.menuMore)
        {
            Toast.makeText(this, "More  options Clicked", Toast.LENGTH_SHORT).show();
        }
        if(itemId == R.id.menuDevices)
        {
            Toast.makeText(this, "Devices Clicked", Toast.LENGTH_SHORT).show();
        }
        if(itemId == R.id.menuLogout)
        {
            Toast.makeText(this, "Logout Clicked", Toast.LENGTH_SHORT).show();
        }
        if(itemId == R.id.menuExit)
        {
            Toast.makeText(this, "Exit Clicked", Toast.LENGTH_SHORT).show();
        }
        return  true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater=new MenuInflater(this);
        menuInflater.inflate(R.menu.options_menu,menu);

        return  true;
    }
}


