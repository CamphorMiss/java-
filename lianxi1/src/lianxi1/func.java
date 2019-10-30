package lianxi1;

import java.util.*;

public class func{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int count=0;
		while(s.hasNext())
		{
			int N=s.nextInt();
			int []arr=new int [N];
			for(int i=0;i<N;i++)
			{
				arr[i]=s.nextInt();
			}
			Arrays.sort(arr);
			for(int i=0;i<N;i++)
			{
				if(i==0||arr[i]!=arr[i-1])
				{
					count++;
				}
			}
			System.out.println(count);
			for(int i=0;i<N;i++)
			{
				if(i==0||arr[i]!=arr[i-1])
				{
					System.out.print(arr[i]);
					System.out.print(" ");
				}
			}
		}
		s.close();
	}

}