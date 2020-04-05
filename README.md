# ScalaCodingPractice
// Problem Statement: Given an array of 0s and 1s.
// Fins the masximum length subarray containing equal number of 0s and 1s


// Problem Statement
// Find a pair of elemnts in the given list whose sum == target
// Input 1: target = 9  --> pair (3,6) : So return true
// Input 2: target = 21 --> no pair exists in given list : So return false

def maxSubarray(arr : Array[Int]) : Int = {
       
       val map = scala.collection.mutable.Map[Int,Int]()
       var sum = 0;
       var answer = -1
       
       for(i <- 0 until arr.length){
           
           if(arr(i) == 1) sum += arr(i) else sum -= 1
         
           if(sum == 0)
           answer = i + 1
           
           else
               if(map.contains(sum)) answer = answer.max(i - map(sum)) else map(sum) = i
       }
      
      return answer
   }
   
   def main(args: Array[String]) {
     
     var arr = Array(1,1,1,0,0,0,1,0,1,1,0,1,1,0)
     println(maxSubarray(arr))
   }
   
   
   
   
   
   def checkPair(list: List[Int],target: Int) : Boolean = {
       
      val hash = scala.collection.mutable.Map[Int,Int]() 
      list.map(x => if(hash.contains(x)) hash(x) += 1 else hash += ( x  -> 1))
      
      list.map(x => {
          
                hash(x)  -= 1
                
                if(hash.contains(target - x) && hash(target - x) != 0)
                        return true
                        
                hash(x) += 1
                })
                
       return false
   }
   
   def main(args: Array[String]) {
      
      val list : List[Int] = List(2,4,3,2,6,1,13)
      val target = 9;
      println(checkPair(list,target))
   }
