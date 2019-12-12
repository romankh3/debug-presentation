package com.github.romankh3.debugpresentation;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/**
 * Main class for debug presentation.
 */
public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        HoneyPlant appleTree = new HoneyPlant(40.5);
        HoneyPlant plumTree = new HoneyPlant(85);

        List<HoneyPlant> honeyPlants = Arrays.asList(appleTree, plumTree);

        BeeHive beeHive = new BeeHive(3);

        beeHive.fetchNectar(honeyPlants);

        LOGGER.info(String.format("%s was produced by %d bees from %d honey plants",
                beeHive.getHoney(), beeHive.getBees().size(), honeyPlants.size()));
    }
}
