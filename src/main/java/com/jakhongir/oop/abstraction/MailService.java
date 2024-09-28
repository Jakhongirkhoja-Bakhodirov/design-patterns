package com.jakhongir.oop.abstraction;

public class MailService {
    public void sendEmail() {
      this.connect();
      this.authenticate();
      disconnect();
    }

    private void connect() {
        System.out.println("Connect");
    }

    private void authenticate() {
        System.out.println("Authenticate");
    }

    private void disconnect() {
        System.out.println("Disconnect");
    }
}
