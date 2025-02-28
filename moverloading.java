class moverloading{
int mul(int a,int b)
{
return a*b;
}
int mul(int a,int b,int c)
{
return a*b*c;
}
int mul(int a, int b, int c,int d)
{
return a*b*c*d;
}
public static void main(String[] args){

moverloading num = new moverloading();
System.out.println("mul1="+num.mul(2,3));
System.out.println("mul2="+num.mul(2,3,4));
System.out.println("mul3="+num.mul(2,3,4,5));
}
}
