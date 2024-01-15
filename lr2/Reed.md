# Практическая работа #1  Приложение с общей архитектурой JavaEE
Выполняли студенты группы 6132: ***Иванов Владислав*** и ***Каспаров Иоанн***  

## Задание 1 ##


## Задание 2 ##
В качестве СУБД используется PostgreSQL.

## Задание 3 ##

_Выберите любую предметную область и создайте модель как минимум из двух объектов с несколькими свойствами.
Создайте скрипт для создания базы данных для вашей модели._

Наша база данных состоит из двух сущностей: студент и факультет
Мы создали модель из двух сущностей: **book** и **author**.

В данном случае реализована связь **Один-ко-многим (One-to-Many)**, автор может иметь несколько написанных книг, а книга имеет единственного автора.


## Задание 4 ##
_Разработайте data layer (уровень данных) в виде Java Beans для модели и подготовьте его для использования с Entity Persistence._

Для создания уровня данных использовались аннотации:

1. @Entity - отмечает класс как сущность базы данных.
2. Аннотация @Id указывает первичный ключ.
3. Аннотация @GeneratedValue указывает, что первичный ключ должен генерироваться автоматически.
4. @Column - отмечает поле как колонку в таблице, когда имя поля неочевидно для записи в базу данных.
5. @ManyToOne - используется для работы с полями внешнего ключа (Foreign Key).
6. @JoinColumn - используется для явного указания имени колонки в базе данных, где будет храниться внешний ключ при использовании аннотации @ManyToOne.

## Задание 5 ##

_Реализуйте бизнес-уровень для доступа к данным с помощью session beans._

Для реализации бизнес-уровня использовался метод getAll(), который возвращает список всех книг из базы данных. Внутри метода реализована логика выполнения SQL-запроса и маппинга результатов в объекты book.

## Задание 6 ##
_Реализуйте слой представления, используя любую технологию по вашему выбору, которая здесь применима._

![Alt text](Screenshot_3.png)


![Alt text](Screenshot_1.png)


![Alt text](Screenshot_2.png)


