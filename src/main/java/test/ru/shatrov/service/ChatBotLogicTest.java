package test.ru.shatrov.service;

import org.apache.camel.component.telegram.model.IncomingMessage;
import org.apache.camel.component.telegram.model.OutgoingTextMessage;
import org.junit.jupiter.api.Test;
import ru.shatrov.app.service.ChatBotLogic;
import ru.shatrov.app.service.impl.ChatBotLogicImpl;

import static org.junit.jupiter.api.Assertions.*;

class ChatBotLogicTest {

    private final ChatBotLogic chatBotLogic = new ChatBotLogicImpl();

    @Test
    void chatBotProcess() {
        IncomingMessage incomingMessage = new IncomingMessage();
        incomingMessage.setText("Тест");

        OutgoingTextMessage outgoingTextMessage = chatBotLogic.chatBotProcess(incomingMessage);

        assertEquals("Ваше сообщение:\n\nТест", outgoingTextMessage.getText());
    }
}
