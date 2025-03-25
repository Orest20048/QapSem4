
# Golf Club Membership & Tournament API

A Spring Boot-based RESTful API for managing golf club members and tournaments, built using Java, Gradle, MySQL, and Docker.

---

## ✨ Features

- Manage golf club **Members** and **Tournaments**
- Assign Members to Tournaments
- Search Members by name, phone number, membership type, and membership start date
- Search Tournaments by location and start date
- View Members in a Tournament
- Docker & Docker Compose support for easy setup

---

## 🚀 Prerequisites

- Docker + Docker Compose
- JDK 22+
- Git

---

## 🐳 Running with Docker

```bash
git clone https://github.com/YOUR_USERNAME/golf-club-api.git
cd golf-club-api
docker-compose up --build
```

The API will be available at: `http://localhost:8080`

---

## 🔌 API Endpoints

### 📋 Member Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET    | `/api/members` | List all members |
| GET    | `/api/members/{id}` | Get member by ID |
| POST   | `/api/members` | Create a new member |
| PUT    | `/api/members/{id}` | Update a member |
| DELETE | `/api/members/{id}` | Delete a member |
| GET    | `/api/members/search?name=John` | Search by name |
| GET    | `/api/members/search?phone=1234567890` | Search by phone |
| GET    | `/api/members/search?type=Gold` | Search by membership type |
| GET    | `/api/members/search?startDate=2024-01-01` | Search by membership start date |

### 🏆 Tournament Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET    | `/api/tournaments` | List all tournaments |
| GET    | `/api/tournaments/{id}` | Get tournament by ID |
| POST   | `/api/tournaments` | Create a new tournament |
| PUT    | `/api/tournaments/{id}` | Update a tournament |
| DELETE | `/api/tournaments/{id}` | Delete a tournament |
| POST   | `/{tournamentId}/add-member/{memberId}` | Add member to tournament |
| GET    | `/{tournamentId}/members` | View members in a tournament |
| GET    | `/api/tournaments/search?location=Toronto` | Search by location |
| GET    | `/api/tournaments/search?startDate=2024-06-01` | Search by start date |

---

## 🧪 Postman Testing

Screenshots of Postman tests are available in the `screenshots/` folder.

---

## 🛠️ Lombok Support

This project uses [Project Lombok](https://projectlombok.org/) to reduce boilerplate code.  
Ensure that:
- The Lombok plugin is installed in your IDE
- Annotation Processing is enabled

---

## 🐘 Database Configuration (Dockerized MySQL)

- **Database:** `golfclubdb`
- **User:** `golfuser`
- **Password:** `golfpassword`
- **Root Password:** `rootpassword`

These are defined in `docker-compose.yml`.

---

## ✅ Notes

- All endpoints follow REST best practices
- Dockerized build ensures consistent dev environments
- You can add sample data via POST endpoints or with Postman collections

---

## 👨‍💻 Author

Orest Demchuk

---

