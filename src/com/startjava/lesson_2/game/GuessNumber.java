import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	Player p1;
	Player p2;  // ���������� ��� ���� �������� PLayer

	public void startGame() {
		Player p1 = new Player();
		PLayer p2 = new Player();

		int quessp1 = 0;  // ���������� ��� �������� ��������� ������ �������
		int quessp2 = 0; 

		boolean p1isRight = false;  // ���������� ��� �������� ������������ ��� ��������������
		boolean p2isRight = false;  

		/*int rand = (int)(Math.random() * 11); // ��������� ���������� �����
		System.out.println("�������� ����� �� 0 �� 10...");  */

		while(true) {
			System.out.println("����� ������� ����� �������, - " + rand);
			p1.guess();
			p2.guess();


			guessp1 = p1.number;
			System.out.println(p1 + "������ ��� - ");
			guessp2 = p2.number;
			System.out.println(p2 + "������ ��� - ");

			if (guessp1 == rand) {

				p1isRight = true;

			}
			if (guessp2 == rand.guess) {

				p2isRight = true;

			} 
			if (p1isRight || p2isRight ) {

				System.out.println("� ��� ���� ����������!");
				System.out.println("������ ����� ������?" + p1isRight);
				System.out.println("������ ����� ������?" + p2isRight);
				System.out.println("����� ����!");			

			} else {
				System.out.println("���������� ��� ���!");

			}
		}	
	}
	
	public static boolean shouldPlayAgain() {
		System.out.println("�� ��������! ������ ������� ���? ( ��/��� ");
		

		Scanner again = new Scanner(System.in);
		String yes = again.next();
		char yes = yes.charAt(1);		

		return yes == "��" || yes == "��";
	}

	public void guess () {
		int rand = (int)(Math.random() * 11); // ��������� ���������� �����
		System.out.println("�������� ����� �� 0 �� 10...");
	}
}