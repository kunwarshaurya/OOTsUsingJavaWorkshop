import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
    public static final int SERVER_PORT = 9876;

    public static void main(String[] args) {
        try (DatagramSocket serverSocket = new DatagramSocket(SERVER_PORT)) {
            System.out.println("UDP Server is running on port " + SERVER_PORT);

            byte[] receiveBuffer = new byte[1024];

            while (true) {
                // Receive client packet
                DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
                serverSocket.receive(receivePacket);

                // Handle each client in a separate thread
                new Thread(new ClientHandler(serverSocket, receivePacket)).start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// Worker thread to handle client request
class ClientHandler implements Runnable {
    private DatagramSocket socket;
    private DatagramPacket packet;

    public ClientHandler(DatagramSocket socket, DatagramPacket packet) {
        this.socket = socket;
        this.packet = packet;
    }

    @Override
    public void run() {
        try {
            String clientMessage = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Received from client: " + clientMessage);

            String response = "Echo: " + clientMessage;

            byte[] sendData = response.getBytes();
            InetAddress clientAddress = packet.getAddress();
            int clientPort = packet.getPort();

            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);
            socket.send(sendPacket);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}