package lianxi2;

import java.util.*;
public class Func {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int max=0;
		int pos=0;
		while(s.hasNext()) {
			int N=s.nextInt();
			int []arr=new int[N];
			for(int i=0;i<N;i++)
			{
				arr[i]=s.nextInt();
			}
			Arrays.sort(arr);
			 for(int i=1;i<N;i++)
			 {
				 int count=0;
				 while(arr[i]==arr[i-1])
					 count++;
				// max=max<count?count:max;
				 if(count>max)
				 {
					 max=count;
					 pos=i-1;
				 }
			 }
			 System.out.print(max);
			 System.out.println(arr[pos]);
			 s.close();
			 }
}
}