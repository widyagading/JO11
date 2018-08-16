
package jo11;

import java.util.Locale;
import java.util.Scanner;

public class z {
    public static void main(String[] args){
 String x = "operasi";
 String y = "";
 String z = "operasi";
 String r = "operasi";
 String s = "operasI";
 String t = "    operasi string   ";
double d = 1545454000;
        System.out.println(String.format("Uang saya %,.4f", d));
        
        System.out.println(String.format(Locale.forLanguageTag("in-ID"), "uang saya Rp %,.2f", d));
     
     
}
}

