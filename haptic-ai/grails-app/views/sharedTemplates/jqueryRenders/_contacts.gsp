<!-- CONTACTS PANEL -->
<div id="display-contact-panel">
    <!-- Row | CRM Panel -->
    <div class="row">
        <div class="col-md-7">




            <!-- LANDING PAGE - No Lead Default -->
            <g:if test="${!(lead instanceof haptic.crm.Lead)}">
                <!-- Welcome Message -->



                <div class="row padding-10-w">
                    <div class="panel panel-white margin-10-b">
                        <div class="panel-body">
                            <!-- Row -->
                            <div class="page-breadcrumb">
                            <h2> Haptic Dashboard</h2>
                            </div>


                            <hr class="contact-page-hr">




                            <!-- Row -->
                            <div class="panel panel-white padding-0-i margin-0 activity-feed-panel">

                                <div class="panel-heading contacts-panel-heading clearfix padding-0-i">
                                    <div class="">
                                        <!-- Display The Selected Contact's Name -->
                                        <h2 class="no-m m-b-lg contact-name-header">Welcome ${currentUser} - <small> Select a lead from the left hand list to research and engage a prospect!</small></h2>
                                    </div>
                                </div>



                            </div>
                        </div>
                    </div>
                </div>
                <!-- END Welcome Message -->
            </g:if>



            <g:else>

            </g:else>
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
                                        <h2 class="no-m m-b-lg contact-name-header">${activeContact?.firstName} ${activeContact?.lastName}</h2>
                                    </div>
                                    <div class="contact-action-buttons">
                                        <a data-toggle="modal" data-target="#send-new-email-modal" id="new-email-${activeContact?.id}-${lead?.id}" class="icon-btn">
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
                                    <ul class="nav nav-tabs change-active-contact-button" id="lead-panel-tab-label" role="tablist">

                                        <g:each status="i" in="${allContacts?.sort()}" var="contact">
                                            <g:if test="${i < 5}">
                                                <li role="presentation" <g:if test="${contact == activeContact}"> class="active" disabled </g:if> >
                                                    <a href="#select-contact-${contact.id}-${lead.id}" role="tab" id="select-contact-${contact.id}-${lead.id}" data-toggle="tab">
                                                        <p class="contact-name-tabs">
                                                            ${contact.firstName} ${contact.lastName} <small class="contact-panel-job-title">, ${contact.jobTitle}</small>
                                                        </p>
                                                    </a>
                                                </li>
                                            </g:if>
                                            <g:if test="${i >= 5}">
                                                <li role="presentation" class="dropdown">
                                                    <a class="dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-expanded="false"><p class="contact-name-tabs">
                                                        Dropdown<span class="caret"></span></p>
                                                    </a>
                                                    <ul class="dropdown-menu" role="menu">
                                                        <li class="">
                                                            <a href="#tab32" role="tab" data-toggle="tab" aria-expanded="false">
                                                                <p class="contact-name-tabs">
                                                                    ${contact.firstName} ${contact.lastName} <small class="contact-panel-job-title">, ${contact.jobTitle}</small>
                                                                </p>
                                                            </a>
                                                        </li>
                                                    </ul>
                                                </li>
                                            </g:if>
                                        </g:each>
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
                            <div class="panel-body contacts-body" id="display-contacts-feed-panel">
                                <div id="display-lead-error-messages"></div>


                                <a href="#" data-load="true" data-url="portlet_ajax_content_1.html" class="reload"></a>

                                <!-- Row | Contacts Panel -->
                                <g:render template="/sharedTemplates/crm/crm-contact" />
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
<div id="activity-modals-render-target">
    <g:render template="/sharedTemplates/modals/activity-modals" model="[lead: lead, leadCompany: leadCompany, activeContact: activeContact, allContacts: allContacts]"/>
</div>

<!-- END CONTACT ACTIVITY MODALS -->