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

    public void populateHoney() {
        double nectarFromAllTheBees = bees.stream().mapToDouble(Bee::giveNectar).sum();
        honey += createHoney(nectarFromAllTheBees);
        double honeyForQueen = 2;
        honey = honey - honeyForQueen;
        beeQueen.eatNectar(honeyForQueen);
    }

    private double createHoney(double nectar) {
        return nectar * 0.5;
    }

    public double getHoney() {
        return honey;
    }

    public List<Bee> getBees() {
        return bees;
    }
}
