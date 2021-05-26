<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:form action="updatePerson">
    <s:textfield name="person.username" label="username"/>
    <s:textfield name="person.address" label="address"/>
    <s:textfield name="person.age" value="%{person.age}" label="age"/>
    <s:hidden name="person.id" value="%{person.id}"/>
    <s:submit />

</s:form>


</body>
</html>
