package com.example.figuresquarecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
	Spinner spinner;
	Button mainButton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		spinner = findViewById(R.id.figures_spinner);
		mainButton = findViewById(R.id.main_button);
		spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
				mainButton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (parent.getSelectedItem().toString()){
							case "Triangle":
								Intent intent = new Intent(getApplicationContext(), TriangleActivity.class);
								startActivity(intent);
								break;
							case "Circle":
								Intent intent1 = new Intent(getApplicationContext(), CircleActivity.class);
								startActivity(intent1);
								break;
							case "Rectangle":
								Intent intent2 = new Intent(getApplicationContext(), RectangleActivity.class);
								startActivity(intent2);
								break;
						}
					}
				});
			}
			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				Toast.makeText(getApplicationContext(), "Пожалуйста, выберите тип фигуры", Toast.LENGTH_LONG).show();
			}
		});
		
	}
	
}