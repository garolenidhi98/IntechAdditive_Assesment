// e)You will be given a list coin denominations that you can use to tender change to
// your customers, find the most optimum way to tender the exact change to your
// customers , the optimum is when you use the least number of coins. 

// Example:
// input => [ 1, 2, 5, 8, 10] (available coins)
// Input => 7 (Change to be given)
// Ans : [ 2, 5 ]

// Explain all the scenarios in better words and simpler to understand format compared to explanation available in the link below: 
// https://www.geeksforgeeks.org/coin-change-dp-7/

// Explain what is a greedy algorithm and how dynamic programming helps in this case. 

// Bonus question: 

// given a number N, remove one digit and print the largest possible number. 
// E.g. 
// Why is the above solution part of a greedy algorithm?
// 5 - 
// 1234
// 2945
// 9273
// 3954
// 19374



// Answers:

// 234
// 945
// 973
// 954
// 9374

//Code
//I declare that all the solutions given are my own and are not taken from internet or any other source
import java.util.*;

public class E_Bonus_LargestNumber {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int num=sc.nextInt();
            //int num=61534;
            StringBuilder str =new StringBuilder();
            String s=Integer.toString(num);
            //System.out.println(s.charAt(0));
            int j=0;
            int m=0;
            int flag=0;
            for(m=1;m<s.length();m++,j++)
            {
                    if (s.charAt(j) < s.charAt(m) && flag == 0)
                    {
                        flag = 1;
                    }
                    else
                    {
                        str.append(s.charAt(j));
                    }
            }

            if(j<s.length())
            {
                str.append(s.charAt(s.length()-1));
            }
            System.out.println(str);
            }
        }
    }

/********** why is the solution part of greedy**************
 * it is a part of greedy because because we are choosing that element from the left which is smaller than its right element
 * inorder to maximize the remaining number
 *  We are making the best possible choice locally , that provides solution to the complete problem
 */