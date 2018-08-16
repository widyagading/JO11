
package jo11;

import java.util.Scanner;

public class z {
    public static void main(String[] args){
 String x = "operasi";
 String y = "";
        System.out.println("isi x sama dengan y :" + x.equals(y));
     
     String z = "operasi";
     System.out.println("isi variabel z : " + z);
     System.out.println("isi x sama dengan z (Case Sensitive): " + x.equals(z));
     
     String r = "operasi";
     System.out.println("isi variabel r : "+ r);
     System.out.println("isi x sama dengan r (Case Sensitve) : " + x.equals(r));
     System.out.println("isi x sama dengan r (Not Case Sensitive) : " + x.equalsIgnoreCase(r));
}
}

