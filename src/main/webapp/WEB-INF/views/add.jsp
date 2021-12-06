<!DOCTYPE html>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<body>
<h1>Add Book</h1>
<%--@elvariable id="bookForm" type=""--%>
<form:form method="post" modelAttribute="bookForm" action="${pageContext.request.contextPath}/books">

    <form:input path="id" type="hidden"/>


    <label>Title</label>
    <form:input path="title" type="text" />
    <br/>
    <label>Author</label>
    <form:input path="author" type="text" />
    <br/>
    <label>Rating</label>
    <form:input path="rating" min="0" max="10" type="number"/>
    <br/>
    <label>Description</label>
    <form:input path="description" type="text"/>
    <br/>
    <label>Cover of book<form:input path="coverURL" type="text"/></label>
    <br/>
    <button type="submit">Add</button>
</form:form>
</body>
</html>