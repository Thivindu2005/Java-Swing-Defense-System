/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defense.system;

/**
 *
 * @author HP
 */
public class Helicopter extends SuperDefence {

    // Constructor
    public Helicopter() {

        super("Helicopter", 0, 0);
    }

    // Shoot operation
    public boolean shoot() {

        if (getAmmoCount() >= 1) {

            setAmmoCount(getAmmoCount() - 1);

            setMessage("Helicopter shoot operation completed.");

            return true;

        }

        return false;
    }

    // Missile operation
    public boolean missileOperation() {

        if (getAmmoCount() >= 2) {

            setAmmoCount(getAmmoCount() - 2);

            setMessage("Helicopter missile operation completed.");

            return true;

        }

        return false;
    }

    // Laser operation
    public boolean laserOperation() {

        setMessage("Helicopter laser operation completed.");

        return true;

    }

    // Update soldier count
    public void updateSoldierCount(int count) {

        setSoldierCount(count);
    }

    // Update ammunition
    public void updateAmmoCount(int count) {

        setAmmoCount(count);
    }

    // Update position
    public void updatePosition(int position) {

        setPosition(position);
    }

    // Send message
    public void sendMessage(String message) {

        setMessage(message);
    }
}
