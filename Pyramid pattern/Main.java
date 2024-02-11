/******************************************************************************

row = 3
  +
 +++
+++++

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.print("row = ");
        Scanner o = new Scanner(System.in);
        int n = o.nextInt(), i, j;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++)
                System.out.print(" ");
            for(;j<n+i;j++)
                System.out.print("+");
            System.out.println();
        }
	}
}
