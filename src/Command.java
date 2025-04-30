public class Command {
    private int id;
    private String command;
    private String category;
    private String description;
    private String example;

    public Command(String command, String category, String description, String example) {
        this.command = command;
        this.category = category;
        this.description = description;
        this.example = example;
    }

    // Getters and setters
}
