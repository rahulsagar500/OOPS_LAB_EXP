import java.util.Arrays;

import java.util.Scanner;
class student{
    int[] marks=new int[10];
    void input(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the marks of the students: ");
        for(int i=0;i<10;i++){
            marks[i]= obj.nextInt();
        }

    }
    void display(){
        Arrays.sort(marks);                    //making the marks in ascending order
        for (int i=0;i<10;i++){
            if(marks[i]>40 && marks[i]<=50){
                System.out.println(marks[i]+"-----PASS");
            }
            if(marks[i]>50 && marks[i]<=75) {
                System.out.println(marks[i]+"-----MERIT");
            }
            if(marks[i]>75) {
                System.out.println(marks[i]+"-----DISTINCTION");
            }

        }
    }

}
public class Exp2_4 {
    public static void main(String[] args) {
        student a=new student();
        a.input();
        a.display();
    }
}

