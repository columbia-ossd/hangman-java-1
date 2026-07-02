# Hangman Java Game

A command-line Hangman game written in Java.

The game randomly selects a city in Washington State, and the player guesses one letter at a time.

## Requirements

- Java 17 or later

Check your Java version:

```bash
java --version
```

---

## Running the Game

### 1. Clone the repository

```bash
git clone <repository-url>
cd hangman-java
```

### 2. Compile the source files

```bash
javac src/*.java
```

This will generate `.class` files in the `src` directory.

### 3. Run the game

```bash
java -cp src Main
```

### Example

```bash
javac src/*.java
java -cp src Main
```

---

## Project Structure

```text
hangman-java/
├── src/
│   ├── Main.java
│   ├── Game.java
│   ├── Drawing.java
│   └── Dictionary.java
└── README.md
```

## Potential Contributions

This project is designed to provide practice with understanding, modifying, and extending an existing codebase. The following are examples of potential improvements that contributors can implement.

### Issue #1: Add New York City Mode

Currently, the game only includes cities from Washington State.

Add a second game mode that allows players to choose between:

1. Washington State cities
2. New York State cities

Example:

```text
Choose a city set:
1. Washington State cities
2. New York State cities
```

The game should randomly select a city from the chosen state.

Possible files to modify:
- `Dictionary.java`
- `Game.java`
- `Main.java`

---

### Issue #2: Support Multi-Word City Names

The current implementation only supports single-word city names.

Modify the game so that it can support city names containing spaces, such as:

- Glen Cove
- White Plains
- New Rochelle

Requirements:

- Spaces should be displayed automatically.
- Players should not need to guess spaces.
- The win condition should still work correctly.

Example:

```text
G _ _ _   C _ _ _
```

Possible files to modify:
- `Game.java`
- `Dictionary.java`

---

### Issue #3: Allow Full City Guesses

Currently, players can only guess one letter at a time.

Modify the game so that players can enter either:

- A single letter
- An entire city name

Examples:

```text
Enter a letter or city name: Seattle
Congratulations! You win!
```

Incorrect full-city guesses should count as one incorrect attempt.

Example:

```text
Enter a letter or city name: Tacoma
Incorrect city guess.
Remaining tries: 5
```

Possible files to modify:
- `Game.java`

---

### Issue #4: Add Replay Mode

Currently, users must restart the program to play another game.

Add functionality that allows users to start a new game after a win or loss.

Example:

```text
Play again? (y/n): y
```

Requirements:

- `y` or `Y` starts a new game.
- `n` or `N` exits the program.
- Invalid responses should prompt the user again.

Possible files to modify:
- `Main.java`
- `Game.java`
