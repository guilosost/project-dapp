<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@include file="header.html"%>
<c:if test='${empty sessionScope["Pinterest-token"]}'>
    <c:redirect url = "/AuthController/Pinterest"/>
</c:if>

<h1>Reddit post creation</h1>
<div class="container">

    <p class="message"></p>

    <form action="/pinterestNewPostController" method="post">

        <label for="title">Title:</label>
        <textarea id="title" name="title"></textarea>

        <label for="content">Content:</label>
        <textarea id="content" name="content"></textarea>

        <div class="bottom_links">
            <button type="submit" class="button">Create post in Pinterest</button>
            <button type="button" onClick="javascript:window.location.href = '/'" class="button">Cancel</button>
        </div>
    </form>
</div>

<%@include file="footer.html"%>
