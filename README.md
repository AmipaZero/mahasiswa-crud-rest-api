# 📚 Mahasiswa CRUD API (Spring Boot)

Proyek ini adalah **RESTful API CRUD** sederhana untuk manajemen data **Mahasiswa** menggunakan **Spring Boot** dan **MySQL**.  
API ini mendukung operasi dasar seperti **Create, Read, Update, Delete (CRUD)**.

---

## 🚀 Features
- ✅ Tambah data mahasiswa
- ✅ Lihat semua mahasiswa
- ✅ Cari mahasiswa berdasarkan ID
- ✅ Update data mahasiswa
- ✅ Hapus mahasiswa
- ✅ Terhubung ke database MySQL

---

📌 API Endpoints
Method   Endpoint               Description
GET      /api/mahasiswa         Get all mahasiswa
GET      /api/mahasiswa/{id}    Get mahasiswa by ID
POST     /api/mahasiswa         Create new mahasiswa
PUT      /api/mahasiswa/{id}    Update mahasiswa by ID
DELETE   /api/mahasiswa/{id}    Delete mahasiswa by ID

🧪 Example Request (JSON)
```json
{
  "nim": "12345678",
  "nama": "Budi Santoso",
  "fakultas": "Fakultas Teknik & Ilmu Komputer",
  "prodi": "Teknik Informatika"
}

---

## 🛠️ Tech Stack
- [Java 17+](https://openjdk.org/)
- [Spring Boot 3](https://spring.io/projects/spring-boot)
- [Maven](https://maven.apache.org/)
- [MySQL](https://www.mysql.com/)
- [Lombok](https://projectlombok.org/) (optional)

---
