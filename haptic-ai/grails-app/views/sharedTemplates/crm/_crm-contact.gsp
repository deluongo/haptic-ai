

<div class="row">
    <div class="col-md-8">
        <div class="panel panel-white">
            <div class="panel-body">
                <h2 class="no-m m-b-lg">Contact Name</h2>


                <hr>

                <h3>Personal Details</h3>
                <table id="personal-details" class="table table-bordered table-striped" style="clear: both">
                    <tbody>
                    <tr>
                        <td>Salutation</td>
                        <td><a href="#" id="salutation" data-type="text" data-pk="1" data-placement="right" data-placeholder="Required" data-title="Enter your first name" class="editable editable-click editable-empty">Empty</a></td>
                    </tr>
                    <tr>
                        <td>First Name</td>
                        <td><a href="#" id="firstName" data-type="text" data-pk="1" data-placement="right" data-placeholder="Required" data-title="Enter your first name" class="editable editable-click editable-empty">Empty</a></td>
                    </tr>
                    <tr>
                        <td>Last Name</td>
                        <td><a href="#" id="lastName" data-type="text" data-pk="1" data-placement="right" data-placeholder="Required" data-title="Enter your last name" class="editable editable-click editable-empty">Empty</a></td>
                    </tr>
                    <tr>
                        <td>Gender</td>
                        <td><a href="#" id="gender" data-type="select" data-pk="1" data-value="" data-title="Select sex" class="editable editable-click" style="color: gray;">not selected</a></td>
                    </tr>
                    <tr>
                        <td>Job Title</td>
                        <td><a href="#" id="jobTitle" data-type="select" data-pk="1" data-value="5" data-source="/titles" data-title="Select group" class="editable editable-click">Admin</a></td>
                    </tr>
                    <tr>
                        <td>Group</td>
                        <td><a href="#" id="group" data-type="select" data-pk="1" data-value="" data-title="Select sex" class="editable editable-click" style="color: gray;">not selected</a></td>
                    </tr>
                    <tr>
                        <td>Company</td>
                        <td>
                            <div class="col-xs-6">
                                <a href="#" id="company" data-type="select2" data-pk="1" data-value="BS" data-title="Select country" class="editable editable-click">Bahamas</a>
                            </div>
                            <div class="col-xs-6">
                                <!--Make Modal Window-->
                                <button id="new-company" class="btn btn-info">New Company</button>
                            </div>
                        </td>
                    </tr>

                    </tbody>
                </table>

                <h3> Contact Info </h3>

                <contactInfo:allDetails source="${contact ?: []}" ></contactInfo:allDetails>





                <div style="float: left; width: 50%">
                    <h3>Console <small>(all ajax requests here are emulated)</small></h3>
                    <div><textarea id="console" class="form-control" rows="8" style="width: 70%"></textarea></div>
                </div>
            </div>
        </div>
    </div>
</div><!-- Row -->
