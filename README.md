EBank App BDD Automation Testing

This project automates the Login and Logout functionalities of the EBank web application using Selenium, Cucumber (BDD), Java, TestNG/JUnit, and Page Object Model (POM).

Project URL

🔗 Application Under Test (AUT):
https://qaebank.ccbp.tech/ebank/login

Test Scenarios
| Test Case         | Input                                    | Expected Result                                           |
| ----------------- | ---------------------------------------- | --------------------------------------------------------- |
| Empty fields      | Click login without entering credentials | Error message: **Invalid User ID**                        |
| Empty User ID     | PIN = `231225`                           | Error message: **Invalid PIN**                            |
| Empty PIN         | User ID = `142420`                       | Error message: **Invalid PIN**                            |
| Invalid PIN       | User ID = `142420`, PIN = `123456`       | Error message: **User ID and PIN didn't match**           |
| Valid credentials | User ID = `142420`, PIN = `231225`       | Redirect to `https://qaebank.ccbp.tech/`                  |
| Logout test       | Login → Logout                           | Redirect to Login page: `https://qaebank.ccbp.tech/login` |



Technology Used
| Tool                    | Purpose                       |
| ----------------------- | ----------------------------- |
| Selenium WebDriver      | Browser automation            |
| Cucumber (BDD)          | Scenario-based automation     |
| Java                    | Programming language          |
| JUnit/TestNG            | Test execution                |
| Maven                   | Dependency management         |
| Page Object Model (POM) | Maintainability & readability |
