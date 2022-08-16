package org.example.Calculations.Messages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MessageOperator extends Message {
    public static final Logger LOGGER = LogManager.getLogger(MessageOperator.class);
    @Override
    public void showMessage() {
        /*System.out.println("Choose an operator: +, -, *, or /");*/
        LOGGER.error("Choose an operator: +, -, *, or /");

    }
}
