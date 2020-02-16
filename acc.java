import java.util.Scanner;
class student
{
	String sname;
	int sroll;
	student()
	{
		sname=" ";
		sroll=0;
	}
	student(String qwe,int d)
	{
		sname=qwe;
		sroll=d;
	}
	 String getsname()
	{
		return sname;
	}
	int getsroll()
	{
		return sroll;
	}
	void setsname(String asd)
	{
		sname=asd;
	}
	void setsroll(int roll)
	{
		sroll=roll;
	}
	void display()
	{
	System.out.println(" student name   :  "+getsname());
	System.out.println("  student roll number  :"+getsroll());

	}
}
class acc
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in); 
	System.out.println("Enter name  :  ");
	String sname=sc.nextLine();
	System.out.println("Enter sroll  :");
	int sroll=sc.nextInt();
	student s=new student(sname,sroll);
		s.display();
	}
}






















