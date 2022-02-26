import java.util.Scanner;
public class buyukKucuk {

public static void main(String[] args) {
  
  int a, b ,c;

  Scanner sayi = new Scanner(System.in);

  System.out.print("Birinci Sayıyı Giriniz : ");

  a = sayi.nextInt();

  System.out.print("İkinci Sayıyı Giriniz : ");

  b = sayi.nextInt();

  System.out.print("Üçüncü Sayıyı Giriniz : ");

  c = sayi.nextInt();



  if (a < b && a < c){
    if (b < c){
      System.out.println("Küçükten büyüğe doğru sıralama şu şekildedir: " + a + " < " + b + " < " + c );
    }
    else{
      System.out.println("Küçükten büyüğe doğru sıralama şu şekildedir: " + a + " < " + c + " < " + b );
    }

  }
  else if (b < a && b < c){
    if (a < c){
      System.out.println("Küçükten büyüğe doğru sıralama şu şekildedir: " + b + " < " + a + " < " + c );

    }
    else{
      System.out.println("Küçükten büyüğe doğru sıralama şu şekildedir: " + b + " < " + c + " < " + a );
    }
  }
  else /*if (c < b && c < a)*/{
    if (b < a){
      System.out.println("Küçükten büyüğe doğru sıralama şu şekildedir: " + c + " < " + b + " < " + a );
    }
    else{
      System.out.println("Küçükten büyüğe doğru sıralama şu şekildedir: " + c + " < " + a + " < " + b );
    }
  }

  sayi.close();
}
  
}
