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


import java.util.Scanner;
public class patientDriverApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Patient name: ");
        String patientName = scanner.nextLine();

        System.out.print("Address: ");
        String address = scanner.nextLine();

        System.out.print("City: ");
        String city = scanner.nextLine();

        System.out.print("State: ");
        String state = scanner.nextLine();

        System.out.print("ZIP: ");
        String zipCode = scanner.nextLine();

        System.out.print("Emergency Contact: ");
        String emergencyContact = scanner.nextLine();

        int procedureChoice;
        String procedure;
        String practitioner;
        double procedureCharge;
        String procedureDate = "7/20/2023";

        while (true) {
            System.out.print("\nProcedure (1 - Physical Exam, 2 - X-ray, 3 - Blood Test, 0 - Exit): ");
            procedureChoice = scanner.nextInt();

            if (procedureChoice == 0) {
                break;
            }

            switch (procedureChoice) {
                case 1:
                    procedure = "Physical Exam";
                    practitioner = "Dr. Irvine";
                    procedureCharge = 250.0;
                    break;
                case 2:
                    procedure = "X-ray";
                    practitioner = "Dr. Jamison";
                    procedureCharge = 500.0;
                    break;
                case 3:
                    procedure = "Blood Test";
                    practitioner = "Dr. Smith";
                    procedureCharge = 200.0;
                    break;
                default:
                    System.out.println("Invalid procedure choice. Please try again.");
                    continue;
            }

            patient patient = new patient(patientName, address, city, state, zipCode, emergencyContact);
            procedure selectedProcedure = new procedure(procedure, procedureDate, practitioner, procedureCharge);

            // Display patient details
            System.out.println("Patient name: " + patient.getName());
            System.out.println("Address: " + patient.getAddress());
            System.out.println("City: " + patient.getCity());
            System.out.println("State: " + patient.getState());
            System.out.println("ZIP: " + patient.getZipCode());
            System.out.println("Emergency Contact: " + patient.getEmergencyContact());

            // Display procedure details
            System.out.println("Procedure: " + selectedProcedure.getName());
            System.out.println("Procedure Date: " + selectedProcedure.getDate());
            System.out.println("Practitioner: " + selectedProcedure.getPractitioner());
            System.out.println("Procedure Charge: " + selectedProcedure.getCharge());
        }

        scanner.close();
        System.out.println("Student name: Vivek Hubbly ");
        System.out.println("Student MC M#:M21174642  ");
        System.out.println("Due Date:07/03/2023 ");
    }
    
}