package com.example.figuresquarecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RectangleActivity extends AppCompatActivity {
	EditText firstNumberInputField;
	EditText secondNumberInputField;
	TextView rectanglePerimeterTxtView;
	TextView rectangleSquareTxtView;
	Button rectanglePerimeterBtn;
	Button rectangleSquareBtn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rectangle);
		
		firstNumberInputField = findViewById(R.id.rectangle_first_number_edit);
		secondNumberInputField = findViewById(R.id.rectangle_second_number_edit);
		rectanglePerimeterTxtView = findViewById(R.id.rectangle_perimeter_view);
		rectangleSquareTxtView = findViewById(R.id.rectangle_square_view);
		rectangleSquareBtn = findViewById(R.id.rectangle_square_btn);
		rectanglePerimeterBtn = findViewById(R.id.rectangle_perimeter_btn);
		
		rectanglePerimeterBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Rectangle rectangle = new Rectangle(Float.parseFloat(firstNumberInputField.getText().toString()), Float.parseFloat(secondNumberInputField.getText().toString()));
				rectanglePerimeterTxtView.setText(String.valueOf(rectangle.figurePerimeter()));
				
			}
		});
		rectangleSquareBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Rectangle rectangle = new Rectangle(Float.parseFloat(firstNumberInputField.getText().toString()), Float.parseFloat(secondNumberInputField.getText().toString()));
				rectangleSquareTxtView.setText(String.valueOf(rectangle.figureSquare()));
			}
		});
	}
}