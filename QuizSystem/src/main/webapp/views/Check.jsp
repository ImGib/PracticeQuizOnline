<%-- 
    Document   : Check
    Created on : Feb 19, 2023, 1:27:20 AM
    Author     : Lenovo
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            #dialog-confirm {
                display:none
            }
            .shut-up {
                float:left;
                display: inline-block;
                margin-top: 1em;
            }
        </style>
    </head>
    <body>
        <input type="button" id="btnOpenDialog"  value="Open Confirm Dialog" />
        <div id="dialog-confirm">Are you sure you want to do whatever?</div>
        
         <script>
        function fnOpenNormalDialog() {
            // Define the Dialog and its properties.
            $("#dialog-confirm").dialog({
                display: block,
                resizable: false,
                modal: true,
                title: "Modal",
                height: 250,
                width: 400,
                create: function (e, ui) {
                    var pane = $(this).dialog("widget").find(".ui-dialog-buttonpane")
                    $("<label class='shut-up' ><input  type='checkbox'/> Stop asking!</label>").prependTo(pane)
                },
                buttons: {
                    "Yes": function () {
                        $(this).dialog('close');
                        callback(true);
                    },
                    "No": function () {
                        $(this).dialog('close');
                        callback(false);
                    }
                }
            });
        }

        $('#btnOpenDialog').click(fnOpenNormalDialog);
        $(document).on("change", ".shut-up input", function () {
            alert("shut up! " + this.checked)
        })

        function callback(value) {
            if (value) {
                alert("Confirmed");
            } else {
                alert("Rejected");
            }
        }

    </script>
    </body>

   
</html>
