package com.github.romankh3.debugpresentation;

import java.util.ArrayList;
import java.util.List;

/**
 * Class which shows bee-hive in programmatically way.
 */
public class BeeHive {

    private final List<Bee> bees;
    private BeeQueen beeQueen = new BeeQueen();

    private double honey;

    public BeeHive(Integer beeCount) {
        List<Bee> beeList = new ArrayList<>();
        for (int i = 0; i < beeCount; i++) {
            beeList.add(new Bee());
        }
        this.bees = beeList;
    }

    public void fetchNectar(List<HoneyPlant> honeyPlants) {
        bees.forEach( bee -> {
            for (HoneyPlant honeyPlant : honeyPlants) {
                bee.collectHoney(honeyPlant);
            }
        });
        populateHoney();
    }

    private void populateHoney() {
        double sumDoubleValues = bees.stream().mapToDouble(Bee::giveNectar).sum();
        honey = honey + sumDoubleValues * 0.5;
        double honeyForQueen = 2;
        honey = honey - honeyForQueen;
        beeQueen.eatNectar(honeyForQueen);
    }

    public double getHoney() {
        return honey;
    }

    public List<Bee> getBees() {
        return bees;
    }
}
