import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int taban, us;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Üslü Sayı Hesaplama Programı");
        System.out.print("Taban Sayıyı Girin : ");
        taban = scanner.nextInt();
        System.out.print("Üssünü Girin : ");
        us = scanner.nextInt();
        int result = taban;
        for(int i = 1; i < us; i++){
            result *= taban;
        }
        System.out.println(result);
    }
}
