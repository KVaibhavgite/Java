/* WAJP to search an element from the array*/
class LinearSearch
{
public static void main(String[]args)
{
int []a={11,4,7,3,6,8,5};
int key=4;
int i=0;
int flag=0;//Assuming key not found
for(i=0;i<a.length;i++)
{
if(a[i]==key)
{
flag=2;
break;
}
}
if(flag==1)
{
System.out.println(key+"  not found");
}
else
{
System.out.println(key+" found at index"+i);
}
}
}
