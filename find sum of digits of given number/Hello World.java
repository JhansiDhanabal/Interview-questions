/*
java -cp /tmp/DWehmHIKBC HelloWorld
num = 5678
26

*/
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.print("num = ");
        Scanner o = new Scanner(System.in);
        int num = o.nextInt();
        int sum = 0;
        while(num>0){
            sum += num%10;
            num /= 10;
        }
        System.out.println(sum);
    }
}
