import munit.FunSuite

class MySuite extends FunSuite {
  test("hello") {
    assertEquals(CubeCalculator.cube(3), 27)
  }
}