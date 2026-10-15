# ☕ JAVA_LEARNING — Complete Java Programming Journey

![Java](https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=openjdk&logoColor=white)
![Learning](https://img.shields.io/badge/Focus-Core%20Java-blue?style=for-the-badge)
![Topics](https://img.shields.io/badge/Topics-14%2B-brightgreen?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Continuous%20Learning-purple?style=for-the-badge)

Welcome to **JAVA_LEARNING**, a structured collection of Java programs, examples, and practice exercises covering fundamental and advanced Core Java concepts.

This repository is designed to build a strong foundation in Java programming through hands-on coding, organized topic folders, and practical examples.

Whether you are starting with Java or revising concepts for interviews and problem-solving, this repository can serve as a learning reference.

## 🎯 Learning Objectives

- Understand Java syntax and programming fundamentals.
- Develop logical thinking and problem-solving skills.
- Master Object-Oriented Programming (OOP).
- Work with arrays, strings, methods, and mathematical operations.
- Handle exceptions and work with files.
- Understand multithreading and synchronization.
- Learn Java Collections Framework.
- Explore lambda expressions and the Stream API.
- Build a foundation for data structures, algorithms, and interview preparation.

## 📚 Topics Covered

| No. | Topic | Concepts |
|---:|---|---|
| 1 | [Print](https://github.com/Saravanan-mc/JAVA_LEARNING/tree/main/1.PRINT) | Output statements, basic syntax |
| 2 | [Data Types & Variables](https://github.com/Saravanan-mc/JAVA_LEARNING/tree/main/2.Data_Types_Variables) | Primitive types, variables, type conversion |
| 3 | [Operators](https://github.com/Saravanan-mc/JAVA_LEARNING/tree/main/3.Operators) | Arithmetic, logical, relational, assignment |
| 4 | [Conditionals](https://github.com/Saravanan-mc/JAVA_LEARNING/tree/main/4.Conditionals) | `if`, `else`, nested conditions, `switch` |
| 5 | [Loops](https://github.com/Saravanan-mc/JAVA_LEARNING/tree/main/5.Loops) | `for`, `while`, `do-while`, nested loops |
| 6 | [Arrays](https://github.com/Saravanan-mc/JAVA_LEARNING/tree/main/6.Array) | Array traversal, searching, sorting basics |
| 7 | [Strings](https://github.com/Saravanan-mc/JAVA_LEARNING/tree/main/7.String) | String methods, comparison, manipulation |
| 8 | [Methods](https://github.com/Saravanan-mc/JAVA_LEARNING/tree/main/8.Methods) | Parameters, return values, method overloading |
| 9 | [Math Operations](https://github.com/Saravanan-mc/JAVA_LEARNING/tree/main/9.Math_Operation) | Mathematical methods and calculations |
| 10 | [OOP](https://github.com/Saravanan-mc/JAVA_LEARNING/tree/main/10.OOPs) | Classes, objects, inheritance, polymorphism, abstraction, encapsulation |
| 11 | [Exception Handling](https://github.com/Saravanan-mc/JAVA_LEARNING/tree/main/11.Exception_Handling) | `try`, `catch`, `finally`, `throw`, `throws` |
| 12 | [Files](https://github.com/Saravanan-mc/JAVA_LEARNING/tree/main/12.Files) | File operations, reading, writing |
| 13 | [Threading](https://github.com/Saravanan-mc/JAVA_LEARNING/tree/main/13.Threading) | Threads, synchronization, concurrent execution |
| 14 | [Collections](https://github.com/Saravanan-mc/JAVA_LEARNING/tree/main/14.Collections) | Lists, Sets, Maps, Queues, collection implementations |
| 15 | [Stream API](https://github.com/Saravanan-mc/JAVA_LEARNING/blob/main/14.streamAPI.java) | Stream operations, functional-style data processing |

*The descriptions summarize the topics suggested by the folder names. Refer to the individual source files for the exact examples implemented.*

## 🗂️ Repository Structure

```text
JAVA_LEARNING/
│
├── 1.PRINT/
├── 2.Data_Types_Variables/
├── 3.Operators/
├── 4.Conditionals/
├── 5.Loops/
├── 6.Array/
├── 7.String/
├── 8.Methods/
├── 9.Math_Operation/
├── 10.OOPs/
├── 11.Exception_Handling/
├── 12.Files/
├── 13.Threading/
├── 14.Collections/
│
├── 14.streamAPI.java
└── README.md
```

## ⚙️ Prerequisites

Before running the programs, install:

- **JDK:** Java Development Kit, preferably JDK 17 or a compatible version.
- **Editor:** Visual Studio Code, IntelliJ IDEA, Eclipse, or another Java IDE.
- **Terminal:** Command Prompt, PowerShell, or a Unix-compatible terminal.

Verify your installation:

```bash
java -version
javac -version
```

## 🚀 Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/Saravanan-mc/JAVA_LEARNING.git
```

### 2. Navigate to the project

```bash
cd JAVA_LEARNING
```

### 3. Open a topic folder

Choose any topic and open a Java source file.

### 4. Compile and run a Java program

For a source file containing a standard class with a `main` method:

```bash
javac HelloWorld.java
java HelloWorld
```

Replace `HelloWorld.java` with your actual source filename and `HelloWorld` with its class name.

**Note:** Java source filenames must match the name of a public top-level class. Since `14.streamAPI.java` begins with a number and contains an additional dot, it may require renaming before standard `javac` compilation. Use a valid filename such as `StreamAPI.java` if appropriate.

## 💡 Example: Java Fundamentals

```java
public class HelloWorld {
    public static void main(String[] args) {
        String language = "Java";
        int year = 2026;

        System.out.println("Learning " + language);
        System.out.println("Year: " + year);
    }
}
```

**Output:**

```text
Learning Java
Year: 2026
```

## 🧠 Recommended Learning Path

1. Master variables, data types, and operators.
2. Practise conditions and loops.
3. Solve problems using arrays and strings.
4. Learn methods and reusable code.
5. Understand all four pillars of OOP.
6. Practise exception handling and file operations.
7. Learn collections and their use cases.
8. Study threads, synchronization, and concurrency.
9. Explore lambda expressions and the Stream API.
10. Progress to DSA, JDBC, databases, and backend development.

## 🔥 Practice Challenges

Try implementing these exercises while learning:

- Check whether a number is prime.
- Reverse a string and check for a palindrome.
- Find the largest and second-largest array elements.
- Count the frequency of elements in a collection.
- Create a student management program using OOP.
- Handle invalid input with exception handling.
- Read and write data using file operations.
- Create multiple threads and observe their execution.
- Sort, filter, and transform collections using the Stream API.

## 🔮 Future Enhancements

- Add Java DSA and algorithm problems.
- Include unit testing with JUnit.
- Add JDBC and database connectivity examples.
- Explore Java networking and REST APIs.
- Learn Maven or Gradle.
- Add practical projects demonstrating Core Java concepts.
- Document time and space complexity for algorithm exercises.
- Include interview questions and coding challenges.

## 👨‍💻 Author

**Saravanan-mc**

- GitHub Profile: [@Saravanan-mc](https://github.com/Saravanan-mc)
- Repository: [JAVA_LEARNING](https://github.com/Saravanan-mc/JAVA_LEARNING)

## ⭐ Support

If this repository helps you learn Java, consider giving it a ⭐ on GitHub.

Feel free to explore the examples, practise the concepts, and contribute improvements.

---

<p align="center">
  <b>Learn Java. Practise Every Day. Build Strong Programming Skills. ☕</b>
</p>
