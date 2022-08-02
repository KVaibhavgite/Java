/*design a method which is accept a character and points its Ascii value*/
class PrintAscii
{
public static void printAscii(char ch)
{
int ascii=ch;
System.out.println(ch+"------>"+ascii);
}
public static void main(String...args)
{
printAscii('!');
printAscii('@');
printAscii('#');
printAscii('*');
printAscii('$');
printAscii(')');
}
}