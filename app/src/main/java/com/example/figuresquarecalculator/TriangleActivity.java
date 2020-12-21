package com.example.figuresquarecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TriangleActivity extends AppCompatActivity {
	EditText firstNumberInputField;
	EditText secondNumberInputField;
	EditText thirdNumberInputField;
	TextView trianglePerimeterTxtView;
	TextView triangleSquareTxtView;
	Button trianglePerimeterBtn;
	Button triangleSquareBtn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_triangle);
		
		firstNumberInputField = findViewById(R.id.triangle_first_number_edit);
		secondNumberInputField = findViewById(R.id.triangle_second_number_edit);
		thirdNumberInputField = findViewById(R.id.triangle_third_number_edit);
		trianglePerimeterBtn = findViewById(R.id.triangle_perimeter_btn);
		triangleSquareBtn = findViewById(R.id.triangle_square_btn);
		trianglePerimeterTxtView = findViewById(R.id.triangle_perimeter_view);
		triangleSquareTxtView = findViewById(R.id.triangle_square_view);
		
		trianglePerimeterBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Triangle triangle = new Triangle(Float.parseFloat(firstNumberInputField.getText().toString()),
						Float.parseFloat(secondNumberInputField.getText().toString()),
						Float.parseFloat(thirdNumberInputField.getText().toString()));
				trianglePerimeterTxtView.setText(String.valueOf(triangle.figurePerimeter()));
			}
		});
		triangleSquareBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Triangle triangle = new Triangle(Float.parseFloat(firstNumberInputField.getText().toString()),
						Float.parseFloat(secondNumberInputField.getText().toString()),
						Float.parseFloat(thirdNumberInputField.getText().toString()));
				triangleSquareTxtView.setText(String.valueOf(triangle.figureSquare()));
			}
		});
	}
}