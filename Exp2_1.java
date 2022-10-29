import java.util.Scanner;

public class Exp2_1 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.println("The number which is greatest among a,b,c is:");
        if(a>b && a>c){
            System.out.println(a);
        } else if (b>a && b>c) {
            System.out.println(b);
        } else if (c>a && c>b) {
            System.out.println(c);
        }
    }
}
