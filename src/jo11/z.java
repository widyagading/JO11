
package jo11;

import java.util.Scanner;

public class z {
    public static void main(String[] args){
 String x = "operasi";
 String y = "";
 String z = "operasi";
 String r = "operasi";
 String s = "operasI";
 String t = "    operasi string   ";
  System.out.println("karaktr mulai posisi 3 di vaiabel x : " + x.substring(3));
      System.out.println("karekter dari posisi 3-5 di variabel x : " + x.substring(3,6));
      
      String tclean = t.trim();
      System.out.println("isi variabel tclean : "+ t.trim());
      System.out.println("rubah 'i' jadi 'E' di variabel tclean : " + tclean.replace("i", "E"));
      
      String[] arrT = tclean.split(" ");
       System.out.println("pecah kata di variabel tclean : ");
       for(int i=0; i<arrT.length; i++)
          System.out.println(arrT[i]);
       String[] arrTr = tclean.split("r");
        System.out.println("pecah berdasarkan huruf 'r' di variabel tclean : ");
        
        for(int i=0; i<arrTr.length; i++)
         System.out.println(arrTr[i]);
     
     
}
}

