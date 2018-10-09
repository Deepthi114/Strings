import java.lang.*;
class CompareTo
{
public static void main(String[]args)
{
String name1="D";
String name2="T";
String name3=new String("M");

System.out.println(name1.compareTo(name2));//Tvalue - Dvalue according to ASCII

System.out.println(name2.compareTo(name3));
}
}


Output

C:\Users\deept\Documents\Java by DS\java progms\Rohit\Deepu\Strings>javac CompareTo.java

C:\Users\deept\Documents\Java by DS\java progms\Rohit\Deepu\Strings>java CompareTo
-16
7