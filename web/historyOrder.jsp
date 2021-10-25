<%-- 
    Document   : historyOrder
    Created on : Oct 20, 2021, 11:45:42 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<c:if test="${sessionScope.USER!=null&& sessionScope.USER.role eq 'customer'}" var="testRole">
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Order History</title>
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous"/>
            <link href="css/style_1.css" rel="stylesheet"/>
        </head>
        <style>
            #formSubmit{
                display: none;
            }
        </style>
        <body>
            <div class="header_bottom" style="background-color: #F0EEEE;">
                <div class="container">
                    <div class="row" >
                        <div class="col-lg-3 col-md-12 col-sm-12 col-xs-12">
                            <!-- logo start -->
                            <div class="logo"> <a href="MainController"><img src="img/logo.png" alt="logo" /></a> </div>
                            <!-- logo end -->
                        </div>
                        <div class="col-lg-9 col-md-12 col-sm-12 col-xs-12">
                            <!-- menu start -->
                            <div class="menu_side">
                                <div id="navbar_menu">
                                    <ul class="first-ul">
                                        <li> <a class="active" href="MainController">Home</a>
                                        </li>
                                        <li><a href="cart.jsp">Cart</a></li>
                                            <c:url var="historyLink" value="MainController">
                                                <c:param name="action" value="shoppingHistory"/>
                                            </c:url>
                                        <li><a href="${historyLink}">Order History</a></li>
                                            <c:url var="logoutLink" value="MainController">
                                                <c:param name="action" value="Logout"/>
                                            </c:url>
                                        <li><a href="${logoutLink}">Logout</a></li>
                                </div>
                                <!-- menu end -->
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="container" style="margin-top: 50px;">
                <div class="center">
                    <h1>Order History</h1>
                </div>
                <div>
                    <div>
                        <div>
                            <div>
                                <ul id="navbar-history" class="nav nav-tabs">
                                    <c:url var="historyLink" value="MainController">
                                        <c:param name="action" value="shoppingHistory"/>
                                    </c:url>
                                    <li class="active"><a href="${historyLink}">All</a></li>
                                        <c:url var="historyLink" value="MainController">
                                            <c:param name="action" value="shoppingHistory"/>
                                            <c:param value="Wait for Confirmation" name="cbStatus"/>
                                        </c:url>
                                    <li><a href="${historyLink}">Wait for Confirmation</a></li>
                                        <c:url var="historyLink" value="MainController">
                                            <c:param name="action" value="shoppingHistory"/>
                                            <c:param value="Confirmed" name="cbStatus"/>
                                        </c:url>
                                    <li><a href="${historyLink}">Confirmed</a></li>
                                        <c:url var="historyLink" value="MainController">
                                            <c:param name="action" value="shoppingHistory"/>
                                            <c:param value="Delivering" name="cbStatus"/>
                                        </c:url>
                                    <li><a href="${historyLink}">Delivering</a></li>
                                        <c:url var="historyLink" value="MainController">
                                            <c:param name="action" value="shoppingHistory"/>
                                            <c:param value="Completed" name="cbStatus"/>
                                        </c:url>
                                    <li><a href="${historyLink}">Completed</a></li>
                                        <c:url var="historyLink" value="MainController">
                                            <c:param name="action" value="shoppingHistory"/>
                                            <c:param value="Canceled" name="cbStatus"/>
                                        </c:url>
                                    <li><a href="${historyLink}">Canceled</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row" style="margin-top: 50px;">
                <c:if test="${sessionScope.ORDERHISTORY!=null}" var="testEmpty">
                    <div class="center">
                        <form action="MainController" method="POST">
                            <table border="1" class="table table-bordered" style="width: 1000px; margin-right: 50px; height: 310px;">
                                <thead>
                                    <tr>
                                        <th scope="col">No.</th>
                                        <th scope="col">Buy Date</th>
                                        <th scope="col">Phone</th>
                                        <th scope="col">Address</th>
                                        <th scope="col">Total</th>
                                        <th scope="col">Status</th>
                                        <th scope="col">Cancel Order</th>
                                        <th scope="col">Action</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${sessionScope.ORDERHISTORY}" var="product" varStatus="counter">
                                        <tr>
                                            <td>
                                                ${counter.count}
                                            </td>
                                            <td>
                                                <fmt:formatDate type = "both" dateStyle = "short" timeStyle = "short" value = "${product.buyDate}" />
                                            </td>
                                            <td>
                                                ${product.phone}
                                            </td>
                                            <td>
                                                ${product.shippingAddress}
                                            </td>
                                            <td>
                                                ${product.total}
                                            </td>
                                            <td>
                                                ${product.status}
                                            </td>
                                            <td>
                                                <c:if test="${product.status eq 'Canceled' or product.status eq 'Completed'}">
                                                    <font color="red">
                                                    Can't cancel order
                                                    </font>
                                                </c:if>
                                                <c:if test="${product.status eq 'Delivering' or product.status eq 'Wait for Confirmation' or product.status eq 'Confirmed'}">
                                                    <a>Cancel the order</a>
                                                </c:if>
                                            </td>
                                            <td>
                                                <c:url var="showDetailHistory" value="MainController">
                                                    <c:param name="action" value="showDetailHistory"/>
                                                    <c:param name="orderID" value="${product.orderID}"/>
                                                </c:url>
                                                <a href="${showDetailHistory}">Show detail</a>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </form>
                    </div>
                </c:if>
                <c:if test="${!testEmpty}">
                    <div class="center">
                        <p>You don't have any order.</p>
                    </div>
                    <div class="center">
                        <a href="MainController" class="btn btn-primary">Back to shopping?</a>
                    </div>
                </c:if>
            </div>
        </body>
    </html>
</c:if>
<c:if test="${!testRole}">
    <c:set var="ERROR" value="You do not have permission to access this" scope="request"/>
    <%@include file="error.jsp"%>
</c:if>
