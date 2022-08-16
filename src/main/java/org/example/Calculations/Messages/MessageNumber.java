package org.example.Calculations.Messages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MessageNumber extends Message {
    public static final Logger LOGGER = LogManager.getLogger(MessageNumber.class);
    @Override
    public void showMessage() {
        /*System.out.println("Please, enter any number:");*/
        LOGGER.error("Please, enter any number:");
    }
}
