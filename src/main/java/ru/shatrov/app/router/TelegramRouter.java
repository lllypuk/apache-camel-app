package ru.shatrov.app.router;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.telegram.model.IncomingMessage;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.shatrov.app.service.ChatBotLogic;

/**
 * Created on 18.12.2020.
 *
 * @author Shatrov Aleksandr
 */
@Component
public class TelegramRouter extends RouteBuilder {

    private final ChatBotLogic chatBotLogic;

    @Autowired
    public TelegramRouter(ChatBotLogic chatBotLogic) {
        this.chatBotLogic = chatBotLogic;
    }

    @Override
    public void configure() {
        from("telegram:bots")
                .to("log:INFO")
                .process(exchange -> {
                    IncomingMessage incomingMessage = (IncomingMessage) exchange.getIn().getBody();
                    exchange.getIn().setBody(chatBotLogic.chatBotProcess(incomingMessage));
                })
                .to("telegram:bots")
                .convertBodyTo(Document.class)
                .to("mongodb:myDb?database=telegram&collection=messages&operation=insert")
                .setBody(simple("${body}"));
    }
}
