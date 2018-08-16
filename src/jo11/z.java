
package jo11;

import java.util.Scanner;

public class z {
   private static void tampilPerKata(String kalimat, String convert){
        String[]arrKal = kalimat.split(" ");
        String[]arrCon = convert.split(" ");
        
        for(int i=0;i<arrKal.length;i++)
            System.out.println(arrKal[i]+" => "+arrCon[i]);
         tampilPerKata(kalimat,convert);
         
    }    
   public static void main(String[] args){
       tampilPerkata(kalimat, convert);
   }
}

