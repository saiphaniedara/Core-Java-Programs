import java.net.*;
public class TestURL
{
public static void main(String[] args) throws Exception
{
URL url1=new URL("http","www.sun.java.com",80,"/docs/readme.doc");
System.out.println("Protocol: "+url1.getProtocol());
System.out.println("Host: "+url1.getHost());
System.out.println("Port No: "+url1.getPort());
System.out.println("Path: "+url1.getPath());
}
}