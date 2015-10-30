<%-- 
    Document   : index
    Created on : Jun 5, 2015, 1:24:06 AM
    Author     : yegoris
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>Alignment</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
    </head>
    <body style="background-color:lightblue" >
        <font face="Courier New" size="5">
        <div>
            <form name="DNA" action="DNAdna" method="POST">
                
                  <table border="0">
                    <thead>
                        <tr>
                            <th></th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>First Sequence</td>
                            <td>Second Sequence</td>
                        </tr>
                        <tr>
                            <td><textarea name="myDNAinput" rows="10" cols="40" 
                             font="Courier New" spellcheck="false" size="3" ></textarea>
                 </td>
                            <td><textarea name="myDNAinput1" rows="10" cols="40"
                              font="Courier New" spellcheck="false"size="3" ></textarea>                             
                </td>
                        </tr>
                    </tbody>
                </table>
              <!--  Minimum Match Expected:  <input type="text" name="MinMatch" value="0" size="10" /> -->
                           
             
              <input  type="submit" value="calculate" size="20*50" font="Courier New" size="5"/>
                </font>
            </form></div>
    </body>
</html>
