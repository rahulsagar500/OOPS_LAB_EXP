public class Exp3_4 {
    static void sum(){
            int add=0;
            for(int i=40;i<250;i++){
                if(i%5==0){
                    add=add+i;
                }
            }
        System.out.println("The sum of the numbers from (40,250) and divisible by 5 is: "+add);
    }
    public static void main(String[] args) {
        sum();
    }
}
