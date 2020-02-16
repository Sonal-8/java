import java.util.Scanner;
class bank
{
   String foldername;
   int balance;
   Scanner S=new Scanner(System.in);
   System.out.println("Enter foldername:=");
   foldername=S.nextLine();
   System.out.println("Enter balance:=");
   balance=S.nextLInt();
}
class current extends bank
{
   boolean od=true;
   int wamt,reamt;
   reamt=wamt-balance;
   if(od==true)
     {
        if(reamt>0)
         {
           System.out.println("remaining ammount:-"+reamt);
         }
        else
         {
           reamt=reamt * -1;
           System.out.println("overdrown value:-"+reamt);
         }
    }
}
class inheritance
{
  public static void main(String args[])
   {
     current=new current();
   }
}		