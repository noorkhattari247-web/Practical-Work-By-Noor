<!DOCTYPE html>
<html>

<head>

<title>University</title>

<link
href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
rel="stylesheet">

<g:layoutHead/>

</head>

<body>

<nav class="navbar navbar-dark bg-dark p-3">

<a class="navbar-brand text-white">
University System
</a>

</nav>

<div class="container mt-4">

<g:if test="${flash.message}">

<div class="alert alert-success">

${flash.message}

</div>

</g:if>

<g:layoutBody/>

</div>

</body>

</html>
