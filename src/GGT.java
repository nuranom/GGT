
public class GGT {

	public static void main(String[] args) {
		
		int m,n,r,cache ;
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		m = a ; n = b;
		if (m >= 0 && n >= 0) {
		do {
		if  (m < n)  { 
		cache = m;
		m = n;
		n = cache;}
		
		r = m - n ;
		m = n ;
		n = r ; }
		while (r != 0 );
		
		System.out.println (m);
		}
		else {
			System.out.println ("Zahlen kleiner als 0 werden nicht akzeptiert!");
		}
					}
	
		}


