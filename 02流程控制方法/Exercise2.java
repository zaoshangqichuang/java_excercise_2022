/**
 * no1:��1~100�ĺ�
 * no2:��1~100��7�ı����ĸ���
 */
package exercise2;
public class Exercise2
{
	public static void main(String[] args)
	
	{
		//1
		int temp = 0;
		for (int i = 1;i<=100;i++)
		{
			temp += i;
		}
		System.out.println(temp);
		
		//2
		temp = 0;
		for(int i = 1;i<=100;i++)
		{
			if(i%7 == 0)
				temp++;
		}
		System.out.println(temp);
		
	}
	
}