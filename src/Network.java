
public class Network implements App {
    @Override
    public void connectToNetwork(String networkName) {
        System.out.println("Connected to " + networkName);
    }

    @Override
    public void disconnectFromNetwork() {
        System.out.println("Disconnected from network");
    }

    public static void main(String[] args) {
        Network network = new Network();
        network.connectToNetwork("Wifi");
        network.disconnectFromNetwork();
    }

}
