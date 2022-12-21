# BackendTestApplication
Тестовое задание для Clevertec

Java 17, Gradle 7.5.1, PostgreSQL 14, SpringBoot 3.0.0
Запуск осуществляется: java BackendTestApplication 3-1 2-5 5-1 card-1234
или при помощи GET Запроса: http://localhost:8080/check?itemid=1-2,2-3,4-6,card-1234
(Вывод на экран при помощи Get запроса не является полностью доработанным(Плохо отрисовывается из-за кодировки))
Файл в который записывается чек, файлы с DDL и DML командами для создания базы данных, находятся в директории resources, 
фалы с который считывается данные находяться в директории resources/static 

Варианты Get-запроса
http://localhost:8080/check?itemid=1-2&itemid=2-3&itemid=card-1528
http://localhost:8080/check?itemid=1-2,2-3,card-1528,4-6
