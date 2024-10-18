package JavaProgramHmeAsssgn;

public class fibonacciSeries {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range=7;
		int first=0,second=1, third;
		System.out.print(first+" ");
		System.out.print(second+" ");
		for(int i=1; i<range;i++)
		{
			third=first+second;
			System.out.print(third+" ");
			first=second;
			second=third;
			
			
		}
		

	}
}
