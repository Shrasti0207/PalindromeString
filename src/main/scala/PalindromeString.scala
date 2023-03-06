import scala.util.Try

object PalindromeString extends App {
  def checkPalindrome(inputString:String)={
    Try{
      if(inputString==inputString.reverse)
        println("Yes")
      else
        println("No")
    }.getOrElse(println("There was some Exception"))

  }
  checkPalindrome("aba")
}

