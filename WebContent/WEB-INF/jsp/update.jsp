<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="updateEmp2">
id:<input type="text" name="id" value="${emp.id }">
人员编号:<input type="text" name="eid" value="${emp.eid }"><br>
人员姓名:<input type="text" name="ename" value="${emp.ename }"><br>
所在部门:<select name="dept.did">
  <p:forEach item="${depts }" var="dept">
           <option value="${dept.did}" >${dept.dname}</option>
  </p:forEach>
</select><br>
籍贯:<input type="text" name="jiguan" value="${emp.jiguan }"><br>
性别:<input type="text" name="sex" value="${emp.sex }"><br>
身份证号:<input type="text" name="card" value="${emp.card }"><br>
出生日期:<input type="text" name="brith" value="${emp.brith}"><br>
学历:<input type="text" name="xueli" value="${emp.xueli }"><br>
民族:<input type="text" name="minzhu" value="${emp.minzhu }">
<input type="submit">
</form>
</body>
</html>