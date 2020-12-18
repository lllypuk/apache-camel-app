package ru.shatrov.app.router;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
import ru.shatrov.app.ChatBotLogic;

/**
 * Created on 18.12.2020.
 *
 * @author Shatrov Aleksandr
 */
@Component
public class TelegramRouter extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("telegram:bots")
                .bean(ChatBotLogic.class)
//                .to("log:info");
                .to("telegram:bots");
    }
}
