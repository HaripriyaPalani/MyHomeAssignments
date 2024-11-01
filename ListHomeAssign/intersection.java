package ListHomeAssign;

import java.util.ArrayList;
import java.util.List;

public class intersection {
	public static void main(String[] args) {
		int[] array1 = {3, 2, 11, 4, 6, 7};
	    int[] array2 = {1, 2, 8, 4, 9, 7};
	    List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int n1:array1)
        	list1.add(n1);
        for(int n2:array2)
        	list2.add(n2);
        ArrayList intersection =new ArrayList();
        for(Integer n3:list1)
        {if(list2.contains(n3)) {
        	intersection.add(n3);
        	
        }
  
	}
	System.out.println(intersection);

	}
}
