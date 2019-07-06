import java.net.*;
public class TestInetAddress
{
public static void main(String[] args) throws Exception
{
InetAddress iA=InetAddress.getLocalHost();
System.out.println(iA);
iA=InetAddress.getByName("KUTUMBARAO");
System.out.println(iA);
}
} 