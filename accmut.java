class practice
{
	int d;
	practice()
	{
		d=0;
	}
	practice(int a)
	{
		d=a;
	}
	int getd()
	{
		return d;
	}
	void setd(int z)
	{
		d=z;
	}
	
}
class accmut
{
	public static void main(String args[])
	{
	practice q=new practice();
	q.setd(10);
	System.out.println("value of a   :"+q.getd());			
	}
}