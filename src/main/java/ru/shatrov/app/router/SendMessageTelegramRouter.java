package ru.shatrov.app.router;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * author Shatrov create date 21.12.2020
 */
//@Component
public class SendMessageTelegramRouter extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("timer:tick?fixedRate=true&period=60000")
                .setBody().constant("Hello")
                .setHeader("CamelTelegramChatId", simple("202488922"))
                .to("telegram:bots")
                .to("log:INFO?showHeaders=true");
    }
}
