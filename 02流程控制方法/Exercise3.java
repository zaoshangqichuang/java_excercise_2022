/**
 * no1:99乘法表
 * no2:打印等腰三角形
 */
package exercise3;
public class Exercise3
{
	public static void main(String[] args)
	{
		//1
		for(int i = 1;i<=9;i++)
		{
			for(int j = i;j<=9;j++)
			{
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
		//2
		for(int x=1;x<=5;x++)
		{
			for(int y=1;y<=5-x;y++)
			{
				System.out.print("-");
			}
			for(int y=1;y<=x;y++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
	}