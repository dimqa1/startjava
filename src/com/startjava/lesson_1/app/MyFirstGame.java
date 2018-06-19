package com.startjava.lesson_1.app;

class MyFirstGame {
	public static void main (String [] args)  {
		int guess =  30; // введенное число
		int rand = 30;	// случайное число

		while (guess !=rand) {
            if (guess > rand) {
            	System.out.println ("Число больше " + guess);
            	guess = guess --;
            }
            else {
            	System.out.println ("Число меньше " + guess);
            	guess = guess ++;
            }                    
        }
        if (guess == rand){
        System.out.println ("Угадал");	
		  
		
			
		} 
	}
}