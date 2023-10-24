<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="head.jsp"%>
</head>
<body >
  <h1>
    Todo Application
  </h1>
  <div class="container">
    <form action="Todo" method="post">
      <div class="mb-3">
        <label for="title" class="form-label">title </label>
        <input type="text" name="title" class="form-control" id="title" placeholder="todo here ... ">
      </div>
      <div class="mb-3">
        <label for="user_id" class="form-label">user id </label>
        <input type="number" name="user_id"  class="form-control" id="user_id" placeholder="todo here ... ">
      </div>
      <div class="mb-3">
        <label for="description" class="form-label">description textarea</label>
        <textarea class="form-control" name="description" id="description" rows="3"></textarea>
      </div>
      <input type="submit" class="btn btn-primary">
    </form>
    <table class="table">
      <thead>
      <th scope="col">id</th>
      <th scope="col">title</th>
      <th scope="col">description</th>
      <th scope="col">status</th>
      </thead>
      <tbody>
      <c:forEach items="${todos}" var="todo">
        <tr>
          <th scope="col m-4">${todo.id}</th>
          <th scope="col m-4">${todo.title}</th>
          <th scope="col m-4">${todo.description}</th>
          <th scope="col m-4">${todo.status}</th>
        </tr>
      </c:forEach>

      </tbody>
    </table>
  </div>

</body>
</html>
