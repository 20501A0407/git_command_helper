-- Create the table
CREATE TABLE git_commands (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    command TEXT NOT NULL,
    category TEXT,
    description TEXT,
    example TEXT
);
