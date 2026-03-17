# 📚 Book Tracker

A modern full-stack web application to search, track, and manage your reading progress.

---

## 🚀 Features

* 🔍 **Search Books** using Open Library API
* ➕ **Add Books** to your personal collection
* 📖 Organize books into:

  * Want to Read
  * Reading
  * Completed
* 📊 **Track Reading Progress** (update pages in real-time)
* 🌗 **Light / Dark Mode Toggle** (persistent across pages)
* 🖼️ **Book Cover Thumbnails**
* 🔔 **Toast Notifications** for smooth UX
* ⚡ **Instant UI Updates** (no page reloads)

---

## 🛠️ Tech Stack

### Frontend

* HTML, CSS, JavaScript
* React (via CDN, no build tools)
* Responsive & minimal UI design

### Backend

* Java
* Spring Boot (REST API)

### Data Storage

* JSON file (lightweight persistence)

---

## 🔄 API Endpoints

| Method | Endpoint    | Description   |
| ------ | ----------- | ------------- |
| GET    | /books      | Get all books |
| POST   | /books      | Add new book  |
| PUT    | /books/{id} | Update book   |
| DELETE | /books/{id} | Delete book   |

---

## ✨ Key Highlights

* Clean separation of frontend & backend
* Real-time state updates (no unnecessary reloads)
* Optimistic UI updates for better UX
* Persistent theme using localStorage
* Handles missing API data gracefully

---

## 🔮 Future Improvements

* 📊 Analytics dashboard (reading stats, streaks)
* ⭐ Book ratings & notes
* 🔐 User authentication
* ☁️ Cloud database (PostgreSQL / Supabase)
* 📱 Fully responsive mobile UI

---

## 📌 Notes

This project was built as a full-stack demonstration focusing on:

* API design
* State management
* User experience
* Clean UI implementation

---
