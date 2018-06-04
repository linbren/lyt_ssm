<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title></title>
</head>
<body class="sidebar-mini ajax-template skin-blue fixed">
I am a freemarker template file. <br>
${hello}<br>
<ol>
user from list 
<#list users as user>
<li>	${user.userName}	${user.id}</li>
<#if user.userName == "超级管理员">
  超级管理员就是牛！
</#if>
</#list>
</ol>

<ol>
user from pages
pageNum:	${pages.pageNum}
pageSize:	${pages.size}
total:	${pages.total}
<br>
	<#list pages.list as l>
<li>	${l.userName}${l.id}</li>
	</#list>
</ol>
<ol>字符串列表</ol>
<#list ["foo", "bar", "baz"] as x>
${x}
</#list>
<ol>数字列表</ol>
<#assign myRange1 = 0..10 >
${myRange1[1]}
<#assign myRange2 = 0..< 10 >
<#list myRange2[0..3] as i>
<li>${i}</li>
</#list>

<#list 0..!10 as rg>
<li>${rg}</li>
</#list>
<#assign myRange4 = 10..*5 >
${myRange4[0]}
<#assign myRange5 = 10..*-5 >
${myRange5[4]}
<ol>字符列表</ol>
<#assign s = "ABCDEF">
${s[2..3]}
${s[2..<4]}
${s[2..*3]}
${s[2..*100]}
${s[2..]}
<ol>哈希表</ol>
<#assign ages = {"Joe":23, "Fred":25} + {"Joe":30, "Julia":18}>
- Joe is ${ages.Joe}
- Fred is ${ages.Fred}
- Julia is ${ages.Julia}
<ol>内置函数</ol>
<#assign myString="hello & World! & 你好! ">
${myString?upper_case}
${myString?cap_first}
${myString?upper_case?html}
${myString?length}
<ol></ol>
<#assign mySeq=["hello"," World!"," & 你好! "]>
${mySeq?size}
${mySeq?join(",")}
<ol>方法</ol>
 程序员自定义
 <ol>转义处理</ol>
 ${'<img src="xxxxxxx"/>'?html}
 ${r'${obj.name}'}
 <ol>空值处理</ol>
 ${mouse!"No mouse."}
  ${mouse!}
<#assign mouse="Jerry">
${mouse!"No mouse."}

${(product.color)!"red"}

<#if cat??>
  cat found
<#else>
  No cat found
</#if>
Creating mouse...
<#assign mouse = "Jerry">
<#if mouse??>
  Mouse found
<#else>
  No mouse found
</#if>

<ol>自定义函数</ol>
<#function avg nums...>
  <#local sum = 0>
  <#list nums as num>
    <#local sum = sum + num>
  </#list>
  <#if nums?size != 0>
    <#return sum / nums?size>
  </#if>
</#function>


 ${r'${avg(10, 20, 30, 40)}'}
 ${avg(10, 20, 30, 40)}
 <ol>宏</ol>
 <#macro greet person color="black">
  <font size="+2" color="${color}">Hello ${person}!</font>
</#macro>
<@greet person="Fred" color="yellow"/>
</body>
</html>
