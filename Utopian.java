import java.io.*;

public class Utopian {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner scan = new Scanner(System.in);
    	int l = scan.nextInt();
    	int i = 0;
    	int n, times, a;
    	int d = 1;
    	while(i++ <= l) {
    		n = (times = scan.nextInt()) / 2;
    		//System.out.println(d);
    		a = times % 2;
    		for(int k = 0; k < (n + a); k++) {
    			d = 2*d;
    			d = d + 1;
    		}
    		System.out.println(d - a);
    	}
    }
}