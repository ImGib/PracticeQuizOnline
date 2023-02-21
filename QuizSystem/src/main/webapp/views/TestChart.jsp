<%-- 
    Document   : TestChart
    Created on : Feb 21, 2023, 2:47:50 PM
    Author     : Lenovo
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.5.0/Chart.min.js"></script>
    </head>
    <body>
        <h1>Hello fuksdf!</h1>        
        <canvas id="myChart" style="width:100%;max-width:600px"></canvas>
        <script>
            var yValues = [55, 49, 44, 24, 15, 150];
            var barColors = ["red", "green", "blue", "orange", "brown", "black"];

            function passValue(){
                return ${requestScope.values};
            }
            new Chart("myChart", {
                type: "bar",
                data: {
                    labels: passValue(),
                    datasets: [{
                            backgroundColor: barColors,
                            data: yValues
                        }]
                },
                options: {
                    legend: {display: false},
                    title: {
                        display: true,
                        text: "World Wine Production 2018"
                    }
                }
            });
            
        </script>
    </body>
</html>
