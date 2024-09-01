# Library Management System

Overview

The Library Management System is a Java application designed to manage a 
collection of books. It includes functionality for adding books, borrowing books, 
returning books, and viewing available books. This project uses object-oriented
principles and test-driven development (TDD) to ensure a robust and maintainable
codebase.

Features

**Add Books**: Add new books to the library with details like ISBN, title, author, and publication year.

**Borrow Books**: Borrow a book if it's available.

**Return Books**: Return borrowed books to update their availability.

**View Available Books**: List all books currently available in the library.

### **Requirements**

Java Development Kit (JDK): Version 11 or higher

JUnit: Version 5 for running unit tests

IDE: IntelliJ IDEA or any Java IDE (Optional but recommended)

### **Getting Started**

Follow these steps to set up and run the Library Management System on your local machine:

#### 1. **Clone the Repository** 

First, clone the repository from GitHub:

   git clone <your-remote-repository-url>

   cd library_management_system
   
#### 2.Set Up Your Development Environment

If you're using an IDE like IntelliJ IDEA:

1) Open IntelliJ IDEA.

2) Import Project:

Go to File -> Open and select the cloned project directory.

Choose the src folder as the source directory if prompted.

#### 3.**Build the Project**

The project can be built using an IDE or via the command line. If using Gradle or Maven (not specified but commonly used), you might need to include build instructions.

**Using Gradle** (if applicable):

Run the following command to build the project:

./gradlew build

****Using Maven**** (if applicable):

Run the following command to build the project:

mvn package

#### 4.**Run the Application**

To run the application:

1) **Locate Main.java:**

In IntelliJ IDEA, right-click on **Main.java** in the **src/main/java/com/example** directory.

Select **Run 'Main.main()'**.

2) **Alternatively, Run from Command Line**:

Navigate to the **build/classes/java/main** (Gradle) or **target/classes** (Maven) directory and run:

java com.example.Main

#### 5.**Run Tests**

To ensure everything is working correctly, run the unit tests provided in the LibraryTest class:

1) **Using IntelliJ IDEA:**

Right-click on **LibraryTest.java** in the **src/test/java/com/example** directory.
Select Run '**LibraryTest**'.

2) **Using Command Line**:

**For Gradle:**

./gradlew test

**For Maven:**

mvn test

#### 6.**Explore the Code**

**Book.java**: Defines the Book class with attributes like ISBN, title, author, and availability.

**Library.java**: Manages book operations including adding, borrowing, returning, and viewing books.

**BookNotAvailableException.java**: Custom exception for handling cases when a book is not available.

**Main.java**: Demonstrates the usage of the Library class.

**LibraryTest.java**: Contains unit tests to validate the functionality of the Library class.

