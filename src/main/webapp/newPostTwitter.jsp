<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@include file="header.html"%>
<c:if test='${empty sessionScope["Twitter-token"]}'>
    <c:redirect url = "/AuthController/Twitter"/>
</c:if>

<h1>Twitter post creation</h1>
<div class="container">

    <p class="message"></p>

    <form action="/TwitterNewPostController" method="post">

        <label for="createdAt">created At:</label>
        <textarea id="createdAt" name="createdAt"></textarea>

        <label for="idStr">idStr:</label>
        <textarea id="idStr" name="idStr"></textarea>
        
        <label for="text">text:</label>
        <textarea id="text" name="text"></textarea>


        <div class="bottom_links">
            <button type="submit" class="button">Create post in Twitter</button>
            <button type="button" onClick="javascript:window.location.href = '/'" class="button">Cancel</button>
        </div>
    </form>
</div>

<%@include file="footer.html"%>
