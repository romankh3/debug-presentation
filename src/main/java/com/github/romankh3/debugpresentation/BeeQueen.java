package com.github.romankh3.debugpresentation;

import java.util.logging.Logger;

/**
 * Class which shows bee-hive in programmatically way.
 */
public class BeeQueen {

    private static final Logger LOGGER = Logger.getLogger(BeeQueen.class.getName());

    public void eatNectar(double nectar) {
        LOGGER.info(String.format("the queen has successfully eaten %s nectar", nectar));
    }
}
