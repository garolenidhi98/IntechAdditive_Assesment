// Explain a piece of code that you wrote which you are proud of? If you have not written any code, please write your favorite subject in engineering studies. We can go deep into that subject.

//Solution
// I declare that all the solutuions given are my own and are not taken from internet or any other source
/**************My Favourite Subjects:**************

1. Data Structures and Algorithms
2. Java Programming Language
 */

 /**************************** Code I am proud of*******************
  * : https://practice.geeksforgeeks.org/problems/find-the-number-of-islands/1
  * why am i proud of this, I had tried executing DFS before, but failed though i had a complete understanding of wghat DFS is
  * then i thought of executing DFS via some  problem, to have  kind of realistic understanding
 Executed DFS on a grid , I found this a bit a challenging for the first time  but was able to solve it in first attempt and write an
 optimal code for this

  What is the soultion about
  The code is about finding the specific componenet in a grid
  A grid of 0 and 1's  is given, where 0 represents water and 1 represents land
  Task: is to find the number of islands in the grid , i,e findind disconnected componenets in a grid
  */

 public  class G_CodeUrProudOf {
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        // Code here
        Stack<Integer[]> stk=new Stack<Integer[]>();
        int i=0;
        int j=0;
        int count=0;
        int flag=-1;
        Integer[] src={0,0};
        /**** finding the the cell where fisrt occurrance of 1 is seen and adding that cell to stack*/
        for(i=0;i<grid.length;i++)
        {
            for(j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    src[0]=i;
                    src[1]=j;
                    count=1;
                    flag=1;
                    stk.push(src);
                    break;
                }
            }
            if(flag==1)
            {
            break;
            }
        }


/** this contains all the directions of all adjacent cells that are to be discovered in all eight directions***/
        int[] col={1,-1,0,0,-1,-1,1,1};
        int[] row={0,0,1,-1,1,-1,1,-1};
/**** This part tries to discover all the adjacent cells of the cell that is in stack,
 * the current element in the stk is popped out and all its adjacent memebers are discovered
 *
 */
        while(stk.isEmpty()==false)
        {
            src[0]=stk.peek()[0];
            src[1]=stk.peek()[1];
          //  System.out.println("______"+stk.peek()[0]+" src[0] "+stk.peek()[1]+" src[1]________ ");


            stk.pop();
            grid[src[0]][src[1]]='v';
            /** marking the cell as visited whose nodes are to be discovered, we mark it to ensure that it is not revisited**/
            for(int t=0;t<row.length;t++)
            {
                int c=col[t]+src[1];
                int r=row[t]+src[0];

                if(r<grid.length && r>=0 && c>=0 && c<grid[0].length && grid[r][c]=='1')
                {
                    Integer[] arr={r,c};
                    //System.out.println("*******Adjacents********");
                    /** pushing adjacent cells into stack**/
                    stk.push(arr);
                    //System.out.println("*******Adjacents******** "+stk.peek()[0]+" row "+ stk.peek()[1]+" col");
/** marking the cell as visited whose nodes are to be discovered, we mark it to ensure that it is not pushed into the stack
 * again and again**/
                    grid[r][c]='d';
                }
            }


            //finding disconnected compo
            /** once stk is empty, we are sure that one connected componenet is done, and we need to find another connected
             * componenet, for which we need to find the '1' again
             */

            if(stk.isEmpty())
            {

                flag=-1;
               // System.out.println("fheriru");
                for(i=0;i<grid.length;i++)
                {
                    for(j=0;j<grid[i].length;j++)
                    {
                         //System.out.print(grid[i][j]);
                        if(grid[i][j]=='1')
                        {
                            //System.out.print("fheriru");
                            src[0]=i;
                            src[1]=j;
                            stk.push(src);
                            /** for every connected compo, count is increased to track how many islands are there**/
                            count++;
                            flag=1;
                            break;
                        }
                    }
                    if(flag==1)
                    {
                        break;
                    }
                }
            }
        }
      return count;

    }
}