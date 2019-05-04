package pratice;


class FizzBuzz 
{ 
    public static void main(String args[]) 
    {  
        int n = 100; 
  
        // loop for 100 times 
        for (int i=1; i<=n; i++)                                  
        { 
            if (i%15==0)                                                  
                System.out.print("FizzBuzz"+" ");  
            // number divisible by 5, print 'Buzz'  
            else if (i%5==0)      
                System.out.print("Buzz"+" ");  
  
            // number divisible by 3, print 'Fizz'   
            else if (i%3==0)      
                System.out.print("Fizz"+" ");  
  
            // number divisible by 15(divisible by 
            // both 3 & 5), print 'FizzBuzz' in  
            // place of the number 
                  
            else // print the numbers 
                System.out.print(i+" ");                          
        } 
    }
}
