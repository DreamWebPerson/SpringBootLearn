<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>freemarker1</title>
</head>
<body>
学习Freemarker-springBoot</br>
姓名为：${name}</br>
性别为：<#if sex=="1">男</br></#if>
<#if sex=="2">女</br></#if>
<#list object as hobbi>
    爱好为： ${hobbi}</br>
</#list>
</body>
</html>