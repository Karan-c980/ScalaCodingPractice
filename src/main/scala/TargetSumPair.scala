// Problem Statement
// Find a pair of elemnts in the given list whose sum == target
// Input 1: target = 9  --> pair (3,6) : So return true
// Input 2: target = 21 --> no pair exists in given list : So return false

object TargetSumPair {

  def checkPair(list: List[Int],target: Int) : Boolean = {

    val hash = scala.collection.mutable.Map[Int,Int]()
    list.foreach(x => if(hash.contains(x)) hash(x) += 1 else hash += ( x  -> 1))

    list.foreach(x => {

      hash(x)  -= 1

      if(hash.contains(target - x) && hash(target - x) != 0)
        return true

      hash(x) += 1
    })

    return false
  }

  def main(args: Array[String]) {

    val list : List[Int] = List(2,4,3,2,6,1,13)
    val target = 9
    println(checkPair(list,target))
  }

}
