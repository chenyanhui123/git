<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="p" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>添加员工</h1>
<form action="addEmp2">
人员编号:<input type="text" name="eid"><br>
人员姓名:<input type="text" name="ename"><br>
所在部门:<select name="dept.did">
<option value="0">--请选择--</option>
<p:forEach items="${depts }" var="depts">
<option value="${depts.did}">${depts.dname }</option>
</p:forEach>
</select><br>
籍贯:<input type="text" name="jiguan"><br>
性别:<input type="text" name="sex"><br>
身份证号:<input type="text" name="card"><br>
出生日期:<input type="text" name="brith"><br>
学历:<input type="text" name="xueli"><br>
民族:<input type="text" name="minzhu">
<input type="submit">
</form>
</body>
</html>