<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

로그앗 페이지

<form action="/customLogout" method="post">

<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
<button>로그아웃</button>

</form>

</body>
</html>