<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">


    <title>NetCracker</title>
    <link rel="shortcut icon" href="http://ru.javasql.center/theme/image.php/shoehorn/theme/1443184510/favicon">

    <!-- Material Design fonts -->
    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:300,400,500,700" type="text/css">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

    <!-- Bootstrap -->
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">

    <link href="${pageContext.request.contextPath}/resources/css/bootstrap-material-design.css" />" rel="stylesheet"  media="screen">
    <link href="${pageContext.request.contextPath}/resources/css/ripples.css" />" rel="stylesheet"  media="screen">
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" />" rel="stylesheet"  media="screen">
    <link href="${pageContext.request.contextPath}/resources/css/dopstyle.css" />" rel="stylesheet"  media="screen" type="text/css">
    <link href="${pageContext.request.contextPath}/resources/css/material-design.css" />" rel="stylesheet"  media="screen" type="text/css">


    <link href="//fezvrasta.github.io/snackbarjs/dist/snackbar.min.css" rel="stylesheet">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Bootstrap</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- [if lt IE 9]>
    <script src="../../assets/js/html5shiv.js/"></script>
    <script src="../../assets/js/respond.min.js/"></script>
    <![endif]-->
</head>
<body>
<!--<a href="#" data-toggle="modal" data-target="#login-modal">Login</a>-->
<div class="modal fade" id="login-modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"
     style="display: none;">
    <div class="modal-dialog">
        <div class="loginmodal-container">
            <h1>Login to Your Account</h1><br>
            <form>
                <input type="text" name="user" placeholder="Username">
                <input type="password" name="pass" placeholder="Password">
                <input type="submit" name="login" class="login loginmodal-submit" value="Login">
            </form>

            <div class="login-help">
                <a href="#">Register</a> - <a href="#">Forgot Password</a>
            </div>
        </div>
    </div>
</div>
<div class="col-md-12 top-menu">
    <div class="navbar-collapse collapse navbar-inverse navbar-inverse-collapse">
        <ul class="nav navbar-nav">
            <li class="active"><a href="#">Testing system</a></li>
            <li><a href="javascript:void(0)">NetCracker</a></li>
            <li class="dropdown">
                <a href="bootstrap-elements.html" data-target="#" class="dropdown-toggle"
                   data-toggle="dropdown">Courses
                    <b class="caret"></b></a>
                <ul class="dropdown-menu">
                    <li><a href="javascript:void(0)">All courses</a></li>
                    <li class="divider"></li>
                    <li class="dropdown-header">Java</li>
                    <li><a href="javascript:void(0)">Java EE</a></li>
                    <li><a href="javascript:void(0)">Java SE and XML</a></li>
                    <li><a href="javascript:void(0)">Java SX</a></li>
                    <li class="divider"></li>
                    <li class="dropdown-header">SQL</li>
                    <li><a href="javascript:void(0)">Oracle SQL part 1</a></li>
                    <li><a href="javascript:void(0)">Oracle SQL part 2</a></li>
                    <li class="divider"></li>
                    <li class="dropdown-header">Learning resources</li>
                    <li><a href="javascript:void(0)">Lectures</a></li>
                    <li><a href="javascript:void(0)">Articles</a></li>
                    <li><a href="javascript:void(0)">Library</a></li>
                </ul>
            </li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
            <form class="navbar-form navbar-left">
                <div class="form-group is-empty">
                    <input type="text" class="form-control col-md-8" placeholder="Search">
                </div>
            </form>
            <li class="dropdown">
                <a href="bootstrap-elements.html" data-target="#" class="dropdown-toggle"
                   data-toggle="dropdown"><img src="<c:url value="/resources/images/settings.png" />">
                    <b class="caret"></b></a>
                <ul class="dropdown-menu">
                    <c:if test="${pageContext.request.userPrincipal.name == null}">
                        <li>
                            <a href="#" class="btn btn-raised btn-sm">My Profile
                                <div class="ripple-container"></div>
                            </a>
                        </li>
                        <li>
                            <a href="#" class="btn btn-raised btn-sm">Settings
                                <div class="ripple-container"></div>
                            </a>
                        </li>
                        <li>
                            <form class="navbar-form" action="${contextPath}/login">
                                <a href="#ModalSign" class="btn btn-raised btn-sm btn-success"
                                   data-toggle="modal" data-target="#login-modal">Sign in</a>
                            </form>

                        </li>
                    </c:if>
                    <c:if test="${pageContext.request.userPrincipal.name != null}">
                        <li>
                            <form class="navbar-form " action="${contextPath}/login">
                                <a href="#ModalSign" class="btn btn-raised btn-sm btn-success"
                                   data-toggle="modal">Log out</a>
                            </form>
                        </li>
                        <li>
                            <a href="#" class="btn btn-raised btn-sm">Create account
                                <div class="ripple-container"></div>
                            </a>
                        </li>
                    </c:if>
                </ul>
            </li>
        </ul>
    </div>
</div>

<div class="col-md-3 left-sidebar">
    <div class="bs-component">
        <ul class="nav nav-tabs" style="margin-bottom: 15px;">
            <li class=""><a href="#Java-SE" data-toggle="tab" aria-expanded="false" onclick="openCity(event, 'London')"
                            id="defaultOpen">Java SE
                <div class="ripple-container"></div>
            </a></li>
            <li class=""><a href="#Oracle-Sql" data-toggle="tab" aria-expanded="false">Oracle Sql
                <div class="ripple-container"></div>
            </a></li>
            <li class=""><a href="#XML" data-toggle="tab" aria-expanded="false">XML
                <div class="ripple-container"></div>
            </a></li>
        </ul>
        <div id="myTabContent" class="tab-content">
            <div id="Java-SE" class="tab-pane fade">
                <h3>Java SE</h3>
                <table class="table table-striped table-hover ">
                    <thead>
                    <tr>
                        <th>Place</th>
                        <th>User</th>
                        <th>Score</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>1</td>
                        <td>dase</td>
                        <td>100</td>
                    </tr>
                    <tr>
                        <td>2</td>
                        <td>qplk</td>
                        <td>95</td>
                    </tr>
                    <tr>
                        <td>3</td>
                        <td>fade</td>
                        <td>75</td>
                    </tr>
                    </tbody>
                </table>
            </div>

            <div id="Oracle-Sql" class="tab-pane fade">
                <h3>Oracle Sql</h3>
                <table class="table table-striped table-hover ">
                    <thead>
                    <tr>
                        <th>Place</th>
                        <th>User</th>
                        <th>Score</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>1</td>
                        <td>dase</td>
                        <td>100</td>
                    </tr>
                    <tr>
                        <td>2</td>
                        <td>qplk</td>
                        <td>95</td>
                    </tr>
                    <tr>
                        <td>3</td>
                        <td>fade</td>
                        <td>75</td>
                    </tr>
                    </tbody>
                </table>
            </div>

            <div id="XML" class="tab-pane fade">
                <h3>XML</h3>
                <table class="table table-striped table-hover ">
                    <thead>
                    <tr>
                        <th>Place</th>
                        <th>User</th>
                        <th>Score</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>1</td>
                        <td>dase</td>
                        <td>100</td>
                    </tr>
                    <tr>
                        <td>2</td>
                        <td>qplk</td>
                        <td>95</td>
                    </tr>
                    <tr>
                        <td>3</td>
                        <td>fade</td>
                        <td>75</td>
                    </tr>
                    </tbody>
                </table>
            </div>

        </div>
    </div>
</div>

<div class="col-md-9 content">
    <div class="container">
        <div class="row">
            <div class="col-md-12 main-content"></div>
            <div class="col-md-12 main-content"></div>
            <div class="col-md-12 main-content"></div>
        </div>
    </div>
</div>

<div class="container">
    <div class="row">
        <!--<div class="col-md-12 head-block"></div>-->
        <!--<div class="col-md-12 top-material"></div>-->

    </div>
</div>

<script src="//code.jquery.com//jquery.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
<script>
    function openCity(evt, cityName) {
        var i, tabcontent, tablinks;
        tabcontent = document.getElementsByClassName("tabcontent");
        for (i = 0; i < tabcontent.length; i++) {
            tabcontent[i].style.display = "none";
        }
        tablinks = document.getElementsByClassName("tablinks");
        for (i = 0; i < tablinks.length; i++) {
            tablinks[i].className = tablinks[i].className.replace(" active", "");
        }
        document.getElementById(cityName).style.display = "block";
        evt.currentTarget.className += " active";
    }
    // Get the element with id="defaultOpen" and click on it
    document.getElementById("defaultOpen").click();
</script>
</body>
</html>
