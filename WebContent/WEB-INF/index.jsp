<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>イツドコデダレガナニシタ</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<form action="/index" method="post">
<h1>イツドコデダレガナニシタ</h1>
<div class="box">
<dl>
<dt>いつ</dt>
<dd><input type="text" name="when" /></dd>
<dt>どこで</dt>
<dd><input type="text" name="where" /></dd>
<dt>だれが</dt>
<dd><input type="text" name="who" /></dd>
<dt>なにした</dt>
<dd><input type="text" name="what" /></dd>
</dl>
</div>
<p><input type="submit" value="新しい文章を作成する" /></p>
</form>

</body>
</html>