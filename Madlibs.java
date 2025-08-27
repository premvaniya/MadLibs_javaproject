//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Let's shape the story according to you!");
        System.out.println("Try to make the story either funny or horror.");

        // Collecting inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("╔══════════════════════════════════════════════════╗");
        System.out.println("║           📖 Madlibs Story Template Preview           ║");
        System.out.println("╚══════════════════════════════════════════════════╝\n");

        System.out.println("On a (time of day), we reached the (place) carrying a (object),");
        System.out.println("just as a (sound) rolled through the (location feature).");
        System.out.println("(person’s name) tugged my sleeve and whispered, “If we (verb) now,");
        System.out.println("we can avoid the (creature),” but the (adjective) door swung open by itself,");
        System.out.println("revealing a hallway lined with (plural noun).");
        System.out.println("The lights flickered (number) times, and a voice from the (direction) murmured,");
        System.out.println("“Only those who (verb2) may pass,” while something smelled like (weird smell).");
        System.out.println("We stepped forward, placed the (noun) on a (surface), and waited until the");
        System.out.println("(adjective2) key shaped like a (object2) slid toward us from the dark.\n");

        System.out.println("📝 Now it's your turn to fill in the blanks!\n");


        System.out.print("Enter time of day: ");
        String timeofday = sc.nextLine();

        System.out.print("Enter place: ");
        String place = sc.nextLine();

        System.out.print("Enter object: ");
        String object = sc.nextLine();

        System.out.print("Enter sound: ");
        String sound = sc.nextLine();

        System.out.print("Enter location feature: ");
        String location = sc.nextLine();

        System.out.print("Enter person's name: ");
        String personName = sc.nextLine();

        System.out.print("Enter verb: ");
        String verb = sc.nextLine();

        System.out.print("Enter creature: ");
        String creature = sc.nextLine();

        System.out.print("Enter adjective: ");
        String adjective = sc.nextLine();

        System.out.print("Enter plural noun: ");
        String pluralNoun = sc.nextLine();

        System.out.print("Enter number: ");
        int number = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter direction: ");
        String direction = sc.nextLine();

        System.out.print("Enter second verb: ");
        String verb2 = sc.nextLine();

        System.out.print("Enter weird smell: ");
        String weirdsmell = sc.nextLine();

        System.out.print("Enter noun: ");
        String noun = sc.nextLine();

        System.out.print("Enter surface: ");
        String surface = sc.nextLine();

        System.out.print("Enter second adjective: ");
        String adjective2 = sc.nextLine();

        System.out.print("Enter second object: ");
        String object2 = sc.nextLine();

        // Constructing the story
        String story = "On a " + timeofday + ", we reached the " + place + " carrying a " + object + ", " +
                "just as a " + sound + " rolled through the " + location + ". " +
                personName + " tugged my sleeve and whispered, “If we " + verb + " now, " +
                "we can avoid the " + creature + ",” but the " + adjective + " door swung open by itself, " +
                "revealing a hallway lined with " + pluralNoun + ". " +
                "The lights flickered " + number + " times, and a voice from the " + direction + " murmured, " +
                "“Only those who " + verb2 + " may pass,” while something smelled like " + weirdsmell + ". " +
                "We stepped forward, placed the " + noun + " on a " + surface + ", and waited until the " +
                adjective2 + " key shaped like a " + object2 + " slid toward us from the dark.";

        System.out.println("\nHere's your story:\n");
        System.out.println(story);
    }
}
