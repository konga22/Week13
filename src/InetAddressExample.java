import java.net.*;

public class InetAddressExample {
    public static void main(String[] args) throws Exception {
        InetAddress local = InetAddress.getLocalHost();


        System.out.println("Local Host: " + local);
        System.out.println("Local HostAddress: " + local.getHostAddress());
        System.out.println("Local HostName: " + local.getHostName());
        System.out.println("aa"+local.isAnyLocalAddress());
        InetAddress google = InetAddress.getByName("www.naver.com");
        System.out.println("NAVER IP: " + google);

        byte[] address = google.getAddress();
        for (int i = 0; i < address.length; i++) {
            System.out.println("address[" + i + "] = " + address[i]);
        }

        InetAddress[] addresses = InetAddress.getAllByName("www.naver.com");
        for (InetAddress addr : addresses) {
            System.out.println("NAVER Address: " + addr);
        }
    }
}
