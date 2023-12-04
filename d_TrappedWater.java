// d)Given an array of integers representing the elevation of a roof structure at
// various positions, each position is separated by a unit length, Write a program
// to determine the amount of water that will be trapped on the roof after heavy
// rainfall
// Example:
// input : [2 1 3 0 1 2 3]
// Ans : 7 units of water will be trapped/

//Code
// I declare that all the solutuions given are my own and are not taken from internet or any other source
import java.util.Scanner;

public class WaterTrapped {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int i=0;
        int[] left=new int[n];
        int[] right=new int[n];
        int water=0;
        int max=0;

        for(i=0;i<n;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
            left[i]=max;
        }

        max=0;
        for(i=n-1;i>=0;i--)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
            right[i]=max;
        }

        for(i=0;i<n;i++)
        {
            int temp=Math.min(left[i], right[i]);
            water=water +temp-arr[i];
        }
        System.out.println(water);
    }
}