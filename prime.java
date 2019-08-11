
import java.util.Scanner;
class prime{
	public static void main(String args[]){
	int n=0,i=0;
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	boolean flag=false;
	for(i=2;i<=n/2;i++){
		if(n%i==0){
			flag=true;
			break;
		}
	}
	if(!flag){
		System.out.println(n + " is prime");
	}
	else{
		System.out.println(n + " is not prime");
	}
