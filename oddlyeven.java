import java.util.Scanner;
class Main{
	public static void main(String args[]){
		int n=0,a=0,r=0,b=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		while(n>0){
			r=n%10;
			if(r%2==0){
				a=a+r;
			}
			else{
				b=b+r;
			}
			n=n/10;
		}
		int c=a+b;
		System.out.println(c);
	}
}
