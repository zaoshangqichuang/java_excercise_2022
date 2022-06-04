/**
 * no1.求2*8
 * no2.交换两个变量的数值
 * no3.十进制转换为十六进制
 */
package excercise1;
public class Excercise1
{
	public static void main(String[] args) 
	{
		//1
		System.out.println("no.1:求2*8");
		byte a = 2;
		a = (byte) (a<<3);
		System.out.println(a);
		//2
		System.out.println("no.2:交换两个变量的数值");
		//方法1：求和
		int b1 = 2,b2 = 3;
		System.out.println("初始：b1="+b1+","+"b2="+b2);
		b1 = b1 + b2;
		b2 = b1 - b2;
		b1 = b1 - b2;
		System.out.println("交换后：b1="+b1+","+"b2="+b2);
		//方法2：异或运算
		b1 = 2;
		b2 = 3;
		System.out.println("初始：b1="+b1+","+"b2="+b2);
		b1 = b1^b2;
		b2 = b1^b2;
		b1 = b1^b2;
		System.out.println("交换后：b1="+b1+","+"b2="+b2);
		//3
		int aa = 2716;
		int b = aa&15;
		//System.out.println(b);
		System.out.print(b >= 10? (char)(b-10+'A'):b);
		aa = aa>>4;
		b = aa&15;
		System.out.print(b >= 10? (char)(b-10+'A'):b);
		aa = aa>>4;
		b = aa&15;
		System.out.print(b >= 10? (char)(b-10+'A'):b);
	}

}