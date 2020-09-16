<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>イツドコデダレガナニシタ</title>
<link href="/css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<h1>イツドコデダレガナニシタ</h1>
<div class="box">
<p><c:out value="${sentence}" /></p>
<p><a href="/index">もう一度文章を作成する</a></p>
</div>
</body>
</html>