# uzum_java_courses

Инструкция по сборке проекта для ДЗ №7:
1) Для сборки и последующего запуска проекта вам понадобится
 - JVM (минимум 17-ой версии)
  Скачать можно по ссылке: https://www.oracle.com/cis/java/technologies/downloads/
 - apache maven. (На момент написания ДЗ последняя версия 3.9.6)
  Скачать можно ссылке: https://maven.apache.org
2) После скачивания архива распаковать его содержимое в удобную для вас папку.
3) В переменные среды добавить путь к исполняемому файлу mvn.cmd
4) Перейти в папку homework, в которой находится конфигурационный файл POM.xml
5) Выполнить команду mvn clean install
6) Проверить, что после выполнения команды была создана папка target
7) Перейти в папку target, убедиться в наличии файла homework-1.0-jar-with-dependencies.jar
8) Выполнить команду java -jar homework-1.0-jar-with-dependencies.jar