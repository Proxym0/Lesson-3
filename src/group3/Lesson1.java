package group3;

public class Lesson1 {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int sum =a+b;
        System.out.print(a+" "+b);
        for(int i=0;i<=8;i++){
            sum=b+a;
            a=b;
            b=sum;
            System.out.print(" "+sum);
        }
    }
}
