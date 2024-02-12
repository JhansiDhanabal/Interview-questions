/*
java -cp /tmp/DWehmHIKBC HelloWorld
[6, 2, 7, 4]
*/
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int arr2[] = {1,2,1,5,3};
        int arr1[] = {5,8,7,9};
        int n = arr1.length>arr2.length?arr1.length:arr2.length;
        
        if(arr1.length != n)
        {
            int temp[] = arr1;
            arr1 = arr2;
            arr2 = temp;
        }
        int i=n-1, j=arr2.length-1, curr;
        while(j>=0){
            if(arr1[i]>=arr2[j])
                arr1[i] = arr1[i] - arr2[j];
            else{
                curr = i-1;
                while(curr>0 && arr1[curr]==0)
                {
                    arr1[curr] = 9;
                    curr--;
                }
                arr1[curr] -= 1;
                arr1[i] = arr1[i]+10 - arr2[j];
            }
            i--;
            j--;
        }
        while(i>=0 && arr1[i]>0)
            arr1[i] = arr1[i--];
        int arr[] = new int[n-(i+1)];
        for(j=0;j<arr.length;j++)
            arr[j] = arr1[++i];
            
        System.out.println(Arrays.toString(arr));
        
    }
}
