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