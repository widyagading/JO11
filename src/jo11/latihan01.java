
package jo11;

import java.util.Locale;

public class latihan01 {
    public static void main(String[] args) {
      String identitas = "Widya Gading Sejati / XRPL2 / 38";
      System.out.println("Identitas : "+ identitas);
      
      String x = "operasi";
      System.out.println("isi variabel x : " + x);
      System.out.println("\"" + x + "\" panjang karakter = "+ x.length());
      
      System.out.println("x adalah kosong : " + x.isEmpty());
      
      String y = "";
      System.out.println("isi variabel y : "+ y);
      System.out.println("y adalah kosong : "+ y.isEmpty());
      
      System.out.println("isi x sama dengan y :" + x.equals(y));
     
     String z = "operasi";
     System.out.println("isi variabel z : " + z);
     System.out.println("isi x sama dengan z (Case Sensitive): " + x.equals(z));
     
     String r = "operasi";
     System.out.println("isi variabel r : "+ r);
     System.out.println("isi x sama dengan r (Case Sensitve) : " + x.equals(r));
     System.out.println("isi x sama dengan r (Not Case Sensitive) : " + x.equalsIgnoreCase(r));
     
     System.out.println("perbandingan isi x dengan y : " + x.compareTo(y));
     System.out.println("perbandingan isi x dengan z (Case sensitive) : " + x.compareTo(z));
     System.out.println("perbandingan isi x dengan r (Case Sensitive) : " + x.compareTo(r));
     System.out.println("perbandingan isi x dengan r (Not Case Sensitive) : " + x.compareToIgnoreCase(r));
     
     String s = "operasI";
     System.out.println("isi variabel s : "+ s);
     System.out.println("perbandingan isi r dengan s (Case Sensitive) : " + r.compareTo(s));
     
      
      }
    
}
