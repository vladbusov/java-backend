<!DOCTYPE html>
<html lang="en">
<body>
<h1> Users list </h1>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Age</th>
    </tr>
        <#list users as user>
        <tr>
            <td> <a href="/user/${user.id}">${user.id}</a> </td>
            <td> ${user.name} </td>
            <td> ${user.email} </td>
            <td> ${user.age} </td>
            <td><a href="/delete/${user.id}"> Delete </td>
            <td><a href="/update/${user.id}"> Update </td>
        </tr>
        </#list>
</table>
<a href="adduser">add user</a>
</body>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
</html>