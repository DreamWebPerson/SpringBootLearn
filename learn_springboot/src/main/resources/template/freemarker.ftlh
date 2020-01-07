<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>freemarker</title>
</head>
<body>
学习Freemarker-springBoot</br>
姓名为：${name}-
性别为：
<#if sex=="1">男-</#if>
<#if sex=="2">女-</#if>
<#list object as hobbi>
    爱好为： #{hobbi}-
</#list>
</body>
</html>