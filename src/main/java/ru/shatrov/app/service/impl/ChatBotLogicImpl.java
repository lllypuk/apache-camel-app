package ru.shatrov.app.service.impl;

import org.apache.camel.component.telegram.model.IncomingMessage;
import org.apache.camel.component.telegram.model.OutgoingTextMessage;
import org.springframework.stereotype.Service;
import ru.shatrov.app.service.ChatBotLogic;

/**
 * author Shatrov create date 18.12.2020
 */
@Service
public class ChatBotLogicImpl implements ChatBotLogic {

    @Override
    public OutgoingTextMessage chatBotProcess(IncomingMessage incomingMessage) {

        OutgoingTextMessage outgoingTextMessage = new OutgoingTextMessage();
        outgoingTextMessage.setText("Ваше сообщение:\n\n" + incomingMessage.getText());

        return outgoingTextMessage;
    }
}
