<%@ page import="Pojos.Doctor" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="ClinicBeansImplementation.Logic" %><%--
  Created by IntelliJ IDEA.
  User: Candy Abebe
  Date: 2/21/2018
  Time: 4:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</he
<body>

</body>
</html>
<%!
    Doctor doc=new Doctor();
    SimpleDateFormat formatter=new SimpleDateFormat("yyyy-mm-dd");
%>
<%
    Logic logic= (Logic) request.getAttribute("logic");
    if(request.getParameter("name")!=null){
       doc.setFname(request.getParameter("Fname"));
       doc.setLname(request.getParameter("Lname"));
       doc.setStaffid(Integer.parseInt("Staffid"));
       doc.setPhonenumber(Long.parseLong("phonenumber"));
       doc.setGender(request.getParameter("Gender"));
       request.getRequestDispatcher("WelcomePagePatient.html").forward(request,response);
    }
    else {
        request.getRequestDispatcher("DoctorRegForm.html").forward(request,response);
    }

%>