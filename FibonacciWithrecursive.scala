object FibonacciWithrecursive
{
    def fibonacciWithrecursive(n: Int): Int = {
       if(n ==0) return 0 
       else if(n==1)return 1
       else return (fibonacciWithrecursive(n-1)+fibonacciWithrecursive(n-2))%10
    }
     
    def main(args: Array[String]) {
        println("The last digit in 13th term is " +fibonacciWithrecursive(13))
        
    }
}