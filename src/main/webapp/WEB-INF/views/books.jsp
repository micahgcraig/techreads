<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h1>Books</h1>
<a href="<c:url value="/books/add" />">Add Books</a>

<c:if test="${not empty books}">
    <ul>
        <c:forEach var="book" items="${books}">
            <li>
                <label>Cover:</label>
                <img src="<c:out value="${book.coverURL}"/>" width="500" height="500" />
                <br/>
                <label>Title:</label>
                <c:out value="${book.title}"/>
                <br/>
                <label>Author:</label>
                <c:out value="${book.author}"/>
                <br/>
                <label>Rating:</label>
                <c:out value="${book.rating}"/>
                <br/>
                <label>Description:</label>
                <c:out value="${book.description}"/>
                <br/>
                <a href="<c:url value="/books/details/${book.id}" /> ">
                    <input type="submit" value="Details"/>
                </a>
                <a href="<c:url value="/books/edit/${book.id}"/> ">
                    <input type="submit" value="Edit">
                </a>
                <a href="<c:url value="/books/delete/${book.id}" /> ">
                    <input type="submit" value="Delete">
                </a>
                <br/>

            </li>
        </c:forEach>
    </ul>
</c:if>
</body>
</html>