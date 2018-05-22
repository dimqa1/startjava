class MyFirstGame {
	public static void main (String [] args)  {
		int guess =  30; // введенное число
		int rand = 50;	// случайное число

		while (guess !=rand) {
            if (guess > rand) {
            	System.out.println ("Число больше " + guess);
            	guess = guess - 1;
            }
            else {
            	System.out.println ("Число меньше " + guess);
            	guess = guess + 1;
            }                    
        }
        if (guess == rand){
        System.out.println ("Угадал");	
		  
		
			
		} 
	}
}