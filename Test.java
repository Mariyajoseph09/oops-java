class Test{
int sum(int a,int b) 
{
return a+b;
}
int sum(int a, int b, int c)
{
return a+b+c;
}
int sum(int a, int b, int c,int d)
{
return a+b+c+d;
}
public static void main(String[] args){
Test num = new Test();
System.out.println("sum1="+num.sum(10,20));
System.out.println("sum2="+num.sum(10,20,30));
System.out.println("sum3="+num.sum(10,20,30,40));
}
}
