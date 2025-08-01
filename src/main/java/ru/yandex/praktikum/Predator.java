package ru.yandex.praktikum;

import java.util.List;

public interface Predator {
    List<String> getFood(String animalType) throws Exception;
    int getKittens();

    List<String> eatMeat();
}
