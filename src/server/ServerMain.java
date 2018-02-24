package server;

/**
 * Server
 *
 * Server entry point.
 * Starts GUI, listens for client connections and sends responses to client
 *
 * @author Team 7
 * @version 1.0
 */
public class ServerMain {

    public static void main(String[] args) {
        ServerConnection serverConnection = new ServerConnection();
        serverConnection.start();
        serverConnection.setFrequency(3);
        serverConnection.setMax(100);
        serverConnection.setMin(2);
        
//         new ServerUI();
//         ServerConsole serverConsole = new ServerConsole();
// 		serverConsole.setErrorMessage("This is dummy error");
// 		serverConsole.setMessage("Hello world..");
    }
}
