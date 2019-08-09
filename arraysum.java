
import java.util.Scanner;
class Array{
	public static void main(String args[]){
		int n=0,i=0,sum=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++){
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
}
