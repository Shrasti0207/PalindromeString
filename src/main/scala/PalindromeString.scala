import scala.util.Try

object PalindromeString extends App {
  def checkPalindrome(str:String)={
    Try{
      if(str==str.reverse)
        println("Yes")
      else
        println("No")
    }.getOrElse(println("There was some Exception"))

  }
  checkPalindrome("aba")
}

