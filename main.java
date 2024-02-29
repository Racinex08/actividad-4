import java.util.Scanner;

// Clase VisitorInformation
 class VisitorInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaración y asignación de valores a variables representando información del visitante
        String visitorName;
        int visitorcount;
        int visitorAge;
        char visitorGender;
        boolean isResident;

        // Solicitar al usuario que ingrese la información del visitante
        System.out.println("Por favor, ingrese la información del visitante:");

        System.out.print("Nombre: ");
        visitorName = scanner.nextLine();

        System.out.print("Edad: ");
        visitorAge = scanner.nextInt();

        System.out.print("Género (M/F): ");
        visitorGender = scanner.next().charAt(0);

        System.out.print("¿Es residente? (true/false): ");
        isResident = scanner.nextBoolean();

        // Imprimir la información del visitante
        System.out.println("\nInformación del Visitante:");
        System.out.println("Nombre: " + visitorName);
        System.out.println("Edad: " + visitorAge + " (" + age(visitorAge) + ")");
        System.out.println("Género: " + visitorGender);
        System.out.println("¿Es Residente?: " + isResident);
        scanner.close(); // Cerrar el scanner al finalizar
    }

    static String age(int args)
    {
        if (args >= 18)
        {
            return "Es mayor de edad";
        }
        return "No es mayor de edad";
    }
}
