<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- test1.jsp 페이지에서 AJAX 를 통해 요청한 작업에 대한 처리 및 응답 결과 생성 페이지 --%>
<h1>AJAX - test1_result.jsp</h1>
<%-- 실제 로그인 처리 생략하고, 전달받은 아이디와 패스워드만 출력 --%>
<%-- 이 때, 전달받은 아이디, 패스워드 처리는 일반 파라미터 처리와 동일 --%>
<h3>아이디 : ${param.id }</h3>
<h3>패스워드 : ${param.passwd }</h3>
