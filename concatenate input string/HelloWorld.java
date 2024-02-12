/*
concatenate two string such that last character in the first string and 1st character in 2nd  string are same either one should be removed

java -cp /tmp/DWehmHIKBC HelloWorld
String 1 : good
String 2 : boy
goodboy

java -cp /tmp/DWehmHIKBC HelloWorld
String 1 : bat
String 2 : tree
batree

*/

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.print("String 1 : ");
        String str1 = o.next();
        System.out.print("String 2 : ");
        String str2 = o.next();
        if(str1.charAt(str1.length()-1) == str2.charAt(0))
            System.out.println(str1+str2.substring(1));
        else
            System.out.println(str1+str2);
    }
    
}
