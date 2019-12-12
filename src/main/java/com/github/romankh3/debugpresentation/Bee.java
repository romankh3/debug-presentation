package com.github.romankh3.debugpresentation;

import java.time.LocalDate;
import lombok.Data;

/**
 * Class represents bee in programmatically way.
 */
@Data
public class Bee {

    public Bee() {
        dateOfBirth = LocalDate.now();
    }

    /**
     * Date of birth.
     */
    private final LocalDate dateOfBirth;

    /**
     * Date of Death.
     */
    private LocalDate dateOfDeath;

    /**
     * True if bee alive, false otherwise.
     */
    private boolean alive;

    /**
     * Current nectar capacity
     */
    private double nectarCapacity;

    /**
     * Maximal nectar that can take bee.
     */
    private double maxNectarCapacity = 20.0;

    public void collectHoney(HoneyPlant honeyPlant) {
        double fetchCountPerSecond = 1.0;
        while (maxNectarCapacity > nectarCapacity) {
            nectarCapacity = nectarCapacity + honeyPlant.retrieveNectar(fetchCountPerSecond);
        }
    }

    public double giveNectar() {
        double nectar = nectarCapacity;
        nectarCapacity = 0;
        return nectar;
    }
}
