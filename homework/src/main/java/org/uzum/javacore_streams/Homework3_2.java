package org.uzum.javacore_streams;

import org.uzum.javacore_streams.model.Person;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

/**
 * Класс для реализации домашнего задания номер три, часть 2.
 */
public class Homework3_2 {

    /**
     * Реализовать метод при помощи {@link java.util.stream.Stream} который:
     * - группирует заданых персон по возрасту
     * - фильтрует по минимальному возрасту
     * - Убирает дубликаты персон по имени
     * @param persons - заданный список персон
     * @param minimalAgeFilter - указанный минимальный возраст
     * @param removeDupes - флаг отвечающий за исключение дубликатов из результата
     * @return словарь где ключ хобби а значение лист персон с этим хобби
     */
    public Map<Integer, List<Person>> groupByAge(List<Person> persons, int minimalAgeFilter,  boolean removeDupes) {

        List<Person> agePerson = persons.stream().filter(e -> e.getAge() >= minimalAgeFilter).toList();

        if (removeDupes) {
            Set<String> nameSet = new HashSet<>();
            agePerson = agePerson.stream().filter(e -> nameSet.add(e.getName())).collect(Collectors.toList());
        }

        return agePerson.stream().collect(groupingBy(e -> e.getAge(), Collectors.toList()));
    }
}
