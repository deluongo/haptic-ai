<div class = "row">

    <div class="col-xs-6">
        <h3 class="margin-0-t-i">Personal</h3>
        <table id="personal-details" class="table table-bordered table-striped" style="clear: both">
            <tbody>
            <tr>
                <td>Salutation</td>
                <td><a href="#" id="salutation"  data-type="select" data-lead="${lead?.id}" data-pk="${activeContact?.id}" data-source="/salutations" data-title="Select salutation" class="editable editable-click editable-empty" style="color: gray;">
                    ${activeContact?.salutation}</a></td>
            </tr>
            <tr>
                <td>First Name</td>
                <td><a href="#" id="firstName" data-type="text" data-lead="${lead?.id}" data-pk="${activeContact?.id}" data-placement="right" data-placeholder="Required" data-title="Enter your first name" class="editable editable-click editable-empty">
                    ${activeContact?.firstName}</a></td>
            </tr>
            <tr>
                <td>Last Name</td>
                <td><a href="#" id="lastName" data-type="text" data-lead="${lead?.id}" data-pk="${activeContact?.id}" data-placement="right" data-placeholder="Required" data-title="Enter your last name" class="editable editable-click editable-empty">
                    ${activeContact?.lastName}</a></td>
            </tr>
            <tr>
                <td>Gender</td>
                <td><a href="#" id="gender" data-type="select" data-lead="${lead?.id}" data-pk="${activeContact?.id}" data-value="" data-source="/genders" data-title="Select gender" class="editable editable-click" style="color: gray;">
                    ${activeContact?.gender}</a></td>
            </tr>
            </tbody>
        </table>
    </div>

    <div class="col-xs-6">
        <h3 class="margin-0-t-i">Professional</h3>
        <table id="professional-details" class="table table-bordered table-striped" style="clear: both">
            <tbody>
            <tr>
                <td>Department</td>
                <td><a href="#" id="department" data-type="select" data-lead="${lead?.id}" data-pk="${activeContact?.id}" data-value="5" data-source="/departments" data-title="Select group" class="editable editable-click">${activeContact?.department}</a></td>
            </tr>
            <tr>
                <td>Role</td>
                <td><a href="#" id="jobRole" data-type="select" data-lead="${lead?.id}" data-pk="${activeContact?.id}" data-value="5" data-source="/roles" data-title="Select group" class="editable editable-click">${activeContact?.jobRole}</a></td>
            </tr>
            <tr>
                <td>Job Title</td>
                <td><a href="#" id="jobTitle" data-type="select" data-lead="${lead?.id}" data-pk="${activeContact?.id}" data-value="5" data-source="/titles" data-title="Select group" class="editable editable-click">${activeContact?.jobTitle}</a></td>
            </tr>
            <tr>
                <td>Role Description <br/><small>Submit w/ <i>ctrl+enter</i></small></td>
                <td><a href="#" id="roleDescription" data-type="textarea" data-lead="${lead?.id}" data-pk="${activeContact?.id}" data-placeholder="Your comments here..." data-title="Enter comments" class="editable editable-pre-wrapped editable-click">${activeContact?.roleDescription}</a></td>
            </tr>
            <tr>
                <td>Company</td>
                <!--Make Modal Window-->
                <td><a href="#" id="company" data-type="select2" data-lead="${lead?.id}" data-pk="${activeContact?.id}" data-value="BS" data-title="Select country" class="editable editable-click">${activeContact?.company?.companyName ?: lead?.company?.companyName}</a>&nbsp; <small><a href="#"><i class="fa fa-plus" aria-hidden="true"></i></a></small></td>
            </tr>
            </tbody>
        </table>
    </div>
</div>

<h3> Contact Info </h3>

<contactInfo:allDetails source="${activeContact ?: []}" ></contactInfo:allDetails>

<!-- Modals -->
<g:render template="/sharedTemplates/modals/contact-info-modals"/>


<div style="float: left; width: 50%">
<h3>Console <small>(all ajax requests here are emulated)</small></h3>
<div><textarea id="console" class="form-control" rows="8" style="width: 70%"></textarea></div>
</div>


