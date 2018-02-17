/**
 * Response
 *
 * <P>Message class for a response from the server
 *
 * @author Team 7
 * @version 1.0
 */
public class Response {
    private String text;

    public Response(String text) {
        this.text = text;
    }

    public Response() {
        this.text = "";
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
