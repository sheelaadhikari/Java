package MulticastSocket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class MulticastSocket {
    public static void main(String[] args) {
        try {
            InetAddress add = InetAddress.getByName("224.0.0.1");
            DatagramSocket socket = new DatagramSocket();
            int i ;
            for(i=0;i<=3;i++){
                String data = "Data Sent" + i;
                DatagramPacket dp;
                dp = new DatagramPacket(data.getBytes(),data.getBytes().length,add,1234);
                socket.send(dp);
                System.out.print("Data sent" +data);
                Thread.sleep(2000);
                
            }
        } catch (Exception e) {
           System.out.println(e);
        }
    }
}