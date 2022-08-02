/* WAJP a java program to print a character if it is a Special character*/
class PrintSpecialCharacter
{
public static void main(String[]args)
{
char ch='@';
String res=!(ch>='0'&&ch<='9')||(ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')?"a Special character":"a not Special character";
System.out.println(ch+" is "+res);
}
}