# main-station automation

## doc

[cucumber-jvm](https://cucumber.io/)

[selenium](http://www.seleniumframework.com/)

## examples

[CucumberJVMExamples](https://github.com/machzqcq/CucumberJVMExamples)

[cucumber-jvm](https://github.com/cucumber/cucumber-jvm/tree/master/examples)


## Quickstart

本项目是用[maven](https://github.com/AimeeLee23/main-station.git)构建的，它是一种项目构建工具，可以管理项目的依赖以及打包方式，还可以根据不同的环境选择不同的配置文件

运行 `mvn test` 

![mvn-test.png](quick-start/mvn-test.png) 

生成报告 `mvn verify`, 在 *target/reports* 目录下就可以浏览生成的报告.

通过设置环境变量来选择测试的浏览器 `mvn clean test -Dwebdriver=chrome`

根据tags来过滤场景 `mvn clean test -Dwebdriver=chrome -Dcucumber.options="--tags @user_login"`

