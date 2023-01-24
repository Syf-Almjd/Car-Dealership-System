import javax.swing.*;

class client {

    private String UserName = "SaifAlmajd";
    private String Password = "Admin";
    private int logAttempts = 0; // default login attempts times

    CarList CarList = new CarList();

    public void System() {
        String[] options = { "Add a Car", "Remove a car", "Search a car", "Number of Cars", "Show All Data of Cars",
                "Exist System" };
        int ListMsg = JOptionPane.showOptionDialog(null, "Welcome to CarAIU System",
                "CarAIU System CCC2113",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        // System.out.println(asd);n

        switch (ListMsg) {
            case 0: // if button 1 clicked
                AddCar();// to add
                System(); // get back to main page
                break;
            case 1:// if button 2 clicked
                RemoveCar();// to delete
                System();// get back to main page
                break;
            case 2:
                SearchCar();
                System();
                break;
            case 3:
                CheckCar();
                System();
                break;
            case 4:
                ShowCar();
                System();
                break;
            case 5:// if button 5 clicked
                JOptionPane.showMessageDialog(null,
                        "Thank you for using AIUCar System, if you have any issues please contact me via email:  \n -saifalmajd.almassri@student.aiu.edu.- \nThank you");
                System.exit(0);// exit with 0 errors
            default:
                JOptionPane.showMessageDialog(null, "An Error has Occurred"); // error handeling- if error has occurred
                break;
        }
    };

    public void AddCar() {

        String registerNo = JOptionPane.showInputDialog(null, "What is the car Register Number?");
        String model = JOptionPane.showInputDialog(null, "What is the car Model?");
        String color = JOptionPane.showInputDialog(null, "What is the car Color?");
        String cc = JOptionPane.showInputDialog(null, "What is the car CC?");
        String yearManufactured = JOptionPane.showInputDialog(null, "What is the car year Manufactured?");
        Car Car = new Car(registerNo, model, color, Double.parseDouble(cc), Integer.parseInt(yearManufactured));
        Car.CarDetails();

        JOptionPane.showMessageDialog(null, Car.CarDetails());

        String[] optionsAdd = { "Add at first", "Add at last", "Add at Certain Location" };
        int Msg = JOptionPane.showOptionDialog(null, "Add a car to CarAIU System",
                "CarAIU System CCC2113",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, optionsAdd, optionsAdd[0]);
        if (Msg == 0) {
            CarList.addAtFirst(Car.CarDetails());
        } else if (Msg == 1) {
            CarList.addAtLast(Car.CarDetails());
        } else if (Msg == 2) {
            int addPoint = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "Where do you want to add the car location in the Index?"));
            CarList.addAtCertainLocation(Car.CarDetails(), addPoint - 1);
        }
    };

    public void RemoveCar() {
        String[] optionsRemove = { "Remove at first", "Remove at last", "Remove at Certain Location",
                "Remove All" };
        int Msg = JOptionPane.showOptionDialog(null, "Remove a car to CarAIU System",
                "CarAIU System CCC2113",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, optionsRemove, optionsRemove[0]);
        if (Msg == 0) {
            CarList.removeAtFirst();
        } else if (Msg == 1) {
            CarList.removeAtLast();
        } else if (Msg == 2) {
            int addPoint = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "What car location index do you want to remove?"));
            CarList.RemoveAtCertainLocation(addPoint - 1);
        } else if (Msg == 3) {
            CarList.removeAll();
        }

    }

    public void SearchCar() {

        String[] optionsSearch = { "Search by Index", "Availability of Data" };
        int Msg = JOptionPane.showOptionDialog(null, "Search a car in CarAIU System",
                "CarAIU System CCC2113",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, optionsSearch, optionsSearch[0]);
        if (Msg == 0) {
            int addPoint = Integer
                    .parseInt(JOptionPane.showInputDialog(null, "What is the car index in LinkedList?"));
            CarList.searchCar(addPoint - 1);
        } else if (Msg == 1) {
            String DataCon = JOptionPane.showInputDialog(null,
                    "What car data does it contain? (Type ALL Car details and be accurate)");
            CarList.searchCarData(DataCon);
        }

    }

    public void CheckCar() {

        String[] optionsSize = { "Check if its Empty", "Get the total Number" };
        int Msg = JOptionPane.showOptionDialog(null, "Size of cars in CarAIU System",
                "CarAIU System CCC2113",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, optionsSize, optionsSize[0]);
        if (Msg == 0) {
            CarList.checkIsEmpty();
        } else if (Msg == 1) {
            CarList.getSize();
        }

    }

    public void ShowCar() {
        CarList.showAll();
    }

    public static void main(String[] args) {
        client client = new client();
        String[] options = { "Instructions & Manual", "Login to CarAIU System", "Exist System" }; // interface options
        int WelcomeMsg = JOptionPane.showOptionDialog(null, "Welcome to CarAIU System",
                "CarAIU System CCC2113",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        switch (WelcomeMsg) {
            case 0:
                JOptionPane.showMessageDialog(null,
                        "Hello, This System is to view, modify, add or delete cars within AIU Linkedlist System. \nRead The Following Instructions:\n1. This program is licenced by SaifAlmajd Almassri \n2.The data sturcture used is a linked list implemented by Java Framework Collection \n3.This system is under DR. Rohaida");
                client.login();
                break;
            case 1:
                client.login();
                break;
            case 2:
                JOptionPane.showMessageDialog(null,
                        "Thank you for using AIUCar System, if you have any issues please contact me via email:  \n -saifalmajd.almassri@student.aiu.edu.- \nThank you");
                System.exit(0);// exit with 0 errors
            default:
                JOptionPane.showMessageDialog(null, "An Error has Occurred"); // error handeling- if error has occurred
                break;
        }

    };

    public void login() {
        JTextField username = new JTextField();
        JTextField password = new JPasswordField(); // JTextField new objects
        Object[] message = {
                "AIU Admin Username:", username,
                "Password:", password
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Login", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            if (username.getText().equals(UserName) && password.getText().equals(Password)) {// check login detials
                JOptionPane.showMessageDialog(null, "Login Successful, Welcome " + username.getText()); // print login
                System();
            } else {
                JOptionPane.showMessageDialog(null, "Your login failed, Try Again."); // error handeling - login falied
                                                                                      // case
                logAttempts++;
                if (logAttempts == 3) {
                    JOptionPane.showMessageDialog(null, "Failed, you are banned."); // error handeling - login falied
                                                                                    // case
                    System.exit(0);// exit with 0 errors
                }
                login();

            }
        } else {
            JOptionPane.showMessageDialog(null, "You canceled");// error handeling - login cancelation case
        }
    }

}