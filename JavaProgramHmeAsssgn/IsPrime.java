package JavaProgramHmeAsssgn;

public class IsPrime {
	public static void main(String[] args) {
        int number =13;
       		
        boolean isPrime = true; 
      	      for (int i = 2; i < number; i++) {
           if (number % i == 0) {
               isPrime = false;
               break; // No need to check further
           }
      
     }

       if (isPrime) {
           System.out.println(number + " is a prime number.");
       } else {
           System.out.println(number + " is not a prime number.");
       }
   }


}
