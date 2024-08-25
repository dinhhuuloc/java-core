package javacore;

import java.util.Scanner;

public class S2JavaMath {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("a : ");
		int a = sc.nextInt();
		System.out.println("b: ");
		int b = sc.nextInt();
		System.out.println("max : " + Math.max(a, b) + ", min: " + Math.min(a, b));

		sc.close();
	}
}
