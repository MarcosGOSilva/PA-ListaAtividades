
public class ExUm {
	public static void main(String[] args) {
		int i=1, s=0;
		
		do {
			s = s+i;
			i=i+2;
		} while(i<=1000);
		System.out.println(s);
	}
}
