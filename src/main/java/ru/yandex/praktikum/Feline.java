package ru.yandex.praktikum;

import java.util.List;

public class Feline extends Animal implements Predator {

    @Override
    public List<String> getFood(String animalType) throws Exception {
        if ("Травоядное".equals(animalType)) {
            return List.of("Трава", "Различные растения");
        } else if ("Хищник".equals(animalType)) {
            return List.of("мясо", "рыба");
        } else {
            throw new Exception("Неизвестный вид животного");
        }
    }

    @Override
    public int getKittens() {
        return getKittens(1);
    }

    @Override
    public List<String> eatMeat() {
        return null;
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }

    @Override
    public String getFamily() {
        return "Кошачьи";
    }

}
