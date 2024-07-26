# Мобильное тестирование для OTUS

Репозиторий содержит пример написания мобильных автотестестов. Тесты написаны в рамках курса ["Java QA Engineer. Professional"](https://otus.ru/lessons/java-qa-pro/).

## Технологии и иструменты

Автотесты написаны на языке `Java` с использованием `JUnit 5`, `Android Driver`, `Appium`, `Appium Inspector`. Сборщик
проекта - `Maven`.
<p align="center">
    <a href="https://www.java.com/">
      <img width="8%" title="Java" src="src/main/resources/media/icon/java-original.svg" alt="java">
    </a>
    <a href="https://www.docker.com/">
      <img width="8%" title="Java" src="src/main/resources/media/icon/Docker.svg" alt="docker">
    </a>
    <a href="https://www.jetbrains.com/">
      <img width="8%" title="IntelliJ IDEA" src="src/main/resources/media/icon/Idea.svg" alt="IntelliJ IDEA">
    </a>
    <a href="https://maven.apache.org/">
      <img width="8%" title="Maven" src="src/main/resources/media/icon/ApacheMaven.svg" alt="Maven">
    </a>
    <a href="https://junit.org/junit5/">
      <img width="8%" title="JUnit5" src="src/main/resources/media/icon/Junit5.svg" alt="JUnit5">
    </a>
    <a href="https://github.com/">
      <img width="7%" title="GitHub" src="src/main/resources/media/icon/github-mark-white.svg" alt="GitHub">
    </a>
    <a href="https://selenide.org/">
      <img width="7%" title="Selenide" src="src/main/resources/media/icon/Selenide.svg" alt="Selenide">
    </a>
    <a href="https://appium.io/">
      <img width="7%" title="Appium" src="src/main/resources/media/icon/appium.svg" alt="Appium">
    </a>
    <a href="https://github.com/appium/appium-inspector">
      <img width="7%" title="Appium Inspector" src="src/main/resources/media/icon/appium_inspector.png" alt="Appium Inspector">
    </a>

</p>

## Команда для запуска автотестов из терминала
Для запуска тестов необходимо: 
- установить **Docker** 
- запустить контейнер с ОС **Android** ([butomo1989/docker-android-x86-7.1.1](https://github.com/budtmo/docker-android)) командой:
`docker run --rm --privileged -d --name android -v andy.apk:/root/andy.apk -p 6080:6080 -p 4723:4723 -p 5554:5554 -p 5555:5555 -e DEVICE="Samsung Galaxy S6" -e APPIUM_HOST="127.0.0.1" -e APPIUM_PORT=4723 butomo1989/docker-android-x86-7.1.1` 
- запустить тесты командой: 
`mvn clean test`

## Пример прогона автотеста

<p align="center">
    <img width="30%" title="Video" src="src/main/resources/media/icon/video_mp4_gif.gif" alt="Video">
</p>


