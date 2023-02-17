# Задание 1. API (обязательное к выполнению)
Вспомните условие задачи из курса по ручному тестированию, где вы общались с сервером. Тогда на сервер вы посылали информацию в виде JSON — текстового формата описания объекта в JavaScript-стиле, выглядела она так:
```java
{
"birthday": "13.06.1999",
"name": "Иван",
"passport": "4444 № 44444444",
"patronymic": "Иванович",
"phone": "+7 (999)-999-99-99",
"surname": "Иванов"
}
```
Немного усложним и добавим в неё ещё информацию о том, согласен ли пользователь получать новости о скидках в виде sms: `"subscription"``: true`. Также предлагается, чтобы дата рождения была не полем-строкой, а тоже объектом: `"birthday": {"day" : 13, "month": 6, "year": 1999}`. В итоге объект в запросе будет выглядеть, например, так:
```java
{
"birthday": {
"day": 13,
"month": 6,
"year": 1999
},
"name": "Иван",
"passport": "4444 № 44444444",
"patronymic": "Иванович",
"phone": "+7 (999)-999-99-99",
"surname": "Иванов",
"subscription": true
}
```
Вашей задачей будет разработать классы, описывающие объекты запроса анкеты на сервер, и продемонстрировать их работу в `Main`.

Создайте класс `Post`, описывающий объект запроса на сервер, и заполните его полями. Сперва можно без `birthday`, так как для него придётся создавать вспомогательный класс, выбрав подходящие типы:
```java
public class Post {
public String name; // поле для имени
// добавьте другие поля
}
```
Создадим класс `Main`, в `main` которого создадим и заполним наш объект:
```java
public class Main {
public static void main(String[] args) {
Post post = new Post();
post.name = "Иван";
// заполните другие поля
}
}
```
Поставим точку останова на последней строчке, можно прямо на закрывающей фигурной скобке main, и запустим отладчик, чтобы посмотреть, что у нас будет лежать в переменной с объектом: 
![](https://user-images.githubusercontent.com/53707586/151747800-bbd79552-0f62-4105-90fa-b0d7df7dbce6.jpg)

Если вы сделали всё правильно, то в отладчике будет виден созданный и заполненный объект типа `Post` по схеме данных — полей — указанных вами в классе `Post`.

Осталось добавить поле `birthday`. Значение в этом поле должно быть объектом, для которого также нужно будет создать свой класс. Создайте класс `FormDate` для описания схемы объекта в поле `birthday`:
```java
public class FormDate {
// добавьте три необходимых поля
}
```
Теперь в классе `Post` добавьте поле `birthday` с типом `FormDate`. После чего добавьте заполнение этого поля в `main`:
```java
post.birthday = new FormDate();
post.birthday.day = 13;
// заполните другие поля даты рождения
```
Запустите отладчик снова и убедитесь, что всё заполнено как надо и соответствует JSON-описанию объекта выше.

### Результат
При отправке решения в личном кабинете прикрепите ссылку на ваш публичный репозиторий GitHub.