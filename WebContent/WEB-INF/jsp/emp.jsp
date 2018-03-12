<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="p"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery.min.js"></script>
</head>
<body>

<form action="showEmp">
姓名:<input type="text" name="ename">
所在部门:<select name="did">
<option value="0">--请选择--</option>
<p:forEach items="${depts }" var="depts">
<option value="${depts.did}">${depts.dname }</option>
</p:forEach>
</select>
学历:<input type="text" name="xueli">
<input type="submit" value="查询">
</form>

<table border="1">
<tr>
<td>序号:</td>
<td>人员编号:</td>
<td>人员姓名:</td>
<td>所在部门:</td>
<td>籍贯:</td>
<td>性别:</td>
<td>身份证号:</td>
<td>出生日期:</td>
<td>学历:</td>
<td>民族:</td>
<td>操作</td>
</tr>
<p:forEach items="${list }" var="list">
<tr>
<td>${list.id }</td>
<td>${list.eid }</td>
<td>${list.ename }</td>
<td>${list.dept.dname }</td>
<td>${list.jiguan }</td>
<td>${list.sex }</td>
<td>${list.card }</td>
<td>${list.brith }</td>
<td>${list.xueli }</td>
<td>${list.minzhu }</td>
<td><button  onclick="del('${list.id}')">删除</button>
<button onclick="updateEmp('${list.id}')">修改</button>
</td>
</tr>
</p:forEach>
</table>
<script type="text/javascript">
function del(id){
	location.href="delEmp?id="+id;	
}
</script>

<script type="text/javascript">
function updateEmp(id){
	location.href="updateEmp?id="+id;	
}
</script>

<a href="addEmp">添加员工</a>
</body>
</html>