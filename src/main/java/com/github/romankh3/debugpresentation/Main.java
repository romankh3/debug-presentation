package com.github.romankh3.debugpresentation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Main class for debug presentation.
 */
public class Main {

    public static void main(String[] args) {
        // создаем медоносы: яблочное и сливовое деревья
        HoneyPlant appleTree = new HoneyPlant(40);
        HoneyPlant plumTree = new HoneyPlant(30);

        // добавляем деревья в коллекцию
        List<HoneyPlant> honeyPlants = new ArrayList<>();
        honeyPlants.add(appleTree);
        honeyPlants.add(plumTree);

        // создаем улей с семью пчелами
        BeeHive beeHive = new BeeHive(7);

        // собираем нектар
        for (Bee bee : beeHive.getBees()) {
            bee.fetchNectar(honeyPlants);
        }

        // получить мёд из нектара пчел
        beeHive.populateHoney();

        // отобразим результат
        System.out.println(
                beeHive.getHoney() + " honey was produced by " +
                        beeHive.getBees().size() +
                        " bees from " + honeyPlants.size() + " honey plants"
        );
    }
}
