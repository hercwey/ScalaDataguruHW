package com.lduan.hw2

class Hw1 {

}

object Hw1 {
  def main(args: Array[String]) {

    println(checkString("abcdefgh"));
    println(checkString("abcde"));
    println(checkString("abc"));
    println(checkString(""));
  }
  /**
   * 2.构造一个函数，其参数是字符串，
   *   若字符串长度大于6，返回其字符串的Unicode代码之和；
   *   若字符串长度大于4小于6，返回字符串的unicode 代码；
   *   若字符串长度短于4，返回字符串的Unicode代码乘积；
   *   若字符串长度为0，抛出异常并输出“Warning！”。
   */
  def checkString(m: String) = {
    var lengthString = m.length();
    var re="";
    if (lengthString > 6) {
      var charArray = m.toCharArray();
      var sumChart = 0;
      for (c <- charArray) {
        sumChart = sumChart + c.intValue();
      }
       re = sumChart.toString;
    }
    if (lengthString > 4 && lengthString < 6) {
      var prefix = "\\u";
      var returnString = "";
      var charArray = m.toCharArray();
      for (c <- charArray) {
        returnString =returnString+ prefix + c.intValue();
      }
       re = returnString;

    }
    if (lengthString < 4 && lengthString > 0) {
      var charArray = m.toCharArray();
      var multiply = 1;
      for (c <- charArray) {
        multiply = multiply * c.intValue();
      }
      re =  multiply.toString;

    }
    if (lengthString == 0) {
       throw new Exception("Warning！")
    }
    re
  }
}