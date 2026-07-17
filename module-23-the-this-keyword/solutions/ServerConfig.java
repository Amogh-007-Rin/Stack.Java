class ServerConfig {
    String host;
    int port;
    int timeout;
    boolean useSSL;

    ServerConfig setHost(String host) {
        this.host = host;
        return this;
    }

    ServerConfig setPort(int port) {
        this.port = port;
        return this;
    }

    ServerConfig setTimeout(int timeout) {
        this.timeout = timeout;
        return this;
    }

    ServerConfig setUseSSL(boolean useSSL) {
        this.useSSL = useSSL;
        return this;
    }

    void display() {
        System.out.println("Server Config: " + host + ":" + port +
                           " | timeout=" + timeout + "ms | SSL=" + useSSL);
    }
}
