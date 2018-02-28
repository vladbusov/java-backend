<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Profile</title>
</head>
<body>
<table>
    <h1> User Profile </h1>
    <tr>
        <td>Id</td>
        <td>${user.id}</td>
    </tr>
    <tr>
        <td>Name</td>
        <td>${user.name}</td>
    </tr>
    <tr>
        <td>Email</td>
        <td>${user.email}</td>
    </tr>
    <tr>
        <td>Age</td>
        <td>${user.age}</td>
    </tr>
</table>
<br/>
<a href="/">back to main page</a>
<br/>
<a href="/users">back to users</a>
</body>
</html>