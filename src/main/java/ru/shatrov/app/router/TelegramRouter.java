package ru.shatrov.app.router;

import org.apache.camel.builder.RouteBuilder;

/**
 * Created on 18.12.2020.
 *
 * @author Shatrov Aleksandr
 */
public class TelegramRouter extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("webhook:telegram:bots").to("log:info");
    }
}
