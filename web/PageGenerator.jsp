<%-- 
    Document   : PageGenerator
    Created on : Jan 30, 2017, 6:31:17 PM
    Author     : Jennifer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>This is the table using a JSP Page</h1>
        
          <%
              for(int row=1; row<5; row++) {
                out.println("<tr>");
                for(int col =2; col<7; col++) {
                
                    out.println("<td> R " + row  + " C " + col + "</td");
                }
                
                out.println(" </tr>");
                    out.print("<br>");
                }
            out.println("</table>");
            
              
              %>
        
        
    </body>
</html>
