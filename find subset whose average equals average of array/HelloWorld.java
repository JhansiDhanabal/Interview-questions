/*
java -cp /tmp/DWehmHIKBC HelloWorld
n = 4
ARRAY = 10 20 30 40
20 30 
10 40 
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
        double avg = sum*1.0/n;
        
        SubsetAverage(arr, avg);
    }
    private static void SubsetAverage(int arr[], double avg){
        int n = arr.length;
        int num = (int)Math.pow(2,n);
        int s, i, j, c;
        for(i=1;i<num-1;i++){
            s = 0;
            c = 0;
            for(j=0;j<n;j++){
                if((i&(1<<j)) > 0){
                    s += arr[j];
                    c++;
                }
            }
            if((s*1.0)/c == avg)
            {
                for(j=0;j<n;j++){
                    if((i&(1<<j)) > 0)
                        System.out.print(arr[j]+" ");
                }
                System.out.println();
            }  
        }
        
    }
}
