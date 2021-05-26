<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>list</title>
    <script>
        function del()
        {
            if (confirm("你确定要删除吗?"))
            {
                return true;
            }
            return false;
        }
    </script>
</head>
<body>

    <table border="1" align="center" width="80%">

        <s:iterator value="#request.list" var="person">

            <tr>
                <td><s:property value="#person.id"/></td>
                <td><s:property value="#person.username"/></td>
                <td><s:property value="#person.address"/></td>
                <td><s:property value="#person.age"/></td>
                <td><s:a href="updatePPerson.action?person.id=%{#person.id}">更新</s:a></td>
                <td><s:a href="deletePerson.action?person.id=%{#person.id}" onclick="return del();">删除</s:a></td>
            </tr>

        </s:iterator>


    </table>


</body>
</html>
