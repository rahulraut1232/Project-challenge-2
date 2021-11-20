import java.util.Scanner;
class First
{
	static int subArray(int arr[])
	{
		int count=0;
		
		
		for(int i=0;i<arr.length-1;i++)//5,4,3,2,1
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					count++;
					break;
				}
			}
		}
		return count;
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("How many numbers you want to enter");
		int size = in.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = in.nextInt();
		}
		
		System.out.println("Sub array count is: "+First.subArray(arr));
	}

}
