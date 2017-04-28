<!-- Address Model -->
<div class="container">
    <!-- Modal -->
    <div class="modal fade" id="addressModal" role="dialog">
        <div class="modal-dialog modal-lg">
            <div class="modal-content">
                <div class="modal-header" style="padding:35px 50px;">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>

                    <h2 class="no-m m-b-lg">New Address</h2>
                </div>
                <hr>
                <div class="modal-body remove-margin-b remove-padding-b">

                    <h4 class=""> Complete the fields below to add a new address.  </h4>
                    <div id="validation-error-messages"></div>
                    <!-- Display Post Submit Form -->

                    <div class="panel panel-white">
                        <div class="panel-body">


                            <div class = "row">
                                <div class="col-xs-12">
                                    <table id="professional-details" class="table table-bordered table-striped" style="clear: both">
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


