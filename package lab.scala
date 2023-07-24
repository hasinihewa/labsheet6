package lab

import scala.io.StdIn

object Q1 {
  val alphabet = 26

  
  def encryption(text: String, shift: Int): String = {
    text.map { char =>
      if (char.isLetter) {
        val base = if (char.isUpper) 'A' else 'a'
        ((char - base + shift) % alphabet + base).toChar
      }
      else
        char
    }
  }


  def decryption(text: String, shift: Int): String = {
    encryption(text, alphabet - shift)
  }

  def ciper(text:String,shift:Int,func:(String,Int)=>String):String={
    func(text,shift)
  }
