import java.util.*;

import javax.swing.JOptionPane;

public class CarList {
    LinkedList<String> carDatabase = new LinkedList<String>();

    public void addAtFirst(String Data) {
        carDatabase.addFirst(Data);
        JOptionPane.showMessageDialog(null, "Added Successfully");
    };

    public void addAtLast(String Data) {
        carDatabase.addLast(Data);
        JOptionPane.showMessageDialog(null, "Added Successfully");
    };

    public void addAtCertainLocation(String Data, int index) {
        try {
            carDatabase.add(index, Data);
            JOptionPane.showMessageDialog(null, "Added Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Operation Unsuccessfully \nInformation:\n" + e);
        }

    };

    public void removeAtFirst() {
        try {
            carDatabase.removeFirst();
            JOptionPane.showMessageDialog(null, "Removed Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Operation Unsuccessfully \nInformation:\n" + e);
        }
    };

    public void removeAtLast() {
        try {
            carDatabase.removeLast();
            JOptionPane.showMessageDialog(null, "Removed Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Operation Unsuccessfully \nInformation:\n" + e);
        }

    };

    public void removeAll() {
        carDatabase.clear();
        JOptionPane.showMessageDialog(null, "Removed all Successfully");
    };

    public void RemoveAtCertainLocation(int index) {
        try {
            carDatabase.remove(index);
            JOptionPane.showMessageDialog(null, "Removed Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Operation Unsuccessfully \nInformation:\n" + e);
        }
    };

    public void searchCar(int index) {
        try {
            JOptionPane.showMessageDialog(null, carDatabase.get(index));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Operation Unsuccessfully \nInformation:\n" + e);
        }
    };

    public void searchCarData(String Data) {
        try {
            JOptionPane.showMessageDialog(null, carDatabase.contains(Data) + " Data Availability");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Operation Unsuccessfully \nInformation:\n" + e);
        }
    };

    public void checkIsEmpty() {
        if (carDatabase.isEmpty()) {
            JOptionPane.showMessageDialog(null, "The List is Empty");
        } else {
            showAll();
        }
    };

    public void getSize() {
        JOptionPane.showMessageDialog(null, "There is " + (carDatabase.size()) + " Elements in the Database.");
    };

    public void showAll() {
        String SData = "";
        if (carDatabase.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Its Empty, please add a car to procced.");
        } else {
            for (int i = 0; i < carDatabase.size(); i++) {
                Object[][] ShowCarDatabase = { { i + 1 }, { carDatabase.get(i) } };
                SData = (SData + "\n" + ((ShowCarDatabase[0][0]) + "                          "
                        + (ShowCarDatabase[1][0]).toString()));
            }
            JOptionPane.showMessageDialog(null, "Index" + "                  " + "Car Information" + SData);
        }
    };

    public static void main(String[] args) {
    }
}