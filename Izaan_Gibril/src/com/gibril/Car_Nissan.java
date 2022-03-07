package com.gibril;

public class Car_Nissan {
private void process() {
System.out.println("BS6");
}
private void Light() {
	System.out.println("LED");

}
private void Camera() {
	System.out.println("360 Degree");
}
public static void main(String[] args) {
	Car_Nissan i = new Car_Nissan();
	i.process();
	i.Light();
	i.Camera();
}
}
