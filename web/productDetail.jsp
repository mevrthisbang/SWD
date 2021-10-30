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
        <style>
            .gallery-wrap .img-big-wrap img {
                height: 450px;
                width: auto;
                display: inline-block;
                cursor: zoom-in;
            }


            .gallery-wrap .img-small-wrap .item-gallery {
                width: 60px;
                height: 60px;
                border: 1px solid #ddd;
                margin: 7px 2px;
                display: inline-block;
                overflow: hidden;
            }

            .gallery-wrap .img-small-wrap {
                text-align: center;
            }
            .gallery-wrap .img-small-wrap img {
                max-width: 100%;
                max-height: 100%;
                object-fit: cover;
                border-radius: 4px;
                cursor: zoom-in;
            }
            .img-big-wrap img{
                width: 100% !important;
                height: auto !important;
            }
        </style>
    </head>
    <body>
        <jsp:include page="menu.jsp"></jsp:include>
        <c:set var="product" value="${requestScope.product}"/>
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
                            <li class="breadcrumb-item"><a href="#">${product.name}</a></li>
                        </ol>
                    </nav>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row">
                <jsp:include page="left.jsp"></jsp:include>
                    <div class="col-sm-9">
                        <div class="container">
                            <div class="card">
                                <div class="row">

                                    <aside class="col-sm-5 border-right">
                                        <article class="gallery-wrap"> 
                                            <div class="img-big-wrap">
                                                <div> <a href="#"><img src="${product.img}"></a></div>
                                        </div> <!-- slider-product.// -->
                                        <div class="img-small-wrap">
                                        </div> <!-- slider-nav.// -->
                                    </article> <!-- gallery-wrap .end// -->
                                </aside>
                                <aside class="col-sm-7">
                                    <article class="card-body p-5">
                                        <h3 class="title mb-3">${product.name}</h3>

                                        <p class="price-detail-wrap"> 
                                            <span class="price h3 text-warning"> 
                                                <span class="currency">US $</span><span class="num">${product.price}</span>
                                            </span> 
                                        </p> <!-- price-detail-wrap .// -->
                                        <dl class="item-property">
                                            <dt>Description</dt>
                                            <dd><p>
                                                    ${product.description}
                                                </p></dd>
                                        </dl>

                                        <!--                                        <hr>
                                                                                <div class="row">
                                                                                    <div class="col-sm-5">
                                                                                        <dl class="param param-inline">
                                                                                            <dt>Quantity: </dt>
                                                                                            <dd>
                                                                                                <select class="form-control form-control-sm" style="width:70px;">
                                                                                                    <option> 1 </option>
                                                                                                    <option> 2 </option>
                                                                                                    <option> 3 </option>
                                                                                                </select>
                                                                                            </dd>
                                                                                        </dl>   item-property .// 
                                                                                    </div>  col.// 
                                        
                                                                                </div>  row.// -->
                                        <hr>
                                        <!--                                        <a href="#" class="btn btn-lg btn-primary text-uppercase"> Buy now </a>-->
                                        <c:url var="addToCartLink" value="MainController">
                                            <c:param name="action" value="AddToCart"/>
                                            <c:param name="id" value="${product.productID}"/>
                                        </c:url>
                                        <a href="${addToCartLink}" class="btn btn-lg btn-outline-primary text-uppercase"> <i class="fas fa-shopping-cart"></i> Add to cart </a>
                                    </article> <!-- card-body.// -->
                                </aside> <!-- col.// -->
                            </div> <!-- row.// -->
                        </div> <!-- card.// -->

                        <c:forEach items="${requestScope.listReview}" var="review">
                            <div class="card">
                                <div class="row">
                                    <div class="col-md-10">
                                        <article class="card-body p-3">
                                            <p>
                                                <a class="float-left" href="#"><strong>${review.customerID}</strong></a>
                                                <p class="text-secondary float-left">${review.createDate}</p>
                                                <c:forEach var="i" begin="1" end="${review.rating}">
                                                    <span class="float-right"><i class="text-warning fa fa-star"></i></span>
                                                </c:forEach>
                                            </p>
                                            <div class="clearfix"></div>
                                            <p>${review.content}</p>
                                        </article>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                </div>

            </div>
        </div>

        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>

