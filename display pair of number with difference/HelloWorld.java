/*
java -cp /tmp/DWehmHIKBC HelloWorld
n = 7
ARRAY = 4 6 8 1 3 7 9
difference = 2
4 6
6 8
1 3
7 9
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
        System.out.print("difference = ");
        int diff = o.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(list.contains(arr[i]-diff))
                System.out.println((arr[i]-diff)+" "+arr[i]);
            list.add(arr[i]);
        }
    }
    
}
