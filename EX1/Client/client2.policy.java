package Client;
grant {
    permission java.net.SocketPermission "localhost:1099", "connect, resolve";
    permission java.net.SocketPermission "localhost:1024-", "connect, resolve";
    permission java.net.SocketPermission "localhost:1024-", "accept, resolve";
};
