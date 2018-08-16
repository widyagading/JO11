
package jo11;

import java.util.Scanner;

public class z {
    public static void main(String[] args){
 String x = "operasi";
 String y = "";
 String z = "operasi";
 String r = "operasi";
  System.out.println("perbandingan isi x dengan y : " + x.compareTo(y));
     System.out.println("perbandingan isi x dengan z (Case sensitive) : " + x.compareTo(z));
     System.out.println("perbandingan isi x dengan r (Case Sensitive) : " + x.compareTo(r));
     System.out.println("perbandingan isi x dengan r (Not Case Sensitive) : " + x.compareToIgnoreCase(r));
     
     String s = "operasI";
     System.out.println("isi variabel s : "+ s);
     System.out.println("perbandingan isi r dengan s (Case Sensitive) : " + r.compareTo(s));
     
}
}

