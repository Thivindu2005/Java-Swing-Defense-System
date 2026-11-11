/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defense.system;

/**
 *
 * @author HP
 */
public abstract class SuperDefence implements Observable {

    // Common attributes
    private String unitName;
    private int soldierCount;
    private int ammoCount;
    private int position;
    private boolean areaCleared;
    private Strength strength;
    private String message;

    // Observer array
    private Observer[] observers;
    private int observerCount;

    // Constructor
    public SuperDefence(String unitName, int soldierCount, int ammoCount) {

        this.unitName = unitName;
        this.soldierCount = soldierCount;
        this.ammoCount = ammoCount;

        position = 0;
        areaCleared = false;
        strength = Strength.MEDIUM;
        message = "Area Not Cleared";

        observers = new Observer[10];
        observerCount = 0;
    }

    // Get unit name
    public String getUnitName() {
        return unitName;
    }

    // Get soldier count
    public int getSoldierCount() {
        return soldierCount;
    }

    // Set soldier count
    public void setSoldierCount(int soldierCount) {

        if (soldierCount >= 0) {

            this.soldierCount = soldierCount;
            notifyObservers();
        }
    }

    // Get ammo count
    public int getAmmoCount() {
        return ammoCount;
    }

    // Set ammo count
    public void setAmmoCount(int ammoCount) {

        if (ammoCount >= 0) {

            this.ammoCount = ammoCount;
            notifyObservers();
        }
    }

    // Get position
    public int getPosition() {
        return position;
    }

    // Set position
    public void setPosition(int position) {

        if (position >= 0 && position <= 100) {

            this.position = position;
            notifyObservers();
        }
    }

    // Get area status
    public boolean isAreaCleared() {
        return areaCleared;
    }

    // Set area status
    public void setAreaCleared(boolean areaCleared) {

        this.areaCleared = areaCleared;

        if (areaCleared == true) {

            message = "Area Cleared";

        } else {

            message = "Area Not Cleared";
        }

        notifyObservers();
    }

    // Get strength
    public Strength getStrength() {
        return strength;
    }

    // Set strength
    public void setStrength(Strength strength) {

        this.strength = strength;
        notifyObservers();
    }

    // Get message
    public String getMessage() {
        return message;
    }

    // Set message
    public void setMessage(String message) {

        this.message = message;
        notifyObservers();
    }

    // Add observer
    @Override
    public void addObserver(Observer observer) {

        if (observerCount < observers.length) {

            if (observer != null) {

                boolean alreadyAdded = false;

                for (int i = 0; i < observerCount; i++) {

                    if (observers[i] == observer) {
                        alreadyAdded = true;
                    }
                }

                if (alreadyAdded == false) {

                    observers[observerCount] = observer;
                    observerCount++;
                }
            }
        }
    }

    // Remove observer
    @Override
    public void removeObserver(Observer observer) {

        for (int i = 0; i < observerCount; i++) {

            if (observers[i] == observer) {

                for (int j = i; j < observerCount - 1; j++) {

                    observers[j] = observers[j + 1];
                }

                observerCount--;
                observers[observerCount] = null;

                break;
            }
        }
    }

    // Notify observers
    @Override
    public void notifyObservers() {

        for (int i = 0; i < observerCount; i++) {

            observers[i].update(this);
        }
    }
    
}
