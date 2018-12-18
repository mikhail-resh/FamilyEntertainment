<!DOCTYPE html>
<html>
	<head>
		<meta charset = "utf-8">
		<title> Some photoes </title>
	</head>
	<body>
		<% out.print("<h2> Hello, ");%>${memberName}<%out.println("!</h2>"); %>
		<%
			for (int i=0;i<10;i++){
				out.print("<img src=\"images/0/");
				out.print(i);
				out.println(".jpg\" alt=\"Zack image\" width=\"600\" align=\"middle\">");
		}
		%>	
		<!--<img src="images/p001.jpg" alt="Zack image" width="600" align="middle">-->
		<!--<video src="videos/v003.webm" width="600" poster="videos/video.jpg" controls>
			Your browser does not support HTML5 video.
		</video>-->
	</body>
</html>