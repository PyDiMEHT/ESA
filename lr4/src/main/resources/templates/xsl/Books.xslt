<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html>
<body>
<h2>All Players</h2>
<table border="1">
<tr>
    <th>ID</th>
    <th>Title</th>
    <th>Public year</th>
    <th>Author id</th>
</tr>
<xsl:for-each select="ArrayList/item">
<tr>

<td><xsl:value-of select="id"/></td>
<td><xsl:value-of select="title"/></td>
<td><xsl:value-of select="public_year"/></td>
<td><xsl:value-of select="author_id"/></td>

</tr>
</xsl:for-each>
</table>

<h1>Add Player</h1>
<form action="/players/create" method="post" enctype="application/x-www-form-urlencoded">
<label for="first_name">First Name:</label>
<input type="text" id="first_name" name="first_name" required="required"/><br/>

<label for="last_name">Last Name:</label>
<input type="text" id="last_name" name="last_name" required="required"/><br/>

<label for="id_team">Team ID:</label>
<input type="number" id="id_team" name="id_team" required="required"/><br/>

<input type="submit" value="Submit"/>
</form>
</body>
</html>
</xsl:template>
</xsl:stylesheet>