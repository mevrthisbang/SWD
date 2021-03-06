<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<c:if test="${sessionScope.USER!=null&& sessionScope.USER.role eq 'admin'}" var="testRole">

    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Order List</title>
            <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
                  integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
                  crossorigin="anonymous"/>
            <link rel="stylesheet" href="css/style_1.css"/>
            <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/alertify.min.css"/>
            <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/themes/default.min.css"/>
            <script src="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/alertify.min.js"></script>

        </head>
        <style>
            #formSubmit {
                display: none;
            }
        </style>
        <body>
            <div class="header_bottom" style="background-color: #F0EEEE;">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-3 col-md-12 col-sm-12 col-xs-12">
                            <!-- logo start -->
                            <div class="logo"><a href="MainController"><img src="img/logo.png" alt="logo"/></a></div>
                            <!-- logo end -->
                        </div>
                        <div class="col-lg-9 col-md-12 col-sm-12 col-xs-12">
                            <!-- menu start -->
                            <div class="menu_side">
                                <div id="navbar_menu">
                                    <ul class="first-ul">
                                        <li> <a class="active" href="MainController">Home</a>
                                        </li>
                                        <li><a href="createForm.jsp">Create new Product</a></li>
                                            <c:url var="orderListLink" value="MainController">
                                                <c:param name="action" value="orderList"/>
                                            </c:url>
                                        <li><a href="${orderListLink}">Customer Order</a></li>
                                        <li><a href="createForm.jsp">Profile</a></li>
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

            <div class="container" style="padding-top: 50px;">
                <div class="center">
                    <form action="MainController" method="POST">
                        Search: <input name="txtSearch" type="text" value="${param.txtSearch}"/>
                        Date from: <input name="dateFrom" type="date" value="${param.dateFrom}"/> Date to:<input name="dateTo" type="date" value="${param.dateTo}"/>
                        <select name="cbStatus" id="cbStatus">
                            <option value="">-Status-</option>
                            <option value="Wait for Confirmation"
                                    <c:if test="${order.status eq 'Wait for Confirmation'}">
                                        selected="true"
                                    </c:if>>Wait for Confirmation
                            </option>
                            <option value="Confirmed"
                                    <c:if test="${order.status eq 'Confirmed'}">
                                        selected="true"
                                    </c:if>>Confirmed
                            </option>
                            <option value="Delivering"
                                    <c:if test="${order.status eq 'Delivering'}">
                                        selected="true"
                                    </c:if>>Delivering
                            </option>
                            <option value="Completed"
                                    <c:if test="${order.status eq 'Completed'}">
                                        selected="true"
                                    </c:if>>Completed
                            </option>
                            <option value="Cancelled"
                                    <c:if test="${order.status eq 'Cancelled'}">
                                        selected="true"
                                    </c:if>>Cancelled
                            </option>
                        </select>
                        <input type="submit" value="Search Order" name="action" class="btn btn-primary"/>
                    </form>
                </div>
            </div>

            <div class="container" style="margin-top: 50px;">
                <div class="center">
                    <h1>Order List</h1>
                </div>
                <div>
                    <div>
                        <div>
                            <div>
                                <ul id="navbar-history" class="nav nav-tabs">
                                    <c:url var="orderLink" value="MainController">
                                        <c:param name="action" value="orderList"/>
                                    </c:url>
                                    <li class="active"><a href="${orderLink}">All</a></li>
                                        <c:url var="orderLink" value="MainController">
                                            <c:param name="action" value="orderList"/>
                                            <c:param value="Wait for Confirmation" name="cbStatus"/>
                                        </c:url>
                                    <li><a href="${orderLink}">Wait for Confirmation</a></li>
                                        <c:url var="orderLink" value="MainController">
                                            <c:param name="action" value="orderList"/>
                                            <c:param value="Confirmed" name="cbStatus"/>
                                        </c:url>
                                    <li><a href="${orderLink}">Confirmed</a></li>
                                        <c:url var="orderLink" value="MainController">
                                            <c:param name="action" value="orderList"/>
                                            <c:param value="Delivering" name="cbStatus"/>
                                        </c:url>
                                    <li><a href="${orderLink}">Delivering</a></li>
                                        <c:url var="orderLink" value="MainController">
                                            <c:param name="action" value="orderList"/>
                                            <c:param value="Completed" name="cbStatus"/>
                                        </c:url>
                                    <li><a href="${orderLink}">Completed</a></li>
                                        <c:url var="orderLink" value="MainController">
                                            <c:param name="action" value="orderList"/>
                                            <c:param value="Cancelled" name="cbStatus"/>
                                        </c:url>
                                    <li><a href="${orderLink}">Cancelled</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row" style="margin-top: 50px;">
                <c:if test="${sessionScope.ORDER_LIST!=null}" var="testEmpty">
                    <div class="center">

                        <table border="1" class="table table-bordered"
                               style="width: 1000px; margin-right: 50px; height: 310px;">
                            <thead>
                                <tr>
                                    <th scope="col">No.</th>
                                    <th scope="col">Buy Date</th>
                                    <th scope="col">Phone</th>
                                    <th scope="col">Address</th>
                                    <th scope="col">Total</th>
                                    <th scope="col">Status</th>
                                    <th scope="col">Action</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${sessionScope.ORDER_LIST}" var="order" varStatus="counter">

                                    <tr>
                                        <td>
                                            ${counter.count}
                                        </td>
                                        <td>
                                            <fmt:formatDate type="both" dateStyle="short" timeStyle="short"
                                                            value="${order.buyDate}"/>
                                        </td>
                                        <td>
                                            ${order.phone}
                                        </td>
                                        <td>
                                            ${order.shippingAddress}
                                        </td>
                                        <td>
                                            ${order.total}
                                        </td>
                                <form action="MainController" method="POST">
                                    <td>
                                        <select name="cbStatus">
                                            <option value="Wait for Confirmation"
                                                    <c:if test="${order.status eq 'Wait for Confirmation'}">
                                                        selected="true"
                                                    </c:if>>Wait for Confirmation
                                            </option>
                                            <option value="Confirmed"
                                                    <c:if test="${order.status eq 'Confirmed'}">
                                                        selected="true"
                                                    </c:if>>Confirmed
                                            </option>
                                            <option value="Delivering"
                                                    <c:if test="${order.status eq 'Delivering'}">
                                                        selected="true"
                                                    </c:if>>Delivering
                                            </option>
                                            <option value="Completed"
                                                    <c:if test="${order.status eq 'Completed'}">
                                                        selected="true"
                                                    </c:if>>Completed
                                            </option>
                                            <option value="Cancelled"
                                                    <c:if test="${order.status eq 'Cancelled'}">
                                                        selected="true"
                                                    </c:if>>Cancelled
                                            </option>
                                        </select>

                                        <c:if test="${order.status ne 'Completed'}">
                                            <input type="hidden" name="orderID" value="${order.orderID}" onchange="getStatus(counter.count);">   
                                            <input type="submit" name="action" value="Update Status" class="btn btn-primary"
                                                   onclick="return confirm('Are you sure to update order No.${counter.count} status?')" />

                                        </c:if>
                                        <c:if test="${order.status eq 'Completed'}">
                                            Can't edit completed order.
                                        </c:if>
                                    </td>
                                </form>
                                <td>
                                    <c:url var="orderDetail" value="MainController">
                                        <c:param name="action" value="orderDetail"/>
                                        <c:param name="orderID" value="${order.orderID}"/>
                                    </c:url>
                                    <a href="${orderDetail}">View detail</a>

                                </td>

                                </tr>

                            </c:forEach>
                            </tbody>
                        </table>

                    </div>
                </c:if>
                <c:if test="${!testEmpty}">
                    <div class="center">
                        <p>Does not have any orders.</p>
                    </div>
                    <div class="center">
                        <a href="MainController" class="btn btn-primary">Back to Homepage</a>
                    </div>
                </c:if>
            </div>
        </body>
    </html>
    <c:if test="${requestScope.UPDATE_RESULT eq 'true'}">
        <script>
            alertify.set('notifier', 'position', 'bottom-right');
            alertify.success('Update order status success');
        </script>
    </c:if>
</c:if>
<c:if test="${!testRole}">
    <c:set var="ERROR" value="You do not have permission to access this" scope="request"/>
    <%@include file="error.jsp" %>
</c:if>