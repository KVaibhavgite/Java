/*Design a method which can accept an array and a key element and return the index of an key element if 
is present else it should return-1.
*/
class LinearReturnIndex
{
public static int linearSearch(int []a ,int key)
{
for(int i=0;i<a.length;i++)
{
if(a[i]==key)
{
return i;
}
}
return -1;
}
static public void main(String[]args)
{
int[]a={11,23,32,45,67,78};
int key=4;
System.out.println(linearSearch(a,key));
}
}