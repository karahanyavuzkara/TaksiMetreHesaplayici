package patika;
import java.util.Scanner;
public class taksimetrehesaplayıcı {

public static void main(String[]args) {
	System.out.print("Kaç km gittiğinizi giriniz : ");
	Scanner input = new Scanner(System.in);
    double km ;
	km = input.nextDouble();
    double fiyat;
    fiyat = (km*6) + 10;
    System.out.print("Taksimetre tutarı : " + fiyat + " TL");
    
}

}
