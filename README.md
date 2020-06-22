# Тестовое задание
*Использованные технологии*
- Java
- JUnit 5
- Selenide
- Maven 
- Allure

**Для запуска тестов через консоль:**
  ```sh
mvn clean test
```
- для использования другого браузера (например firefox): 
 ```sh
mvn clean test -Dselenide.browser="firefox"
```

**Для старта аллюр сервера и просмотра репорта:**
 ```sh
mvn allure:serve
```

###Задание:

* Открыть сайт sportmaster.ru
* В левом верхнем углу кликнуть на название города
* В открывшемся окошке введите название города 'Липецк'
* Из выпадашки выберите 'г Липецк, Липецкая обл' Нажмите кнопку 'Ок'
* Проверьте что в левом верхнем углу отображается город 'Липецк'