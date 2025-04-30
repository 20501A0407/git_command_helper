import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CommandService service = new CommandService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Git keyword to search:");
        String input = scanner.nextLine();

        List<Command> results = service.searchCommand(input);
        if (results.isEmpty()) {
            System.out.println("No matching Git commands found.");
        } else {
            for (Command cmd : results) {
                System.out.println("\nCommand: " + cmd.getCommand());
                System.out.println("Category: " + cmd.getCategory());
                System.out.println("Description: " + cmd.getDescription());
                System.out.println("Example: " + cmd.getExample());
            }
        }
    }
}
