package com.test;

import java.util.Scanner;

public class Test_Program {
public static void main(String[] args) {
System.out.println("do you have Passport");
Scanner sc = new Scanner(System.in);
String passport = sc.next();
System.out.println("communication skill good/bad");
String comm = sc.next();
System.out.println("Training feed back Good / bad");
String feedback = sc.next();
System.out.println("do you have 2 yr exp? yes /no");
String exp = sc.next();
System.out.println("your age is 23 or not? yes /no ");
int age = sc.nextInt();
sc.close();

if (passport.equalsIgnoreCase("yes")
	&& comm.equalsIgnoreCase("good") 
	&& feedback.equalsIgnoreCase("good") 
	&& exp.equalsIgnoreCase("yes") && age >=23) {
	System.out.println("Eligible for On site");
}else {
	System.out.println("Not eligible");
}}
}
