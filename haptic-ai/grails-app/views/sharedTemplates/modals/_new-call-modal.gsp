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