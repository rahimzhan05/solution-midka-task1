# Онлайн платежная система

## Описание проекта

Этот проект представляет собой консольное приложение для обработки онлайн-платежей с использованием паттернов **Factory Method** и **Adapter**. Приложение поддерживает различные способы оплаты и ведет историю транзакций.

## Используемые паттерны проектирования

- **Factory Method** – используется для создания различных методов оплаты (кредитная карта, PayPal, криптовалюта).
- **Adapter** – используется для интеграции с внешним API (например, имитация работы PayPal API).

## Основные возможности

✔ Поддержка различных методов оплаты:
- 💳 Кредитная карта
- 🏦 PayPal
- ₿ Криптовалюта

✔ Проверка корректности учетных данных (например, email для PayPal)
✔ Ведение истории транзакций
✔ Обработка ошибок (недостаточно средств, неверные данные и т. д.)
✔ Простая консольная навигация




## Как использовать?

1️⃣ Выберите метод оплаты
2️⃣ Введите сумму
3️⃣ Проверьте статус транзакции
4️⃣ Просмотрите историю платежей

## Пример работы
```
💳 Платежная система | Баланс: $100.0
1️⃣ Сделать платеж
2️⃣ Просмотреть историю транзакций
3️⃣ Выход
👉 Введите ваш выбор: 1

💳 Выберите метод оплаты:
1️⃣ Кредитная карта
2️⃣ PayPal
3️⃣ Криптовалюта
👉 Ваш выбор: 2

📧 Введите Email для PayPal: user@example.com
💰 Введите сумму платежа: 50
✅ Результат платежа: Платеж: PayPal | Сумма: $50 | Статус: УСПЕХ
```

"# solution-midka-task1" 
