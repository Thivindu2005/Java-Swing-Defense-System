/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defense.system;

/**
 *
 * @author HP
 */
public class MainController implements Observer {

    // Array to store defence units
    private SuperDefence[] defences;

    private int defenceCount;

    // Store received information
    private String informationLog;

    // Constructor
    public MainController() {

        defences = new SuperDefence[3];

        defenceCount = 0;

        informationLog = "";
    }

    // Register defence units
    public void registerDefence(SuperDefence defence) {

        if (defenceCount < defences.length) {

            defences[defenceCount] = defence;

            defence.addObserver(this);

            defenceCount++;

            informationLog = informationLog
                    + defence.getUnitName()
                    + " connected.\n";

            System.out.println(
                    defence.getUnitName() + " connected."
            );
        }
    }

    // Remove defence units
    public void removeDefence(SuperDefence defence) {

        for (int i = 0; i < defenceCount; i++) {

            if (defences[i] == defence) {

                defence.removeObserver(this);

                informationLog = informationLog
                        + defence.getUnitName()
                        + " disconnected.\n";

                for (int j = i; j < defenceCount - 1; j++) {

                    defences[j] = defences[j + 1];
                }

                defenceCount--;

                defences[defenceCount] = null;

                break;
            }
        }
    }
    
    

@Override
public void update(SuperDefence defence) {

    if (broadcasting) {
        return;
    }

        String information =

                "Unit: " + defence.getUnitName()
                + "\nSoldier Count: " + defence.getSoldierCount()
                + "\nAmmo Count: " + defence.getAmmoCount()
                + "\nPosition: " + defence.getPosition()
                + "\nStrength: " + defence.getStrength()
                + "\nMessage: " + defence.getMessage()
                + "\n--------------------------\n";

        informationLog = informationLog + information;

        System.out.println(information);
    }

    // Get defence count
    public int getDefenceCount() {

        return defenceCount;
    }

    // Get a defence unit using its index
    public SuperDefence getDefence(int index) {

        if (index >= 0 && index < defenceCount) {

            return defences[index];
        }

        return null;
    }

    // Get collected information
    public String getInformationLog() {

        return informationLog;
    }
    
    // Prevent controller messages from being recorded as unit messages
private boolean broadcasting = false;

// Send a message to all registered defence units
public void broadcastMessage(String message) {

    if (message == null || message.trim().isEmpty()) {
        return;
    }

    broadcasting = true;

    for (int i = 0; i < defenceCount; i++) {

        defences[i].setMessage(message);
    }

    broadcasting = false;
}
    
}
