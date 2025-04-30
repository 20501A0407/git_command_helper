# Git Command Helper

Git Command Helper is a command-line tool built in Java that simplifies Git command usage. The tool provides easy access to over 50 Git commands, their descriptions, categories, and examples. It aims to save time by allowing users to quickly retrieve essential Git command information without needing to search online.

## Features

- Store over 50 Git commands with descriptions, categories, and usage examples.
- Simplifies learning and referencing Git commands.
- Built with a user-friendly interface.
- Integrated with an SQLite database to manage and retrieve Git command data.

## Getting Started

### Prerequisites

To run the project, you need:

- **Java**: Make sure Java is installed on your system. You can download it from [here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
- **SQLite JDBC Driver**: The SQLite JDBC driver is required for database interaction. You can download it from [here](https://github.com/xerial/sqlite-jdbc).

### Setup

1. Clone the repository:

    ```bash
    git clone https://github.com/20501A0407/git_command_helper.git
    ```

2. Navigate into the project folder:

    ```bash
    cd git_command_helper
    ```

3. Compile the project:

    ```bash
    javac -d bin src/*.java
    ```

4. Run the program:

    ```bash
    java -cp "bin;sqlite-jdbc-3.42.0.0.jar" Main
    ```

### How It Works

- **Database**: The Git command data is stored in an SQLite database (`git_commands.db`).
- **Command Categories**: Commands are categorized (e.g., "Basics", "Staging") for easy navigation.
- **Command Lookup**: You can search for commands based on their category and view a description and usage example.

### Example Usage

```bash
java -cp "bin;sqlite-jdbc-3.42.0.0.jar" Main
