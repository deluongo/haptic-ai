
<!-- Email Address Model -->
<div class="container">
    <!-- Modal -->
    <div class="modal fade" id="send-new-email-modal" role="dialog">
        <div class="modal-dialog modal-lg">
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
                            <form role="form ">
                                <div class="form-body padding-0-b-i padding-10-w-i">
                                    <div class="row">
                                        <div class="col-xs-6">
                                            <div class="form-group form-md-line-input has-success">
                                                <select class="form-control" id="sent-to-email-address">
                                                    <option value=""></option>
                                                    <option value="1">Email 1</option>
                                                    <option value="2">Email 2</option>
                                                    <option value="3">Email 3</option>
                                                    <option value="4">Email 4</option>
                                                </select>
                                                <label for="sent-to-email-address">To:</label>
                                                <span class="help-block">Selects from address... </span>
                                            </div>
                                        </div>
                                        <div class="col-xs-6">
                                            <div class="form-group form-md-line-input has-success">
                                                <select class="form-control" id="sent-from-email-address">
                                                    <option value=""></option>
                                                    <option value="1">Email 1</option>
                                                    <option value="2">Email 2</option>
                                                    <option value="3">Email 3</option>
                                                    <option value="4">Email 4</option>
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
                                                <button type="button" class="btn blue">Send</button>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group form-md-line-input has-success">
                                        <textarea class="form-control" id="new-email-body" rows="10" placeholder="Enter text ..."></textarea>
                                        <label for="new-email-body">Transcript:</label>
                                    </div>
                                </div>

                            </form>
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
    </div>
</div>


<!-- Phone Number Model -->
<div class="container">
    <div class="modal fade" id="make-new-call-modal" role="dialog">
        <div class="modal-dialog modal-lg">
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
                                <span class="caption-subject bold uppercase"> Call</span><br/>
                            </div>
                            <br/>
                            <br/>
                            <hr class="action-form-hr">
                            <h4 class=""> This form mimics functionality that will be provided by phone plugins in future releases.  </h4>
                            <div id="new-phone-call-error-messages"></div>
                            <div id="new-phone-success-messages"></div>
                        </div>
                        <div class="portlet-body form">
                            <form role="form ">
                                <div class="form-body padding-0-b-i padding-10-w-i">
                                    <div class="row">
                                        <div class="col-xs-6">
                                            <div class="form-group form-md-line-input has-success">
                                                <select class="form-control" id="dial-this-number">
                                                    <option value=""></option>
                                                    <option value="1">Phone 1</option>
                                                    <option value="2">Phone 2</option>
                                                    <option value="3">Phone 3</option>
                                                    <option value="4">Phone 4</option>
                                                </select>
                                                <label for="dial-this-number">To:</label>
                                                <span class="help-block">Selects from numbers... </span>
                                            </div>
                                        </div>
                                        <div class="col-xs-6">
                                            <div class="form-group form-md-line-input has-success">
                                                <select class="form-control" id="dial-from-this-number">
                                                    <option value=""></option>
                                                    <option value="1">Phone 1</option>
                                                    <option value="2">Phone 2</option>
                                                    <option value="3">Phone 3</option>
                                                    <option value="4">Phone 4</option>
                                                </select>
                                                <label for="dial-from-this-number">From:</label>
                                                <span class="help-block">Select from numbers...</span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group form-md-line-input has-success">
                                        <input type="text" class="form-control" id="call-summary" placeholder="Info state">
                                        <label for="call-summary">Elevator Pitch:</label>
                                    </div>
                                    <div class="form-group form-md-line-input">
                                        <textarea class="form-control" id="call-transcript" rows="3" placeholder="Enter more text"></textarea>
                                        <label for="call-transcript">Transcript:</label>
                                    </div>
                                    <div class="row">
                                    <div class="form-group form-md-checkboxes col-md-3 padding-r-7">
                                        <label>Response</label>
                                        <!--<div class="md-checkbox-inline">-->
                                            <div class="md-checkbox has-success">
                                                <input type="checkbox" id="call_answered_warm" class="md-check">
                                                <label for="call_answered_warm">
                                                    <span></span>
                                                    <span class="check"></span>
                                                    <span class="box"></span> Warm Answer </label>
                                            </div>
                                            <div class="md-checkbox has-success">
                                                <input type="checkbox" id="call_answered_cold" class="md-check" checked>
                                                <label for="call_answered_cold">
                                                    <span></span>
                                                    <span class="check"></span>
                                                    <span class="box"></span> Cold Answer </label>
                                            </div>
                                            <div class="md-checkbox has-warning">
                                                <input type="checkbox" id="call_to_voicemail" class="md-check">
                                                <label for="call_to_voicemail">
                                                    <span></span>
                                                    <span class="check"></span>
                                                    <span class="box"></span> Voicemail </label>
                                            </div>
                                        <!--</div>-->
                                    </div>

                                    <div class="form-group form-md-checkboxes col-md-3 padding-r-7 padding-l-7">
                                        <label> &nbsp</label>
                                        <!--<div class="md-checkbox-inline">-->
                                            <div class="md-checkbox has-error">
                                                <input type="checkbox" id="call_to_wrong_number" class="md-check">
                                                <label for="call_to_wrong_number">
                                                    <span></span>
                                                    <span class="check"></span>
                                                    <span class="box"></span>Wrong Number</label>
                                            </div>
                                            <div class="md-checkbox has-error">
                                                <input type="checkbox" id="call_to_out_of_service" class="md-check" checked>
                                                <label for="call_to_out_of_service">
                                                    <span></span>
                                                    <span class="check"></span>
                                                    <span class="box"></span>Out of Service</label>
                                            </div>
                                            <div class="md-checkbox has-warning">
                                                <input type="checkbox" id="call_to_endless_ring" class="md-check">
                                                <label for="call_to_endless_ring">
                                                    <span></span>
                                                    <span class="check"></span>
                                                    <span class="box"></span>Endless Ring</label>
                                            </div>
                                        <!--</div>-->
                                    </div>
                                    <div class="form-group form-md-checkboxes col-md-3 padding-r-7 padding-l-7">
                                        <label>Outcome</label>
                                        <div class="md-checkbox has-success">
                                            <input type="checkbox" id="call_results_in_qualification" class="md-check">
                                            <label for="call_results_in_qualification">
                                                <span></span>
                                                <span class="check"></span>
                                                <span class="box"></span>Qualified Lead</label>
                                        </div>
                                        <div class="md-checkbox has-success">
                                            <input type="checkbox" id="call_results_in_disqualification" class="md-check">
                                            <label for="call_results_in_disqualification">
                                                <span></span>
                                                <span class="check"></span>
                                                <span class="box"></span>Disqualified Lead</label>
                                        </div>
                                        <div class="md-checkbox has-success">
                                            <input type="checkbox" id="call_results_in_demo" class="md-check" checked>
                                            <label for="call_results_in_demo">
                                                <span></span>
                                                <span class="check"></span>
                                                <span class="box"></span>Scheduled Demo</label>
                                        </div>
                                    </div>
                                    <div class="form-group form-md-checkboxes col-md-3 padding-l-7">
                                        <label> &nbsp</label>
                                        <div class="md-checkbox has-success">
                                            <input type="checkbox" id="call_results_in_quality_touchpoint" class="md-check" checked>
                                            <label for="call_results_in_quality_touchpoint">
                                                <span></span>
                                                <span class="check"></span>
                                                <span class="box"></span>Quality Touchpoint</label>
                                        </div>
                                        <div class="md-checkbox has-success">
                                            <input type="checkbox" id="call_results_in_valuable_intel" class="md-check" checked>
                                            <label for="call_results_in_valuable_intel">
                                                <span></span>
                                                <span class="check"></span>
                                                <span class="box"></span>Valuable Intel</label>
                                        </div>
                                        <div class="md-checkbox has-success">
                                            <input type="checkbox" id="call_results_in_connection" class="md-check" checked>
                                            <label for="call_results_in_connection">
                                                <span></span>
                                                <span class="check"></span>
                                                <span class="box"></span>Lead|Partnership|Referral</label>
                                        </div>
                                    </div>
                                    </div>
                                </div>
                            </form>
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
    </div>
</div>


<!-- Social Network Model -->
<div class="container">
    <!-- Modal -->
    <div class="modal fade" id="make-new-social-post" role="dialog">
        <!-- Phone Number Model -->
        <div class="modal-dialog modal-lg">
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
                                <span class="caption-subject bold uppercase"> Post</span><br/>
                            </div>
                            <br/>
                            <br/>
                            <hr class="action-form-hr">
                            <h4 class=""> This form mimics functionality that will be automated by social plugins in future releases.  </h4>
                            <div id="new-social-post-error-messages"></div>
                            <div id="new-social-post-messages"></div>
                        </div>
                        <div class="portlet-body form">
                            <form role="form ">
                                <div class="form-body padding-0-b-i padding-10-w-i">
                                    <div class="row">
                                        <div class="form-group form-md-radios">
                                            <label class="col-md-3 control-label padding-r-7">Network</label>
                                            <div class="md-radio-list">
                                                <div class="col-md-3">
                                                    <!--<div class="md-checkbox-inline">-->
                                                    <div class="md-radio has-info">
                                                        <input type="radio" id="post_on_facbook" name="network_select_radio" value="1" class="md-radiobtn">
                                                        <label for="post_on_facbook">
                                                            <span></span>
                                                            <span class="check"></span>
                                                            <span class="box"></span> Facebook </label>
                                                    </div>
                                                    <div class="md-radio has-success">
                                                        <input type="radio" id="post_on_twitter" name="network_select_radio" value="2" class="md-radiobtn">
                                                        <label for="post_on_twitter">
                                                            <span></span>
                                                            <span class="check"></span>
                                                            <span class="box"></span> Twitter </label>
                                                    </div>
                                                    <div class="md-radio has-success">
                                                        <input type="radio" id="post_on_linked_in" name="network_select_radio" value="3" class="md-radiobtn">
                                                        <label for="post_on_linked_in">
                                                            <span></span>
                                                            <span class="check"></span>
                                                            <span class="box"></span> Linked In </label>
                                                    </div>
                                                    <!--</div>-->
                                                </div>
                                                <div class="col-md-3">
                                                    <!--<div class="md-checkbox-inline">-->
                                                    <div class="md-radio has-warning">
                                                        <input type="radio" id="post_on_google_plus" name="network_select_radio" value="4" class="md-radiobtn">
                                                        <label for="post_on_google_plus">
                                                            <span></span>
                                                            <span class="check"></span>
                                                            <span class="box"></span>Google Plus</label>
                                                    </div>
                                                    <div class="md-radio has-error">
                                                        <input type="radio" id="post_on_pinterist" name="network_select_radio" value="5" class="md-radiobtn">
                                                        <label for="post_on_pinterist">
                                                            <span></span>
                                                            <span class="check"></span>
                                                            <span class="box"></span>Pinterest</label>
                                                    </div>
                                                    <div class="md-radio has-error">
                                                        <input type="radio" id="post_on_youtube" name="network_select_radio" value="6" class="md-radiobtn">
                                                        <label for="post_on_youtube">
                                                            <span></span>
                                                            <span class="check"></span>
                                                            <span class="box"></span>Youtube</label>
                                                    </div>
                                                    <!--</div>-->
                                                </div>
                                            </div>
                                        </div>

                                        <div class="form-group form-md-checkboxes col-md-3 padding-r-7 padding-l-7">
                                            <label> &nbsp</label>

                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-xs-4">
                                            <div class="form-group form-md-line-input">
                                                <select class="form-control" id="post-at-this-handel" disabled>
                                                    <option value=""></option>
                                                    <option value="1" selected > User's Handel</option>
                                                </select>
                                                <label for="dial-this-number">At:</label>
                                                <span class="help-block">Engage with prospects... </span>
                                            </div>
                                        </div>
                                        <div class="col-xs-4">
                                            <div class="form-group form-md-line-input has-success">
                                                <select class="form-control" id="tag-this-handel">
                                                    <option value=""></option>
                                                    <option value="1">Handel 1</option>
                                                    <option value="2">Handel 2</option>
                                                    <option value="3">Handel 3</option>
                                                    <option value="4">Handel 4</option>
                                                </select>
                                                <label for="dial-from-this-number">Tag:</label>
                                                <span class="help-block">Tag your colleagues...</span>
                                            </div>
                                        </div>
                                        <div class="col-xs-4">
                                            <div class="form-group form-md-line-input has-success">
                                                <select class="form-control" id="post-from-this-handel">
                                                    <option value=""></option>
                                                    <option value="1">Handel 1</option>
                                                    <option value="2">Handel 2</option>
                                                    <option value="3">Handel 3</option>
                                                    <option value="4">Handel 4</option>
                                                </select>
                                                <label for="dial-from-this-number">From:</label>
                                                <span class="help-block">Manage multiple accounts...</span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group form-md-line-input has-success">
                                        <input type="text" class="form-control" id="social_post_title" placeholder="Info state">
                                        <label for="social_post_title">Title/Heading:</label>
                                    </div>
                                    <div class="form-group form-md-line-input">
                                        <textarea class="form-control" id="social_post_body" rows="3" placeholder="Enter more text"></textarea>
                                        <label for="social_post_body">Body:</label>
                                    </div>
                                    <div class="row">
                                        <div class="form-group form-md-line-input col-md-offset-3 col-md-2 ">
                                            <input type="text" class="form-control" id="post_likes" name="post_likes" placeholder="0 Likes!">
                                            <input type="text" class="form-control" id="post_shares" name="post_likes" placeholder="0 Shares!">
                                            <input type="text" class="form-control" id="post_favorites" name="post_favorites" placeholder="0 Favorites!">
                                            <label for="post_likes">Post Metrics</label>
                                        </div>
                                        <div class="form-group form-md-checkboxes col-md-3 padding-r-7">
                                            <label>Response</label>
                                            <!--<div class="md-checkbox-inline">-->
                                            <div class="md-checkbox has-success">
                                                <input type="checkbox" id="post_" class="md-check">
                                                <label for="call_answered_warm">
                                                    <span></span>
                                                    <span class="check"></span>
                                                    <span class="box"></span> Warm Answer </label>
                                            </div>
                                            <div class="md-checkbox has-success">
                                                <input type="checkbox" id="call_answered_cold" class="md-check" checked>
                                                <label for="call_answered_cold">
                                                    <span></span>
                                                    <span class="check"></span>
                                                    <span class="box"></span> Cold Answer </label>
                                            </div>
                                            <div class="md-checkbox has-warning">
                                                <input type="checkbox" id="call_to_voicemail" class="md-check">
                                                <label for="call_to_voicemail">
                                                    <span></span>
                                                    <span class="check"></span>
                                                    <span class="box"></span> Voicemail </label>
                                            </div>
                                            <!--</div>-->
                                        </div>

                                        <div class="form-group form-md-checkboxes col-md-3 padding-r-7 padding-l-7">
                                            <label> &nbsp</label>
                                            <!--<div class="md-checkbox-inline">-->
                                            <div class="md-checkbox has-error">
                                                <input type="checkbox" id="call_to_wrong_number" class="md-check">
                                                <label for="call_to_wrong_number">
                                                    <span></span>
                                                    <span class="check"></span>
                                                    <span class="box"></span>Wrong Number</label>
                                            </div>
                                            <div class="md-checkbox has-error">
                                                <input type="checkbox" id="call_to_out_of_service" class="md-check" checked>
                                                <label for="call_to_out_of_service">
                                                    <span></span>
                                                    <span class="check"></span>
                                                    <span class="box"></span>Out of Service</label>
                                            </div>
                                            <div class="md-checkbox has-warning">
                                                <input type="checkbox" id="call_to_endless_ring" class="md-check">
                                                <label for="call_to_endless_ring">
                                                    <span></span>
                                                    <span class="check"></span>
                                                    <span class="box"></span>Endless Ring</label>
                                            </div>
                                            <!--</div>-->
                                        </div>
                                        <div class="form-group form-md-checkboxes col-md-3 padding-r-7 padding-l-7">
                                            <label>Outcome</label>
                                            <div class="md-checkbox has-success">
                                                <input type="checkbox" id="call_results_in_qualification" class="md-check">
                                                <label for="call_results_in_qualification">
                                                    <span></span>
                                                    <span class="check"></span>
                                                    <span class="box"></span>Qualified Lead</label>
                                            </div>
                                            <div class="md-checkbox has-success">
                                                <input type="checkbox" id="call_results_in_disqualification" class="md-check">
                                                <label for="call_results_in_disqualification">
                                                    <span></span>
                                                    <span class="check"></span>
                                                    <span class="box"></span>Disqualified Lead</label>
                                            </div>
                                            <div class="md-checkbox has-success">
                                                <input type="checkbox" id="call_results_in_demo" class="md-check" checked>
                                                <label for="call_results_in_demo">
                                                    <span></span>
                                                    <span class="check"></span>
                                                    <span class="box"></span>Scheduled Demo</label>
                                            </div>
                                        </div>
                                        <div class="form-group form-md-checkboxes col-md-3 padding-l-7">
                                            <label> &nbsp</label>
                                            <div class="md-checkbox has-success">
                                                <input type="checkbox" id="call_results_in_quality_touchpoint" class="md-check" checked>
                                                <label for="call_results_in_quality_touchpoint">
                                                    <span></span>
                                                    <span class="check"></span>
                                                    <span class="box"></span>Quality Touchpoint</label>
                                            </div>
                                            <div class="md-checkbox has-success">
                                                <input type="checkbox" id="call_results_in_valuable_intel" class="md-check" checked>
                                                <label for="call_results_in_valuable_intel">
                                                    <span></span>
                                                    <span class="check"></span>
                                                    <span class="box"></span>Valuable Intel</label>
                                            </div>
                                            <div class="md-checkbox has-success">
                                                <input type="checkbox" id="call_results_in_connection" class="md-check" checked>
                                                <label for="call_results_in_connection">
                                                    <span></span>
                                                    <span class="check"></span>
                                                    <span class="box"></span>Lead|Partnership|Referral</label>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </form>
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
    </div>
</div>




<!-- Review Site Model -->
<div class="container">
    <!-- Modal -->
    <div class="modal fade" id="make-new-website-touch" role="dialog">
        <div class="modal-dialog modal-lg">
            <div class="modal-content">
                <div class="modal-header" style="padding:35px 50px;">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h2 class="no-m m-b-lg">New Review Site</h2>
                </div>
                <hr>
                <div class="modal-body remove-margin-b remove-padding-b">

                    <h4 class=""> Complete the fields below to add a new review site.  </h4>

                    <div id="new-review-site-error-messages"></div>
                    <div id="new-review-site-success-messages"></div>

                    <div class="panel panel-white">
                        <div class="panel-body">
                            <div class = "row">
                                <div class="col-xs-12">
                                    <table id="new-review-site-table" class="table table-bordered table-striped" style="clear: both">
                                        <tbody>
                                        <tr>
                                            <td>Review Site URL</td>
                                            <td><a href="#" id="reviewSiteUrl" data-type="text" data-pk="1" data-placeholder="Enter a valid URL.." data-title="Enter network URL" class="editable editable-pre-wrapped editable-click"></a></td>
                                        </tr>
                                        <tr>
                                            <td>Name</td>
                                            <td><a href="#" id="reviewSiteName" data-type="radiolist" data-title="Enter the name" class="editable editable-click" data-pk="1" data-url="/post"></a></td>
                                        </tr>
                                        <tr>
                                            <td> Handel / Username </td>
                                            <td><a href="#" id="reviewSiteHandel" data-type="text" data-title="Enter network handel.." class="editable editable-click" data-pk="1" data-url="/post"></a></td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>




<!-- Review Site Model -->
<div class="container">
    <!-- Modal -->
    <div class="modal fade" id="add-web-site-modal" role="dialog">
        <div class="modal-dialog modal-lg">
            <div class="modal-content">
                <div class="modal-header" style="padding:35px 50px;">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h2 class="no-m m-b-lg">New Review Site</h2>
                </div>
                <hr>
                <div class="modal-body remove-margin-b remove-padding-b">

                    <h4 class=""> Complete the fields below to add a new review site.  </h4>

                    <div id="new-web-site-error-messages"></div>
                    <div id="new-web-site-success-messages"></div>

                    <div class="panel panel-white">
                        <div class="panel-body">
                            <div class = "row">
                                <div class="col-xs-12">
                                    <table id="new-web-site-table" class="table table-bordered table-striped" style="clear: both">
                                        <tbody>
                                        <tr>
                                            <td>Review Site URL</td>
                                            <td><a href="#" id="webSiteUrl" data-type="text" data-pk="1" data-placeholder="Enter a valid URL.." data-title="Enter network URL" class="editable editable-pre-wrapped editable-click"></a></td>
                                        </tr>
                                        <tr>
                                            <td>Name</td>
                                            <td><a href="#" id="webSiteName" data-type="text" data-title="Enter the name" class="editable editable-click" data-pk="1" data-url="/post"></a></td>
                                        </tr>
                                        <tr>
                                            <td>Type</td>
                                            <td><a href="#" id="webSiteType" data-type="radiolist" data-title="Enter the name" class="editable editable-click" data-pk="1" data-url="/post"></a></td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>



