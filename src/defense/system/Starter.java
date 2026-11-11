/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defense.system;

/**
 *
 * @author HP
 */
public class Starter {

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                Helicopter helicopter = new Helicopter();

                HelicopterGUI gui =
                        new HelicopterGUI(helicopter);

                gui.setVisible(true);
            }
        });
    }
}
