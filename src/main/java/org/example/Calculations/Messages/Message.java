package org.example.Calculations.Messages;

import org.example.Exceptions.MyCustomException;

public abstract class Message {
    public abstract void showMessage() throws MyCustomException;
}
