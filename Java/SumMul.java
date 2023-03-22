class SumMul
{
static int sum;
static int mul;

public static void sum(int a,int b)
{
sum=a+b;
System.out.println(sum);
}

public static void multiply()
{
mul=sum*5;
System.out.println(mul);
}

public static void main(String[] args)
{
SumMul.sum(10,8);
SumMul.multiply();
}
}