import java.util.Scanner;

class month{
    void output(){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number between 1 to 12: ");
        int number= obj.nextInt();
        switch (number){
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("Jul");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sep");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;
        }
    }
}
public class Exp3_3 {
    public static void main(String[] args) {
        month a=new month();
        a.output();
    }
}
