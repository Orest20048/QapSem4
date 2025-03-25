A basic REST API to manage golf club members and tournaments — built with Java, Spring Boot, MySQL, and Docker.

✅ What You Can Do
Add, update, and delete members and tournaments

Add members to tournaments

Search members by name, phone, type, or start date

Search tournaments by location or start date

See who’s in a tournament

Run everything using Docker

🔧 What You Need
Docker + Docker Compose

Java 22 or higher

Git

▶️ How to Start
bash
Копіювати
Редагувати
git clone https://github.com/YOUR_USERNAME/golf-club-api.git
cd golf-club-api
docker-compose up --build
The API will be at: http://localhost:8080

🔌 Main Endpoints
Members
GET /api/members – All members

GET /api/members/{id} – One member

POST /api/members – Add member

PUT /api/members/{id} – Update member

DELETE /api/members/{id} – Delete member

GET /api/members/search?... – Search by name, phone, type, or date

Tournaments
GET /api/tournaments – All tournaments

GET /api/tournaments/{id} – One tournament

POST /api/tournaments – Add tournament

PUT /api/tournaments/{id} – Update tournament

DELETE /api/tournaments/{id} – Delete tournament

POST /{tournamentId}/add-member/{memberId} – Add member to tournament

GET /{tournamentId}/members – List tournament members

GET /api/tournaments/search?... – Search by location or date

🧪 Testing
Screenshots of Postman tests are in the screenshots/ folder.

