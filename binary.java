import java.ut   il.Scanner
class BinaryNo
{
	long n1;
	long n2;
	int i=0,carry=0;
	void add()
	{
		long res;
		res=n1+n2;
		System.out.println("result:="+res);
	}
	public static void main(String args[])
	{
		BinaryNo BN=new BinaryNo();
		BN.add(100,11);
	}
} 