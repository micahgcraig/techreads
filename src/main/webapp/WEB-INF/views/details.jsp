<jsp:useBean id="book" scope="request" type="com.manifestcorp.techreads.model.Book"/>
<!DOCTYPE html>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<P>${book.coverURL}</P>
<h1>${book.title}</h1>
<h2>By: ${book.author}</h2>
<h3>Rating: ${book.rating}</h3>

<h3>Description: </h3> <p>${book.description}</p>
</body>
</html>