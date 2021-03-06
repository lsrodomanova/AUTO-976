## Проект по автоматизации тестирования сайта berizaryad.ru"
#### Городской сервис аренды зарядок  
> <a target="_blank" href="https://berizaryad.ru/">Ссылка на главную страницу сайта</a>
### <img width="100%" title="Zaryad" src="images/screens/logo.png">

###  Содержание:

- Технологии и инструменты
- Реализованные проверки
- Сборка в Jenkins
- Запуск из терминала
- Allure отчет
- Отчет в Telegram
- Видео примеры прохождения тестов


###  Проект реализован с использованием
<p align="center">IntelliJ IDEA Java Gradle Selenide Selenoid JUnit5 Jenkins Allure Report Allure TestOps Telegram </p>
<p align="center">
<img width="6%" title="IntelliJ IDEA" src="images/logo/Intelij_IDEA.svg">
<img width="6%" title="Java" src="images/logo/Java.svg">
<img width="6%" title="Selenide" src="images/logo/Selenide.svg">
<img width="6%" title="Selenoid" src="images/logo/Selenoid.svg">
<img width="6%" title="Allure Report" src="images/logo/Allure_Report.svg">
<img width="8%" title="Gradle" src="images/logo/Gradle.svg">
<img width="6%" title="JUnit5" src="images/logo/JUnit5.svg">
<img width="6%" title="GitHub" src="images/logo/GitHub.svg">
<img width="6%" title="Jenkins" src="images/logo/Jenkins.svg">
<img width="6%" title="Telegram" src="images/logo/Telegram.svg">
<img width="6%" title="Allure TestOps" src="images/logo/testops.svg">
</p>

###  Список проверок, реализованных в автотестах
- [x] Заполнение формы обратного звонка
- [x] Проверка номера телефона на главной странице
- [x] Проверка кнопки скачивания приложения в Google play 
- [x] Проверка  списка городов, где предоставляется услуга
- [x] Проверка на наличие ошибок в console log


###   Сборка в Jenkins
### <img width="6%" title="Jenkins" src="images/logo/Jenkins.svg"> Запуск тестов в Jenkins


<p align="center">
  <img src="images/screens/Jenkins.png" alt="job" width="800">
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

> <code>BROWSER</code> – браузер, в котором будут выполняться тесты.
>
> <code>BROWSER_VERSION</code> – версия браузера, в которой будут выполняться тесты.
>
> <code>BROWSER_SIZE</code> – разрешение окна браузера, в котором будут выполняться тесты.
>
> <code>REMOTE</code> – адрес удаленного сервера, на котором будут запускаться тесты.


### Запуск из терминала
```bash
gradle clean test
```

## <img width="4%" title="Allure" src="images/logo/Allure_Report.svg"> Отчет Allure Report
<p align="center">
  <img src="images/screens/Allure_main.png" alt="job" width="800">
</p>

<p align="center">
  <img src="images/screens/Allure2.png" alt="job" width="800">
</p>


## <img width="4%" title="Allure TestOPS" src="images/logo/testops.svg"> Интеграция с Allure TestOps
<p align="center">
  <img src="images/screens/AllureTestOps3.png" alt="job" width="800">
</p>

<p align="center">
  <img src="images/screens/AllureTestOps2.png" alt="job" width="800">
</p>



## <img width="4%" title="Telegram" src="images/logo/Telegram.svg"> Отчет в Telegram

<p align="center">
  <img src="images/screens/Telegram.png" alt="job" width="400">
</p>

## Видео прохождения тестов

> К каждому тесту в отчете прилагается видео.
<p align="center">
  <img title="Selenoid Video" src="images/screens/video.gif" >
</p>
