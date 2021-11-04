<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home page</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!------ Include the above in your HEAD tag ---------->
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <link href="css/style_2.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/alertify.min.css"/>
        <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/themes/default.min.css"/>
        <script src="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/alertify.min.js"></script>
    </head>
    <body>
        <jsp:include page="menu.jsp"></jsp:include>
            <section class="jumbotron text-center">
                <div class="container">
                    <h1 class="jumbotron-heading">In a World of Technology, People Make the Difference.</h1>
                    <p class="lead text-muted mb-0">We’re in IT Business since 1999</p>
                </div>
            </section>
            <div class="container">
                <div class="row">
                    <div class="col">
                        <nav aria-label="breadcrumb">
                            <ol class="breadcrumb">
                            <c:url var = "homeLink" value="MainController">
                                <c:param name="action" value="Search"/>
                            </c:url>
                            <li class="breadcrumb-item"><a href="${homeLink}">Home</a></li>
                            <li class="breadcrumb-item"><a href="#">Category</a></li>
                        </ol>
                    </nav>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row">
                <jsp:include page="left.jsp"></jsp:include>
                    <div class="col-sm-9">
                        <div id="content" class="row">
                        <c:forEach items="${requestScope.listProduct}" var="o">
                            <div class="product col-12 col-md-6 col-lg-4" style="padding: 20px;">
                                <div class="card" >
                                    <img class="card-img-top" src="${o.img}" alt="Card image cap" style="object-fit: cover;width: 200px;
                                         height: 150px;">
                                    <div class="card-body">
                                        <c:url var="viewDetail" value="MainController">
                                            <c:param name="action" value="ViewProductDetail"/>
                                            <c:param name="id" value="${o.productID}"/>
                                        </c:url>
                                        <h4 class="card-title show_txt"><a href="${viewDetail}" title="View Product">${o.name}</a></h4>
                                        <p class="card-text show_txt">${o.name}</p>
                                        <div class="row">
                                            <div class="col" style="text-align: center;">
                                                <p>${o.price}$</p>
                                            </div>
                                            <div class="col">
                                                <div class="center">
                                                    <c:url var="addToCartLink" value="MainController">
                                                        <c:param name="action" value="AddToCart"/>
                                                        <c:param name="id" value="${o.productID}"/>
                                                    </c:url>
                                                    <a class="btn btn-primary" href="${addToCartLink}">Add to Cart</a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                    <div style="text-align: center;">
                        <button onclick="loadMore()" class="btn btn-primary" style="margin-bottom: 30px;">Load more</button>
                    </div>


                </div>

            </div>
        </div>

        <jsp:include page="footer.jsp"></jsp:include>
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
            <script>
                            function loadMore() {
                                var amount = document.getElementsByClassName("product").length;
                                $.ajax({
                                    url: "/SWD_TechnologyProduct/MainController?action=load_more",
                                    type: "get", //send it through get method
                                    data: {
                                        exits: amount
                                    },
                                    success: function (data) {
                                        var row = document.getElementById("content");
                                        row.innerHTML += data;
                                    },
                                    error: function (xhr) {
                                        //Do Something to handle error
                                    }
                                });
                            }
                            function searchByName(param) {
                                var txtSearch = param.value;
                                $.ajax({
                                    url: "/SWD_TechnologyProduct/MainController?action=searchAjax",
                                    type: "get", //send it through get method
                                    data: {
                                        txt: txtSearch
                                    },
                                    success: function (data) {
                                        var row = document.getElementById("content");
                                        row.innerHTML = data;
                                    },
                                    error: function (xhr) {
                                        //Do Something to handle error
                                    }
                                });
                            }
            </script>  
        </body>
    </html>
<c:if test="${requestScope.ADDSUCESS eq 'true'}">
    <script>
        alertify.set('notifier', 'position', 'bottom-right');
        alertify.success('Add Successfully!');
    </script>
</c:if>
<c:if test="${requestScope.SUCCESS eq 'Order Successfully!'}">
    <script>
        alertify.set('notifier', 'position', 'bottom-right');
        alertify.success('Order Successfully!');
    </script>
</c:if>

