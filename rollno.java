import java.util.Scanner;
class Rollno{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		String college=s.nextLine();
		String dept=s.nextLine();
		String dob=s.nextLine();
		String name=s.nextLine();
		String rollno=college.substring(0,1)+dept.substring(0,2)+dob.substring(0,2)+name.substring(0,4)+dob.substring(3,5)+dob.substring(8);
		System.out.println(rollno);
	}
}
