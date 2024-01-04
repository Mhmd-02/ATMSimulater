# ATM-Bank System Management

Welcome to the ATM-Bank System Management project! This system is designed to manage and simulate a basic ATM and bank operations. It provides functionalities such as account management, transaction processing, and balance inquiries.

## Table of Contents

- [Features](#Features)
- [Getting Started](#Getting-Started)
  - [Prerequisites](#Prerequisites)
  - [Installation](#Installation)
- [Usage](#Usage)

## Features

- Account creation and management.
- Deposit and withdrawal transactions.
- Balance inquiries.

## Getting Started

Follow these instructions to get the project up and running on your local machine.

### Prerequisites

- Java IDE(Netbeans,Eclipse,Vscode,intellij)
- Jdk 17/21
- Xampp(for local hosting)

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/Mhmd-02/ATMSimukater.git
   ```
2. You can also download as zip file and extract in a certain folder.

### Create a DataBase
1. Open the Xampp and start the apache and Mysql
2. Go to the localhost/phpmyadmin/ and create a database called "bank_db".
3. You need to create 6 tables:
  - bank(Columns:	pin ,date ,Lastoperation, amount)
  - login( Columns: Cardno (UNI, bigint) ID (PRI, int) Pin (int))
  - operation(Columns: amount (int) date (varchar) mode (varchar) opID (PRI, int) pin (int))
  - signup(Columns: Address (varchar) City (varchar) Dob (varchar) Email (varchar) Fname (varchar) gender (varchar) ID (PRI, int) Maritial (varchar) Name (varchar) pincode (int) State (varchar))
  - signup2(Columns: Edu (varchar) Existing (varchar) ID (PRI, int) Income (varchar) Nationality (varchar) National_ID (UNI, bigint) occup (varchar) OthNat (varchar) SCitizen (varchar))
  - signup3(Columns: AccType (varchar) Cardno (UNI, bigint) ID (PRI, int) Pin (int) Service (varchar))

<b>Note:</b> You can use different names but make the suitable changes inside the java files.

## Usage

After getting every thing set just go ahead and run the login file and your good to go!.
You will be able to signup for a new account.
After filling the details correctly you will get a card number with a pin write them down.
Finaly you will be able to perform different inquiries.

<strong> Enjoy and Good bye ;)</strong>

