<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>保存</title>
</head>
<body>
    <s:form action="savePerson">
        <s:textfield name="person.username" label="username"/> <br>
        <s:textfield name="person.address" label="address"/> <br>
        <s:textfield name="person.age" label="age"/> <br>

        <s:submit/>

    </s:form>
</body>
</html>
