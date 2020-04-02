object Loops {

  val arr = new Array[Int](1000)

  def main(args: Array[String]): Unit = {

    for(i <- 0  until arr.length)
      arr(i) = i

    val list = arr.toList

    var sum = 0

    for(x <- list)
      sum += x

    println(sum)

    list.foreach( sum += _)

    println(sum)
  }

}
