/**
 * no1:求1~100的和
 * no2:求1~100中7的倍数的个数
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