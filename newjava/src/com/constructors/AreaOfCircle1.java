package com.constructors;
//taking pi as static 

public class AreaOfCircle1 {

    public static void main(String[] args) {
        GetAreaCircle1 ar = new GetAreaCircle1(4);
        System.out.println(ar.GetArea());
    }
}

class GetAreaCircle1 {

    int radius;
    static float PI = 3.14f;
    float area;
    

    public GetAreaCircle1(int radius) {
        this.radius = radius;
    }

    float GetArea(){
    	float area= PI * (radius *radius);
    	return area;
    	}
}


/*Such variables whose value is going to stay same regardless of the object should be declared as static 
  such variables whose value can be diff for different object can be created as instance
 */