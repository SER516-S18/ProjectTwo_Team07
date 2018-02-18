import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryonet.EndPoint;

/**
 * Register
 *
 * <P>Classes that are sent over the network are registered here
 *
 * @author Team 7
 * @version 1.0
 */
public class Register {

    static public void register(EndPoint endPoint) {
        Kryo kryo = endPoint.getKryo();
        kryo.register(Request.class);
        kryo.register(Response.class);
    }
}