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

public class patient {
    private String name;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String emergencyContact;

    public patient(String name, String address, String city, String state, String zipCode, String emergencyContact) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.emergencyContact = emergencyContact;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }
}