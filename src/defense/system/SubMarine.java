/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defense.system;

/**
 *
 * @author HP
 */
public class SubMarine extends SuperDefence {

    private int energy;
    private int oxygen;

public SubMarine() {
    super("SubMarine", 0, 100);

    energy = 100;
    oxygen = 100;
}

    // Get Energy
    public int getEnergy() {
        return energy;
    }

    // Get Oxygen
    public int getOxygen() {
        return oxygen;
    }

    // Update Energy
    public void updateEnergy(int energy) {
        if (energy >= 0 && energy <= 100) {
            this.energy = energy;
            notifyObservers();
        }
    }

    // Update Oxygen
    public void updateOxygen(int oxygen) {
        if (oxygen >= 0 && oxygen <= 100) {
            this.oxygen = oxygen;
            notifyObservers();
        }
    }

    // Shoot Operation
    public boolean shoot() {

        if (getAmmoCount() >= 1 && energy >= 5 && oxygen >= 2) {

            setAmmoCount(getAmmoCount() - 1);
            energy = energy - 5;
            oxygen = oxygen - 2;

            return true;
        }

        return false;
    }

    // Sonar Operation
    public boolean sonarOperation() {

        if (energy >= 10 && oxygen >= 5) {

            energy = energy - 10;
            oxygen = oxygen - 5;

            return true;
        }

        return false;
    }

    // Tomahawk Missile Operation
    public boolean tomahawkMissile() {

        if (getAmmoCount() >= 2 && energy >= 15 && oxygen >= 10) {

            setAmmoCount(getAmmoCount() - 2);
            energy = energy - 15;
            oxygen = oxygen - 10;

            return true;
        }

        return false;
    }

    // Trident 2 Missile Operation
    public boolean tridentMissile() {

        if (getAmmoCount() >= 3 && energy >= 20 && oxygen >= 15) {

            setAmmoCount(getAmmoCount() - 3);
            energy = energy - 20;
            oxygen = oxygen - 15;

            return true;
        }

        return false;
    }
}
