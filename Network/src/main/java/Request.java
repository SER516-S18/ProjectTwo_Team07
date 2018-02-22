/**
 * Request
 *
 * Message class for a request to the server
 *
 * @author Team 7
 * @version 1.0
 */
public class Request {
    private String text;

    public Request(String text) {
        this.text = text;
    }

    public Request() {
        this.text = "";
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
