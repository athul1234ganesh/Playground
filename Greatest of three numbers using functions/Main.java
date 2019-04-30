import java.util.Scanner;
 
class Main
{
  public static void main(String args[])
  {
    int x, y, z;
   
    Scanner in = new Scanner(System.in);
 
    x = in.nextInt();
    y = in.nextInt();
    z = in.nextInt();
 
    if (x > y && x > z)
      System.out.println("100");
    else if (y > x && y > z)
      System.out.println("98");
    else if (z > x && z > y)
      System.out.println("Third number is largest.");
    else
      System.out.println("The numbers are not distinct.");
  }
}