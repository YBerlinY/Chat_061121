package sample.hw6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import sample.EchoClient;

import java.awt.*;
import java.util.Scanner;

public class Controller {
    @FXML
    private TextField textField;
    @FXML
    private TextArea textArea;

    private sample.hw6.EchoClient client;





    public Controller() {
        client= new sample.hw6.EchoClient(this);
    }


    public  void btnSendClick(ActionEvent actionEvent) {
        final String message = textField.getText().trim();
        if (message.isEmpty()){
            return;
        }
        client.sendMessage(message);
        textField.clear();
        textField.requestFocus();

    }

    public void addMessage(String message) {

        textArea.appendText(message+ "\n");
    }
}

