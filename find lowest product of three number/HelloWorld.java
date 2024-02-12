/*
java -cp /tmp/DWehmHIKBC HelloWorld
n = 5
ARRAY = 1 2 -4 -9 5
-90
*/
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.print("n = ");
        int n = o.nextInt();
        int sum = 0;
        int arr[] = new int[n];
        System.out.print("ARRAY = ");
        for(int i=0;i<n;i++){
            arr[i] = o.nextInt();
            sum += arr[i]; 
        }
        int low = arr[0]*arr[1]*arr[2];
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k = j+1;k<n;k++){
                    low = Math.min(low, arr[i]*arr[j]*arr[k]);
                }
            }
        }
        System.out.println(low);
    }
    
}
