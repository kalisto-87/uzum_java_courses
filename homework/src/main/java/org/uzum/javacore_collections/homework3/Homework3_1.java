package org.uzum.javacore_collections.homework3;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Класс для реализации домашнего задания номер три, часть 1.
 */
public class Homework3_1 {

    /**
     * Реализовать метод который считает количество слов встречающихся в заданном тексте.
     *
     * @param text - заданный текст
     * @return - словарь слов и количество их появлений в данном тексте
     */
    public Map<String, Integer> countWords(String text) {
        String regex = "[ \n,.!?:;—-]";
        String[] wordsArray = text.split(regex);
        return Arrays.stream(wordsArray).
                map(e -> e.toLowerCase()).filter(e -> !e.isEmpty()).toList().stream().
                collect(Collectors.groupingBy(Function.identity(),
                        Collectors.collectingAndThen(Collectors.counting(), Long::intValue)));
    }
}
