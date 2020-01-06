<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
	String path=request.getContextPath();
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" type="text/css" href="<%=path%>/css/index_work.css"/> 
<script type="text/javascript" src="<%=path%>/js/jquery-1.8.3.js"></script>
</head>
<body>
	<center>
	
	<form action="list.do"  method="post">
	<input type="hidden">
		关键字：<input type="text" name="keywords" value="${map.keywords}">
		描　述：<input type="text" name="description" value="${map.description}">>
		公司名称：<input type="text" name="cname" value="${map.cname}">><br><br>
		注册资本：<input type="text" name="zcBegin" value="${map.zcBegin}">>~<input type="text" name="zcend"  value="${map.zcend}">><br><br>
		成立时间：<input type="date" name="clBegin"  value="${map.clBegin}">>~<input type="date" name="clend"  value="${map.clBegin}">><br><br>
		<input type="submit" value="搜索">
	</form>
		<table>
			<tr>
				<th>编号</th>
				<th>关键字</th>
				<th>描述</th>
				<th>公司名称</th>
				<th>主管产品</th>
				<th>地址</th>
				<th>注册资本(万元)</th>
				<th>成立时间</th>
				<th>年检日期</th>
				<th>年检状态</th>
				<th>备注</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${page.list}" var="g">
				<tr>
					<td>${g.cid}</td>
					<td>${g.keywords}</td>
					<td>${g.description}</td>
					<td>${g.cname}</td>
					<td>${g.goods}</td>
					<td>${g.address}</td>
					<td>${g.czb}</td>
					<td>${g.ccl}</td>
					<td>${g.cnj}</td>
					<td>
						${g.czt}
					</td>
					<td>${g.cbz}</td>
					<td>
						<input type="button"  value="年检审核" onclick="upd(${g.cid})">
					</td>
				</tr>
			</c:forEach>
			
			<tr>
				<td colspan="15">
					<input type="button" value="首页" onclick="fy(${page.firstPage})">
					<input type="button" value="上一页" onclick="fy(${page.pageNum-1==0?page.firstPage:page.pageNum-1})">
					<input type="button" value="下一页" onclick="fy(${page.pageNum+1>=page.pages?page.lastPage:page.pageNum+1})">
					<input type="button" value="尾页" onclick="fy(${page.lastPage})">
					当前第${page.pageNum}页/共${page.pages}页
				</td>
			</tr>
		</table>
	</center>
</body>

<script type="text/javascript">
function fy(pageNum){
	location="list.do?pageNum="+pageNum
}

function upd(cid){
	
	
	location="upd.jsp?cid="+cid;
}

</script>
</html>