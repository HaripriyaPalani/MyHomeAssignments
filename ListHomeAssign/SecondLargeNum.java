package ListHomeAssign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondLargeNum {

	public static void main(String[] args) {
	int array[]= {3, 2, 11, 4, 6, 7};
         Arrays.sort(array);
         
         int SecondLarge = array[array.length - 2];
	System.out.println(SecondLarge);
	
	}

}
