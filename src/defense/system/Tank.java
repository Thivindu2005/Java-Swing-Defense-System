/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package defense.system;

public class Tank extends SuperDefence {

    // Constructor
    public Tank() {

        super("Tank", 0, 0);
    }

    // Shoot operation
    public boolean shoot() {

        if (getAmmoCount() >= 1) {

            setAmmoCount(getAmmoCount() - 1);

            setMessage("Tank shoot operation completed.");

            return true;
        }

        return false;
    }

    // Missile operation
    public boolean missileOperation() {

        if (getAmmoCount() >= 2) {

            setAmmoCount(getAmmoCount() - 2);

            setMessage("Tank missile operation completed.");

            return true;
        }

        return false;
    }

    // Radar operation
    public boolean radarOperation() {

        setMessage("Tank radar operation completed.");

        return true;
    }

    // Rotate shooting operation
    public boolean rotateShooting() {

        setMessage("Tank rotate shooting operation completed.");

        return true;
    }

    // Update soldier count
    public void updateSoldierCount(int count) {

        setSoldierCount(count);
    }

    // Update ammunition count
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
