<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="shortcut icon" type="image/png" href="favicon.png" />
<title>Post an image</title>
<script>
	function previewFile() {
		var preview = document.querySelector('img'); //selects the query named img
		var file = document.querySelector('input[type=file]').files[0]; //sames as here
		var reader = new FileReader();

		reader.onloadend = function() {
			preview.src = reader.result;
		}

		if (file) {
			reader.readAsDataURL(file); //reads the data as a URL
		} else {
			preview.src = "";
		}
	}

	previewFile(); //calls the function named previewFile()
</script>
</head>
<body>
	<div id="searchDiv">
		<form id="postImageForm" action="GooglePhotosPostImageController"
			method="post">
			<input type="file" onchange="previewFile()" required><br>
			<img src="" height=20% width=20% alt="Image preview..."><br>
			<input type="submit" name="postImageBtn" title="postImage"
				value="Subir imagen">
		</form>
	</div>
</body>
</html>