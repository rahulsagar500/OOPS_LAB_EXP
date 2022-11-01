import java.util.Scanner;
class number{
    int[] numbers=new int[10];
    void input(){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter any 10 numbers: ");
        for(int i=0;i<10;i++){
            numbers[i]=obj.nextInt();
        }
    }
    void add(){
        int sum=0;
        for(int i=0;i<10;i++){
            sum=sum+numbers[i];
        }
        System.out.println("The sum of the numbers you have entered is: "+sum);
    }
    void square(){
        System.out.println("Square of the numbers you have entered are: ");
        for(int i=0;i<10;i++){
            System.out.println(numbers[i]*numbers[i]);
        }
    }
}

public class Exp3_2 {
    public static void main(String[] args) {
        number a=new number();
        a.input();
        a.square();
        a.add();
    }
}
