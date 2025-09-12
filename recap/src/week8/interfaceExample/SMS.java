package week8.interfaceExample;

public class SMS implements Readable{

    private final String sender;
    private final String content;

    public SMS(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }

    public String getSender() {
        return sender;
    }


    public String read() {
        return this.content;
    }
}
