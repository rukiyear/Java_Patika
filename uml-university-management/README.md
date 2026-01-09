# Üniversite Yönetim Sistemi UML Class Diyagramı

Bu doküman, üniversite yönetim sistemi için tasarlanan UML Class diyagramını içerir.

## Sınıflar
- University
- Classroom
- Office
- Department
- Employee
- Professor
- Memur

## İlişkiler
- University, Classroom, Office, Department ve Employee sınıflarına sahiptir.
- Department, Office sınıflarına sahiptir.
- Employee bir Office'te çalışır.
- Professor ve Memur, Employee sınıfından kalıtım alır.

## UML Özeti
- Professor extends Employee
- Memur extends Employee
