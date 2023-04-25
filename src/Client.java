import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {

    private Socket socket;
    private long clientID;
    private String nickName;

    private ObjectInputStream ois;
    private ObjectOutputStream oos;

    public Client(Socket s) {
        socket = s;
        try {
            oos = new ObjectOutputStream(socket.getOutputStream());
            ois = new ObjectInputStream(socket.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Client(Socket s, String nick) {
        socket = s;
        nickName = nick;

        try {
            oos = new ObjectOutputStream(socket.getOutputStream());
            ois = new ObjectInputStream(socket.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Client(Socket s, String nick, long id) {
        socket = s;
        nickName = nick;
        clientID = id;

        try {
            oos = new ObjectOutputStream(socket.getOutputStream());
            ois = new ObjectInputStream(socket.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendPresentation() {
        String[] params = {nickName};
        Request presentation = new Request(RequestCodes.PRESENT, params);
        write(presentation);
    }

    public Object read() {
        try {
            return ois.readObject();
        } catch (ClassNotFoundException | IOException e) {
            return null;
        }
    }

    public void write(Object obj) {
        try {
            oos.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
