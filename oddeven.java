import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int x;
    Scanner s=new Scanner(System.in);
    x=s.nextInt();
    if(x%2==0){
      System.out.println("Even");
    }
    else{
      System.out.println("Odd");
    }

  }
}
