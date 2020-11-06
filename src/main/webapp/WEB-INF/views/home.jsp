<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Welcome!  
</h1>

<P>  Current Time is ${serverTime}. </P>
<br/>
<h3>Enter The Student Details</h3>
        <form action="fetchProgram" >
             <table>
                <tr>
                    <td><label name="namelabel">Name</label></td>
                    <td><input name="name"/></td>
                </tr>
                <tr/>
                <tr>
                    <td><label name ="programlabel">Program</label></td>
                    <td><select name="program">
			              <option value="CS" label="Computer Science"/>
			              <option value="CE" label="Civil Engineering"/>
			            </select>
			         </td>   
                </tr>
                <tr/>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form>
</body>
</html>
