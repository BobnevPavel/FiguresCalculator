package com.example.figuresquarecalculator;

 class Triangle extends Figure{
    private float a;
    private float b;
    private float c;
    Triangle(float a, float b, float c){
    	this.a = a;
    	this.b = b;
    	this.c = c;
    }
	@Override
	public  float figureSquare(){
		return (float) Math.sqrt((((a + b + c) / 2) * (((a + b + c) / 2) - a) * (((a + b + c) / 2) - b) * (((a + b + c) / 2) - c)));
	}
	
	@Override
	 public float figurePerimeter(){
		return (float)(a + b + c);
	}
}
