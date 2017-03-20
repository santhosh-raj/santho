import java.util.*;
class Aarray
{
public static void main(String args[])
{int lc,lm;
int [][]arr= new int [2][2];
Scanner S=new Scanner(System.in);
for(lc=0;lc<2;lc++)
{
 for(lm=0;lm<2;lm++)
{
  System.out.println("enter the values"+lc+" "+lm);
  arr[lc][lm]= S.nextInt();
}
}
System.out.println("output");
for(lc=0;lc<2;lc++)
{
for(lm=0;lm<2;lm++)
{
  System.out.println(" "+arr[lc][lm]);
}
}
}
}