package com.startjava.lesson_2.calculator;

import java.util.Scanner;

public class CalculatorTest{
	public static void main (String[] args) {

		Scanner scanner = new Scanner(System.in);
		Calculator calc = new Calculator();
				
		System.out.println("����������� �������! ");

		
		String answer = "��";
		while (answer.equals("��")) {

			System.out.print("������� ������ �����: ");
			int firstNumber = scanner.nextInt();
			calc.setFirstNumber(firstNumber);

			System.out.print("������� ���� ���.��������: ");
			char mathOperation = scanner.next().charAt(0);
			calc.setMathOperation(mathOperation);

			System.out.print("������� ������ �����: ");
			int secondNumber = scanner.nextInt();
			calc.setSecondNumber(secondNumber);
			
			calc.calculate();
			
			System.out.print("������ ����������? [��/���]: ");
			answer = scanner.next();

		}

		System.out.println("����������� ��������");
	}
}