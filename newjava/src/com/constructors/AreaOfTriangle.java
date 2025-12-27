package com.constructors;


public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetAreatriangle ar = new GetAreatriangle(5,4);
		System.out.print("Area :"+ar.GetArea());

	}

}

class GetAreatriangle{
	int length ;
	int breadth;
	
	
	float GetArea(){
	float area=0.5f *(length*breadth) ;
	return area;
	}
	
	public GetAreatriangle(int length,int breadth){
		this.length = length;
		this.breadth=breadth;
	}
	
	
}