UI Automation Test Framework with Cucumber, Java, Gradle, and Selenium
Project Description

This project provides a UI Automation Testing framework to test web applications. The framework utilizes Cucumber, Java, Gradle, and Selenium to achieve the following goals:

- Automate UI test scenarios: Cucumber enables writing test scenarios in easy-to-read and understand Gherkin language.
- Robust test execution: Java and Selenium provide powerful libraries to interact with web elements and execute tests effectively.
- Efficient build management: Gradle helps manage dependencies, build the project, and run tests automatically.

Page Object Model Design Pattern

The framework implements the Page Object Model (POM) design pattern to improve code maintainability and readability. Each web page in the application under test is represented as a separate Java class. This class contains all the locators and methods required to interact with elements on that page.

Positive and Negative Test Cases

The project includes test scenarios for both positive and negative cases. Positive cases verify that the application works as expected, while negative cases verify that the application handles errors and unexpected situations correctly.

Running the Tests

To run the tests, follow these steps:

1. Clone the GitHub repository: Clone the GitHub repository containing the project's source code.
2. Ensure prerequisites are met: Ensure you have Java Development Kit (JDK) and Gradle installed on your system.
3. Run the tests: Open a terminal and navigate to the project's root directory. Execute the following command to run the tests:
gradle test

Documentation

Test Case 
- Scenario: login with normal user.
- Scenario: Test login web with lock user.
- Scenario: Test login web with invalid user.
- Scenario: test login web add to cart.
- Scenario: test login web user delete item from cart.
