class maindriver extends main
{
 public static void main(String[]args)
	{
		main obj=new main("Rituritu","Ritu@1234");
		System.out.println(obj.login("gd",""));
		System.out.println(obj.logout("logout",""));
		System.out.println(obj.forgotpassward("forget",""));
		System.out.println(obj.create_new("create",""));
	
	}

}