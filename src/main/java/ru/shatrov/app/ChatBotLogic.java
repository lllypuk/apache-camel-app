package ru.shatrov.app;

/**
 * author Shatrov create date 18.12.2020
 */
public class ChatBotLogic {

    public String chatBotProcess(String message) {
        if ("do-not-reply".equals(message)) {
            return null; // no response in the chat
        }

        return "echo from the bot: " + message; // echoes the message
    }
}
