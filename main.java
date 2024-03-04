import java.util.Scanner;

class VisitorInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalVisits = 0;
        int totalStayTime = 0;

        System.out.println("Por favor, ingrese la información del visitante:");

        System.out.print("Nombre: ");
        String visitorName = scanner.nextLine();

        System.out.print("Edad: ");
        int visitorAge = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Género (M/F): ");
        char visitorGender = scanner.nextLine().charAt(0);

        System.out.print("¿Es residente? (true/false): ");
        boolean isResident = scanner.nextBoolean();
        scanner.nextLine();

        String isAdult = (visitorAge >= 18) ? "Sí" : "No";

        for (int i = 0; i < 7; i++) {
            System.out.println("Por favor, ingrese la información de la visita del día " + (i+1) + ":");

            System.out.print("Cantidad de visitas hoy: ");
            int visitsToday = scanner.nextInt();
            totalVisits += visitsToday;
            scanner.nextLine();

            System.out.print("Tiempo total de estadía hoy (en minutos): ");
            int stayTimeToday = scanner.nextInt();
            totalStayTime += stayTimeToday;
            scanner.nextLine();
        }

        int averageStayTime = totalStayTime / 7;

        System.out.println("\nInformación del visitante:");
        System.out.println("Nombre: " + visitorName);
        System.out.println("Edad: " + visitorAge);
        System.out.println("¿Es mayor de edad?: " + isAdult);
        System.out.println("Género: " + visitorGender);
        System.out.println("¿Es residente?: " + isResident);

        System.out.println("\nInformación de la semana:");
        System.out.println("Cantidad total de visitas: " + totalVisits);
        System.out.println("Tiempo promedio de estadía: " + averageStayTime + " minutos");

        scanner.close();
    }
}
