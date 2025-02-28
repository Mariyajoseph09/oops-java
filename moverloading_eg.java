class moverloading_eg{
void mul(int a,int b)
{
System.out.println(a*b);
}
void mul(int a,int b,int c)
{
System.out.println(a*b*c);
}
void mul(int a, int b, int c,int d)
{
System.out.println(a*b*c*d);
}
public static void main(String[] args){

moverloading num = new moverloading();
num.mul(2,1);
num.mul(2,3,4);
num.mul(2,3,7,5);
}
}
