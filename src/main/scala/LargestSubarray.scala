object LargestSubarray {

  def maxSubarray(arr : Array[Int]) : Int = {

    val map = scala.collection.mutable.Map[Int,Int]()
    var sum = 0
    var answer = -1

    for(i <- arr.indices){

      if(arr(i) == 1) sum += arr(i) else sum -= 1

      if(sum == 0)
        answer = i + 1

      else
      if(map.contains(sum)) answer = answer.max(i - map(sum)) else map(sum) = i
    }

    return answer
  }

  def main(args: Array[String]) {

    val arr = Array(1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 0, 1, 1, 0)
    println(maxSubarray(arr))
  }

}
