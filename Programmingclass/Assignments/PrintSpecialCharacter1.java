/* WAJP a java program to print a character if it is a Special character*/
class PrintSpecialCharacter1
{
public static void main(String[]args)
{
char ch='@';
if(!(ch>='0'&&ch<='9')||(ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
{
System.out.println(ch);
}
}
}