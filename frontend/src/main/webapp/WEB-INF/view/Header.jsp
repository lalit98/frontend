<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <!-- Brand/logo -->
  <a class="navbar-brand" href="Home">Home</a>
  
  <!-- Links -->
  <ul class="navbar-nav">
    
    <li class="nav-item">
      <a class="nav-link" href="Admin">Admin</a>
    </li>
    
     <security:authorize access="isAnonymous()">
      <li class="nav-item">
        <a class="nav-link" href="login">Login</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="Sign">SignUp</a>
      </li>    
      </security:authorize>
      <security:authorize access="isAuthenticated()">
       <li class="nav-item">
        <a class="nav-link" href="login">Logout</a>
      </li>
     </security:authorize> 
      
  </ul>
</nav>

</body>
</html>
