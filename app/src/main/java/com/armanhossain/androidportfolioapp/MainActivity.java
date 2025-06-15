package com.armanhossain.androidportfolioapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.armanhossain.androidportfolioapp.adapter.ProjectsAdapter;
import com.armanhossain.androidportfolioapp.model.Project;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        RecyclerView rvProjects = findViewById(R.id.rv_projects);

        Project[] projectArray = {
                new Project("Getting Started App", "Our very first project, the default 'Hello World' app!", R.drawable.getting_started),
                new Project("The Motivational Quote App", "Making a simple change to the layout, with my own personal motivation quote for software developers", R.drawable.quote),
                new Project("BMI Calculator", "A real life working BMI calculator teaching me Variables, Methods and Conditional Logic", R.drawable.calculator),
                new Project("Inch Converter", "A basic converter to convert inches to meters (my own personal calculator app made on my own)", R.drawable.tape),
                new Project("The Hungry App", "A menu app for a fictional restaurant, learning Activities, Classes & Objects, Arrays, Intents and ListView", R.drawable.hungry_developer),
        };

        ProjectsAdapter adapter = new ProjectsAdapter(projectArray);
        rvProjects.setAdapter(adapter);
    }
}