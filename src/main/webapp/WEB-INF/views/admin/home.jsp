<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


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

    <link href="${pageContext.request.contextPath}/resources/css/bootstrap-material-design.css"/>
    <link href="${pageContext.request.contextPath}/resources/css/ripples.css"/>
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"/>
    <link href="${pageContext.request.contextPath}/resources/css/dopstyle.css"/>
    <link href="${pageContext.request.contextPath}/resources/css/material-design.css"/>

    <link href="//fezvrasta.github.io/snackbarjs/dist/snackbar.min.css" rel="stylesheet">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Bootstrap</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <style>
        /*ЦВЕТ И ОТСТУП СНИЗУ ДЛЯ БЛОКОВ*/
        .head-block, .top-material, .left-sidebar, .content, .content-registration {
            background: #afdaff;
            margin-bottom: 1px;
        }

        .main-content {
            background: white;
            height: 100px;
            width: 80%;
            align-items: center;
            margin-top: 10px;
        }

        .head-block {
            margin-top: 100px;
        }

        /*ВЫСОТА ШАПКИ*/
        .head-block {
            height: 150px;
        }

        /*ВЫСОТА МЕНЮ*/
        .top-menu {
            height: 50px;
        }

        /*ВЫСОТА БЛОКА ВАЖНЫЕ МАТЕРИАЛЫ*/
        .top-material {
            height: 200px;
        }

        /*ВЫСОТА САЙДБАРА И БЛОКА КОНТЕНТ*/
        .left-sidebar {
            width: 25%;
            height: 600px;
            margin-top: 10px;
            margin-left: 15px;
            /*margin-right: 15px;*/
        }

        /*ГРАНИЦА У КОНТЕНТА*/
        .content {
            border-left: 1px solid #fff;
            height: 600px;
            margin-top: 10px;
            margin-left: 11px;
            width: 72%;
            /*margin-right: 15px;*/
        }

        .content-registration {
            border-left: 1px solid #fff;
            height: 615px;
            width: 1337px;
            text-align: center;
            margin-top: 10px;
            margin-left: 14px;
        }

        div.tab {
            margin-top: 10px;
            overflow: hidden;
            border: 1px solid #ccc;
            background-color: #f1f1f1;
        }

        /* Style the buttons inside the tab */
        div.tab button {
            background-color: inherit;
            float: left;
            border: none;
            outline: none;
            cursor: pointer;
            padding: 14px 16px;
            transition: 0.3s;
        }

        /* Change background color of buttons on hover */
        div.tab button:hover {
            background-color: #ddd;
        }

        /* Create an active/current tablink class */
        div.tab button.active {
            background-color: #ccc;
        }

        /* Style the tab content */
        .tabcontent {
            display: none;
            padding: 6px 12px;
            border: 1px solid #ccc;
            border-top: none;
        }

        form * {
            border-radius: 0 !important;
        }

        form > fieldset > legend {
            font-size: 120%;
        }
    </style>
    <style>
        .loginmodal-container {
            padding: 30px;
            max-width: 350px;
            width: 100% !important;
            background-color: #F7F7F7;
            margin: 0 auto;
            border-radius: 2px;
            box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
            overflow: hidden;
            font-family: roboto;
        }

        .loginmodal-container h1 {
            text-align: center;
            font-size: 1.8em;
            font-family: roboto;
        }

        .loginmodal-container input[type=submit] {
            width: 100%;
            display: block;
            margin-bottom: 10px;
            position: relative;
        }

        .loginmodal-container input[type=text], input[type=password] {
            height: 44px;
            font-size: 16px;
            width: 100%;
            margin-bottom: 10px;
            -webkit-appearance: none;
            background: #fff;
            border: 1px solid #d9d9d9;
            border-top: 1px solid #c0c0c0;
            /* border-radius: 2px; */
            padding: 0 8px;
            box-sizing: border-box;
            -moz-box-sizing: border-box;
        }

        .loginmodal-container input[type=text]:hover, input[type=password]:hover {
            border: 1px solid #b9b9b9;
            border-top: 1px solid #a0a0a0;
            -moz-box-shadow: inset 0 1px 2px rgba(0, 0, 0, 0.1);
            -webkit-box-shadow: inset 0 1px 2px rgba(0, 0, 0, 0.1);
            box-shadow: inset 0 1px 2px rgba(0, 0, 0, 0.1);
        }

        .loginmodal {
            text-align: center;
            font-size: 14px;
            font-family: 'Arial', sans-serif;
            font-weight: 700;
            height: 36px;
            padding: 0 8px;
            /* border-radius: 3px; */
            /* -webkit-user-select: none;
              user-select: none; */
        }

        .loginmodal-submit {
            /* border: 1px solid #3079ed; */
            border: 0px;
            color: #fff;
            text-shadow: 0 1px rgba(0, 0, 0, 0.1);
            background-color: #4d90fe;
            padding: 17px 0px;
            font-family: roboto;
            font-size: 14px;
            /* background-image: -webkit-gradient(linear, 0 0, 0 100%,   from(#4d90fe), to(#4787ed)); */
        }

        .loginmodal-submit:hover {
            /* border: 1px solid #2f5bb7; */
            border: 0px;
            text-shadow: 0 1px rgba(0, 0, 0, 0.3);
            background-color: #357ae8;
            /* background-image: -webkit-gradient(linear, 0 0, 0 100%,   from(#4d90fe), to(#357ae8)); */
        }

        .loginmodal-container a {
            text-decoration: none;
            color: #666;
            font-weight: 400;
            text-align: center;
            display: inline-block;
            opacity: 0.6;
            transition: opacity ease 0.5s;
        }

        .login-help {
            font-size: 12px;
        }

        body {

        }

        #banner {
            border-bottom: none
        }

        .page-header h1 {
            font-size: 4em
        }

        .bs-docs-section {
            margin-top: 8em
        }

        .bs-component {
            position: relative
        }

        .bs-component .modal {
            position: relative;
            top: auto;
            right: auto;
            left: auto;
            bottom: auto;
            z-index: 1;
            display: block
        }

        .bs-component .modal-dialog {
            width: 90%
        }

        .bs-component .popover {
            position: relative;
            display: inline-block;
            width: 220px;
            margin: 20px
        }

        #source-button {
            position: absolute;
            top: 0;
            right: 0;
            z-index: 100;
            font-weight: bold;
            padding: 5px 10px;
        }

        .progress {
            margin-bottom: 10px
        }

        footer {
            margin: 5em 0
        }

        footer li {
            float: left;
            margin-right: 1.5em;
            margin-bottom: 1.5em
        }

        footer p {
            clear: left;
            margin-bottom: 0
        }

        .splash {
            padding: 4em 0 0;
            background-color: #141d27;
            color: #fff;
            text-align: center
        }

        .splash h1 {
            font-size: 4em
        }

        .splash #social {
            margin: 2em 0
        }

        .splash .alert {
            margin: 2em 0
        }

        .section-tout {
            padding: 4em 0 3em;
            border-bottom: 1px solid rgba(0, 0, 0, 0.05);
            background-color: #eaf1f1
        }

        .section-tout .fa {
            margin-right: .5em
        }

        .section-tout p {
            margin-bottom: 3em
        }

        .section-preview {
            padding: 4em 0 4em
        }

        .section-preview .preview {
            margin-bottom: 4em;
            background-color: #eaf1f1
        }

        .section-preview .preview .image {
            position: relative
        }

        .section-preview .preview .image:before {
            box-shadow: inset 0 0 0 1px rgba(0, 0, 0, 0.1);
            position: absolute;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            content: "";
            pointer-events: none
        }

        .section-preview .preview .options {
            padding: 1em 2em 2em;
            border: 1px solid rgba(0, 0, 0, 0.05);
            border-top: none;
            text-align: center
        }

        .section-preview .preview .options p {
            margin-bottom: 2em
        }

        .section-preview .dropdown-menu {
            text-align: left
        }

        .section-preview .lead {
            margin-bottom: 2em
        }

        @media (max-width: 767px) {
            .section-preview .image img {
                width: 100%
            }
        }

        .sponsor {
            text-align: center
        }

        .sponsor a:hover {
            text-decoration: none
        }

        @media (max-width: 767px) {
            #banner {
                margin-bottom: 2em;
                text-align: center
            }
        }

        .infobox .btn-sup {
            color: rgba(0, 0, 0, 0.5);
            font-weight: bold;
            font-size: 15px;
            line-height: 30px;
        }

        .infobox .btn-sup img {
            opacity: 0.5;
            height: 30px;
        }

        .infobox .btn-sup span {
            padding-left: 10px;
            position: relative;
            top: 2px;
        }

        .icons-material .row {
            margin-bottom: 20px;
        }

        .icons-material .col-xs-2 {
            text-align: center;
        }

        .icons-material i {
            font-size: 34pt;
        }

        .icon-preview {
            display: inline-block;
            padding: 10px;
            margin: 10px;
            background: #D5D5D5;
            border-radius: 3px;
            cursor: pointer;
        }

        .icon-preview span {
            display: none;
            position: absolute;
            background: black;
            color: #EEE;
            padding: 5px 8px;
            font-size: 15px;
            border-radius: 2px;
            z-index: 10;
        }

        .icon-preview:hover i {
            color: #4285f4;
        }

        .icon-preview:hover span {
            display: block;
            cursor: text;
        }

        /*.lleo_errorSelection *::-moz-selection,
        .lleo_errorSelection *::selection,
        .lleo_errorSelection *::-webkit-selection {
            background-color: red !important;
            color: #fff !important;;
        }*/

        #lleo_dialog,
        #lleo_dialog * {
            color: #000 !important;
            font: normal 13px Arial, Helvetica !important;
            line-height: 15px !important;
            margin: 0 !important;
            padding: 0 !important;
            background: none !important;
            border: none 0 !important;
            position: static !important;
            vertical-align: baseline !important;
            overflow: visible !important;
            width: auto !important;
            height: auto !important;
            max-width: none !important;
            max-height: none !important;
            float: none !important;
            visibility: visible !important;
            text-align: left !important;
            text-transform: none !important;
            border-collapse: separate !important;
            border-spacing: 2px !important;
            box-sizing: content-box !important;
            box-shadow: none !important;
            opacity: 1 !important;
            text-shadow: none !important;
            letter-spacing: normal !important;
            -webkit-filter: none !important;
            -moz-filter: none !important;
            filter: none !important;
        }

        #lleo_dialog *:before,
        #lleo_dialog *:after {
            content: '';
        }

        #lleo_dialog iframe {
            height: 0 !important;
            width: 0 !important;
        }

        #lleo_dialog {
            position: absolute !important;
            background: #fff !important;
            border: solid 1px #ccc !important;
            padding: 7px 0 0 !important;
            left: -999px;
            top: -999px;
            width: 440px !important;
            overflow: hidden;
            display: block !important;
            z-index: 999999999 !important;
            box-shadow: 8px 16px 30px rgba(0, 0, 0, 0.16) !important;
            border-radius: 3px !important;
            opacity: 0 !important;
            -webkit-transform: translateY(15px);
            -moz-transform: translateY(15px);
            -ms-transform: translateY(15px);
            -o-transform: translateY(15px);
            transform: translateY(15px);
        }

        #lleo_dialog.lleo_show_small {
            width: 150px !important;
        }

        #lleo_dialog.lleo_show {
            opacity: 1 !important;
            -webkit-transform: translateY(0);
            -moz-transform: translateY(0);
            -ms-transform: translateY(0);
            -o-transform: translateY(0);
            transform: translateY(0);
            -webkit-transition: -webkit-transform 0.3s, opacity 0.3s !important;
            -moz-transition: -moz-transform 0.3s, opacity 0.3s !important;
            -ms-transition: -ms-transform 0.3s, opacity 0.3s !important;
            -o-transition: -o-transform 0.3s, opacity 0.3s !important;
            transition: transform 0.3s, opacity 0.3s !important;
        }

        #lleo_dialog.lleo_collapse {
            opacity: 0 !important;
            -webkit-transform: scale(0.25, 0.1) translate(-550px, 100px);
            -moz-transform: scale(0.25, 0.1) translate(-550px, 100px);
            -ms-transform: scale(0.25, 0.1) translate(-550px, 100px);
            -o-transform: scale(0.25, 0.1) translate(-550px, 100px);
            transform: scale(0.25, 0.1) translate(-550px, 100px);
            -webkit-transition: -webkit-transform 0.4s, opacity 0.4s !important;
            -moz-transition: -moz-transform 0.4s, opacity 0.4s !important;
            -ms-transition: -ms-transform 0.4s, opacity 0.4s !important;
            -o-transition: -o-transform 0.4s, opacity 0.4s !important;
            transition: transform 0.4s, opacity 0.4s !important;
        }

        #lleo_dialog input::-webkit-input-placeholder {
            color: #aaa !important;
        }

        #lleo_dialog .lleo_has_pic #lleo_word {
            margin-right: 80px !important;
        }

        #lleo_dialog #lleo_translationsContainer1 {
            position: relative !important;
        }

        #lleo_dialog #lleo_translationsContainer2 {
            padding: 7px 0 0 !important;
            vertical-align: middle !important;
        }

        #lleo_dialog #lleo_word {
            color: #000 !important;
            margin: 0 5px 2px 0 !important;
            /*float: left !important;*/
        }

        #lleo_dialog .lleo_has_sound #lleo_word {
            margin-left: 30px !important;
        }

        #lleo_dialog #lleo_text {
            font-weight: bold !important;
            color: #d56e00 !important;
            text-decoration: none !important;
            cursor: default !important;
        }

        /*
        #lleo_dialog #lleo_text.lleo_known {
            cursor: pointer !important;
            text-decoration: underline !important;
        }
        */
        /*#lleo_dialog #lleo_closeBtn {
            position: absolute !important;
            right: 6px !important;
            top: 5px !important;
            line-height: 1px !important;
            text-decoration: none !important;
            font-weight: bold !important;
            font-size: 0 !important;
            color: #aaa !important;
            display: block !important;
            z-index: 9999999999 !important;
            width: 7px !important;
            height: 7px !important;
            padding: 0 !important;
            margin: 0 !important;
        }*/

        #lleo_dialog #lleo_optionsBtn {
            position: absolute !important;
            right: 3px !important;
            top: 5px !important;
            line-height: 1px !important;
            text-decoration: none !important;
            font-weight: bold !important;
            font-size: 13px !important;
            color: #aaa !important;
            padding: 2px !important;
            display: none;
        }

        #lleo_dialog.lleo_optionsShown #lleo_optionsBtn {
            display: block !important;
        }

        #lleo_dialog #lleo_optionsBtn img {
            width: 12px !important;
            height: 12px !important;
        }

        #lleo_dialog #lleo_sound {
            float: left !important;
            width: 16px !important;
            height: 16px !important;
            margin-left: 9px !important;
            margin-right: 3px !important;
            background: 0 0 no-repeat !important;
            cursor: pointer !important;
            display: none !important;
            background: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAfNJREFUeNq0U01IVFEU/u57Oo5WhBRIBBptykWLYBa2soWiEKQQEbrSFsGbVRQKQc2iFqGitXqvjQxCoCJCqyI0aBUtZILaJNUuYWYWo8HovJ/707nP94bnz0rxwvfOuefd8517fi5TSuE4i50YwZ3l37ZhNlpgzFkaaM/G9sHF1YskNrT+7l4PjMOcb78t2JL71uxgB+2UlfxHTtq5N94fIOh/88kWgWfl73ZCSQkpeGg3H091JY6dI2S00qA/N3KO3dDUYhFgEmZGurG+w9FqApIHsVM7kaTF9Nhn0r8Q7hPWQgIRuNaH3AMUA4W/Lkdh04cpFS43G0TgxQTvCdMETVAk3KynIHwXZU/ge8XDt7KH9bKLjU0P2zVO5LsEpSejVRJ9UR18EtfqKegovs9R3Q6w9c/H1o4Aa2Jwm1lIvn9RJ4w9RdRRzqcYrpwycCll4Cy1lnkS3Bc6vfBg28v8aRIfI78zhB/1GygROH3jLyyzMQ0zlUZuZBSlKkeLoegGtTjYLcJ8pF+NakHOFC2J6w+f25mxSfWrWFF/ShXVPTGvtN14NNkVnxlYWJkgZEL7/vwKr55lKSVnaGYWkuYgrgG172uUv47+U7fw0EHaJXmalUQy/HqO6lBzEsVjJC4Q8kd6TETQpjuaGOvjv8b/AgwA/ij1XMx58NIAAAAASUVORK5CYII=) !important;
        }

        #lleo_dialog .lleo_has_sound #lleo_sound {
            display: block !important;
        }

        #lleo_dialog #lleo_soundWave {
            border: solid 5px #4495CC !important;
            border-radius: 5px !important;
            position: absolute !important;
            left: -5px !important;
            top: -5px !important;
            right: -5px !important;
            bottom: -5px !important;
            z-index: 0 !important;
            opacity: 0.9 !important;
            display: none !important;
        }

        #lleo_dialog #lleo_soundWave.lleo_beforePlaying {
            display: block !important;
        }

        #lleo_dialog #lleo_soundWave.lleo_playing {
            opacity: 0 !important;
            border-width: 20px !important;
            border-radius: 30px !important;

            -webkit-transform: scale(1.07, 1.1) !important;
            -moz-transform: scale(1.07, 1.1) !important;
            -ms-transform: scale(1.07, 1.1) !important;
            transform: scale(1.07, 1.1) !important;

            -webkit-transition: all 0.6s !important;
            -moz-transition: all 0.6s !important;
            -ms-transition: all 0.6s !important;
            transition: all 0.6s !important;
        }

        #lleo_dialog #lleo_picOuter {
            position: absolute !important;
            float: right !important;
            top: 4px;
            right: 5px;
            z-index: 9 !important;
            display: none !important;
            width: 100px !important;
        }

        #lleo_dialog.lleo_optionsShown #lleo_picOuter {
            right: 25px;
        }

        #lleo_dialog .lleo_has_pic #lleo_picOuter {
            display: block !important;
        }

        #lleo_dialog #lleo_picOuter:hover {
            width: auto !important;
            z-index: 11 !important;
        }

        #lleo_dialog #lleo_pic,
        #lleo_dialog #lleo_picBig {
            position: absolute !important;
            top: 0 !important;
            right: 0 !important;
            border: solid 2px #fff !important;
            -webkit-border-radius: 2px !important;
            -moz-border-radius: 2px !important;
            border-radius: 2px !important;
            z-index: 1 !important;
        }

        #lleo_dialog #lleo_pic {
            position: relative !important;
            border: none !important;
            width: 30px !important;
        }

        #lleo_dialog #lleo_picBig {
            box-shadow: -1px 2px 4px rgba(0, 0, 0, 0.3);
            z-index: 2 !important;
            opacity: 0 !important;
            visibility: hidden !important;
        }

        #lleo_dialog #lleo_picOuter:hover #lleo_picBig {
            visibility: visible !important;
            opacity: 1 !important;
            -webkit-transition: opacity 0.3s !important;
            -webkit-transition-delay: 0.3s !important;
        }

        #lleo_dialog #lleo_transcription {
            margin: 0 80px 4px 31px !important;
            color: #aaaaaa !important;
        }

        #lleo_dialog .lleo_no_trans {
            color: #aaa !important;
        }

        #lleo_dialog .ll-translation-counter {
            float: right !important;
            font-size: 11px !important;
            color: #aaa !important;
            padding: 2px 2px 1px 10px !important;
        }

        #lleo_dialog .ll-translation-text {
            float: left !important;
            /*width: 80% !important;*/
        }

        #lleo_dialog #lleo_trans a {
            color: #3F669F !important;
            text-decoration: none !important;
            text-overflow: ellipsis !important;
            padding: 1px 4px !important;
            overflow: hidden !important;
            float: left !important;
            width: 320px !important;
        }

        #lleo_dialog .ll-translation-item {
            color: #3F669F !important;
            border: solid 1px #fff !important;
            padding: 3px !important;
            width: 100% !important;
            float: left !important;
            -moz-border-radius: 2px !important;
            -webkit-border-radius: 2px !important;
            border-radius: 2px !important;
        }

        #lleo_dialog .ll-translation-item:hover {
            border: solid 1px #9FC2C9 !important;
            background: #EDF4F6 !important;
            cursor: pointer !important;
        }

        #lleo_dialog .ll-translation-item:hover .ll-translation-counter {
            color: #83a0a6 !important;
        }

        #lleo_dialog .ll-translation-marker {
            background: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAQAAAAECAYAAACp8Z5+AAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAAAJcEhZcwAADsQAAA7EAZUrDhsAAAAWSURBVBhXY7RPm/+fAQkwIXNAbMICAJQ8AkvqWg/SAAAAAElFTkSuQmCC) !important;
            display: inline-block !important;
            width: 4px !important;
            height: 4px !important;
            margin: 7px 5px 2px 2px !important;
            float: left !important;
        }

        #lleo_dialog #lleo_icons {
            color: #aaa !important;
            font-size: 11px !important;
            background: #f8f8f8 !important;
            padding: 10px 10px 10px 16px !important;
        }

        #lleo_icons a {
            display: inline-block !important;
            width: 16px !important;
            height: 16px !important;
            margin: 0 10px -4px 3px !important;
            text-decoration: none !important;
            opacity: 0.5 !important;
            background: url(data:image/png;base64,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) !important;
        }

        #lleo_icons a:hover {
            opacity: 1 !important;
        }

        #lleo_icons a.lleo_google {
            background-position: -34px 0 !important;
        }

        #lleo_icons a.lleo_multitran {
            background-position: -64px 0 !important;
        }

        #lleo_icons a.lleo_lingvo {
            background-position: -51px 0 !important;
            width: 12px !important;
        }

        #lleo_icons a.lleo_dict {
            background-position: -17px 0 !important;
        }

        #lleo_icons a.lleo_linguee {
            background-position: -81px 0 !important;
        }

        #lleo_icons a.lleo_michaelis {
            background-position: -98px 0 !important;
        }

        #lleo_dialog #lleo_contextContainer {
            margin: 0 !important;
            padding: 3px 15px 8px 10px !important;
            background: #eee !important;
            background: -webkit-gradient(linear, left top, left bottom, from(#fff), to(#eee)) !important;
            background: -moz-linear-gradient(-90deg, #fff, #eee) !important;
            border-bottom: solid 1px #ddd !important;
            border-top-left-radius: 3px !important;
            border-top-right-radius: 3px !important;
            display: none !important;
            overflow: hidden !important;
        }

        #lleo_dialog .lleo_has_context #lleo_contextContainer {
            display: block !important;
        }

        #lleo_dialog #lleo_context {
            color: #444 !important;
            text-shadow: 1px 1px 0 #f4f4f4 !important;
            line-height: 12px !important;
            font-size: 11px !important;
            margin-left: 2px !important;
        }

        #lleo_dialog #lleo_context b {
            line-height: 12px !important;
            color: #000 !important;
            font-weight: bold !important;
            font-size: 11px !important;
        }

        /*#lleo_dialog #lleo_gBrand {
            color: #aaa !important;
            font-size: 10px !important;
            *//*padding-right: 52px !important;*//*
            padding-bottom: 14px !important;
            margin: -3px 4px 0 4px !important;
            background: left bottom url(data:image/png;base64,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) no-repeat !important;
            display: inline-block !important;
            float: right !important;
        }
        #lleo_dialog #lleo_gBrand.hidden {
            display: none !important;
        }*/
        #lleo_dialog #lleo_translateContextLink {
            color: #444 !important;
            text-shadow: 1px 1px 0 #f4f4f4 !important;
            background: -webkit-gradient(linear, left top, left bottom, from(#f4f4f4), to(#ddd)) !important;
            background: -moz-linear-gradient(-90deg, #f4f4f4, #ddd) !important;
            border: solid 1px !important;
            box-shadow: 1px 1px 0 #f6f6f6 !important;
            border-color: #999 #aaa #aaa #999 !important;
            -moz-border-radius: 2px !important;
            -webkit-border-radius: 2px !important;
            border-radius: 2px !important;
            padding: 0 3px !important;
            font-size: 11px !important;
            text-decoration: none !important;
            margin: 1px 5px 0 !important;
            display: inline-block !important;
            white-space: nowrap !important;
        }

        #lleo_dialog #lleo_translateContextLink:hover {
            background: #f8f8f8 !important;
        }

        #lleo_dialog #lleo_translateContextLink.hidden {
            visibility: hidden !important;
        }

        #lleo_dialog #lleo_setTransForm {
            display: block !important;
            margin-top: 3px !important;
            padding-top: 5px !important;
            /* Set position and background because the form might be overlapped by an image when no translations */
            position: relative !important;
            background: #fff !important;
            z-index: 10 !important;
            padding-bottom: 10px !important;
            padding-left: 16px !important;
        }

        #lleo_dialog .lleo-custom-translation {
            padding: 4px 5px !important;
            border: solid 1px #ddd !important;
            border-radius: 2px !important;
            width: 90% !important;
            min-width: 270px !important;
            background: -webkit-gradient(linear, 0 0, 0 20, from(#f1f1f1), to(#fff)) !important;
            background: -moz-linear-gradient(-90deg, #f1f1f1, #fff) !important;
            font: normal 13px Arial, Helvetica !important;
            line-height: 15px !important;
        }

        #lleo_dialog .lleo-custom-translation:hover {
            border: solid 1px #aaa !important;
        }

        #lleo_dialog .lleo-custom-translation:focus {
            background: #FFFEC9 !important;
        }

        #lleo_dialog *.hidden {
            display: none !important;
        }

        #lleo_dialog .infinitive {
            color: #D56E00 !important;
            text-decoration: none;
            border-bottom: 1px dotted #D56E00 !important;
        }

        #lleo_dialog .infinitive:hover {
            border: none !important;
        }

        #lleo_dialog .lleo_separator {
            height: 1px !important;
            background: #eee;
            margin-top: 10px !important;
            background: -webkit-linear-gradient(left, rgba(255, 255, 255, 1) 0%, #eee 8%, rgba(255, 255, 255, 1) 80%) !important;
            background: -moz-linear-gradient(left, rgba(255, 255, 255, 1) 0%, #eee 8%, rgba(255, 255, 255, 1) 80%) !important;
            background: -ms-linear-gradient(left, rgba(255, 255, 255, 1) 0%, #eee 8%, rgba(255, 255, 255, 1) 80%) !important;
            background: linear-gradient(to right, rgba(255, 255, 255, 1) 0%, #eee 8%, rgba(255, 255, 255, 1) 80%) !important;
        }

        #lleo_dialog #lleo_trans {
            /*border-top: 1px solid #eeeeee !important;*/
            padding: 5px 30px 0 14px !important;
            zoom: 1;
        }

        #lleo_dialog .lleo_clearfix {
            display: block !important;
            clear: both !important;
            visibility: hidden !important;
            height: 0 !important;
            font-size: 0 !important;
        }

        #lleo_dialog #lleo_picOuter table {
            width: 44px !important;
            position: absolute !important;
            right: 0 !important;
            top: 0 !important;
            vertical-align: middle !important;
        }

        #lleo_dialog #lleo_picOuter td {
            width: 38px !important;
            height: 38px !important;
            /*border: 1px solid #eeeeee !important;*/
            vertical-align: middle !important;
            text-align: center !important;
        }

        #lleo_dialog #lleo_picOuter td div {
            height: 38px !important;
            overflow: hidden !important;
        }

        #lleo_dialog .lleo_empty {
            margin: 0 5px 7px !important;
        }

        #lleo_youtubeExportBtn {
            margin-left: 10px;
            height: 24px;
        }

        #lleo_youtubeExportBtn i {
            display: inline-block;
            width: 16px;
            height: 16px;
            background: 0 0 url(https://d144fqpiyasmrr.cloudfront.net/plugins/all/images/i16.png) !important;
        }

        #lleo_youtubeExportBtn .yt-uix-button-content {
            font-size: 12px;
            line-height: 2px;
        }

        /*** Parsed Lyrics Content *****************************/

        /*.lleo_lyrics tran {*/
        /*background: transparent !important;*/
        /*border-radius: 2px !important;*/
        /*text-shadow: none !important;*/
        /*cursor: pointer !important;*/
        /*}*/

        /*.lleo_lyrics tran:hover {*/
        /*color: #fff !important;*/
        /*background: #C77213 !important;*/
        /*-webkit-transition: all 0.1s !important;*/
        /*-moz-transition: all 0.1s !important;*/
        /*-ms-transition: all 0.1s !important;*/
        /*-o-transition: all 0.1s !important;*/
        /*transition: all 0.1s !important;*/
        /*}*/

        .lleo_songName {
            border: solid 1px #ffd47c;
            background: #fff1c2;
            border-radius: 2px;
        }

        .lleo_hidden_iframe {
            visibility: hidden;
        }
    </style>

    <!-- [if lt IE 9]>
    <script src="../../assets/js/html5shiv.js/"></script>
    <script src="../../assets/js/respond.min.js/"></script>
    <![endif]-->
</head>
<body>
<!--<a href="#" data-toggle="modal" data-target="#login-modal">Login</a>-->
<%--<div class="modal fade" id="login-modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"--%>
     <%--style="display: none;">--%>
    <%--<div class="modal-dialog">--%>
        <%--<div class="loginmodal-container">--%>
            <%--<h1>Login to Your Account</h1><br>--%>
            <%--<form action="<c:url value='j_spring_security_check' />" method="POST">--%>
                <%--<input type="text" name="j_username" placeholder="Username">--%>
                <%--<input type="password" name="j_password" placeholder="Password">--%>
                <%--<input type="submit" name="login" class="login loginmodal-submit" value="Login">--%>
            <%--</form>--%>

            <%--<div class="login-help">--%>
                <%--<a href="<c:url value='registration' />">Register</a> - <a href="#">Forgot Password</a>--%>
            <%--</div>--%>
        <%--</div>--%>
    <%--</div>--%>
<%--</div>--%>


<div class="modal fade" id="login-modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"
     style="display: none;">
    <div class="modal-dialog">
        <div class="bs-component">
            <div class="loginmodal-container">
                <ul class="nav nav-tabs" style="margin-bottom: 15px;">
                    <li class=""><a href="#login" data-toggle="tab" aria-expanded="false" id="defaultOpen#1"
                                    onclick="openCity(event, 'London')">Login
                        <div class="ripple-container"></div>
                    </a></li>
                    <li class=""><a href="#registration" data-toggle="tab" aria-expanded="false">Registration
                        <div class="ripple-container"></div>
                    </a></li>
                </ul>
                <div id="login_registration" class="tab-content">
                    <div id="login" class="tab-pane fade">

                        <h1>Login to Your Account</h1><br>
                        <form action="<c:url value='j_spring_security_check' />" method="POST">
                            <input type="text" name="j_username" placeholder="Username">
                            <input type="password" name="j_password" placeholder="Password">
                            <input type="submit" name="login" class="login loginmodal-submit" value="Login">
                        </form>

                        <div class="login-help">
                            <a href="#">Forgot Password</a>
                        </div>
                    </div>

                    <div id="registration" class="tab-pane fade">
                        <h1>Make an account</h1><br>
                        <%----%>
                        <%--<form:form action="" method="post" modelAttribute="user">--%>

                            <%--<legend class="text-center">Registration</legend>--%>

                            <%--<fieldset class="text-center">--%>
                                <%--<div class="row text-left col-md-6" style="margin-left: 24%">--%>
                                        <%--&lt;%&ndash;<div class="form-group">&ndash;%&gt;--%>
                                        <%--&lt;%&ndash;<label for="first_name">First name</label>&ndash;%&gt;--%>
                                        <%--&lt;%&ndash;<input type="text" class="form-control" name="" id="first_name"&ndash;%&gt;--%>
                                        <%--&lt;%&ndash;placeholder="First Name">&ndash;%&gt;--%>
                                        <%--&lt;%&ndash;</div>&ndash;%&gt;--%>

                                    <%--<div class="form-group">--%>
                                        <%--<form:label for="name" path="name">Full Name:</form:label>--%>
                                        <%--<form:errors path="name"/>--%>
                                        <%--<form:input cssClass="form-control" id="name" placeholder="Full Name"--%>
                                                    <%--path="name"/>--%>
                                    <%--</div>--%>

                                    <%--<div class="form-group">--%>
                                        <%--<label for="email">Email</label>--%>
                                        <%--<form:errors path="email"/>--%>
                                        <%--<form:input cssClass="form-control" id="email" placeholder="Email"--%>
                                                    <%--path="email"/>--%>
                                    <%--</div>--%>

                                    <%--<div class="form-group">--%>
                                        <%--<label for="password">Password</label>--%>
                                        <%--<form:errors path="password"/>--%>
                                        <%--<form:password cssClass="form-control" id="password" placeholder="Password"--%>
                                                       <%--path="password"/>--%>
                                    <%--</div>--%>

                                    <%--<div class="form-group">--%>
                                        <%--<label for="password">Confirm Password</label>--%>
                                        <%--<form:errors path="passwordConfirm"/>--%>
                                        <%--<form:password cssClass="form-control" id="confirm_password"--%>
                                                       <%--placeholder="Confirm Password" path="passwordConfirm"/>--%>
                                    <%--</div>--%>

                                <%--</div>--%>
                            <%--</fieldset>--%>

                            <%--<div class="form-group">--%>
                                <%--<div class="col-md-12">--%>
                                    <%--<div class="checkbox">--%>
                                        <%--<label>--%>
                                            <%--<input type="checkbox" value="" id="">--%>
                                            <%--I accept the <a href="#">terms and conditions</a>.--%>
                                        <%--</label>--%>
                                    <%--</div>--%>
                                <%--</div>--%>
                            <%--</div>--%>

                            <%--<div class="form-group">--%>
                                <%--<div class="col-md-12">--%>
                                    <%--<button type="submit" class="btn btn-primary">--%>
                                        <%--Register--%>
                                    <%--</button>--%>
                                    <%--<a href="#">Already have an account?</a>--%>
                                <%--</div>--%>
                            <%--</div>--%>
                        <%--</form:form>--%>
                        <%----%>
                        <div class="login-help">
                            <a href="#">Forgot Password</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>


<div class="col-md-12 top-menu">
    <div class="navbar-collapse collapse navbar-inverse navbar-inverse-collapse">
        <ul class="nav navbar-nav">
            <li class="active"><a href="#">Testing system</a></li>
            <li><a href="<c:url value='http://edu-netcracker.com/' />">NetCracker</a></li>
            <li class="dropdown">
                <a href="bootstrap-elements.html" data-target="#" class="dropdown-toggle"
                   data-toggle="dropdown">Courses
                    <b class="caret"></b></a>
                <ul class="dropdown-menu">
                    <li><a href="<c:url value='student/courses' />">All courses</a></li>
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
                            <form class="navbar-form" action="${contextPath}/login">
                                <a href="#ModalSign" class="btn btn-raised btn-sm btn-success"
                                   data-toggle="modal" data-target="#login-modal">Sign in</a>
                            </form>

                        </li>
                    </c:if>
                    <c:if test="${pageContext.request.userPrincipal.name != null}">
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
                            <form class="navbar-form " action="${contextPath}/logout">
                                <a href="<c:url value="j_spring_security_logout" />">Log out</a>
                                    <%--<a href="<c:url value="j_spring_security_logout" />"--%>
                                    <%--class="btn btn-raised btn-sm btn-success"--%>
                                    <%--data-toggle="modal">Log out</a>--%>
                            </form>
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
                    <form:form action="" method="put" modelAttribute="userGrid">
                        <c:forEach var="user" items="${userGrid}">
                            <th>${user.id}</th>
                            <th>${user.name}</th>
                            <th>${user.score}</th>
                        </c:forEach>
                    </form:form>
                    <form:form action="" method="put" modelAttribute="userGrid">
                        <table>
                            <thead>
                            <tr>
                                <th>Name</th>
                                <th>Password</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach var="user" items="${userGrid}">
                                <tr>
                                    <td>
                                            ${user.name}
                                    </td>
                                    <td>
                                            ${user.password}
                                    </td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </form:form>
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
    document.getElementById("defaultOpen#1").click();
</script>
<script src="js/bootstrap.min.js"></script>
<script>
    $(document).ready(function () {
        $('#found_site').on('change', function () {
            $(this).val() == "other" ? $('#specify').closest('.form-group').show() : $('#specify').closest('.form-group').hide();
        })
    })
</script>

</body>
</html>