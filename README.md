# CareWare: Pharmacy Inventory & Point of Sale (POS) Management System

CareWare is a standalone desktop application designed to streamline pharmacy operations. It integrates robust inventory tracking, stock level alerts, medicine expiration monitoring, supplier relationships, and point-of-sale (POS) processing into an intuitive interface. 

Built with **JavaFX** and following a rigorous **Layered Architecture**, CareWare provides high maintainability, thread safety via the **Singleton Pattern**, and seamless transactional control for small-to-medium pharmacies.

---

## 🚀 Features

- **Point of Sale (POS) Billing:** Efficient checkout interface to issue prescriptions, process sales, calculate discounts, and print/generate detailed customer receipts.
- **Inventory & Stock Management:** Complete CRUD capabilities for medicines/drugs with instant logging of quantities.
- **Expiry Tracking:** Proactive monitoring and visual indicators for expiring or near-expiry batches to prevent hazardous or dead-stock situations.
- **Low Stock Alerts:** Re-order indicators that notify administrators when product levels drop below pre-defined thresholds.
- **Supplier & Purchase Orders:** Manage vendor communications, delivery logs, and incoming supplier history.
- **User Authentication & Role Management:** Secure access levels separating administrator privileges from pharmacist/cashier duties.

---

## 🏗️ Architecture & Design Patterns

The project is structured under a clean **Layered Architecture** pattern to separate concerns and guarantee scalable development:

1. **View / UI Layer (JavaFX / FXML):** Handles user interactions, views, animations, and input forms.
2. **Controller Layer:** Coordinates input data from the UI and passes requests down to the business layers.
3. **Service / BO (Business Object) Layer:** Encapsulates the specific operational rules of the pharmacy (e.g., calculating totals, validation logic).
4. **DAO (Data Access Object) Layer:** Isolates database queries from business rules. Directly interfaces with the persistence layer.
5. **Entity / Model Layer:** Represents the database schemas as plain old Java objects (POJOs).

### Key Design Patterns:
- **Singleton Pattern:** Used across Database Connection wrappers and BO/DAO factories to optimize memory overhead and guarantee unique resource handling.

---

## 🛠️ Tech Stack

- **Language:** Java (JDK 11 or higher)
- **GUI Framework:** JavaFX (with Scene Builder for FXML layouts)
- **Database:** MySQL
- **Build / Dependency Tool:** Maven (or Gradle depending on exact workspace files)

---

## 📦 Prerequisites

Ensure you have the following installed before configuring the project:
- [Java Development Kit (JDK) 11+](https://www.oracle.com/java/technologies/downloads/)
- [JavaFX SDK](https://openjfx.io/) (if not bundled with your build tool)
- [MySQL Server](https://dev.mysql.com/downloads/mysql/)
- An IDE (e.g., IntelliJ IDEA, Eclipse, or NetBeans)

---

## ⚙️ Installation & Setup

1. **Clone the Repository:**
   ```bash
   git clone [https://github.com/vikumkanishka/CareWare-Pharmacy_Inventory_Management_System.git](https://github.com/vikumkanishka/CareWare-Pharmacy_Inventory_Management_System.git)
   cd CareWare-Pharmacy_Inventory_Management_System
