<%@ page import="haptic.org.Employee" %>
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
                    <g:form name="submit-post-form" id="submit-post-form" action="sendSocialPost" >
                        <div class="form-body padding-0-b-i padding-10-w-i">
                            <div class="row">
                                <div class="form-group form-md-radios">
                                    <label class="col-md-3 control-label padding-r-7">Network</label>
                                    <div class="md-radio-list">
                                        <div class="col-md-3">
                                            <!--<div class="md-checkbox-inline">-->
                                            <div class="md-radio has-info">
                                                <input type="radio" id="post_on_facbook" name="network_select_radio" value="facebook" class="md-radiobtn">
                                                <label for="post_on_facbook">
                                                    <span></span>
                                                    <span class="check"></span>
                                                    <span class="box"></span> Facebook </label>
                                            </div>
                                            <div class="md-radio has-success">
                                                <input type="radio" id="post_on_twitter" name="network_select_radio" value="twitter" class="md-radiobtn">
                                                <label for="post_on_twitter">
                                                    <span></span>
                                                    <span class="check"></span>
                                                    <span class="box"></span> Twitter </label>
                                            </div>
                                            <div class="md-radio has-success">
                                                <input type="radio" id="post_on_linked_in" name="network_select_radio" value="linked in" class="md-radiobtn">
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
                                                <input type="radio" id="post_on_google_plus" name="network_select_radio" value="google plus" class="md-radiobtn">
                                                <label for="post_on_google_plus">
                                                    <span></span>
                                                    <span class="check"></span>
                                                    <span class="box"></span>Google Plus</label>
                                            </div>
                                            <div class="md-radio has-error">
                                                <input type="radio" id="post_on_pinterist" name="network_select_radio" value="pinterest" class="md-radiobtn">
                                                <label for="post_on_pinterist">
                                                    <span></span>
                                                    <span class="check"></span>
                                                    <span class="box"></span>Pinterest</label>
                                            </div>
                                            <div class="md-radio has-error">
                                                <input type="radio" id="post_on_youtube" name="network_select_radio" value="youtube" class="md-radiobtn">
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
                                    <div class="form-group form-md-line-input has-success">
                                        <select class="form-control" id="post-at-this-handel">
                                            <g:each in="${activeContact?.socialNetworks?.socialNetworkHandle}" var="handle">
                                                <option value="${handle}">${handle} </option>
                                            </g:each>
                                        </select>
                                        <label for="post-at-this-handel">At:</label>
                                        <span class="help-block">Engage with prospects... </span>
                                    </div>
                                </div>
                                <div class="col-xs-4">
                                    <div class="form-group form-md-line-input has-success">
                                        <select class="form-control" id="tag-this-handel">
                                            <g:each in="${currentUser?.employee?.companySocialHandles}" var="handle">
                                                <option value="${handle}">${handle}</option>
                                            </g:each>
                                        </select>
                                        <label for="tag-this-handel">Tag:</label>
                                        <span class="help-block">Tag your colleagues...</span>
                                    </div>
                                </div>
                                <div class="col-xs-4">
                                    <div class="form-group form-md-line-input has-success">
                                        <select class="form-control" id="post-from-this-handel">
                                            <g:each in="${activeContact?.socialNetworks?.socialNetworkHandle}" var="handle">
                                                <option value="${handle}">${handle} selected></option>
                                            </g:each>
                                        </select>
                                        <label for="post-from-this-handel">From:</label>
                                        <span class="help-block">Manage multiple accounts...</span>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group form-md-line-input has-success">
                                <input type="text" class="form-control" id="social-post-title" placeholder="Info state">
                                <label for="social-post-title">Title/Heading:</label>
                            </div>
                            <div class="form-group form-md-line-input has-success">
                                <textarea class="form-control" id="social-post-body" rows="3" placeholder="Enter more text"></textarea>
                                <label for="social-post-body">Body:</label>
                            </div>
                            <!--<div class="md-checkbox-inline">-->
                            <!--
                            <div class="row">
                                <div class="form-group form-md-line-input col-md-offset-3 col-md-2 has-success">
                                    <input type="text" class="form-control" id="post_likes" name="post_likes" placeholder="0 Likes!">
                                    <input type="text" class="form-control" id="post_shares" name="post_likes" placeholder="0 Shares!">
                                    <input type="text" class="form-control" id="post_favorites" name="post_favorites" placeholder="0 Favorites!">
                                    <label for="post_likes">Post Metrics</label>
                                </div>
                                <div class="form-group form-md-checkboxes col-md-3 padding-r-7">
                                    <label>Response</label>

                                    <div class="md-checkbox has-success">
                                        <input type="checkbox" id="post_answered_warm" class="md-check">
                                        <label for="post_answered_warm">
                                            <span></span>
                                            <span class="check"></span>
                                            <span class="box"></span> Warm Answer </label>
                                    </div>
                                    <div class="md-checkbox has-success">
                                        <input type="checkbox" id="post_answered_cold" class="md-check">
                                        <label for="post_answered_cold">
                                            <span></span>
                                            <span class="check"></span>
                                            <span class="box"></span> Cold Answer </label>
                                    </div>
                                    <div class="md-checkbox has-warning">
                                        <input type="checkbox" id="unanswered_social_post" class="md-check">
                                        <label for="unanswered_social_post">
                                            <span></span>
                                            <span class="check"></span>
                                            <span class="box"></span> Unanswered </label>
                                    </div>


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
                                        <input type="checkbox" id="call_results_in_demo" class="md-check">
                                        <label for="call_results_in_demo">
                                            <span></span>
                                            <span class="check"></span>
                                            <span class="box"></span>Scheduled Demo</label>
                                    </div>
                                </div>
                                <div class="form-group form-md-checkboxes col-md-3 padding-l-7">
                                    <label> &nbsp</label>
                                    <div class="md-checkbox has-success">
                                        <input type="checkbox" id="call_results_in_quality_touchpoint" class="md-check" >
                                        <label for="call_results_in_quality_touchpoint">
                                            <span></span>
                                            <span class="check"></span>
                                            <span class="box"></span>Quality Touchpoint</label>
                                    </div>
                                    <div class="md-checkbox has-success">
                                        <input type="checkbox" id="call_results_in_valuable_intel" class="md-check" >
                                        <label for="call_results_in_valuable_intel">
                                            <span></span>
                                            <span class="check"></span>
                                            <span class="box"></span>Valuable Intel</label>
                                    </div>
                                    <div class="md-checkbox has-success">
                                        <input type="checkbox" id="call_results_in_connection" class="md-check" >
                                        <label for="call_results_in_connection">
                                            <span></span>
                                            <span class="check"></span>
                                            <span class="box"></span>Lead|Partnership|Referral</label>
                                    </div>
                                </div>
                            </div> -->

                            <input type="hidden" id="senderIndex" name="senderIndex" value="${currentUser.id}" />
                            <input type="hidden" id="receiverIndex" name="receiverIndex" value="${activeContact.id}" />
                            <input type="hidden" id="leadIndex" name="leadIndex" value="${lead.id}" />
                        </div>
                        <div class="modal-footer padding-0-v">
                            <div class="form-actions noborder">
                                <div class="form-actions noborder">
                                    <!--<button type="submit" value="Send" id="send-email-submit-button" class="btn blue">Send</button>-->
                                    <g:actionSubmit class="btn blue" id="submit-post-button" action="sendSocialPost" value="Post" />
                                    <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
                                </div>
                            </div>
                        </div>
                    </g:form>
                </div>
            </div>
            <!-- END SAMPLE FORM PORTLET-->
        </div>
    </div>
</div>
