<!DOCTYPE html>
<html>
<head>

    <!-- Title -->
    <title>Haptic Sales Dashboard</title>

    <meta name="viewport" content="width=device-width, initial-scale=0.6, maximum-scale=1.0, user-scalable=0">
    <meta content="width=device-width, initial-scale=1" name="viewport"/>
    <meta charset="UTF-8">
    <meta name="description" content="Admin Dashboard Template" />
    <meta name="keywords" content="admin,dashboard" />
    <meta name="author" content="Steelcoders" />

    <!-- Metronic Styles - Timeline + Portlets -->
    <asset:stylesheet src="metronic/bootstrap-fileinput/bootstrap-fileinput.css"/>
    <link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&subset=all" rel="stylesheet" type="text/css" />
    <!-- <link href="../assets/global/plugins/bootstrap-switch/css/bootstrap-switch.min.css" rel="stylesheet" type="text/css" />-->




    <!-- Menu & Frame Styles -->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,600' rel='stylesheet' type='text/css'>
    <asset:stylesheet src="plugins/pace-master/themes/blue/pace-theme-flash.css"/>
    <asset:stylesheet src="plugins/uniform/css/uniform.default.min.css"/>
    <asset:stylesheet src="plugins/bootstrap/css/bootstrap.min.css"/>
    <asset:stylesheet src="plugins/fontawesome/css/font-awesome.css"/>
    <asset:stylesheet src="plugins/line-icons/simple-line-icons.css"/>
    <asset:stylesheet src="plugins/offcanvasmenueffects/css/menu_cornerbox.css"/>
    <asset:stylesheet src="plugins/waves/waves.min.css"/>
    <asset:stylesheet src="plugins/switchery/switchery.min.css"/>
    <asset:stylesheet src="plugins/3d-bold-navigation/css/style.css"/>
    <asset:stylesheet src="plugins/slidepushmenus/css/component.css"/>

    <!-- Form Style -->
    <asset:stylesheet src="plugins/x-editable/bootstrap3-editable/css/bootstrap-editable.css"/>
    <asset:stylesheet src="plugins/x-editable/inputs-ext/typeaheadjs/lib/typeahead.js-bootstrap.css"/>
    <asset:stylesheet src="plugins/x-editable/inputs-ext/address/address.css"/>
    <asset:stylesheet src="plugins/select2-3.4.8/select2.css"/>
    <asset:stylesheet src="plugins/bootstrap-datetimepicker/css/bootstrap-datetimepicker.min.css"/>
    <asset:stylesheet src="plugins/metronic/plugins/bootstrap-switch/css/bootstrap-switch.css"/>

    <!-- BEGIN THEME GLOBAL STYLES -->
    <asset:stylesheet src="metronic/components-md.css" />

    <asset:stylesheet src="metronic/plugins.min.css" />
    <!-- END THEME GLOBAL STYLES -->
    <!-- BEGIN PAGE LEVEL STYLES -->
    <asset:stylesheet src="metronic/profile.min.css"/>

    <!-- END PAGE LEVEL STYLES -->
    <!-- BEGIN THEME LAYOUT STYLES -->
    <asset:stylesheet src="metronic/themes/blue.min.css" />

    <!-- Theme Styles -->
    <asset:stylesheet src="modern.css"/>
    <asset:stylesheet src="themes/green.css"/>
    <asset:stylesheet src="custom.css"/>

    <!-- Nav Styles -->
    <asset:javascript src="/plugins/3d-bold-navigation/js/modernizr.js" />
    <asset:javascript src="/plugins/offcanvasmenueffects/js/snap.svg-min.js"/>


</head>
<body class="page-header-fixed page-sidebar-fixed">
<div class="overlay"></div>
<div class="menu-wrap">
    <nav class="profile-menu">
        <div class="profile"><img src="${assetPath(src: 'profile-menu-image.png')}" width="60" alt="David Green"/><span>David Green</span></div>
        <div class="profile-menu-list">
            <a href="#"><i class="fa fa-star"></i><span>Favorites</span></a>
            <a href="#"><i class="fa fa-bell"></i><span>Alerts</span></a>
            <a href="#"><i class="fa fa-envelope"></i><span>Messages</span></a>
            <a href="#"><i class="fa fa-comment"></i><span>Comments</span></a>
        </div>
    </nav>
    <button class="close-button" id="close-button">Close Menu</button>
</div>
<form class="search-form" action="#" method="GET">
    <div class="input-group">
        <input type="text" name="search" class="form-control search-input" placeholder="Search...">
        <span class="input-group-btn">
            <button class="btn btn-default close-search waves-effect waves-button waves-classic" type="button"><i class="fa fa-times"></i></button>
        </span>
    </div><!-- Input Group -->
</form><!-- Search Form -->
<main class="page-content content-wrap">
    <div class="navbar">
        <div class="navbar-inner">
            <div class="sidebar-pusher ">
                <a href="javascript:void(0);" class="waves-effect waves-button waves-classic push-sidebar">
                    <i class="fa fa-bars "></i>
                </a>
            </div>
            <div class="logo-box">
                <a href="index.html" class="logo-text"><span>Haptic AI</span></a>
            </div><!-- Logo Box -->
            <div class="search-button">
                <a href="javascript:void(0);" class="waves-effect waves-button waves-classic show-search"><i class="fa fa-search"></i></a>
            </div>
            <div class="topmenu-outer">
                <div class="top-menu">
                    <ul class="nav navbar-nav navbar-left">
                        <li>
                            <a href="javascript:void(0);" class="waves-effect waves-button waves-classic sidebar-toggle" id="menu-toggle-link"><i class="fa fa-bars" id="menu-toggle-icon"></i></a>
                        </li>
                        <li>
                            <a href="#cd-nav" class="waves-effect waves-button waves-classic cd-nav-trigger"><i class="fa fa-diamond"></i></a>
                        </li>
                        <li>
                            <a href="javascript:void(0);" class="waves-effect waves-button waves-classic toggle-fullscreen"><i class="fa fa-expand"></i></a>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle waves-effect waves-button waves-classic" data-toggle="dropdown">
                                <i class="fa fa-cogs"></i>
                            </a>
                            <ul class="dropdown-menu dropdown-md dropdown-list theme-settings" role="menu">
                                <li class="li-group">
                                    <ul class="list-unstyled">
                                        <li class="no-link" role="presentation">
                                            Auto-open Next Field
                                            <div class="ios-switch pull-right switch-md">
                                                <input type="checkbox" id="autoopen" class="js-switch pull-right fixed-header-check" checked>
                                            </div>
                                        </li>
                                        <li class="no-link" role="presentation">
                                            Enable Form Editing
                                            <div class="ios-switch pull-right switch-md">
                                                <div id="enable"><input type="checkbox"  class="js-switch pull-right fixed-header-check" checked></div>
                                            </div>
                                        </li>
                                    </ul>
                                </li>





                                </li>
                                <li class="li-group">
                                    <ul class="list-unstyled">
                                        <li class="no-link" role="presentation">
                                            Fixed Sidebar
                                            <div class="ios-switch pull-right switch-md">
                                                <input type="checkbox" class="js-switch pull-right fixed-sidebar-check" checked disabled>
                                            </div>
                                        </li>
                                        <li class="no-link" role="presentation">
                                            Horizontal bar
                                            <div class="ios-switch pull-right switch-md">
                                                <input type="checkbox" class="js-switch pull-right horizontal-bar-check" disabled>
                                            </div>
                                        </li>
                                        <li class="no-link" role="presentation">
                                            Toggle Sidebar
                                            <div class="ios-switch pull-right switch-md">
                                                <input type="checkbox" class="js-switch pull-right toggle-sidebar-check" disabled>
                                            </div>
                                        </li>
                                        <li class="no-link" role="presentation">
                                            Compact Menu
                                            <div class="ios-switch pull-right switch-md">
                                                <input type="checkbox" class="js-switch pull-right compact-menu-check" disabled>
                                            </div>
                                        </li>
                                        <li class="no-link" role="presentation">
                                            Hover Menu
                                            <div class="ios-switch pull-right switch-md">
                                                <input type="checkbox" class="js-switch pull-right hover-menu-check" disabled>
                                            </div>
                                        </li>
                                    </ul>
                                </li>
                                <li class="li-group">
                                    <ul class="list-unstyled">
                                        <li class="no-link" role="presentation">
                                            Boxed Layout
                                            <div class="ios-switch pull-right switch-md">
                                                <input type="checkbox" class="js-switch pull-right boxed-layout-check" disabled>
                                            </div>
                                        </li>
                                    </ul>
                                </li>
                                <li class="li-group">
                                    <ul class="list-unstyled">
                                        <li class="no-link" role="presentation">
                                            Choose Theme Color
                                            <div class="color-switcher">
                                                <a class="colorbox color-blue" href="?theme=blue" title="Blue Theme" data-css="blue"></a>
                                                <a class="colorbox color-green" href="?theme=green" title="Green Theme" data-css="green"></a>
                                                <a class="colorbox color-red" href="?theme=red" title="Red Theme" data-css="red"></a>
                                                <a class="colorbox color-white" href="?theme=white" title="White Theme" data-css="white"></a>
                                                <a class="colorbox color-purple" href="?theme=purple" title="purple Theme" data-css="purple"></a>
                                                <a class="colorbox color-dark" href="?theme=dark" title="Dark Theme" data-css="dark"></a>
                                            </div>
                                        </li>
                                    </ul>
                                </li>
                                <li class="no-link"><button class="btn btn-default reset-options">Reset Options</button></li>
                            </ul>
                        </li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li>
                            <a href="javascript:void(0);" class="waves-effect waves-button waves-classic show-search"><i class="fa fa-search"></i></a>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle waves-effect waves-button waves-classic" data-toggle="dropdown"><i class="fa fa-envelope"></i><span class="badge badge-success pull-right">1</span></a>
                            <ul class="dropdown-menu title-caret dropdown-lg" role="menu">
                                <li><p class="drop-title">You have 1 new  messages !</p></li>
                                <li class="dropdown-menu-list slimscroll messages">
                                    <ul class="list-unstyled">
                                        <li>
                                            <a href="#">
                                                <div class="msg-img"><div class="online on"></div><img class="img-circle" src="${assetPath(src: 'avatar2.png')}" alt=""></div>
                                                avatar2.png
                                                <p class="msg-name">Sandra Smith</p>
                                                <p class="msg-text">Hey ! I'm working on your project</p>
                                                <p class="msg-time">3 minutes ago</p>
                                            </a>
                                        </li>
                                    </ul>
                                </li>
                                <li class="drop-all"><a href="#" class="text-center">All Messages</a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle waves-effect waves-button waves-classic" data-toggle="dropdown"><i class="fa fa-bell"></i><span class="badge badge-success pull-right">3</span></a>
                            <ul class="dropdown-menu title-caret dropdown-lg" role="menu">
                                <li><p class="drop-title">You have 3 pending tasks !</p></li>
                                <li class="dropdown-menu-list slimscroll tasks">
                                    <ul class="list-unstyled">
                                        <li>
                                            <a href="#">
                                                <div class="task-icon badge badge-success"><i class="icon-user"></i></div>
                                                <span class="badge badge-roundless badge-default pull-right">in 1min</span>
                                                <p class="task-details">New user registered.</p>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="#">
                                                <div class="task-icon badge badge-danger"><i class="icon-energy"></i></div>
                                                <span class="badge badge-roundless badge-default pull-right">in 24min</span>
                                                <p class="task-details">Database error.</p>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="#">
                                                <div class="task-icon badge badge-info"><i class="icon-heart"></i></div>
                                                <span class="badge badge-roundless badge-default pull-right">in 1h</span>
                                                <p class="task-details">Reached 24k likes</p>
                                            </a>
                                        </li>
                                    </ul>
                                </li>
                                <li class="drop-all"><a href="#" class="text-center">All Tasks</a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle waves-effect waves-button waves-classic" data-toggle="dropdown">
                                <span class="user-name">Devon<i class="fa fa-angle-down"></i></span>
                                <!-- AVATAR -->
                                <!--<img class="img-circle avatar" src="assets/images/avatar1.png" width="40" height="40" alt="">-->
                            </a>
                            <ul class="dropdown-menu dropdown-list" role="menu">
                                <li role="presentation"><a href="profile.html"><i class="fa fa-user"></i>Profile</a></li>
                                <li role="presentation"><a href="calendar.html"><i class="fa fa-calendar"></i>Calendar</a></li>
                                <li role="presentation"><a href="inbox.html"><i class="fa fa-envelope"></i>Inbox<span class="badge badge-success pull-right">4</span></a></li>
                                <li role="presentation" class="divider"></li>
                                <li role="presentation"><a href="lock-screen.html"><i class="fa fa-lock"></i>Lock screen</a></li>
                                <li role="presentation"><a href="login.html"><i class="fa fa-sign-out m-r-xs"></i>Log out</a></li>
                            </ul>
                        </li>
                        <li>
                            <a href="login.html" class="log-out waves-effect waves-button waves-classic">
                                <span><i class="fa fa-sign-out m-r-xs"></i>Log out</span>
                            </a>
                        </li>
                    </ul><!-- Nav -->
                </div><!-- Top Menu -->
            </div>
        </div>
    </div>
    <!-- Navbar -->
    <div class="page-sidebar sidebar" id="dashboard-sidebar">
        <div class="page-sidebar-inner slimscroll">
            <div class="prospect-list-padding">
                <ul class="menu accordion-menu display-block">
                    <li>
                        <a href="#">
                            <div class="prospect-list">
                                <div class="col-xs-8 prospect-label-wrapper">
                                    <p class="secondary-label">Product Manager</p>
                                    <p class="primary-label f-gray">Microsoft</p>
                                </div>
                                <div class="col-xs-4 vertical-align padding-0-l-i">
                                    <p class="expected-value">$3,043</p>
                                </div>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <div class="prospect-list">
                                <div class="col-xs-8 prospect-label-wrapper">
                                    <p class="secondary-label">CEO</p>
                                    <p class="primary-label f-gray">Proctor & Gambel</p>
                                </div>
                                <div class="col-xs-4 vertical-align">
                                    <p class="expected-value">$943</p>
                                </div>
                            </div>
                        </a>
                    </li>
                </ul>
            </div>
            <div class="sidebar-profile padding-10" id="header-content">
                <a href="javascript:void(0);" id="profile-menu-link">
                    <div id="prospect-list-quick-settings">
                        <span><i class="fa fa-cog"></i></span>
                    </div>
                </a>
            </div>
        </div><!-- Page Sidebar Inner -->
    </div><!-- Page Sidebar -->
    <div class="page-inner">

        <!-- KPI's & Rankings -->
        <div class="page-title pre-scrollable">

            <!-- XL Screens -->
            <div class="flex-row" id="xlarge-screen-kpis">
                <!-- Pie Chart Container -->
                <div class="kpi-panel-big panel panel-default">
                    <div class="kpi-heading panel-heading ">KPI Set #1</div>
                    <div class="panel-body padding-0-i">
                        <div class="row-fluid">
                            <div class="col-xs-3 padding-0">
                                <div class="chart-sm">
                                    <div class="js-pie-chart pie-chart" data-percent="80" data-line-width="3" data-size="75" data-bar-color="#abe37d" data-track-color="#eeeeee" data-scale-color="#dddddd">
                                        <span>8 <br><small class="text-muted">/100</small></span>
                                    </div>
                                </div>
                                <h4 class="kpi-label">KPI #1a</h4>
                            </div>
                            <div class="col-xs-3 padding-0">
                                <div class="chart-sm">
                                    <div class="js-pie-chart pie-chart" data-percent="80" data-line-width="3" data-size="75" data-bar-color="#abe37d" data-track-color="#eeeeee" data-scale-color="#dddddd">
                                        <span>8 <br><small class="text-muted">/100</small></span>
                                    </div>
                                </div>
                                <h4 class="kpi-label">KPI #1b</h4>
                            </div>
                            <div class="col-xs-3 padding-0">
                                <div class="chart-sm">
                                    <div class="js-pie-chart pie-chart" data-percent="80" data-line-width="3" data-size="75" data-bar-color="#abe37d" data-track-color="#eeeeee" data-scale-color="#dddddd">
                                        <span>8 <br><small class="text-muted">/100</small></span>
                                    </div>
                                </div>
                                <h4 class="kpi-label">KPI #1c</h4>
                            </div>
                            <div class="col-xs-3 padding-0">
                                <div class="chart-sm">
                                    <div class="js-pie-chart pie-chart" data-percent="80" data-line-width="3" data-size="75" data-bar-color="#abe37d" data-track-color="#eeeeee" data-scale-color="#dddddd">
                                        <span>8 <br><small class="text-muted">/100</small></span>
                                    </div>
                                </div>
                                <h4 class="kpi-label">KPI #1d</h4>
                            </div>
                        </div>
                    </div>
                </div>


                <div class="kpi-panel-invisible">
                    <div class="row">
                        <div class="col-xs-4 no-padding-i">
                            <!-- Pie Chart Container -->
                            <div class="kpi-panel">
                                <div class="chart">
                                    <span class="kpi-2 pie-chart" data-percent="66" data-scale-color="#ffb400" data-size="95">
                                        <span class="kpi-2-value">%</span>
                                    </span>
                                </div>
                            <h4 class="kpi-label js_update_2 solo-label">KPI #2</h4>
                            </div>
                        </div>
                        <div class="col-xs-4 no-padding-i">
                            <!-- Pie Chart Container -->
                            <div class="kpi-panel">
                            <div class="chart">
                                <span class="pie-chart kpi-3" data-percent="33" data-line-width="3" data-size="95" data-bar-color="#abe37d" data-track-color="#eeeeee" data-scale-color="#dddddd">
                                    <span class="kpi-3-value">%</span>
                                </span>
                            </div>
                            <h4 class="kpi-label js_update_3 solo-label">KPI #3</h4>
                            </div>
                        </div>
                        <div class="col-xs-4 no-padding-i">
                            <!-- Pie Chart Container -->
                            <div class="kpi-panel">
                                <div class="chart">
                                    <span class="kpi-4 pie-chart" data-percent="66"  data-size="95">
                                        <span class="kpi-4-value">%</span>
                                    </span>
                                </div>
                                <h4 class="kpi-label js_update_4 solo-label">KPI #4</h4>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="level-panel">
                    <span class="level-label"><h4 class="user-level">L<small>vl.</small></h4></span>
                    <span class="level-number"><h4 class="user-level-number">10</h4></span>
                    <div class="progress">
                        <div class="progress-bar progress-bar-striped active level-progress-bar" role="progressbar" aria-valuenow="45" aria-valuemin="0" aria-valuemax="100" style="width: 45%">
                            <span class="sr-only">45% Complete</span>
                        </div>
                    </div>
                </div>
            </div>


            <!-- Standard Screens -->
            <div class="enable-page-title-scroll">
                <div class="flex-row-around" id="large-screen-kpis">
                    <!-- Pie Chart Container -->
                    <div class="kpi-panel-big panel panel-default">
                        <div class="kpi-heading panel-heading ">KPI Set #1</div>
                        <div class="panel-body padding-0-i">

                            <div class="row-fluid">
                                <div class="col-xs-3 padding-0">
                                    <div class="chart-sm">
                                        <div class="js-pie-chart pie-chart" data-percent="80" data-line-width="3" data-size="75" data-bar-color="#abe37d" data-track-color="#eeeeee" data-scale-color="#dddddd">
                                            <span>8 <br><small class="text-muted">/100</small></span>
                                        </div>
                                    </div>
                                    <h4 class="kpi-label">KPI #1a</h4>
                                </div>
                                <div class="col-xs-3 padding-0">
                                    <div class="chart-sm">
                                        <div class="js-pie-chart pie-chart" data-percent="80" data-line-width="3" data-size="75" data-bar-color="#abe37d" data-track-color="#eeeeee" data-scale-color="#dddddd">
                                            <span>8 <br><small class="text-muted">/100</small></span>
                                        </div>
                                    </div>
                                    <h4 class="kpi-label">KPI #1b</h4>
                                </div>
                                <div class="col-xs-3 padding-0">
                                    <div class="chart-sm">
                                        <div class="js-pie-chart pie-chart" data-percent="80" data-line-width="3" data-size="75" data-bar-color="#abe37d" data-track-color="#eeeeee" data-scale-color="#dddddd">
                                            <span>8 <br><small class="text-muted">/100</small></span>
                                        </div>
                                    </div>
                                    <h4 class="kpi-label">KPI #1c</h4>
                                </div>
                                <div class="col-xs-3 padding-0">
                                    <div class="chart-sm">
                                        <div class="js-pie-chart pie-chart" data-percent="80" data-line-width="3" data-size="75" data-bar-color="#abe37d" data-track-color="#eeeeee" data-scale-color="#dddddd">
                                            <span>8 <br><small class="text-muted">/100</small></span>
                                        </div>
                                    </div>
                                    <h4 class="kpi-label">KPI #1d</h4>
                                </div>
                            </div>

                        </div>
                    </div>


                    <!-- Pie Chart Container -->
                    <div class="kpi-panel-big panel panel-default">
                        <div class="kpi-heading panel-heading ">KPI Set #2</div>
                        <div class="panel-body padding-0-i">
                            <div class="row-fluid">
                                <div class="col-xs-3 padding-0">
                                    <div class="chart-sm">
                                        <span class="kpi-2-sm pie-chart" data-percent="66" data-scale-color="#ffb400" data-size="75">
                                            <span class="kpi-2-value-sm">%</span>
                                        </span>
                                    </div>
                                    <h4 class="kpi-label js_update_2_sm solo-label">KPI #2</h4>
                                </div>
                                <div class="col-xs-3 padding-0">
                                    <div class="chart-sm">
                                        <div class="js-pie-chart pie-chart" data-percent="80" data-line-width="3" data-size="75" data-bar-color="#abe37d" data-track-color="#eeeeee" data-scale-color="#dddddd">
                                            <span>8 <br><small class="text-muted">/100</small></span>
                                        </div>
                                    </div>
                                    <h4 class="kpi-label solo-label">KPI #3</h4>
                                </div>
                                <div class="col-xs-3 padding-0">
                                    <div class="chart-sm">
                                        <span class="kpi-4-sm pie-chart" data-percent="66"  data-size="75">
                                            <span class="kpi-4-value-sm">%</span>
                                        </span>
                                    </div>
                                    <h4 class="kpi-label js_update_4_sm solo-label">KPI #4</h4>
                                </div>
                                <div class="col-xs-3 padding-0">
                                    <div class="level-panel-sm">
                                        <span class="level-label-sm"><h4 class="user-level-sm">L<small>vl.</small></h4></span>
                                        <span class="level-number-sm"><h4 class="user-level-number-sm">10</h4></span>
                                        <div class="progress">
                                            <div class="progress-bar progress-bar-striped active level-progress-bar" role="progressbar" aria-valuenow="45" aria-valuemin="0" aria-valuemax="100" style="width: 45%">
                                                <span class="sr-only">45% Complete</span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>





        <!-- CRM, Action, & Review Main Blocks -->
        <div id="main-wrapper">

            <!-- CONTACTS PANEL -->
            <div id=display-contact-panel">
                <!-- Row | CRM Panel -->
                <div class="row">
                    <div class="col-md-7">

                        <div class="row padding-10-w">
                            <div class="panel panel-white margin-10-b">
                                <div class="panel-body">
                                    <!-- Row -->
                                    <div class="page-breadcrumb">
                                        <ol class="breadcrumb">
                                            <li class="active" id="leads-tab"><span class="dashboard-breadcrumb-span">Lead</span></li>
                                            <!-- Display The Selected Company Name -->
                                            <li id="company-tab"><span class="dashboard-breadcrumb-span">Microsoft</span></li>
                                            <li id="contacts-tab"><span class="dashboard-breadcrumb-span">Contacts</span></li>
                                        </ol>
                                    </div>


                                    <hr class="contact-page-hr">




                                    <!-- Row -->
                                    <div class="panel panel-white padding-0-i margin-0 activity-feed-panel">

                                        <div class="panel-heading contacts-panel-heading clearfix padding-0-i">
                                            <div class="flex-row-between">
                                                <div class="">
                                                    <!-- Display The Selected Contact's Name -->
                                                    <h2 class="no-m m-b-lg contact-name-header">Bill Gates</h2>
                                                </div>
                                                <div class="contact-action-buttons">
                                                    <a data-toggle="modal" data-target="#send-new-email-modal" class="icon-btn">
                                                        <i class="fa fa-envelope"></i>
                                                        <div> Email </div>
                                                        <span class="badge badge-info"> 12 </span>
                                                    </a>
                                                    <a data-toggle="modal" data-target="#make-new-social-post"  class="icon-btn">
                                                        <i class="fa fa-thumbs-up"></i>
                                                        <div> Network </div>
                                                        <span class="badge badge-info"> 2 </span>
                                                    </a>
                                                    <a data-toggle="modal" data-target="#make-new-website-touch"  class="icon-btn">
                                                        <i class="fa fa-group"></i>
                                                        <div> Engage </div>
                                                        <span class="badge badge-danger"> 2 </span>
                                                    </a>
                                                    <a data-toggle="modal" data-target="#make-new-call-modal"  class="icon-btn">
                                                        <i class="fa fa-phone"></i>
                                                        <div> Call </div>
                                                        <span class="badge badge-danger"> 3 </span>
                                                    </a>
                                                </div>
                                            </div>
                                        </div>


                                        <div class="panel-body padding-0-i">
                                            <div class="tabs-left" role="tabpanel">
                                                <!-- Nav tabs -->
                                                <ul class="nav nav-tabs" role="tablist">
                                                <li role="presentation" class="active" disabled><a href="#tab9" role="tab" data-toggle="tab"><p class="contact-name-tabs">
                                                        Bill Gates<small class="contact-panel-job-title">, CEO</small></p></a></li>
                                                <li role="presentation"><a href="#tab10" role="tab" data-toggle="tab"><p class="contact-name-tabs">
                                                        Bob Minor<small class="contact-panel-job-title">, CTO</small></p></a></li>
                                                <li role="presentation"><a href="#tab11" role="tab" data-toggle="tab"><p class="contact-name-tabs">
                                                        Justin Cooperman<small class="contact-panel-job-title">, Head of Engineering</small></p></a></li>
                                                <li role="presentation"><a href="#tab12" role="tab" data-toggle="tab"><p class="contact-name-tabs">
                                                    Devon Luongo<small class="contact-panel-job-title">, Product Manager</small></p></a></li>
                                                <li role="presentation" class="dropdown">
                                                        <a class="dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-expanded="false"><p class="contact-name-tabs">
                                                            Dropdown<span class="caret"></span></p>
                                                        </a>
                                                        <ul class="dropdown-menu" role="menu">
                                                            <li class=""><a href="#tab32" role="tab" data-toggle="tab" aria-expanded="false">Steph Curry, <small>Brand Icon</small></a></li>
                                                            <li class=""><a href="#tab33" role="tab" data-toggle="tab" aria-expanded="false">Jim Beam, <small>SDR</small></a></li>
                                                        </ul>
                                                    </li>
                                                </ul>
                                                <!-- Tab panes -->
                                                <div class="tab-content padding-0-i">
                                                    <div role="tabpanel" class="tab-pane active fade in" id="tab9">
                                                        <!-- Render Activity Feed | Tab Panel -->
                                                        <g:render template="/sharedTemplates/contactInfo/activity-feed"/>
                                                    </div>
                                                    <div role="tabpanel" class="tab-pane fade" id="tab10">
                                                        <!-- Render Activity Feed | Tab Panel -->
                                                        <g:render template="/sharedTemplates/contactInfo/activity-feed"/>
                                                    </div>
                                                    <div role="tabpanel" class="tab-pane fade" id="tab11">
                                                        <p>Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo.</p>
                                                    </div>
                                                    <div role="tabpanel" class="tab-pane fade" id="tab12">
                                                        <p>Etiam rhoncus. Maecenas tempus, tellus eget condimentum rhoncus, sem quam semper libero, sit amet adipiscing sem neque sed ipsum. Nam quam nunc, blandit vel, luctus pulvinar, hendrerit id, lorem. Maecenas nec odio et ante tincidunt tempus.</p>
                                                    </div>
                                                    <div role="tabpanel" class="tab-pane fade" id="tab32">
                                                        <p>Etiam rhoncus. Maecenas tempus, tellus eget condimentum rhoncus, sem quam semper libero, sit amet adipiscing sem neque sed ipsum. Nam quam nunc, blandit vel, luctus pulvinar, hendrerit id, lorem. Maecenas nec odio et ante tincidunt tempus.</p>
                                                    </div>
                                                    <div role="tabpanel" class="tab-pane fade" id="tab33">
                                                        <p>Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo.</p>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="row  hidden-md hidden-lg padding-10-w">
                            <div class="col-sm-12 padding-0-i">
                                <div class="col-sm-12 contacts-timeline-padding padding-0-i">
                                    <div class="portlet light portlet-fit ">
                                        <div class="portlet-title">
                                            <div class="caption">
                                                <i class="icon-microphone font-green"></i>
                                                <span class="caption-subject bold font-green uppercase"> Timeline</span>
                                                <span class="caption-helper">contact timeline</span>
                                            </div>
                                        </div>
                                        <div class="portlet-body">
                                            <div class="scroller" style="height: 344px;" data-always-visible="1" data-rail-visible1="0" data-handle-color="#D7DCE2">
                                                <g:render template="/sharedTemplates/contactInfo/timeline"/>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>

                        </div>


                        <!-- Row | CRM Panel -->
                        <div class="row padding-10-w">
                            <div class="panel panel-white">
                                <div class="panel-body">
                                    <div class="panel panel-white">
                                        <div class="panel-body contacts-body">
                                            <!-- Row | Contacts Panel -->
                                            <g:render template="/sharedTemplates/crm/crm-contact"/>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- END CONTACT BOXES -->

                    <div class="col-md-5 padding-0-i hidden-sm hidden-xs">
                        <div class="col-md-12 contacts-timeline-padding">
                            <div class="portlet light portlet-fit ">
                                <div class="portlet-title">
                                    <div class="caption">
                                        <i class="icon-microphone font-green"></i>
                                        <span class="caption-subject bold font-green uppercase"> Timeline</span>
                                        <span class="caption-helper">contact timeline</span>
                                    </div>
                                </div>
                                <div class="portlet-body">
                                    <div class="scroller" style="height: 100%;" data-always-visible="1" data-rail-visible1="0" data-handle-color="#D7DCE2">
                                        <g:render template="/sharedTemplates/contactInfo/timeline"/>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div><!-- Row -->
            </div>
            <!-- END CONTACTS PANEL -->

            <!-- START CONTACT ACTIVITY MODALS -->
            <g:render template="/sharedTemplates/modals/activity-modals"/>
            <!-- END CONTACT ACTIVITY MODALS -->


            <!-- COMPANY PANEL -->
            <div id=display-company-panel class="hidden">
                <!-- Row | CRM Panel -->
                <div class="row">
                    <div class="col-md-7">

                        <div class="row padding-10-w">
                            <div class="panel panel-white margin-10-b">
                                <div class="panel-body">
                                    <!-- Row -->
                                    <div class="page-breadcrumb">
                                        <ol class="breadcrumb">
                                            <li class="active" id="leads-tab"><span class="dashboard-breadcrumb-span">Lead</span></li>
                                            <!-- Display The Selected Company Name -->
                                            <li id="company-tab"><span class="dashboard-breadcrumb-span">Microsoft</span></li>
                                            <li id="contacts-tab"><span class="dashboard-breadcrumb-span">Contacts</span></li>
                                        </ol>
                                    </div>


                                    <hr class="contact-page-hr">




                                    <!-- Row -->
                                    <div class="panel panel-white padding-0-i margin-0 activity-feed-panel">

                                        <div class="panel-heading contacts-panel-heading clearfix padding-0-i">
                                            <div class="flex-row-between">
                                                <div class="">
                                                    <!-- Display The Selected Contact's Name -->
                                                    <h2 class="no-m m-b-lg contact-name-header">Microsoft</h2>
                                                </div>
                                                <div class=" contact-action-buttons">
                                                    <a href="javascript:;" class="icon-btn">
                                                        <i class="fa fa-envelope"></i>
                                                        <div> Inbox </div>
                                                        <span class="badge badge-info"> 12 </span>
                                                    </a>
                                                    <a href="javascript:;" class="icon-btn">
                                                        <i class="fa fa-thumbs-up"></i>
                                                        <div> Feedback </div>
                                                        <span class="badge badge-info"> 2 </span>
                                                    </a>
                                                    <a href="javascript:;" class="icon-btn">
                                                        <i class="fa fa-group"></i>
                                                        <div> Users </div>
                                                        <span class="badge badge-danger"> 2 </span>
                                                    </a>
                                                    <a href="javascript:;" class="icon-btn">
                                                        <i class="fa fa-phone"></i>
                                                        <div> Notification </div>
                                                        <span class="badge badge-danger"> 3 </span>
                                                    </a>
                                                </div>
                                            </div>
                                        </div>

                                        <div class="panel-body padding-0-i">
                                            <!-- Render Activity Feed | Tab Panel -->
                                            <g:render template="/sharedTemplates/contactInfo/activity-feed"/>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="row  hidden-md hidden-lg padding-10-w">
                            <div class="col-sm-12 padding-0-i">
                                <div class="col-sm-12 contacts-timeline-padding padding-0-i">
                                    <div class="portlet light portlet-fit ">
                                        <div class="portlet-title">
                                            <div class="caption">
                                                <i class="icon-microphone font-green"></i>
                                                <span class="caption-subject bold font-green uppercase"> Timeline</span>
                                                <span class="caption-helper">company timeline</span>
                                            </div>
                                        </div>
                                        <div class="portlet-body">
                                            <div class="scroller" style="height: 344px;" data-always-visible="1" data-rail-visible1="0" data-handle-color="#D7DCE2">
                                                <g:render template="/sharedTemplates/contactInfo/timeline"/>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>

                        </div>


                        <!-- Row | CRM Panel -->
                        <div class="row padding-10-w">
                            <div class="panel panel-white">
                                <div class="panel-body">
                                    <div class="panel panel-white">
                                        <div class="panel-body contacts-body">
                                            <!-- Row | Contacts Panel -->
                                            <g:render template="/sharedTemplates/crm/crm-company"/>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>




                    </div>


                    <div class="col-md-5 padding-0-i hidden-sm hidden-xs">
                        <div class="col-md-12 contacts-timeline-padding">
                            <div class="portlet light portlet-fit ">
                                <div class="portlet-title">
                                    <div class="caption">
                                        <i class="icon-microphone font-green"></i>
                                        <span class="caption-subject bold font-green uppercase"> Timeline</span>
                                        <span class="caption-helper">contact timeline</span>
                                    </div>
                                </div>
                                <div class="portlet-body">
                                    <div class="scroller" style="height: 100%;" data-always-visible="1" data-rail-visible1="0" data-handle-color="#D7DCE2">
                                        <g:render template="/sharedTemplates/contactInfo/timeline"/>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div><!-- Row -->
            </div>



        



        </div><!-- Main Wrapper -->
        
        
        
        
        
        
        
        
        
        
        
        
        <div class="page-footer">
            <p class="no-s">2017 &copy; by Haptic AI</p>
        </div>
    </div><!-- Page Inner -->
</main><!-- Page Content -->
<nav class="cd-nav-container" id="cd-nav">
    <header>
        <h3>Navigation</h3>
        <a href="#0" class="cd-close-nav">Close</a>
    </header>
    <ul class="cd-nav list-unstyled">
        <li class="cd-selected" data-menu="index">
            <a href="javsacript:void(0);">
                <span>
                    <i class="glyphicon glyphicon-home"></i>
                </span>
                <p>Dashboard</p>
            </a>
        </li>
        <li data-menu="profile">
            <a href="javsacript:void(0);">
                <span>
                    <i class="glyphicon glyphicon-user"></i>
                </span>
                <p>Profile</p>
            </a>
        </li>
        <li data-menu="inbox">
            <a href="javsacript:void(0);">
                <span>
                    <i class="glyphicon glyphicon-envelope"></i>
                </span>
                <p>Mailbox</p>
            </a>
        </li>
        <li data-menu="#">
            <a href="javsacript:void(0);">
                <span>
                    <i class="glyphicon glyphicon-tasks"></i>
                </span>
                <p>Tasks</p>
            </a>
        </li>
        <li data-menu="#">
            <a href="javsacript:void(0);">
                <span>
                    <i class="glyphicon glyphicon-cog"></i>
                </span>
                <p>Settings</p>
            </a>
        </li>
        <li data-menu="calendar">
            <a href="javsacript:void(0);">
                <span>
                    <i class="glyphicon glyphicon-calendar"></i>
                </span>
                <p>Calendar</p>
            </a>
        </li>
    </ul>
</nav>
<div class="cd-overlay"></div>


<!-- Javascripts - Primary-->
<asset:javascript src="plugins/jquery/jquery-2.1.4.min.js" />
<asset:javascript src="plugins/jquery-ui/jquery-ui.min.js" />
<asset:javascript src="plugins/pace-master/pace.min.js" />
<asset:javascript src="plugins/jquery-blockui/jquery.blockui.js" />
<asset:javascript src="plugins/bootstrap/js/bootstrap.min.js" />
<asset:javascript src="plugins/jquery-slimscroll/jquery.slimscroll.min.js" />
<script src="https://cdnjs.cloudflare.com/ajax/libs/switchery/0.8.2/switchery.min.js"></script>
<asset:javascript src="plugins/uniform/jquery.uniform.min.js" />
<asset:javascript src="plugins/offcanvasmenueffects/js/classie.js" />
<asset:javascript src="plugins/offcanvasmenueffects/js/main.js" />
<asset:javascript src="plugins/waves/waves.min.js" />
<asset:javascript src="plugins/3d-bold-navigation/js/main.js" />

<!-- BEGIN PAGE LEVEL PLUGINS -->
<asset:javascript src="plugins/metronic/plugins/bootstrap-fileinput/bootstrap-fileinput.js"/>
<asset:javascript src="plugins/metronic/plugins/jquery.sparkline.min.js"/>
<asset:javascript src="plugins/metronic/plugins/bootstrap-switch/js/bootstrap-switch.min.js"/>
<script src="http://maps.google.com/maps/api/js?sensor=false" type="text/javascript"></script>
<asset:javascript src="plugins/metronic/plugins/gmaps/gmaps.min.js" />
<!-- END PAGE LEVEL PLUGINS -->

<!-- Javascripts - KPI Charts-->
<script src="http://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
<asset:javascript src="plugins/easy-pie-chart/jquery.easypiechart.min.js" />



<!-- Javascripts - CRM Forms-->
<asset:javascript src="plugins/jquery-mockjax-master/jquery.mockjax.js" />
<asset:javascript src="plugins/moment/moment.js" />
<asset:javascript src="plugins/x-editable/bootstrap3-editable/js/bootstrap-editable.js" />
<asset:javascript src="plugins/x-editable/inputs-ext/typeaheadjs/lib/typeahead.js" />
<asset:javascript src="plugins/x-editable/inputs-ext/typeaheadjs/typeaheadjs.js" />
<asset:javascript src="plugins/x-editable/inputs-ext/address/address.js" />
<asset:javascript src="plugins/select2-3.4.8/select2.min.js" />
<asset:javascript src="plugins/bootstrap-datetimepicker/js/bootstrap-datetimepicker.min.js" />
<asset:javascript src="plugins/bootstrap-switch/js/bootstrap-switch.min.js" />
<asset:javascript src="plugins/masked-input/jquery-input-masking.js.js" />


<!-- BEGIN PAGE LEVEL SCRIPTS -->
<asset:javascript src="plugins/metronic/scripts/profile.min.js"/>
<asset:javascript src="plugins/metronic/scripts/timeline.min.js"/>
<asset:javascript src="plugins/summernote-master/summernote.min.js"/>
<!-- END PAGE LEVEL SCRIPTS -->


<!-- Javascripts - Init-->
<asset:javascript src="modern.js" />

<asset:javascript src="custom.js" />


</body>
</html>
