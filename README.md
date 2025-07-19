## 📚 Binary Search Tree (BST) Full Stack Project

This project implements a **Binary Search Tree (BST)** with:

* ✅ **Spring Boot Java Backend** providing REST APIs for insertion, deletion, search, and traversals.
* ✅ **Frontend with HTML, CSS, JavaScript** to interact with BST and display inserted nodes live on the screen.

---

## 🎥 Demo
![Chat Demo](https://github.com/Prajapatikapil41/-BST-Full-Stack-Project/blob/main/Codveda_L3T3.gif)

---

### ✅ Project Structure

```
BST-Fullstack/
│
├── backend/                # Spring Boot Backend
│   ├── src/main/java/com/bst/controller/BSTController.java
│   ├── src/main/java/com/bst/service/BSTService.java
│   ├── src/main/java/com/bst/model/TreeNode.java
│   └── BackendApplication.java
│   └── pom.xml
│
└── frontend/               # HTML/CSS/JS Frontend
    ├── index.html
    ├── style.css
    └── script.js
```

---

### ✅ Backend Details

Spring Boot REST APIs:

| Method | Endpoint            | Description             |
| ------ | ------------------- | ----------------------- |
| POST   | `/bst/insert/{key}` | Insert a node           |
| DELETE | `/bst/delete/{key}` | Delete a node           |
| GET    | `/bst/search/{key}` | Search for a node       |
| GET    | `/bst/inorder`      | Get inorder traversal   |
| GET    | `/bst/preorder`     | Get preorder traversal  |
| GET    | `/bst/postorder`    | Get postorder traversal |

---

### ✅ Frontend Details

* User-friendly interface with:

  * Insert, Delete, Search buttons
  * Traversals display (Inorder, Preorder, Postorder)
  * Live **node display** after each insert/delete
  * Colorful UI using modern **CSS gradients and shadows**

---

### ✅ How to Run

#### 1️⃣ Start Backend:

```bash
cd backend
./mvnw spring-boot:run
```

Backend will start on `http://localhost:8080`

#### 2️⃣ Start Frontend:

* Open `frontend/index.html` using **Live Server** in VS Code
  OR
* Just open directly in browser:

```bash
file:///path-to-project/frontend/index.html
```

---

### ✅ Preview

Inserted BST nodes are shown dynamically like this:

```
[ 10 ] [ 20 ] [ 30 ]
```

Traversals display below buttons.

---

### ✅ Tools & Technologies

* Spring Boot (Java 17)
* REST APIs
* HTML, CSS, JavaScript (Vanilla JS)
* VS Code IDE

---

## 👨‍💻 Author

|                                                                                                     Photo                                                                                                    | **Kapil Prajapati**                                                                                                                                                                                                                                                 |
| :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [<img src="https://avatars.githubusercontent.com/u/81869156?s=400&u=ff6de7017b51e4d96dbfb1ae39c7a459d5e13ea8&v=4" width="120" height="120" style="border-radius:50%;">](https://github.com/Prajapatikapil41) | - 🧑‍💻 **GitHub:** [Prajapatikapil41](https://github.com/Prajapatikapil41)<br> - 💼 **LinkedIn:** [Kapil LinkedIn](https://www.linkedin.com/in/kapil-prajapati-7ba4b51b7/)<br> - 📧 **Email:** [kapilprajapati0403@gmail.com](mailto:kapilprajapati0403@gmail.com) |

---
