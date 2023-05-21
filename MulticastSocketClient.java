/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multicastsocket;
import java.net.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastSocketClient {
    public static void main(String[] args){
        try {
        InetAddress  add =InetAddress.getByName("224.0.0.1");
        byte[] buffer= new byte[256];
        MulticastSocket socket = new MulticastSocket(1234);
        socket.joinGroup(add);
        while(true){
            DatagramPacket dp= new DatagramPacket(buffer,buffer.length);
            
            socket.receive(dp);
            String data =new String(buffer, 0, buffer.length);
            System.out.println("received dtata"+ data);
            
            
                }
        }catch(Exception e){
            System.out.println(e);
        }
                
    }
}
