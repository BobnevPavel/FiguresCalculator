package com.example.figuresquarecalculator;

public class Circle extends Figure{
	private float a;
	
	Circle(float a){
		this.a = a;
	}
	
	@Override
	public float figureSquare() {
		return ((float)(Math.PI * a * a));
	}
	
	@Override
	public float figurePerimeter() {
		return ((float) (2 * Math.PI * a));
	}
}
