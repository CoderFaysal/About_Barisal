package com.coderfaysal.aboutbarisal;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Details extends AppCompatActivity {

    public static String TITLE = "";
    public static String DESC = "";

    TextView show_name, show_desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        show_name = findViewById(R.id.show_name);
        show_desc = findViewById(R.id.show_desc);

        show_name.setText(TITLE);
        show_desc.setText(DESC);

    }
}