package com.example.ui_netclan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class MainActivity extends AppCompatActivity {
    private FloatingActionButton fabMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);

        ImageButton navigationIcon = findViewById(R.id.image);
        ImageButton refineicon = findViewById(R.id.image2);
        ImageButton nav1=findViewById(R.id.button1);
        ImageButton nav2=findViewById(R.id.button2);
        ImageButton nav3=findViewById(R.id.button3);
        ImageButton filter=findViewById(R.id.button4);

        // Set the OnClickListener for the navigation icon
        navigationIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle the click event for the navigation icon here
                // Add your desired functionality
                Toast.makeText(MainActivity.this, "Navigation icon clicked", Toast.LENGTH_SHORT).show();
            }
        });

        TextView txt=findViewById(R.id.textView);
        Drawable locationIcon = getResources().getDrawable(R.drawable.ic_loc_icon);
        txt.setText("Howdy Username!!");
        String existingText = txt.getText().toString();
        txt.setCompoundDrawablesWithIntrinsicBounds(locationIcon, null, null, null);
        String newText = existingText + "\nLocation";
        txt.setText(newText);

        refineicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        nav1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Navigation icon 1 clicked", Toast.LENGTH_SHORT).show();
            }
        });
        nav2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Navigation icon 2 clicked", Toast.LENGTH_SHORT).show();
            }
        });
        nav3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Navigation icon 3 clicked", Toast.LENGTH_SHORT).show();
            }
        });
        filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "filter button clicked", Toast.LENGTH_SHORT).show();
            }
        });

        fabMenu = findViewById(R.id.fabMenu);

        fabMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupMenu();
            }
        });
    }

    private void showPopupMenu() {
        PopupMenu popupMenu = new PopupMenu(this, fabMenu);
        popupMenu.inflate(R.menu.menu_options); // Your menu resource file

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                // Handle menu item click events here
                switch (item.getItemId()) {
                    case R.id.menu_item1:
                        // Handle option 1 selection
                        return true;
                    case R.id.menu_item2:
                        // Handle option 2 selection
                        return true;
                    case R.id.menu_item3:
                        // Handle option 3 selection
                        return true;
                    // Add more cases for each option in your menu
                    default:
                        return false;
                }
            }
        });

        popupMenu.show();

    }
}