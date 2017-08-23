package org.cap.boot;

public class MainClass {

	public static void main(String[] args) {
		display();
		SalesClass s=new SalesClass();
		s.showMethod();
		s.greetings();
				

	}
public static void display()
{
	System.out.println("Welcome to GIT demo session");
}
}
