// h)Random crashes – you are given a source code to test and it randomly crashes and it never crashes in the same place ( you have attached a debugger and you find this). Explain what all you would suspect and how would you go about with isolating the cause. 

// Bonus – The deeper you go into computer architecture and explain, better. 

//Solution
/***
 *
 * Since the debugger is on, whe can check where the failure is happening and basis that we can make initila suspection
 * *******Initial Suspection************8
 * Memory: If memory is going out of bound somewhere, eg array or heap
 *****  Stack:
 ***** if any function call is being made during any recurssive call, is it going infinite times
 ***** The address of the calling function might be corrupted
 * Random variable:, if there is any random value getting genertaed every timne
 * Deadlock condition: In case of multi -threading, ifa resource or varaible is being accessd by two processes at a tiem
 * Infinite Loop
 * Checking external dependencies of the program if any
 * */
public class H_RandomCrashes {
}

