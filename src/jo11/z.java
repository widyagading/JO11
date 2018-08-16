
package jo11;

import java.util.Scanner;

public class z {
private static String tampilInput(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan Kalimat: ");
        String kalimat = scanner.nextLine();
        System.out.println("Kalimat Asli : " + kalimat);
        
        return kalimat;
    }    
public static void main(String[] args){
    String kalimat = tampilInput();
}
}

