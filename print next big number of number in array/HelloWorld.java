/*
java -cp /tmp/DWehmHIKBC HelloWorld
N = 4
ARRAY = 1 9 2 4
x = 2
next big number 4
*/
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.print("N = ");
        int n = o.nextInt(), i;
        System.out.print("ARRAY = ");
        int arr[] = new int[n];
        for(i=0; i<n; i++){
            arr[i] = o.nextInt();
        }
        System.out.print("x = ");
        int x = o.nextInt();
        int next = arr[0];
        for(i = 1; i<n; i++){
            if(x<arr[i])
            {
                if(next < x)
                    next = arr[i];
                else if(next > arr[i])
                    next = arr[i];
            }
        }
        System.out.println("next big number "+next);
    }
    
}
