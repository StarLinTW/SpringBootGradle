<%@ page language ="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" >
<html>
<head>
<meta http-equiv= "Content-Type" content ="text/html; charset=UTF-8">
<script src= "https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js" ></script >
<link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
<title> Client Test</title>
</head>
<script>
var request = {"clienttype":"html5","currency":"CNY","lang":"zh_cn","mode":"demo","token":"123456@@@@",
 			   "payload":{"gn":"100","pid":"999"}};
$(function(){	
	$("#submit").click( function(){
	    $.ajax({
	         method : "POST",
	         url : "/ZombieKilling",
	         contentType: "application/json",
	         //dataType: "json",
	         data : JSON.stringify(request),
	         success: function(response){
	              $("#response").val(JSON.stringify(response));
	         }
	     });
	 });
});

</script>

<body>
<br>
<button id = "submit">GameRequest</button>
<br>
<textarea rows="4" cols="150" id ="response">
</textarea>
</body>
</html>
