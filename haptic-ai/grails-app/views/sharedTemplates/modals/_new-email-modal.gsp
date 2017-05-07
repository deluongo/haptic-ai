
<div class="modal-dialog modal-lg" id="new-email-model-render-target">
    <div class="modal-content">
        <div class="modal-header" style="padding:35px 50px;">
            <button type="button" class="close" data-dismiss="modal">&times;</button>
            <h2 class="no-m m-b-lg">Lead Outreach</h2>
        </div>
        <hr>
        <div class="modal-body remove-margin-b padding-0-i">
            <!-- BEGIN SAMPLE FORM PORTLET-->
            <div class="portlet light ">
                <div class="portlet-title padding-10-w-i">
                    <div class="caption font-red-sunglo">
                        <i class="icon-settings font-red-sunglo"></i>
                        <span class="caption-subject bold uppercase"> Email</span><br/>
                    </div>
                    <br/>
                    <br/>
                    <hr class="action-form-hr">
                    <h4 class=""> This form mimics functionality that will be provided by email plugins in future releases.  </h4>
                    <div id="new-email-error-messages"></div>
                    <div id="new-email-success-messages"></div>
                </div>
                <div class="portlet-body form">
                    <g:form class="" name="send-email-form" action="sendEmailMessage">
                        <div class="form-body padding-0-b-i padding-10-w-i">
                            <div class="row">
                                <div class="col-xs-6">
                                    <div class="form-group form-md-line-input has-success">
                                        <select class="form-control" id="sent-to-email-address">
                                            <g:each in="${activeContact?.emailAddresses}" var="email">
                                                <option value="${email?.emailAddress}">${email?.emailAddress} (${activeContact?.firstName} ${activeContact?.lastName}'s ${email?.emailStatus} ${email?.emailType})</option>
                                            </g:each>
                                        </select>
                                        <label for="sent-to-email-address">To:</label>
                                        <span class="help-block">Selects from address... </span>
                                    </div>
                                </div>
                                <div class="col-xs-6">
                                    <div class="form-group form-md-line-input has-success">
                                        <select class="form-control" id="sent-from-email-address">
                                            <g:each in="${currentUser?.employee?.emailAddresses}" var="email">
                                                <option value="${email?.emailAddress}">${email?.emailAddress} (${currentUser?.employee?.firstName} ${currentUser?.employee?.lastName})</option>
                                            </g:each>
                                        </select>
                                        <label for="sent-from-email-address">From:</label>
                                        <span class="help-block">Select to address...</span>
                                    </div>
                                </div>
                            </div>
                            <div class="flex-row-between padding-0-i">
                                <div class="col-xs-10 padding-0-i">
                                    <div class="form-group form-md-line-input has-success">
                                        <input type="text" class="form-control" id="new-email-title" placeholder="Email Header">
                                        <label for="new-email-title">Elevator Pitch:</label>
                                    </div>
                                </div>
                                <div class="">
                                    <div class="form-actions noborder">
                                        <input type="hidden" id="senderIndex" name="senderIndex" value="${currentUser.id}" />
                                        <input type="hidden" id="receiverIndex" name="receiverIndex" value="${activeContact.id}" />
                                        <input type="hidden" id="leadIndex" name="leadIndex" value="${lead.id}" />
                                        <g:actionSubmit type="button" class="btn blue" action="sendEmailMessage" value="Send" />
                                    </div>
                                </div>
                            </div>
                            <div class="form-group form-md-line-input has-success">
                                <textarea class="form-control" id="new-email-body" rows="10" placeholder="Enter text ..."></textarea>
                                <label for="new-email-body">Transcript:</label>
                            </div>
                        </div>

                    </g:form>
                    <div class="modal-footer padding-0-v">
                        <div class="form-actions noborder">
                            <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
                        </div>
                    </div>
                </div>
            </div>
            <!-- END SAMPLE FORM PORTLET-->
        </div>
    </div>
</div>