<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        
        <h2>Edit Note</h2>
        
        <form method="post" action="note">
            <label>Title: </label>
            <input type="text" name="userTitle">
            <br><br>
            <label>Content:</label>
            <textarea name="content" rows="5" cols="50"></textarea>
            <input type =" submit" value ="Save Note">
        </form>
    </body>
</html>
