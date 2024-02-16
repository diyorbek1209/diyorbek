

package org.example;

import org.example.model.BotState;
import org.example.model.User;
import org.example.service.ButtonService;
import org.example.service.UserService;
import org.example.service.impl.UserServiceImpl;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyBot extends TelegramLongPollingBot {
    private UserService userService = new UserServiceImpl();
    private ButtonService buttonService = new ButtonService();
    public MyBot(String botToken) {
        super(botToken);
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()){
            String text = update.getMessage().getText();
            long chatId = update.getMessage().getChatId();

            if (text.equals("/start")){
                if (userService.get(chatId) == null) {
                    User user = new User();
                    user.setChatId(chatId);
                    user.setState(BotState.START);

                    userService.create(user);
                }

                SendMessage message = new SendMessage();
                message.setText("Keldi");
                message.setChatId(chatId);
                message.setReplyMarkup(buttonService.mainMenu());

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }


            } else {
                User user = userService.get(chatId);
                switch (user.getState()){
                    case START -> {
                        if (text.equals("Katalog")){
                            user.setState(BotState.PRODUCT);
                            userService.update(chatId,user);
                            SendMessage message = new SendMessage();
                            message.setText("salom");
                            message.setChatId(chatId);
                            message.setReplyMarkup(buttonService.mainMenu());
                            try {
                                execute(message);
                            } catch (TelegramApiException e) {
                                throw new RuntimeException(e);
                            }
                        } else if (text.equals("Sozlamalar")) {

                        }
                    }
                    case PRODUCT -> {

                    }
                }
            }
        } else if (update.hasCallbackQuery()) {

        }
    }

    @Override
    public String getBotUsername() {
        return "TechConnect1_Market_bot";
    }
}


