/*
reverse a string without changing position of space and symbols.
reverse only letter and number
java -cp /tmp/qTaGrwBE5r HelloWorld
input : string = i# like to have tea
output : a# etev ah otek ili
*/
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("string = ");
        Scanner o = new Scanner(System.in);
        String str = o.nextLine();
        String s="";
        int i = 0, j=str.length()-1;
        while(j>=0){
            while(!ischar(str,j))
               j--;
            while(!ischar(str,i)){
               s += str.charAt(i);
               i++;
            }
            s+=str.charAt(j);
            i++;
            j--;
        }
        while(i<str.length())
            s+=str.charAt(i++);
        System.out.println(s);
    }
    public static boolean ischar(String str, int index){
        if((str.charAt(index)>='a'&&str.charAt(index)<='z') || (str.charAt(index)>='0' && str.charAt(index)<='9') || (str.charAt(index)>='A' && str.charAt(index)<='Z'))
         return true;
         return false;
    }
}
