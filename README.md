# 📝 ToDo App - Spring Boot

Это учебный проект "ToDo", реализованный на **Spring Boot 3.4.4** с использованием **H2**, **Spring Security**, **JPA**, и **JUnit 5**.

---

## 🔧 Функциональность:
- ✅ CRUD для задач (Create, Read, Update, Delete)
- 🔐 Авторизация (Basic Auth)
- 🧹 Валидация DTO
- ✅ Интеграционные и юнит тесты
- 🧠 Кастомная конфигурация бинов через `@Configuration` и `@Bean`
- 🧩 Разбор механизма сканирования компонентов с `@ComponentScan`
- 🛠 Создание собственных `@Component`, `@Service`
- 🧠 Понимание жизненного цикла бинов и контекста Spring
- 🗃 H2 консоль по адресу `/h2`

---

## 📦 Технологии:
- ☕ Java 17
- ⚙ Spring Boot
- 💾 Spring Data JPA
- 🔐 Spring Security
- 🧪 JUnit + Mockito
- 🗃 H2 Database
- 📦 Lombok

---

## 🧪 Как запустить:
1. `git clone git@github.com:NTBogl/todo.git`
2. `cd todo`
3. `./mvnw spring-boot:run` или запустить `TodoApplication` в IDE

---

## 🔑 Доступ:
| Логин | Пароль |
|-------|--------|
| `user`  | `password` |

---

## 🔗 Примеры запросов:
```bash
curl -u user:password http://localhost:8080/todos
