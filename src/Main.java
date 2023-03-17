import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Beräkna antal minuter mellan två klockslag angivna på formatet hh:mm

        Scanner input = new Scanner(System.in);
        System.out.print("Ange starttid (hh:mm): ");
        String start = input.nextLine();

        System.out.print("Ange sluttid (hh:mm): ");
        String stop = input.nextLine();

        int startH = Integer.parseInt(start.substring(0, 2));
        int startM = Integer.parseInt(start.substring(3));
        int stopH = Integer.parseInt(stop.substring(0, 2));
        int stopM = Integer.parseInt(stop.substring(3));

        int startMinutes = startH * 60 + startM;
        int stopMinutes = stopH * 60 + stopM;

        if (stopMinutes < startMinutes) {
            stopMinutes += 24 * 60;
        }

        System.out.println("Det har förflutit " + (stopMinutes - startMinutes) + " minuter.");
        int pastH = (stopMinutes - startMinutes) / 60;
        int pastM = (stopMinutes - startMinutes) % 60;
        System.out.format("(detta blir i timmar och minuter: %02d:%02d)", pastH, pastM);
    }
}