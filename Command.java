public class Command {
    private String command;
    private String category;
    private String description;
    private String example;

    // Constructor
    public Command(String command, String category, String description, String example) {
        this.command = command;
        this.category = category;
        this.description = description;
        this.example = example;
    }

    // Getter methods
    public String getCommand() {
        return command;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public String getExample() {
        return example;
    }
}
