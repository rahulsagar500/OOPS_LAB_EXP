interface test{
    void square();
}
class arithmetic implements test{
    public void square(){
        System.out.println("Hey this is square");
    }
}
public class exp5_1 {
    public static void main(String[] args) {
        arithmetic a = new arithmetic();
        a.square();
    }
}
