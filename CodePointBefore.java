import java.lang.*;
class CodePoint
{
public static void main(String[]args)
{
String name="Deepthi lavanya";
System.out.println("Name :"+name);
int nick=name.codePointBefore(5);//value according to ASCII table 
System.out.println("CodePoint Before="+nick);
}
}

output

C:\Users\deept\Documents\Java by DS\java progms\Rohit\Deepu\Strings>javac CodePointBefore.java

C:\Users\deept\Documents\Java by DS\java progms\Rohit\Deepu\Strings>java CodePoint
Name :Deepthi lavanya
CodePoint Before=116