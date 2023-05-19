package com.example.ui_netclan;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageButton image = findViewById(R.id.image);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        EditText editText = findViewById(R.id.editText);
        TextView characterCountTextView = findViewById(R.id.characterCountTextView);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // Not needed in this case
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // Update the character count
                int currentLength = s.length();
                characterCountTextView.setText(currentLength + "/250");
            }

            @Override
            public void afterTextChanged(Editable s) {
                // Not needed in this case
            }
        });

        // Define the color for the progressing SeekBar
        int progressingColor = getResources().getColor(R.color.Prussian_Blue);

// Create a color filter with the progressing color
        PorterDuffColorFilter colorFilter = new PorterDuffColorFilter(progressingColor, PorterDuff.Mode.SRC_IN);

        SeekBar seekBar = findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // Apply the color filter to the progress drawable
                seekBar.getProgressDrawable().setColorFilter(colorFilter);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // No action needed
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // Remove the color filter when the SeekBar stops progressing
                seekBar.getProgressDrawable().clearColorFilter();
            }
        });

// Get references to the TextViews
        TextView option1 = findViewById(R.id.option1);
        TextView option2 = findViewById(R.id.option2);
        TextView option3 = findViewById(R.id.option3);
        TextView option4 = findViewById(R.id.option4);
        TextView option5 = findViewById(R.id.option5);
        TextView option6 = findViewById(R.id.option6);
        TextView option7 = findViewById(R.id.option7);
        TextView option8 = findViewById(R.id.option8);


// Set click listeners for the TextViews
        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Toggle the selection state
                boolean isSelected = option1.isSelected();
                option1.setSelected(!isSelected);

                // Change the background based on the selection state
                if (isSelected) {
                    option1.setBackgroundResource(R.drawable.unselected_box_background);
                    option1.setTextColor(getResources().getColor(R.color.black));
                } else {
                    option1.setBackgroundResource(R.drawable.selected_box_background);
                    option1.setTextColor(getResources().getColor(R.color.white));
                }
            }
        });

        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Toggle the selection state
                boolean isSelected = option2.isSelected();
                option2.setSelected(!isSelected);

                // Change the background based on the selection state
                if (isSelected) {
                    option2.setBackgroundResource(R.drawable.unselected_box_background);
                    option2.setTextColor(getResources().getColor(R.color.black));
                } else {
                    option2.setBackgroundResource(R.drawable.selected_box_background);
                    option2.setTextColor(getResources().getColor(R.color.white));
                }
            }
        });

        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Toggle the selection state
                boolean isSelected = option3.isSelected();
                option3.setSelected(!isSelected);

                // Change the background based on the selection state
                if (isSelected) {
                    option3.setBackgroundResource(R.drawable.unselected_box_background);
                    option3.setTextColor(getResources().getColor(R.color.black));
                } else {
                    option3.setBackgroundResource(R.drawable.selected_box_background);
                    option3.setTextColor(getResources().getColor(R.color.white));
                }
            }
        });
        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Toggle the selection state
                boolean isSelected = option4.isSelected();
                option4.setSelected(!isSelected);

                // Change the background based on the selection state
                if (isSelected) {
                    option4.setBackgroundResource(R.drawable.unselected_box_background);
                    option4.setTextColor(getResources().getColor(R.color.black));
                } else {
                    option4.setBackgroundResource(R.drawable.selected_box_background);
                    option4.setTextColor(getResources().getColor(R.color.white));
                }
            }
        });
        option5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Toggle the selection state
                boolean isSelected = option5.isSelected();
                option5.setSelected(!isSelected);

                // Change the background based on the selection state
                if (isSelected) {
                    option5.setBackgroundResource(R.drawable.unselected_box_background);
                    option5.setTextColor(getResources().getColor(R.color.black));
                } else {
                    option5.setBackgroundResource(R.drawable.selected_box_background);
                    option5.setTextColor(getResources().getColor(R.color.white));
                }
            }
        });
        option6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Toggle the selection state
                boolean isSelected = option6.isSelected();
                option6.setSelected(!isSelected);

                // Change the background based on the selection state
                if (isSelected) {
                    option6.setBackgroundResource(R.drawable.unselected_box_background);
                    option6.setTextColor(getResources().getColor(R.color.black));
                } else {
                    option6.setBackgroundResource(R.drawable.selected_box_background);
                    option6.setTextColor(getResources().getColor(R.color.white));
                }
            }
        });
        option7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Toggle the selection state
                boolean isSelected = option7.isSelected();
                option7.setSelected(!isSelected);

                // Change the background based on the selection state
                if (isSelected) {
                    option7.setBackgroundResource(R.drawable.unselected_box_background);
                    option7.setTextColor(getResources().getColor(R.color.black));
                } else {
                    option7.setBackgroundResource(R.drawable.selected_box_background);
                    option7.setTextColor(getResources().getColor(R.color.white));
                }
            }
        });
        option8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Toggle the selection state
                boolean isSelected = option8.isSelected();
                option8.setSelected(!isSelected);

                // Change the background based on the selection state
                if (isSelected) {
                    option8.setBackgroundResource(R.drawable.unselected_box_background);
                    option8.setTextColor(getResources().getColor(R.color.black));
                } else {
                    option8.setBackgroundResource(R.drawable.selected_box_background);
                    option8.setTextColor(getResources().getColor(R.color.white));
                }
            }
        });
        Spinner spinner = findViewById(R.id.spinner);

        // Create an array of options
        String[] options = {"Available| Hey let us connect", "Away| Stay Discreet And Watch", "Busy| Do Not Disturb | Will catch up later", "SOS| Emergency ! Need Assistance ! HELP"};

        // Create an ArrayAdapter using the options array and a default spinner layout
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, options);

        // Specify the layout to use when the list of options appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Set the adapter for the Spinner
        spinner.setAdapter(adapter);

    }
}