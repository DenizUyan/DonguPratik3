import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a,i;
        System.out.print("Sayi Giriniz: ");
        a = input.nextInt();

        for(i = 1; i < a; i *= 4){

            System.out.println(i);
        }
        for(i = 1; i < a; i *= 5){

            System.out.println(i);
        }

    }
}