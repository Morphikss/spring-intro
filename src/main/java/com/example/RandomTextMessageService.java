package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class RandomTextMessageService implements MessageService {
    List<String> messages = new ArrayList<>(Arrays.asList("Marek", "Andrzej", "Dawid", "Michal", "Karol", "Marek", "Pawel", "Gienio", "Lukasz", "Kacper"));

    @Override
    public String getMessage() {
        int rnd = new Random().nextInt(messages.size());
        return messages.get(rnd);
    }
}
