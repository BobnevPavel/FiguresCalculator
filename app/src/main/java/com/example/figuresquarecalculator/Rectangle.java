package com.example.figuresquarecalculator;

public class Rectangle extends Figure {
	private float a;
	private float b;
	Rectangle(float a, float b){
		this.a = a;
		this.b = b;
	}
	@Override
	public float figureSquare() {
		return a * b;
	}
	
	@Override
	public float figurePerimeter() {
		return 2 * a + 2 * b;
	}
}
