object Main extends App {
  for (i <- 1 to 10){
    println(i)
  }
}

object CubeCalculator extends App {
  def cube(x: Int) = {
    x * x * x
  }
}