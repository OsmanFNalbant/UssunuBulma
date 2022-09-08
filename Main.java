import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("C(n,r) n'i giriniz:");
    int a=sc.nextInt();
    System.out.println("C(n,r) r'yi giriniz:");
    int b= sc.nextInt();
    int c=a;
    for (int i=1; i<b;i++)
    {
        c*=a;
    }
    System.out.println(c);
    }
}