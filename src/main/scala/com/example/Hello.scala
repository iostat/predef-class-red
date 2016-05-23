package com.example

object Hello {
  def main(args: Array[String]): Unit = {
    val foobar = new Foobar()

    foobar.redWhenCalled(Array(
      classOf[scala.Option[_]], classOf[scala.Some[_]], scala.None.getClass,
      classOf[scala.util.Try[_]], classOf[scala.util.Success[_]], classOf[scala.util.Failure[_]],
      classOf[scala.Seq[_]], classOf[scala.Vector[_]],

      classOf[com.example.SomeJavaClass]
    ))

    foobar.notRed(Array(
      classOf[scala.Option[_]], classOf[scala.util.Try[_]], classOf[Hello.type],
      classOf[Object], classOf[com.example.CustomType], classOf[Integer]
    ))
  }
}
