package com.example

class Foobar {
  def redWhenCalled(someArray: scala.Array[scala.Predef.Class[_]]): Foobar = {
    someArray foreach (c ⇒ println(c.getCanonicalName))

    this
  }

  def notRed(someArray: Array[Class[_]]): Foobar = {
    someArray foreach (c ⇒ println(c.getCanonicalName))

    this
  }
}
