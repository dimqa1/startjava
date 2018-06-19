package com.startjava.lesson_2.calculator;

import java.util.Scanner;

public class CalculatorTest{
	public static void main (String[] args) {

		Scanner scanner = new Scanner(System.in);
		Calculator calc = new Calculator();
				
		System.out.println("Калькулятор запущен! ");

		
		String answer = "да";
		while (answer.equals("да")) {

			System.out.print("Введите первое число: ");
			int firstNumber = scanner.nextInt();
			calc.setFirstNumber(firstNumber);

			System.out.print("Введите знак мат.операции: ");
			char mathOperation = scanner.next().charAt(0);
			calc.setMathOperation(mathOperation);

			System.out.print("Введите второе число: ");
			int secondNumber = scanner.nextInt();
			calc.setSecondNumber(secondNumber);
			
			calc.calculate();
			
			System.out.print("Хотите продолжить? [Да/Нет]: ");
			answer = scanner.next();

		}

		System.out.println("Калькулятор закрылся");
	}
}