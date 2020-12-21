package com.example.figuresquarecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CircleActivity extends AppCompatActivity {
	EditText firstNumberInputField;
	TextView circlePerimeterTxtView;
	TextView circleSquareTxtView;
	Button circlePerimeterBtn;
	Button circleSquareBtn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_circle);
		firstNumberInputField = findViewById(R.id.circle_first_number_edit);
		circlePerimeterTxtView = findViewById(R.id.circle_perimeter_view);
		circleSquareTxtView = findViewById(R.id.circle_square_view);
		circlePerimeterBtn = findViewById(R.id.circle_perimeter_btn);
		circleSquareBtn = findViewById(R.id.circle_square_btn);
		circlePerimeterBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Circle circle = new Circle(Float.parseFloat(firstNumberInputField.getText().toString()));
				circlePerimeterTxtView.setText(String.valueOf(circle.figurePerimeter()));
			}
		});
		circleSquareBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Circle circle = new Circle(Float.parseFloat(firstNumberInputField.getText().toString()));
				circleSquareTxtView.setText(String.valueOf(circle.figureSquare()));
			}
		});
	}
}