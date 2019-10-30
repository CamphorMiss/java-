package lianxi3;
import java.util.*;
public class Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		while(s.hasNext())
		{
		int n=s.nextInt();
		int k=s.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		{
		arr[i]=s.nextInt();
		}
		Arrays.sort(arr);
		int count=0;
		Boolean flag=false;
		int j=0;
		for(j=0;j<n;j++)
		{
			if(j==0||arr[j]!=arr[j-1])
			count++;
			if(count==k)
			{
				flag=true;
				break;
			}
		}
		if(flag==false)
			System.out.println("NO REAULT");
		else
			System.out.println(arr[j]);
		}
		s.close();
}

}
