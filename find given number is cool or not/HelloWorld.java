/*
java -cp /tmp/DWehmHIKBC HelloWorld
NUM = 157
false

java -cp /tmp/DWehmHIKBC HelloWorld
NUM = 23650
true

cool (sum of any digit = sum of other digit)
*/
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.print("NUM = ");
        int num = o.nextInt();
        int sum = 0;
        ArrayList<Integer>arr = new ArrayList<>();
        while(num>0){
            arr.add(num%10);
            sum += num%10;
            num /= 10;
        }
        System.out.println(iscool(arr, sum));
    }
    private static boolean iscool(ArrayList<Integer>arr, int sum){
        int n = arr.size();
        int num = (int)Math.pow(2,n);
        int s, i, j;
        for(i=1;i<num;i++){
            s = 0;
            for(j=0;j<n;j++){
                if((i&(1<<j)) > 0)
                    s += arr.get(j);
            }
            if(s == sum-s)
                return true;
        }
        return false;
    }
}
