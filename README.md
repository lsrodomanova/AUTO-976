## Проект по автоматизации тестирования сайта berizaryad.ru"
#### Городской сервис аренды зарядок  
> <a target="_blank" href="https://berizaryad.ru/">Ссылка на главную страницу сайта</a>
### <img width="100%" title="Zaryad" src="src/test/resources/images/screens/logo.png">

###  Содержание:

- Технологии и инструменты
- Реализованные проверки
- Сборка в Jenkins
- Запуск из терминала
- Allure отчет
- Отчет в Telegram
- Видео примеры прохождения тестов


###  Проект реализован с использованием
IntelliJ IDEA Java Gradle Selenide Selenoid JUnit5 Jenkins Allure Report Allure TestOps Telegram Jira
<p align="center">
<img width="8%" title="IntelliJ IDEA" src="src/test/resources/images/logo/Intelij_IDEA.svg">
<img width="8%" title="Java" src="src/test/resources/images/logo/Java.svg">
<img width="8%" title="Selenide" src="src/test/resources/images/logo/Selenide.svg">
<img width="8%" title="Selenoid" src="src/test/resources/images/logo/Selenoid.svg">
<img width="8%" title="Allure Report" src="src/test/resources/images/logo/Allure_Report.svg">
<img width="8%" title="Gradle" src="src/test/resources/images/logo/Gradle.svg">
<img width="8%" title="JUnit5" src="src/test/resources/images/logo/JUnit5.svg">
<img width="8%" title="GitHub" src="src/test/resources/images/logo/GitHub.svg">
<img width="8%" title="Jenkins" src="src/test/resources/images/logo/Jenkins.svg">
<img width="8%" title="Telegram" src="src/test/resources/images/logo/Telegram.svg">
</p>

###  Список проверок, реализованных в автотестах
- [x] Заполнение формы обратного звонка
- [x] Проверка номера телефона на главной странице
- [x] Проверка кнопки скачивания приложения в Google play 
- [x] Проверка  списка городов, где предоставляется услуга
- [x] Проверка на наличие ошибок в console log


###   Сборка в Jenkins
### <img width="6%" title="Jenkins" src="src/test/resources/images/logo/Jenkins.svg"> Запуск тестов в Jenkins


<p align="center">
  <img src="src/test/resources/images/screens/Jenkins.png" alt="job" width="800">
</p>

### Удаленный запуск тестов

```bash
gradle clean test 
-Dbrowser=${BROWSER}
-DbrowserVersion=${BROWSER_VERSION}
-DbrowserSize=${BROWSER_SIZE}
-Dremote=${REMOTE}

```
### Параметры сборки

> <code>BROWSER</code> – браузер, в котором будут выполняться тесты (_по умолчанию - <code>chrome</code>_).
>
> <code>BROWSER_VERSION</code> – версия браузера, в которой будут выполняться тесты (_по умолчанию - <code>91.0</code>_).
>
> <code>BROWSER_SIZE</code> – разрешени окна браузера, в котором будут выполняться тесты (_по умолчанию - <code>1920x1080</code>_).
>
> <code>REMOTE</code> – адрес удаленного сервера, на котором будут запускаться тесты.


### Запуск из терминала
```bash
gradle clean test
```

### <img width="6%" title="Allure" src="src/test/resources/images/logo/Allure_Report.svg"> отчет Allure Report
<p align="center">
  <img src="src/test/resources/images/screens/Allure_main.png" alt="job" width="800">
</p>

<p align="center">
  <img src="src/test/resources/images/screens/Allure_tests.png" alt="job" width="800">
</p>

<p align="center">
  <img src="src/test/resources/images/screens/Allure6.png" alt="job" width="800">
</p>


### <img width="4%" title="Allure TestOPS" src="src/test/resources/images/logo/Allure_Report.svg"> Интеграция с Allure TestOps
<p align="center">
  <img src="src/test/resources/images/screens/AllureTestOps3.png" alt="job" width="800">
</p>

<p align="center">
  <img src="src/test/resources/images/screens/AllureTestOps2.png" alt="job" width="800">
</p>



### <img width="8%" title="Telegram" src="src/test/resources/images/logo/Telegram.svg"> Отчет в Telegram

<p align="center">
  <img src="images/screens/telegram2.png" alt="job" width="400">
</p>

### Видео прохождения тестов

> К каждому тесту в отчете прилагается видео.
<p align="center">
  <img title="Selenoid Video" src="src/test/resources/images/screens/video.gif" >
</p>
