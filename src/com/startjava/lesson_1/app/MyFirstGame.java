package com.startjava.lesson_1.app;

class MyFirstGame {
	public static void main (String [] args)  {
		int guess =  30; // ��������� �����
		int rand = 30;	// ��������� �����

		while (guess !=rand) {
            if (guess > rand) {
            	System.out.println ("����� ������ " + guess);
            	guess = guess --;
            }
            else {
            	System.out.println ("����� ������ " + guess);
            	guess = guess ++;
            }                    
        }
        if (guess == rand){
        System.out.println ("������");	
		  
		
			
		} 
	}
}