/* WAJP a java program to print a character if it is a digit*/
class PrintDigit
{
public static void main(String[]args)
{
char ch='5';
String res=(ch>='0'&&ch<='9')?"it is a digit":"it is a not digit";
System.out.println(res);
}
}