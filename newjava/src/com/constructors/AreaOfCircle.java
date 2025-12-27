package com.constructors;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetAreaCircle ar = new GetAreaCircle(4,3.14f);
		System.out.print(ar.GetArea());

	}

}

class GetAreaCircle{
	int radius ;
	float f;
	
	
	float GetArea(){
	float area= f * (radius *radius);
	return area;
	}
	
	public GetAreaCircle(int radius,float f){
		this.radius = radius;
		this.f=f;
	}
	
	
}