import java.util.Scanner;
class pos{
	public static void main(String args[]){
		int x;
		Scanner s=new Scanner(System.in);
		x=s.nextInt();
		if (x>0){
			System.out.println("Positive");
		}
		else if(x<0){
			System.out.println("Negative");
		}
		else{
			System.out.println("Zero");
		}
	}
}
