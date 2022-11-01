import java.util.Scanner;

public class Exp3_1 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter any three different numbers: ");
        a= obj.nextInt();
        b=obj.nextInt();
        c= obj.nextInt();
        int number=0;
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                for(int k=1;k<=3;k++){
                    if(i!=j && j!=k && k!=i){
                        number=number+1;
                        System.out.println(i+""+j+""+k);
                    }
                }
            }
        }
        System.out.println("Number of combinations that can be formed are: "+ number);
    }
}
