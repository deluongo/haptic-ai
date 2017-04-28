

<div class="row">
    <div class="col-md-8">
        <div class="panel panel-white">
            <div class="panel-body">
                <h2 class="no-m m-b-lg">Lead Name</h2>


                <hr>

                <h3>Overview</h3>

                <h3>Overview</h3>
                <table id="user" class="table table-bordered table-striped" style="clear: both">
                    <tbody>
                    <tr>
                        <td style="width: 35%;">Simple text field</td>
                        <td style="width: 65%;"><a href="#" id="username" data-type="text" data-pk="1" data-title="Enter username" class="editable editable-click" style="display: inline;">superuser</a></td>
                    </tr>
                    <tr>
                        <td>Empty text field, required</td>
                        <td><a href="#" id="firstname" data-type="text" data-pk="1" data-placement="right" data-placeholder="Required" data-title="Enter your firstname" class="editable editable-click editable-empty">Empty</a></td>
                    </tr>
                    <tr>
                        <td>Select, local array, custom display</td>
                        <td><a href="#" id="sex" data-type="select" data-pk="1" data-value="" data-title="Select sex" class="editable editable-click" style="color: gray;">not selected</a></td>
                    </tr>
                    <tr>
                        <td>Select, remote array, no buttons</td>
                        <td><a href="#" id="group" data-type="select" data-pk="1" data-value="5" data-source="/groups" data-title="Select group" class="editable editable-click">Admin</a></td>
                    </tr>
                    <tr>
                        <td>Select, error while loading</td>
                        <td><a href="#" id="status" data-type="select" data-pk="1" data-value="0" data-source="/status" data-title="Select status" class="editable editable-click">Active</a></td>
                    </tr>

                    <tr>
                        <td>Datepicker</td>
                        <td>
                            <div class='input-group date' id='vacation'>
                                <input type='text' class="form-control" />
                                <span class="input-group-addon">
                                    <span class="glyphicon glyphicon-calendar"></span>
                                </span>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td>Combodate (date)</td>
                        <td><a href="#" id="dob" data-type="combodate" data-value="1984-05-15" data-format="YYYY-MM-DD" data-viewformat="DD/MM/YYYY" data-template="D / MMM / YYYY" data-pk="1" data-title="Select Date of birth" class="editable editable-click">15/05/1984</a></td>
                    </tr>
                    <tr>
                        <td>Combodate (datetime)</td>
                        <td><a href="#" id="event" data-type="combodate" data-template="D MMM YYYY  HH:mm" data-format="YYYY-MM-DD HH:mm" data-viewformat="MMM D, YYYY, HH:mm" data-pk="1" data-title="Setup event date and time" class="editable editable-click editable-empty">Empty</a></td>
                    </tr>
                    <tr>
                        <td>Textarea, buttons below. Submit by <i>ctrl+enter</i></td>
                        <td><a href="#" id="comments" data-type="textarea" data-pk="1" data-placeholder="Your comments here..." data-title="Enter comments" class="editable editable-pre-wrapped editable-click">awesome
                        user!</a></td>
                    </tr>
                    <tr>
                        <td>Twitter typeahead.js</td>
                        <td><a href="#" id="state2" data-type="typeaheadjs" data-pk="1" data-placement="right" data-title="Start typing State.." class="editable editable-click">California</a></td>
                    </tr>
                    <tr>
                        <td>Checklist</td>
                        <td><a href="#" id="fruits" data-type="checklist" data-value="2,3" data-title="Select fruits" class="editable editable-click">peach<br>apple</a></td>
                    </tr>
                    <tr>
                        <td>Select2 (tags mode)</td>
                        <td><a href="#" id="tags" data-type="select2" data-pk="1" data-title="Enter tags" class="editable editable-click">html, javascript</a></td>
                    </tr>
                    <tr>
                        <td>Select2 (dropdown mode)</td>
                        <td><a href="#" id="country" data-type="select2" data-pk="1" data-value="BS" data-title="Select country" class="editable editable-click">Bahamas</a></td>
                    </tr>
                    <tr>
                        <td>Custom input, several fields</td>
                        <td><a href="#" id="address" data-type="address" data-pk="1" data-title="Please, fill address" class="editable editable-click"><b>Moscow</b>, Lenina st., bld. 12</a></td>
                    </tr>
                    </tbody>
                </table>
                <div style="float: left; width: 50%">
                    <h3>Console <small>(all ajax requests here are emulated)</small></h3>
                    <div><textarea id="console" class="form-control" rows="8" style="width: 70%"></textarea></div>
                </div>
            </div>
        </div>
    </div>
</div><!-- Row -->
