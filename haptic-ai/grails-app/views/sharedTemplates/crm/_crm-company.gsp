<div class = "row">
    <div class="col-xs-6">
        <h3 class="margin-0-t-i">Details</h3>
        <table id="personal-details" class="table table-bordered table-striped" style="clear: both">
            <tbody>
            <tr>
                <td>Name</td>
                <td><a href="#" id="companyName" data-type="text" data-pk="1" data-placement="right" data-placeholder="Required" data-title="Enter your first name" class="editable editable-click editable-empty"></a></td>
            </tr>
            <tr>
                <td>Vertical</td>
                <td><a href="#" id="marketVertical" data-type="radiolist" data-pk="1" data-value="" data-title="Select a market vertical" class="editable editable-click" style="color: gray;">unknown</a></td>
            </tr>
            <tr>
                <td>Revenue</td>
                <td><a href="#" id="companyRevenue" data-type="select" data-pk="1" data-value="" data-source="/companyRevenue" data-title="Select a revenue tier" class="editable editable-click" style="color: gray;">unknown</a></td>
            </tr>
            </tbody>
        </table>
    </div>
</div>

<h3> Contact Info </h3>

<contactInfo:allDetails source="${company ?: []}" ></contactInfo:allDetails>

<!-- Modals -->
<g:render template="/sharedTemplates/modals/contact-info-modals"/>


<div style="float: left; width: 50%">
<h3>Console <small>(all ajax requests here are emulated)</small></h3>
<div><textarea id="console" class="form-control" rows="8" style="width: 70%"></textarea></div>
</div>


