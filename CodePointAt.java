import java.lang.*;
class CodePoint
{
public static void main(String[]args)
{
String name="Deepthi lavanya";
System.out.println("Name :"+name);
int nick=name.codePointBefore(5);
System.out.println("CodePoint Count="+nick);
}
}

Output

C:\Users\deept\Documents\Java by DS\java progms\Rohit\Deepu\Strings>javac CodePointAt.java

C:\Users\deept\Documents\Java by DS\java progms\Rohit\Deepu\Strings>java CodePoint
Name :Deepthi lavanya
CodePoint Count=101