public class E_CoinChange {
    /***********Approach**********************8/
// main approach is to make two cases , i.e either to include a coin or to exclude it.
// case1:  we include the coin again two cases will be formed for  the reaming cahnge(as coin included will be subtarcted from change)
// case2: if we exclude the coin, again two cases will be formed for the reaming coins
// m is size of coins array
     */
    // (number of different coins)
   public  static int minCoinChange(int coins[], int change, int size)
    {
        int i=0;
        int dp[] = new int[change + 1];
        // array dp store the minimum no of coins required to   make the cahnge

        //Case 1:
        dp[0] = 0;// initialised to 0, as if the chnage =0 , so minimum number of coins required are 0


        for (i = 1; i <= change; i++)
            dp[i] = 999999999;

        int j=0;
        // outer loop runs from 1 till the complete cahnge , and for every value inner loop calculate
        // all the minimum number of coins that are less than i
        for (i = 1; i <= change; i++)
        {
            for (j = 0; j < size; j++)
                // if current coin value is less than the current change value i.e i, then subtarct it frm the chnage
                if (coins[j] <= i)
                {
                   // then subtarct it frm the chnage
                    int ans = dp[i-coins[j]];
                   // if ans has some other value and ans+1 is less than the change at i,
                    // then update the dp table with ans+1, this constantly updates the table thius preventing the need of recomputing
                    if (ans != 999999999 && (ans+1) < dp[i])
                        dp[i] = ans + 1;
                }
        }
        if(dp[change]==999999999)// if the value of cahnge is unedited, i.e the minimum possible coins not found /
            // or the change cannot be provided return -1
            return -1;

        return dp[change];
    }

    // Driver program
    public static void main (String[] args)
    {
        int coin[] = {1,2,5,8,10};
        int change = 7;

        System.out.println (minCoinChange(coin, change, coin.length));
    }
}


/**********************What is a greedy algorithm**************************/
//It is used to find a solution that provides maximum benefit at that pointIt can be used in those situations, i.e,
//selecting the best solution available at the moment
//where the optimal solution that is found locally can be utilised for the whole problem

/*******************How DP is helpful in this problem**************************/
// If we use Greedy here, we end up choosing the coin that is nearest to the change value
// But sometimes we also see a situation where in, choosing the max coin ends up in taking more number of coins than required
// for eg: {9, 6, 5, 1} and change = 11.
// greedy gives - 9,1,1
// optimum sol is: 6+5
// Here we might think of using Recurssion or DP, Since it can be seen as a recurrance relation hence it has an optimal substructure property
    /**********Recurssion, but using recurrsion would end up calling the same function .
     *or computing same value multiple times in order to find the minimum number of coins fo a change
     */

/********** Dynamic programming*****************/
//Dp is used as  it can be seen as a recurrance relation hence it has an optimal substructure property
// thus we can create a table dp and store the results, here we have used the bottom up approach
// Take each coin one by one and fill DP  for that coin, for all the values from 0, to change
/***********Approach**********************8/
 // main approach is to make two cases , i.e either to include a coin or to exclude it.
 // case1:  we include the coin again two cases will be formed for  the reaming cahnge(as coin included will be subtarcted from change)
 // case2: if we exclude the coin, again two cases will be formed for the reaming coins

 */