class MyFirstGame {
	public static void main (String [] args)  {
		int guess =  30; // ��������� �����
		int rand = 50;	// ��������� �����

		while (guess !=rand) {
            if (guess > rand) {
            	System.out.println ("����� ������ " + guess);
            	guess = guess - 1;
            }
            else {
            	System.out.println ("����� ������ " + guess);
            	guess = guess + 1;
            }                    
        }
        if (guess == rand){
        System.out.println ("������");	
		  
		
			
		} 
	}
}