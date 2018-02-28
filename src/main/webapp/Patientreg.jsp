<%@ page import="Pojos.Patient" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="ClinicBeansImplementation.Logic" %><%--
  Created by IntelliJ IDEA.
  User: Candy Abebe
  Date: 2/21/2018
  Time: 8:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<%!
   Patient p=new Patient();
   SimpleDateFormat formatter=new SimpleDateFormat("yyyy-mm-dd");
%>
<%
    Logic logic= (Logic) request.getAttribute("logic");
    if(request.getParameter("name")!=null){
       p.setName(request.getParameter("name"));
       p.setGender(request.getParameter("gender"));
       p.setAge(Integer.parseInt(request.getParameter("age")));
       p.setDate(formatter.parse(request.getParameter("date")));
       p.setID(Integer.parseInt(request.getParameter("ID")));
       request.getRequestDispatcher("WelcomePagePatient.html").forward(request,response);
    }
    else {
        request.getRequestDispatcher("PatientRegForm.html").forward(request,response);
    }

%>
</body>
</html>
