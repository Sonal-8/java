class InstanceData
{
	int n1=10;
	int n2=10;
	void product()
	{
		int mul;
		mul=n1+n2;
		System.out.println("addition="+mul);
	}
	public static void main(String args[])
	{
		InstanceData ID=new InstanceData();
		ID.product();
	}
}