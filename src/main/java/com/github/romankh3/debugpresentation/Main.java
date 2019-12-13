package com.github.romankh3.debugpresentation;

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
        List<HoneyPlant> honeyPlants = Arrays.asList(appleTree, plumTree);

        // создаем улик с семью пчелами
        BeeHive beeHive = new BeeHive(7);

        // собираем нектар
        beeHive.getBees().forEach(bee -> {
            bee.fetchNectar(honeyPlants);
        });

        // получить мёд из нектара пчел
        beeHive.populateHoney();


        // отобразим результат
        System.out.println(String.format("%s was produced by %d bees from %d honey plants",
                beeHive.getHoney(), beeHive.getBees().size(), honeyPlants.size()));
    }
}
