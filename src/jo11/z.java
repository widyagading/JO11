
package jo11;

import java.util.Scanner;

public class z {
    private static String vocal2Angka(String kalimat){
            
        char [][] arConvert =
                
        {{'a','4'},{'i','1'},{'u','2'},{'e','3'},{'o','0'}};
        
        kalimat = kalimat.toLowerCase();
        for(int i=0;i<arConvert.length;i++)
            kalimat = kalimat.replace(arConvert[i][0], arConvert[i][1]);
        
        return kalimat;
    }
    
     public static void main(String[] args){
       String convert = vocal2Angka(kalimat());
    }
}

