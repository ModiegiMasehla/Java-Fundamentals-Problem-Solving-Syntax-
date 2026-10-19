# Java Fundamentals & Problem Solving (Syntax)

## Learning Outcomes Assessed

- Understanding of basic Java syntax
- Conditional statements
- Methods and return types
- Basic loops
- Simple algorithms (problem-solving)

---

## How to Run Your Tests

To compile and run all your tests:

```bash
mvn clean compile test
```

---

## Fundamentals Coding Assessment

This assessment consists of four Java methods inside the `Fundamentals` class. Your task is to **write the logic for each method**, **fix any bugs**, and **ensure all tests pass**.

## Project Structure

```
oop-000-fun-v2/
├── src/main/java/za/co/mocoder
│   └── Fundamentals.java            # <-- This is where you write your solutions
├── src/test/java/za/co/mocoder
│   └── FundamentalsTest.java        # <-- These are the tests you must make pass
└── README.md                        # <-- Assessment instructions (this file)
└── answers.txt                      # <-- Comprehension answers go here
```

---

## Question 1 — `stayCalm(int n)`

This method must:

- Compute the sum of the **squares** of all numbers from 1 to `n` (1² + 2² + ... + n²)
- Return `true` if that sum is divisible by 5
- Return `false` otherwise

Example: `n = 4` gives 1 + 4 + 9 + 16 = 30, which is divisible by 5, so the result is `true`.

Method signature:

```java
public static boolean stayCalm(int n){}
```

---

## Question 2 — `countUpOdd(int n)`

Write the method so that it:

- Uses a loop
- Prints all **odd** numbers from `1` up to `n` (inclusive, if `n` is odd)
- Prints each number on its own line
- Prints nothing if `n` is less than 1

Example: `countUpOdd(7)` prints `1`, `3`, `5`, `7` (each on its own line).

Method signature:

```java
public static void countUpOdd(int n){}
```
---

## Question 3 — `checkPassphrase(String passphrase)`

Write a method `checkPassphrase(String passphrase)` that returns a strength rating based on the rules below. Apply the rules **in this order**:

| Condition | Required Return Value |
|---|---|
| Passphrase is `null`, empty, or only spaces | `"Invalid"` |
| Passphrase length is less than 8 characters | `"Weak"` |
| Contains **uppercase**, **lowercase**, **digits**, and **symbols** (`@#$%&*?`) | `"Strong"` |
| Contains **uppercase**, **lowercase**, and **digits** (but no symbol) | `"Medium"` |
| Anything else | `"Weak"` |

Method signature:

```java
public static String checkPassphrase(String passphrase){}
```

You must correctly implement the following boolean checks:

- `hasUpper` — at least one uppercase letter
- `hasLower` — at least one lowercase letter
- `hasDigit` — at least one digit
- `hasSymbol` — at least one character from `"@#$%&*?"`

Use Java tools such as `Character.isUpperCase()`, `Character.isLowerCase()`, `Character.isDigit()` and `String.indexOf()`.

---

## Question 4 — `capitaliseWords(String sentence)`

Complete the method so that it:

- Capitalises the **first letter** of every word and makes the **rest of each word lowercase**
- Handles extra spaces (leading, trailing and between words) by returning words separated by a single space
- Returns an empty string `""` if the input is `null` or contains only spaces

```
Input:  "  jAVA   is  fun "
Output: "Java Is Fun"
```

Method signature:

```java
public static String capitaliseWords(String sentence)
```
----

## Comprehension Question Section

### Comprehension Question 1 — The JDK, JRE and JVM (5 Points)

A new student has just installed Java for the first time. The installer mentions the "JDK", their friend keeps talking about the "JVM", and an old tutorial told them to install the "JRE". They have no idea how these three things relate to each other, or why Java is described as "write once, run anywhere".

In your own words, explain the JDK, the JRE and the JVM. Your explanation should cover what each acronym stands for, what each one is responsible for, how they fit inside one another, what bytecode is and what role the compiler (`javac`) plays, and why this setup lets the same Java program run on Windows, Linux and macOS. Make sure your explanation is grounded enough that this student would know which one they need to install to write Java code and which one is needed only to run it.

---

### Comprehension Question 2 — Git Collaboration and Merge Conflicts (5 Points)

Two developers on your team have both edited the same method in the same file on their own branches. When the first developer merges, everything is fine. When the second developer tries to merge, Git stops and reports a "merge conflict". The second developer panics and thinks they have broken the repository.

In your own words, explain what a merge conflict is and how to deal with it. Your explanation should cover why Git cannot always merge automatically, what the conflict markers in a file look like and mean, the steps to resolve a conflict and complete the merge, how to reduce the chances of conflicts in the first place, and what a `.gitignore` file is for. Make sure your explanation is grounded enough that this developer could resolve the conflict calmly and safely.

---

### Comprehension Question 3 — Unit Testing (10 Points)

A junior developer has been testing their code by running the program and checking the output by eye. Their method works today, but last week a "small change" silently broke another feature and nobody noticed until a customer complained. They have heard that "unit tests" would have caught this, but do not know what a unit test is.

In your own words, explain unit testing. Your explanation should cover what a unit test is and what a "unit" refers to, why automated tests are better than checking output manually, what JUnit is and what the annotations `@Test` and `@BeforeEach` do, what assertions are (with an example such as `assertEquals`), what makes a good test (including edge cases), and how tests are run with Maven. Make sure your explanation is grounded enough that this developer could write a simple test for a method that adds two numbers.

---

### Comprehension Question 4 — Loops: while, do-while and for (5 Points)

A fellow student on your bootcamp only ever uses `for` loops. They have seen `while` and `do-while` in other people's code but do not understand why those exist or when they would be a better choice.

In your own words, explain the `while` loop and the `do-while` loop and compare them with the `for` loop. Your explanation should cover the syntax of each, the key difference between `while` and `do-while` (when the condition is checked), what an infinite loop is and how it usually happens by accident, what `break` and `continue` do, and when you would choose each type of loop. Make sure your explanation includes enough Java syntax that your fellow student could go and write all three types of loop correctly.

---

### Comprehension Question 5 — Inheritance and Polymorphism (10 Points)

A student has just learned how to write a single Java class with fields and methods. Their next assignment asks them to model different kinds of animals (a `Dog` and a `Cat`) that all have a name and can all make a sound, and they have started copy-pasting the same code into both classes.

In your own words, explain how inheritance and polymorphism solve this problem. Your explanation should cover what inheritance is and what the `extends` keyword does, what a superclass and a subclass are, what method overriding is and what the `@Override` annotation is for, what polymorphism means (including a reference of a parent type holding a child object), the difference between overriding and overloading, and what the `super` keyword does. Make sure your explanation includes a short Java example with an `Animal`, a `Dog` and a `Cat`, so that the student could look at it and understand how the pieces fit together.

---

## Your Goal

Complete all methods in `Fundamentals.java` so that:

- The code is valid Java and compiles without errors
- Each method behaves according to the rules above
- All unit tests pass successfully

---

Good luck — and remember to think carefully about your loops, conditions, types, and syntax!
