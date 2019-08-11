import java.util.Scanner;
class Main{
	public static void main(String args[]){
		int n=0,a=0,r=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		while(n>0){
			r=n%10;
			a=a+r;
		    n=n/10;
		}
		System.out.println(a);
		
	}
}
