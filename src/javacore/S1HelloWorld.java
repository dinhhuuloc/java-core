package javacore;

import java.util.Scanner;

public class S1HelloWorld {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("your name is: ");
		String name = sc.nextLine();
		System.out.println("your age is: ");
		int age = sc.nextInt();
		System.out.println("my name is " + name + ", age = " + age);

		sc.close();

	}
}
