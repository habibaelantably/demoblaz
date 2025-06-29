# 💻 Demoblaze Automation with Playwright (Java)

This project is an automated test simulation of basic e-commerce functionalities using [Playwright for Java](https://playwright.dev/java/). It performs actions like **signup**, **login**, **navigating to product categories**, **adding an item to the cart**,
and **logging out** on the [Demoblaze demo website](https://www.demoblaze.com/index.html).

## 📂 Project Structure

- `mainClass.java`: Main class that executes the full end-to-end flow.
- `SignupPage.java`: Page Object for the Signup functionality.
- `LoginPage.java`: Page Object for the Login functionality.

## 🧪 What the test does

1. Opens the browser using Chromium in non-headless mode.
2. Navigates to [Demoblaze](https://www.demoblaze.com/index.html).
3. Signs up with a username and password.
4. Logs in with an existing account.
5. Navigates to the "Monitors" section.
6. Selects "Apple monitor 24".
7. (Optionally) adds the item to the cart.
8. Logs out of the application.
9. Captures and prints alert dialogs (like signup or login confirmation).

## ⚙️ Tech Stack

- ✅ Java
- ✅ Maven
- ✅ Playwright Java (`com.microsoft.playwright`)

## 🚀 How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/habibaelantably/demoblaz.git
cd demoblaz
