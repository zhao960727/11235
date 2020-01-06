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
	<form action="upd.do" method="post">
		编号：<input type="text" value="${param.cid}"  name="cid" readonly="readonly"><br><br>
		关键字：<input type="text" name="keywords" readonly="readonly"><br><br>
		描述：<input type="text" name="description" readonly="readonly"><br><br>
		公司名称：<input type="text" name="cname" readonly="readonly"><br><br>
		主管产品：<input type="text" name="goods" readonly="readonly"><br><br>
		地址：<input type="text" name="address" readonly="readonly"><br><br>
		注册资本：<input type="text" name="czb" readonly="readonly"><br><br>
		成立时间：<input type="text" name="ccl" readonly="readonly"><br><br>
		年检时间：<input type="date" name="cnj" ><br><br>
		年检状态：<input type="text" name="czt" ><br><br>
		备注：<input type="text" name="cbz" ><br><br>
	<input type="submit" name="提交" ><br><br>
	</form>
</body>
<script type="text/javascript">
var cid=$("[name=cid]").val();
$.post(
	"selectById.do",
	{cid:cid},
	function(obj){
		$("[name=keywords]").val(obj.keywords);
		$("[name=description]").val(obj.description);
		$("[name=cname]").val(obj.cname);
		$("[name=goods]").val(obj.goods);
		$("[name=address]").val(obj.address);
		$("[name=czb]").val(obj.czb);
		$("[name=ccl]").val(obj.ccl);
	},
	"json"	
);

</script>
</html>