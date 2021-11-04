<%-- 
    Document   : review
    Created on : Oct 24, 2021, 8:04:46 PM
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
            <title>History Detail</title>
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
                                        <li><a href="">Profile</a></li>
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
                    <h1>Review Product</h1>
                </div>
            </div>
            <div class="row" style="margin-top: 50px;">
                <div class="center">
                    <c:if test="${sessionScope.PRODUCTLISTREVIEW!=null}" var="testEmpty">
                        <div>
                            <form>
                                <table border="1" class="table table-bordered" style="width: 1000px; margin-right: 50px; height: 310px;">
                                    <thead>
                                        <tr>
                                            <th scope="col">No.</th>
                                            <th scope="col">Product image</th>
                                            <th scope="col">Product name</th>
                                            <th scope="col">Product price</th>
                                            <th scope="col"></th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${sessionScope.PRODUCTLISTREVIEW}" var="productInfo" varStatus="counter">
                                            <tr>
                                                <td>
                                                    ${counter.count}
                                                </td>
                                                <td>
                                                    <img width="150" height="150" src="${productInfo.img}"/>
                                                </td>
                                                <td>
                                                    ${productInfo.name}
                                                </td>
                                                <td>
                                                    ${productInfo.price}
                                                </td>
                                                <td>
                                                    <div class="rate">
                                                        <input type="radio" id="star_${productInfo.productID}-5" name="rate${productInfo.productID}" value="5" />
                                                        <label for="star_${productInfo.productID}-5" title="text">5 stars</label>
                                                        <input type="radio" id="star_${productInfo.productID}-4" name="rate${productInfo.productID}" value="4" />
                                                        <label for="star_${productInfo.productID}-4" title="text">4 stars</label>
                                                        <input type="radio" id="star_${productInfo.productID}-3" name="rate${productInfo.productID}" value="3" />
                                                        <label for="star_${productInfo.productID}-3" title="text">3 stars</label>
                                                        <input type="radio" id="star_${productInfo.productID}-2" name="rate${productInfo.productID}" value="2" />
                                                        <label for="star_${productInfo.productID}-2" title="text">2 stars</label>
                                                        <input type="radio" id="star_${productInfo.productID}-1" name="rate${productInfo.productID}" value="1" />
                                                        <label for="star_${productInfo.productID}-1" title="text">1 star</label>
                                                    </div><br/><br/><br/>
                                                    <div class="reviewForm">
                                                        <p>Review comment</p>
                                                        <div class="textbox">
                                                            <input type="text" placeholder="Enter comment" name="txtComment${productInfo.productID}" value="${param.txtUsername}"/>
                                                            <i class="fas fa-user fa-lg fa-fw" aria-hidden="true"></i>
                                                        </div>
                                                    </div>
                                                </td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                                <div>
                                    <input class="btn btn-primary" value="Cancel Review" name="action" type="submit" />
                                    <input class="btn btn-primary" value="Review" name="action" type="submit" />
                                </div>
                            </form>
                        </div>
                    </c:if>
                </div>
            </div>
        </body>
    </html>
</c:if>
<c:if test="${!testRole}">
    <c:set var="ERROR" value="You do not have permission to access this" scope="request"/>
    <%@include file="error.jsp"%>
</c:if>
