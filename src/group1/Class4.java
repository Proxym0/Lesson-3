package group1;

import java.util.Scanner;

public class Class4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int temp=scanner.nextInt();
        if(temp>-5){
            System.out.println("тепло");
        }else if(-5>=temp&&temp<=-20) {
            System.out.println("нормально");
        }else if(temp>=-20){
            System.out.println("холодно");
        }else{
            System.out.println(" ");
        }
    }
}
