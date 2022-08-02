// WAJP to check wheather a character is special character or not.
class spc
{
public static void main (String []args)
{
char ch='E';
if(ch>='a'&&ch<='z')
{
System.out.println(ch+" it is lower case alphabet");
}
else if(ch>='A'&&ch<='Z')
{
System.out.println(ch+" it is Upper case alphabet");
}
 else if(ch>='0'&&ch<='9')
{
System.out.println(ch+" it is  Digit");
} 
else
{
System.out.println(ch+" it is  Special character");
}
}
}