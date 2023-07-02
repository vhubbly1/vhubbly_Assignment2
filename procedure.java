/**
 * Class: CMSC203
 * Instructor: Prof. Grinberg
 * Description: The program consists of three classes: Patient, Procedure, and PatientDriverApp. The Patient class represents a patient and stores their personal information, while the Procedure class represents a medical procedure and holds details such as the name, date, practitioner, and charge. The PatientDriverApp class serves as the main driver program. It prompts the user for patient information, creates a Patient object, and displays the patient's details. It then enters a loop where the user can choose a procedure, which creates a corresponding Procedure object and displays its information. The loop continues until the user chooses to exit. Overall, the program offers a structured way to manage patient information and procedure details, making it suitable for medical offices or similar settings.
 * Due: 07/02/2023
 * Platform/compiler: eclipse IDE
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
 * Print your Name here: Vivek Hubbly
 */

public class procedure {
    private String name;
    private String date;
    private String practitioner;
    private double charge;

    public procedure(String name, String date, String practitioner, double charge) {
        this.name = name;
        this.date = date;
        this.practitioner = practitioner;
        this.charge = charge;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getPractitioner() {
        return practitioner;
    }

    public double getCharge() {
        return charge;
    }
}

