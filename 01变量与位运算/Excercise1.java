/**
 * no1.��2*8
 * no2.����������������ֵ
 * no3.ʮ����ת��Ϊʮ������
 */
package excercise1;
public class Excercise1
{
	public static void main(String[] args) 
	{
		//1
		System.out.println("no.1:��2*8");
		byte a = 2;
		a = (byte) (a<<3);
		System.out.println(a);
		//2
		System.out.println("no.2:����������������ֵ");
		//����1�����
		int b1 = 2,b2 = 3;
		System.out.println("��ʼ��b1="+b1+","+"b2="+b2);
		b1 = b1 + b2;
		b2 = b1 - b2;
		b1 = b1 - b2;
		System.out.println("������b1="+b1+","+"b2="+b2);
		//����2���������
		b1 = 2;
		b2 = 3;
		System.out.println("��ʼ��b1="+b1+","+"b2="+b2);
		b1 = b1^b2;
		b2 = b1^b2;
		b1 = b1^b2;
		System.out.println("������b1="+b1+","+"b2="+b2);
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