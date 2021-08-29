object case_class extends App {
  case class Point(a: Int, b: Int) {
    var x: Int = a
    var y: Int = b

    def +(that: Point) = Point(this.x + that.x, this.y + that.y)

    def move(dx: Int, dy: Int) = Point(this.x + dx, this.y + dy)

    def distance(that: Point): Double = {
      Math.sqrt(
        (that.y - this.y) * (that.y - this.y) + (that.x - this.x) * (that.x - this.x)
      )
    }

    def invert() = Point(y, x)

  }

  val point1 = Point(1, 2);
  val point2 = Point(3, 4);

  //point 1 and point 2
  println("point1 : " + point1 + " and point2 : " + point2);

  //add two points
  println("point1 + point2 : " + point1 + point2);
  //invert ponint 1
  println("point1 invertion : " + point1.invert);
  //point 1 and point 2
  println("point1 : " + point1 + " and point2 : " + point2);
  //move point2 2 : x , 2 : y
  println("point2 move(2,2) " + point2.move(2, 2));
  //point 1 and point 2
  println("point1 : " + point1 + " and point2 : " + point2);
  //distance ponint1 to point2
  println(point1.distance(point2));

}
