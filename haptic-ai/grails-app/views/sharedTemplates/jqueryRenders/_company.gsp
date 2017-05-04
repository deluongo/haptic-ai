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
</div>
<!-- Row -->