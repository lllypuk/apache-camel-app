package ru.shatrov.app.service;

import org.apache.camel.component.telegram.model.IncomingMessage;
import org.apache.camel.component.telegram.model.OutgoingTextMessage;

/**
 * author Shatrov create date 18.12.2020
 */
public interface ChatBotLogic {

    OutgoingTextMessage chatBotProcess(IncomingMessage incomingMessage);
}
