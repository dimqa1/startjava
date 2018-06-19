import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	Player p1;
	Player p2;  // Переменные для двух объектов PLayer

	public void startGame() {
		Player p1 = new Player();
		PLayer p2 = new Player();

		int quessp1 = 0;  // Переменные для хранения введенных данных игроков
		int quessp2 = 0; 

		boolean p1isRight = false;  // Переменные для хранение правильности или неправильности
		boolean p2isRight = false;  

		/*int rand = (int)(Math.random() * 11); // Генерация случайного числа
		System.out.println("Загадано число от 0 до 10...");  */

		while(true) {
			System.out.println("Число которое нужно угадать, - " + rand);
			p1.guess();
			p2.guess();


			guessp1 = p1.number;
			System.out.println(p1 + "Думает это - ");
			guessp2 = p2.number;
			System.out.println(p2 + "Думает это - ");

			if (guessp1 == rand) {

				p1isRight = true;

			}
			if (guessp2 == rand.guess) {

				p2isRight = true;

			} 
			if (p1isRight || p2isRight ) {

				System.out.println("У нас есть победитель!");
				System.out.println("Первый игрок угадал?" + p1isRight);
				System.out.println("Второй игрок угадал?" + p2isRight);
				System.out.println("Конец игры!");			

			} else {
				System.out.println("Попробуйте ещё раз!");

			}
		}	
	}
	
	public static boolean shouldPlayAgain() {
		System.out.println("Вы выйграли! Хотите сыграть ещё? ( Да/Нет ");
		

		Scanner again = new Scanner(System.in);
		String yes = again.next();
		char yes = yes.charAt(1);		

		return yes == "Да" || yes == "да";
	}

	public void guess () {
		int rand = (int)(Math.random() * 11); // Генерация случайного числа
		System.out.println("Загадано число от 0 до 10...");
	}
}