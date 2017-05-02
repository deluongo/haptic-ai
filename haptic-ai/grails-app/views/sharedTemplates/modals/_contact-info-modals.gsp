
<!-- Email Address Model -->
<div class="container">
    <!-- Modal -->
    <div class="modal fade" id="add-email-address-modal" role="dialog">
        <div class="modal-dialog modal-lg">
            <div class="modal-content">
                <div class="modal-header" style="padding:35px 50px;">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>

                    <h2 class="no-m m-b-lg">New Email Address</h2>
                </div>
                <hr>
                <div class="modal-body remove-margin-b remove-padding-b">

                    <h4 class=""> Complete the fields below to add a new email address.  </h4>

                    <div id="new-email-address-error-messages"></div>
                    <div id="new-email-address-success-messages"></div>


                    <div class="panel panel-white">
                        <div class="panel-body">
                            <div class = "row">
                                <div class="col-xs-12">
                                    <table id="new-email-address-table" class="table table-bordered table-striped" style="clear: both">
                                        <tbody>
                                        <tr>
                                            <td>Email Address</td>
                                            <td><a href="#" id="emailAddress" data-type="text" data-pk="1" data-placeholder="joe@montana.com" data-url="/post" data-title="Enter location name" class="editable editable-pre-wrapped editable-click"></a></td>
                                        </tr>
                                        <tr>
                                            <td>Type</td>
                                            <td><a href="#" id="emailType" data-type="checklist" data-title="Select email type" class="editable editable-click" data-pk="1" data-url="/post"></a></td>
                                        </tr>
                                        <tr>
                                            <td>Status</td>
                                            <td><a href="#" id="emailStatus" data-type="checklist" data-title="Select email status" class="editable editable-click" data-pk="1" data-url="/post">Unverified</a></td>
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



<!-- Phone Number Model -->
<div class="container">
    <!-- Modal -->
    <div class="modal fade" id="add-phone-number-modal" role="dialog">
        <div class="modal-dialog modal-lg">
            <div class="modal-content">
                <div class="modal-header" style="padding:35px 50px;">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>

                    <h2 class="no-m m-b-lg">New Phone Number</h2>
                </div>
                <hr>
                <div class="modal-body remove-margin-b remove-padding-b">

                    <h4 class=""> Complete the fields below to add a new phone number.  </h4>

                    <div id="new-phone-number-error-messages"></div>
                    <div id="new-phone-number-success-messages"></div>

                    <div class="panel panel-white">
                        <div class="panel-body">
                            <div class = "row">
                                <div class="col-xs-12">
                                    <table id="new-phone-number-table" class="table table-bordered table-striped" style="clear: both">
                                        <tbody>
                                        <tr>
                                            <td>Phone Number</td>
                                            <td><a href="#" id="phoneNumber" data-type="text" data-pk="1" data-placeholder="650-555-1234" data-title="Enter location name" class="editable editable-pre-wrapped editable-click"></a></td>
                                        </tr>
                                        <tr>
                                            <td>Type</td>
                                            <td><a href="#" id="phoneType" data-type="checklist" data-title="Select email type" class="editable editable-click" data-pk="1" data-url="/post"></a></td>
                                        </tr>
                                        <tr>
                                            <td>Status</td>
                                            <td><a href="#" id="phoneStatus" data-type="checklist" data-title="Select email status" class="editable editable-click" data-pk="1" data-url="/post"></a></td>
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





<!-- Social Network Model -->
<div class="container">
    <!-- Modal -->
    <div class="modal fade" id="add-social-network-modal" role="dialog">
        <div class="modal-dialog modal-lg">
            <div class="modal-content">
                <div class="modal-header" style="padding:35px 50px;">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h2 class="no-m m-b-lg">New Social Network</h2>
                </div>
                <hr>
                <div class="modal-body remove-margin-b remove-padding-b">

                    <h4 class=""> Complete the fields below to add a new social network.  </h4>

                    <div id="new-social-network-error-messages"></div>
                    <div id="new-social-network-success-messages"></div>

                    <div class="panel panel-white">
                        <div class="panel-body">
                            <div class = "row">
                                <div class="col-xs-12">
                                    <table id="new-social-network-table" class="table table-bordered table-striped" style="clear: both">
                                        <tbody>
                                        <tr>
                                            <td>Social Network URL</td>
                                            <td><a href="#" id="networkUrl" data-type="text" data-pk="1" data-placeholder="Enter a valid URL.." data-title="Enter network URL" class="editable editable-pre-wrapped editable-click"></a></td>
                                        </tr>
                                        <tr>
                                            <td>Network Name</td>
                                            <td><a href="#" id="networkName" data-type="radiolist" data-title="Enter the name" class="editable editable-click" data-pk="1" data-url="/post"></a></td>
                                        </tr>
                                        <tr>
                                            <td> Handel / Username </td>
                                            <td><a href="#" id="handel" data-type="text" data-title="Enter network handel.." class="editable editable-click" data-pk="1" data-url="/post"></a></td>
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
    <div class="modal fade" id="add-review-site-modal" role="dialog">
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



<!-- Address Model -->
<div class="container">
    <!-- Modal -->
    <div class="modal fade" id="add-address-modal" role="dialog">
        <div class="modal-dialog modal-lg">
            <div class="modal-content">
                <div class="modal-header" style="padding:35px 50px;">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>

                    <h2 class="no-m m-b-lg">New Address</h2>
                </div>
                <hr>
                <div class="modal-body remove-margin-b remove-padding-b">

                    <h4 class=""> Complete the fields below to add a new address.  </h4>

                    <div id="new-address-error-messages"></div>
                    <div id="new-address-success-messages"></div>

                    <div class="panel panel-white">
                        <div class="panel-body">
                            <div class = "row">
                                <div class="col-xs-12">
                                    <table id="new-address-table" class="table table-bordered table-striped" style="clear: both">
                                        <tbody>
                                        <tr>
                                            <td>Name</td>
                                            <td><a href="#" id="locationName" data-type="text" data-pk="1" data-placeholder="Name this location.." data-title="Enter location name" class="editable editable-pre-wrapped editable-click"></a></td>
                                        </tr>
                                        <tr>
                                            <td>Location Type</td>
                                            <td><a href="#" id="locationType" data-type="radiolist" data-title="Select location type" class="editable editable-click" data-pk="1" data-url="/post">Main Office</a></td>
                                        </tr>
                                        <tr>
                                            <td>Country</td>
                                            <td><a href="#" id="country" data-type="select2" data-pk="1" data-value="United States" data-title="Select country" class="editable editable-click">United States</a></td>
                                        </tr>
                                        <tr>
                                            <td>State</td>
                                            <td><a href="#" id="state" data-type="typeaheadjs" data-pk="1" data-placement="right" data-title="Start typing State.." class="editable editable-click"></a></td>
                                        </tr>
                                        <tr>
                                            <td>Street Address</td>
                                            <td><a href="#" id="street" data-type="text" data-pk="1" data-placeholder="Enter street address.."  data-title="Please, fill address" class="editable editable-click"></a></td>
                                        </tr>
                                        <tr>
                                            <td>Zip</td>
                                            <td><a href="#" id="zip" data-type="text" data-pk="1" data-placeholder="Enter zipcode.." data-title="Enter zipcode" class="editable editable-pre-wrapped editable-click"></a></td>
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





