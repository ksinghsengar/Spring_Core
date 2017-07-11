package main.resource;

/**
 * Created by krishan on 6/30/2017.
 */
public class Database {
    int port;
    String name;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
//        return super.toString();

        return "Port: "+getPort()+"\nName: "+getName();
    }
}
