package ListHomeAssign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseElements {
    public static void main(String[] args) {
      String[] companies={"HCL", "Wipro", "Aspire Systems", "CTS"};
      List <String> comList=new ArrayList<>();
      Collections.addAll(comList,companies);
      Collections.sort(comList);
      Collections.reverse(comList);
      for(String Reverse:comList)
      {
    	  System.out.print("  "+Reverse);
      }
      
      }
}
