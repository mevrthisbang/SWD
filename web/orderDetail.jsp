<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<c:if test="${sessionScope.USER!=null&& sessionScope.USER.role eq 'admin'}" var="testRole">
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Order Detail</title>
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" 
                  integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" 
                  crossorigin="anonymous"/>
            <link href="css/style_1.css" rel="stylesheet"/>
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
            <div class="container" style="margin-top: 50px;">
                <div class="center">
                    <h1>Order Detail</h1>
                </div>
            </div>

            <div class="row" style="margin-top: 50px;">
                <c:if test="${sessionScope.ORDER_LIST!=null}" var="testEmpty">
                    <c:if test="${sessionScope.PAYMENT_DETAIL!=null}" var="testEmpty">
                        <div class="center">

                            <table border="1" class="table table-bordered"
                                   style="width: 1000px; margin-right: 50px; height: 310px;">
                                <thead>
                                    <tr>
                                        <th scope="col">No.</th>
                                        <th scope="col">Product image</th>
                                        <th scope="col">Product name</th>
                                        <th scope="col">Product price</th>
                                        <th scope="col">Quantity</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${sessionScope.ITEM_LIST}" var="product" varStatus="counter">
                                        <tr>
                                            <td>
                                                ${counter.count}
                                            </td>
                                            <td>
                                                <c:forEach var="productList" items="${requestScope.listProductToShow}">
                                                    <c:if test="${product.productID eq productList.productID}">
                                                        <img width="150" height="150" src="${productList.img}"/>
                                                    </c:if>
                                                </c:forEach>
                                            </td>
                                            <td>
                                                <c:forEach var="productList" items="${requestScope.listProductToShow}">
                                                    <c:if test="${product.productID eq productList.productID}">
                                                        ${productList.name}
                                                    </c:if>
                                                </c:forEach>
                                            </td>
                                            <td>
                                                ${product.price}
                                            </td>
                                            <td>
                                                ${product.quantity}
                                            </td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                            <div>
                                <ul>
                                    <li>Buyer name: ${sessionScope.ORDER_DETAIL.buyerName}</li>
                                    <li>Phone: ${sessionScope.ORDER_DETAIL.phone}</li>
                                    <li>Address: ${sessionScope.ORDER_DETAIL.shippingAddress}</li>
                                    <li>Total: ${sessionScope.ORDER_DETAIL.total}</li>
                                    <li>Payment: 
                                        <c:if test="${sessionScope.PAYMENT_DETAIL.paymendMethod eq 'P-1'}">Cash on Delivery</c:if>
                                        <c:if test="${sessionScope.PAYMENT_DETAIL.paymendMethod eq 'P-2'}">Paypal</c:if>
                                        </li>
                                        <form action="MainController" method="POST">
                                            <li>Status:
                                                <select name="cbStatus" id="cbStatus">
                                                    <option value="Wait for Confirmation"
                                                    <c:if test="${sessionScope.ORDER_DETAIL.status eq 'Wait for Confirmation'}">
                                                        selected="true"
                                                    </c:if>>Wait for Confirmation
                                                </option>
                                                <option value="Confirmed"
                                                        <c:if test="${sessionScope.ORDER_DETAIL.status eq 'Confirmed'}">
                                                            selected="true"
                                                        </c:if>>Confirmed
                                                </option>
                                                <option value="Delivering"
                                                        <c:if test="${sessionScope.ORDER_DETAIL.status eq 'Delivering'}">
                                                            selected="true"
                                                        </c:if>>Delivering
                                                </option>
                                                <option value="Completed"
                                                        <c:if test="${sessionScope.ORDER_DETAIL.status eq 'Completed'}">
                                                            selected="true"
                                                        </c:if>>Completed
                                                </option>
                                                <option value="Cancelled"
                                                        <c:if test="${sessionScope.ORDER_DETAIL.status eq 'Cancelled'}">
                                                            selected="true"
                                                        </c:if>>Cancelled
                                                </option>
                                            </select>
                                        </li>                                        
                                        <c:if test="${sessionScope.ORDER_DETAIL.status ne 'Completed'}">
                                            <input type="hidden" name="orderID" value="${sessionScope.ORDER_DETAIL.orderID}">                                              
                                            <input type="submit" name="action" value="Update Status" class="btn btn-primary" 
                                                   onclick="return confirm('Are you sure to update this order status?')"/>
                                        </c:if>
                                        <c:if test="${sessionScope.ORDER_DETAIL.status eq 'Completed'}">
                                            Can't edit completed order.
                                        </c:if>
                                    </form>
                                </ul>
                            </div>
                        </div>
                    </c:if>
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
