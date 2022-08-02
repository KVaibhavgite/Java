class comLineTest
{
	public static void main(String [] args)
	{
		int count,i=8;
		String string;
		count=args.length;
		System.out.println("Number of arguments = "+ count);//Number of arguments =
		while(i<count)
		{
			string=args[i];
			i=i+1;
			System.out.println(i+" : "+"Java is "+string+" !");
		}
	}


}