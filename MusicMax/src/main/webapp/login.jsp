<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no"/>
<title></title>
</head>
<body>
<div class="container">

<br><br><br><br>
			<header>
				<h1><span>MusicMax</span>			
				
				</h1>
            </header>  
<div  class="form">
<form id="contactform" method="post" action="../LoginServlet" class="login">
    <p class="contact">
      <label for="username">Korisnicko ime: </label>
      
    </p>
    <input id="user" type="text" name="username" value="">

    <p class="contact">
      <label for="password">Lozinka:</label>
      
    </p>
    <input id="pass" type="password" name="password" value="">

    <input type="submit" value="Ulogujte se!">
	<br>
	<div align="center">${msg}</div><br>
  </form>
  </div>
  
 <div align="center"><a href=""><span><span><span>Menu</span></span></span></a></div>
 
 </div>
</body>
</html>