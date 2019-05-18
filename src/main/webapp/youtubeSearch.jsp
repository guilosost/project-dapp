<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div id="searchDiv">
		<form id="searchForm" action="YoutubeSearchController"
			method="get">
			<input type="text" name="searchQuery" required /> <input
				type="submit" name="searchBtn" title="search" value="search">
		</form>
	</div>

</body>
</html>