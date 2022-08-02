class  PrintEvenNumber
{
	public static void main(String[] args) 
	{
		int []a={10,11,12,44,22,7,9,66};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				count++;
			}
		}
		System.out.println(count);//5
	}
}
