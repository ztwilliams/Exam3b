<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="Exam3bCSS.css">
        <title></title>
    </head>

    <body>

        <div class="wrap" >

            <%@ include file="includes/header.jsp" %>

            <%@ include file="includes/adminmenu.jsp" %>

            <div class="main" >
                <h1>Add New Customer </h1>

                <form name="addForm" action="addCustomer" method="get">
                    <table>   
                        <tr>
                            <td>First Name</td>
                            <td><input type="text" name="firstName" value="" required/></td>
                        </tr>

                        <tr>
                            <td>Last Name</td>
                            <td><input type="text" name="lastName" value="" required/></td>
                        </tr>

                        <tr>
                            <td>Address 1</td>
                            <td><input type="text" name="addr1" value="" required/></td>
                        </tr>

                        <tr>
                            <td>Address 2</td>
                            <td><input type="text" name="addr2" value="" /></td>
                        </tr>
                        
                        <tr>
                            <td>City</td>
                            <td><input type="text" name="city" value="" required/></td>
                        </tr>

                        
                        <tr>
                            <td>State (ie: IA)</td>
                            <td><input type="text" name="state" value="" required/></td>
                        </tr>

                        
                        <tr>
                            <td>Zip</td>
                            <td><input type="text" name="zip" value="" required/></td>
                        </tr>

                        
                        <tr>
                            <td>Email Address</td>
                            <td><input type="text" name="emailAddr" value="" /></td>
                        </tr>


                    </table>

                    <input type="reset" name="reset" value="Clear"/>
                    <input type="submit" name="submit" value="Submit"/>
                </form>

            </div>

            <%@ include file="includes/footer.jsp" %>

        </div>

    </body>





</html>
