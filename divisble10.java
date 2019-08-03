import java.util.Scanner;
class main{
  public static void main(String args[]){
    int x;
    Scanner s=new Scanner(System.in);
    x=s.nextInt();
    if(x%10==0){
      System.out.println("Yes");
    }
    else{
      System.out.println("Not");
    }
  }
}
