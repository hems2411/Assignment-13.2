object FibonacciWithoutrecursive
{
    def fibonacciWithoutrecursive(n: Int,first: Int) = {
       var prev:Int =first
       var current:Int =first + 1
        var fib :Int =0
        var i:Int =0
         print(prev+""+current)
        for(i <-1 to n)
        {
            fib = prev + current
            prev = current
            current = fib
            
            print(fib)
        }
        print("\nThe last digit in is " +fib%10)
    }
     
    def main(args: Array[String]) {
        fibonacciWithoutrecursive(10,1)
        
    }
}