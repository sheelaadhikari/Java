import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.SocketFactory;
import javax.net.ssl.*;
import org.w3c.dom.events.Event;
import java.net.*;
import java.io.*;
public class Cipher{
    public static void main(String args[]){
        try{

            Socket st = new Socket();
             SSLSocketFactory factory=(SSLSocketFactory)  SSLSocketFactory.getDefault();
               SSLSocket socket= (SSLSocket) factory.createSocket();
               
                socket.connect(new InetSocketAddress("www.facebook.com", 443));
                String[] suites =socket.getSupportedCipherSuites();
                socket.setEnabledCipherSuites(suites);
                socket.addHandshakeCompletedListener( new MyHandShake());
                System.out.println("Conected to "+ socket.getRemoteSocketAddress());
                System.out.println("suites: " + suites);
                
        } catch(Exception e){
            System.out.println(e);
        
    }

    }
}
    class MyHandShake implements HandshakeCompletedListen, HandshakeCompletedListener{
        public void HandShakeCompleted(Event e) {
            System.out.println("session info"+ ((SSLSocket) e).getSession());
            
        }

        @Override
        public void handshakeCompleted(HandshakeCompletedEvent arg0) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'handshakeCompleted'");
        }
    }

