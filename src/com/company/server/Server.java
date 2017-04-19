package com.company.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 * Created by yu-hsuan on 2017/4/19.
 */
public class Server{
    private ServerSocket serverSocket;
    private ArrayList<ChatServerConnection> connections;
    private int port;

    public Server(int port) {
        // TODO 1: Initialize

    }

    public void start() {
        System.out.println("Server starts listening on port: " + this.port);

        /** TODO 2: Use a loop to make server wait for clients
         *      TODO 2-1: Create a connectionThread amd make it start
         *      TODO 2-2: Add the connectionThread to "connections" ArrayList
         */
    }


    public void broadcast(String message) {
        for (ChatServerConnection connection: connections) {
            connection.sendMessage(message);
        }
    }

    public static void main(String[] args) {
        Server server = new Server(8000);
        server.start();
    }
}
