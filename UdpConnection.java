import java.net.*;

public class UdpConnection {
    private DatagramSocket socket;
    private InetAddress address;
    private int port;

    public UdpConnection() {
        // create a new datagram socket
        try {
            socket = new DatagramSocket();
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    public void setAddress(String hostname) throws UnknownHostException {
        address = InetAddress.getByName(hostname);
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void sendMessage(String message) throws Exception {
        byte[] data = message.getBytes();
        DatagramPacket packet = new DatagramPacket(data, data.length, address, port);
        socket.send(packet);
    }

    public String receiveMessage() throws Exception {
        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        socket.receive(packet);
        return new String(packet.getData(), 0, packet.getLength());
    }

    public void close() {
        socket.close();
    }

    public static void main(String[] args) {
        UdpConnection connection = new UdpConnection();
        try {
            // set the destination address and port
            connection.setAddress("localhost");
            connection.setPort(1234);

            // send a message to the destination
            String message = "Hello, world!";
            connection.sendMessage(message);

            // receive a response from the destination
            String response = connection.receiveMessage();
            System.out.println(response);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
    }
}