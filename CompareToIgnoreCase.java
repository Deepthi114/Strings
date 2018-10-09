import java.lang.*;
class CompareTo
{
public static void main(String[]args)
{
String name1="Deepu";
String name2="Pinky";
String name3=new String("MOUNI");

int result1=name1.compareTo(name2);//According to ASCII

System.out.println(result1);

int result2=name2.compareToIgnoreCase(name3);

System.out.println(result2);
}
}

Output:

C:\Users\deept\Documents\Java by DS\java progms\Rohit\Deepu\Strings>javac CompareToIgnoreCase.java

C:\Users\deept\Documents\Java by DS\java progms\Rohit\Deepu\Strings>java CompareTo
-12
3


