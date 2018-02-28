<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title> Create user page</title>
</head>
<body>
<form name="user" action="/updateUser" method="post">
    <p>User id: ${user.id} </p>
    <input title="Id" hidden type="text" name="id" value="${user.id}" ><br/>
    <input title="Name" type="text" name="name" value="${user.name}" ><br/>
    <input title="Email" type="text" name="email" value="${user.email}" ><br/>
    <input title="Age" type="text" name="age" value="${user.age}" ><br/>
    <button type="submit">edit</button>
</form>
</body>
</html>