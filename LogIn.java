package com.example.ticketbooking;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.nio.Buffer;

public class LogIn {
    @FXML
    private Button button;
    @FXML
    private Label wrongLogIn;
    @FXML
    private TextField  username;
    @FXML
    private PasswordField password;

    public void userLogIn(ActionEvent event) throws IOException {
        checkLogIn();
    }
    private void checkLogIn() throws IOException {
        if(username.getText().toString().equals("harish") && password.getText().toString().equals("123"))
        {
            wrongLogIn.setText("success");
            RailwayReservation book = new RailwayReservation();
            book.startReservationSystem();
        }

        else  if(username.getText().isEmpty() || password.getText().isEmpty())
        {
            wrongLogIn.setText("Please enter the necessary data.");
        }
        else {
            wrongLogIn.setText("Wrong username or password!");
        }
    }



}
