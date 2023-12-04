// I declare that all the solutuions given are my own and are not taken from internet or any other source
/************************Greedy approach****************************************************
        is used to find a solution that provides maximum benefit at that point
It can be used in those situations where the optimal solution that is found locally can be utilised for the whole problem

Greedy approach in @WATER TRAPPED Problem:
Requirement :To maxime the boundary to get the maximum amount of water that can be trapped

Approach: For maximising we need to find the max boundary at left and right positions that can hold water for a the current
        element
      Maximise the boundary at the left, right for every elemnegt and store it in an array
        1. Find the max boundary at the right
        2. Find the max boundary at the left

After find the max right and left values, we need to find the minimum of those to boundaries so that the water
        does not flows and can be trapped, afte finding the minium for the current element's left and right' boundary and subtract
        it by the currennt elemnt's height'

We found solution for an element locally, which is being used for every element , to maximise the amt of water trapped*/

/*********************Dynamic Approach****************************
 *Approach used in Dynamic Programming is to store the solutions of subproblems in some kind of memeory and
 * then use it to find the complete solution, to prevent recomputation.
 * It is used when their are overlapping subproblems.
 *
 * It is an optimisation of Recurrsion, where multiple calls are made sometimes for a solution that is already calculated but still we calculate it again.
 * Instead if we store those results and use it in future , this would reduce time and computational cost
 *
 * for eg in Fibonacci series , when we solve it using recurssion
 * we comput fib(n-1)+fib(n-2)
 * consider a n as 4
 * fib(n-1)=3
 * fib(n-2)=2
 *
 * now notice carefully that when we compute fib(3) that will again call fib(2), which we are altraedy computing inthe above step
 * , if we optimise it and store the value of fib(2), we can reuse it without computing
 *
 *
 */