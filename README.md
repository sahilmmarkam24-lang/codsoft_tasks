# 🎯 Number Guessing Game (Java)

## 📌 About the Project

The **Number Guessing Game** is a simple, interactive, console-based Java application. The computer generates a random number between 1 and 100, and the player tries to guess the correct number within a limited number of attempts.

The game provides hints to help the player determine whether their guess is too high or too low. Players can play multiple rounds, earn points, and view their final score.

## ✨ Features

- 🎲 Random number generation between 1 and 100
- ⌨️ User input validation
- 📈 Hints for guesses that are too high or too low
- 🔢 Maximum of 7 attempts per round
- 🏆 Score calculation based on attempts taken
- 🔄 Option to play multiple rounds
- 📊 Final score and rounds won summary

## 🛠️ Technologies Used

- **Programming Language:** Java
- **Libraries:** `java.util.Random`, `java.util.Scanner`
- **Concepts:** Loops, conditional statements, user input, random number generation, and basic scoring logic

## 📋 Requirements

- Java Development Kit (JDK) installed on your computer
- A terminal or command prompt, or a Java IDE such as IntelliJ IDEA, Eclipse, or VS Code

## 🚀 How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/YOUR-USERNAME/Number-Guessing-Game.git
```

Replace `YOUR-USERNAME` with your GitHub username.

### 2. Navigate to the Project Folder

```bash
cd Number-Guessing-Game
```

### 3. Compile the Java Program

```bash
javac NumberGame.java
```

### 4. Run the Game

```bash
java NumberGame
```

## 🎮 How to Play

1. Run the program.
2. Guess a number between **1 and 100**.
3. Read the hints displayed after each guess.
4. Try to find the correct number within **7 valid attempts**.
5. Earn points based on how quickly you guess the number.
6. Choose whether to play another round.
7. View your total score and rounds won when you finish.

## 🧮 Scoring System

The game awards more points when the player guesses the correct number in fewer attempts.

| Attempts to Guess Correctly | Points Earned |
|---|---:|
| 1 | 70 |
| 2 | 60 |
| 3 | 50 |
| 4 | 40 |
| 5 | 30 |
| 6 | 20 |
| 7 | 10 |

No points are awarded for a round in which the player fails to guess the number.

## 📂 Project Structure

```text
Number-Guessing-Game/
├── NumberGame.java
├── README.md
└── .gitignore
```

## 🎓 Learning Outcomes

This project demonstrates the use of:

- Java classes and the `main()` method
- `Scanner` for reading user input
- `Random` for generating random numbers
- `do-while` and `while` loops
- `if-else` conditional statements
- Input validation and score calculation

## 🔮 Future Improvements

- Add difficulty levels.
- Allow players to customize the number range.
- Save high scores between sessions.
- Add a graphical user interface (GUI).
- Track the total number of games played.

## 👨‍💻 Author

**SAHIL MARKAM**

GitHub: [sahilmmarkam24-lang](https://github.com/YOUR-USERNAME)

---

⭐ If you find this project useful, consider giving the repository a star!

**Built with Java ☕**
