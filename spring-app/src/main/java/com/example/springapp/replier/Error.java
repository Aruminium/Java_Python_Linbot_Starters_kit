package com.example.springapp.replier;

import com.linecorp.bot.model.message.Message;
import com.linecorp.bot.model.message.TextMessage;

public class Error implements Replier{
    private final static String ERROR = "エラー";

    @Override
    public Message reply() {
        return new TextMessage(ERROR);
    }
}