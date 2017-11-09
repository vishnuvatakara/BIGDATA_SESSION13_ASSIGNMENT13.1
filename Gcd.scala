object GCD { //object of class
  def gcd(a: Int,b: Int): Int = { //function with parameters
       if(b ==0) a else gcd(b, a%b)//calculating gcd 
    }
     
    def main(args: Array[String]) { //main function
        println(gcd(98,56))//function calling and printing
    }
}
