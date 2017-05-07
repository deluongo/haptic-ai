


$( document ).ready(function() {


/*                          ==============  ***  ==============                          *
 #  ---------------------          KPI Pie Chart Functions         --------------------  #
 *                          ===================================                          */

                            //   /\  /\  /\  /\  /\  /\  /\ \\
                            //  /  \/  \/  \/  \/  \/  \/  \ \\

/*  _________________________                                  ________________________  */
/*  ========================= !!! ---*** COLLECTIVE ***--- !!! ========================  */


/*  -------------------         *** Temporary AJAX Mocks ***        -------------------  */
    /*
     * Easy Pie Chart, for more examples you can check out http://rendro.github.io/easy-pie-chart/
     *
     * App.initHelper('easy-pie-chart');
     *
     */

        // Init Easy Pie Charts (with .js-pie-chart class)
        jQuery('.js-pie-chart').easyPieChart({
            barColor: jQuery(this).data('bar-color') ? jQuery(this).data('bar-color') : '#777777',
            trackColor: jQuery(this).data('track-color') ? jQuery(this).data('track-color') : '#eeeeee',
            lineWidth: jQuery(this).data('line-width') ? jQuery(this).data('line-width') : 3,
            size: jQuery(this).data('size') ? jQuery(this).data('size') : '80',
            animate: 750,
            scaleColor: jQuery(this).data('scale-color') ? jQuery(this).data('scale-color') : false
        });


        jQuery('.kpi-2').easyPieChart({
                barColor: function(percent) {
                    var ctx = this.renderer.getCtx();
                    var canvas = this.renderer.getCanvas();
                    var gradient = ctx.createLinearGradient(0,0,canvas.width,0);
                    gradient.addColorStop(0, "#ffe57e");
                    gradient.addColorStop(1, "#de5900");
                    return gradient;
                },
                easing: 'easeOutBounce',
                animate: 2000,
                onStep: function(from, to, percent) {
                    $(this.el).find('.kpi-2-value').text(Math.round(percent));
                }
        });

        jQuery('.kpi-3').easyPieChart({
            easing: 'easeOutBounce',
            animate: 2000,
            onStep: function(from, to, percent) {
                $(this.el).find('.kpi-3-value').text(Math.round(percent)).append("%");
            }
        });

        jQuery('.kpi-4').easyPieChart({
            easing: 'easeOutBounce',
            animate: 2000,
            onStep: function(from, to, percent) {
                $(this.el).find('.kpi-4-value').text(Math.round(percent)).append("%");
            }
        });

        jQuery('.kpi-2-sm').easyPieChart({
            barColor: function(percent) {
                var ctx = this.renderer.getCtx();
                var canvas = this.renderer.getCanvas();
                var gradient = ctx.createLinearGradient(0,0,canvas.width,0);
                gradient.addColorStop(0, "#ffe57e");
                gradient.addColorStop(1, "#de5900");
                return gradient;
            },
            easing: 'easeOutBounce',
            animate: 2000,
            onStep: function(from, to, percent) {
                $(this.el).find('.kpi-2-value-sm').text(Math.round(percent));
            }
        });

        jQuery('.kpi-3-sm').easyPieChart({
            barColor: function(percent) {
                var ctx = this.renderer.getCtx();
                var canvas = this.renderer.getCanvas();
                var gradient = ctx.createLinearGradient(0,0,canvas.width,0);
                gradient.addColorStop(0, "#ffe57e");
                gradient.addColorStop(1, "#de5900");
                return gradient;
            },
            easing: 'easeOutBounce',
            animate: 2000,
            onStep: function(from, to, percent) {
                $(this.el).find('.kpi-3-value-sm').text(Math.round(percent));
            }
        });

        jQuery('.kpi-4-sm').easyPieChart({
            easing: 'easeOutBounce',
            animate: 2000,
            onStep: function(from, to, percent) {
                $(this.el).find('.kpi-4-value-sm').text(Math.round(percent)).append("%");
            }
        });


    //update instance after 5 sec
        setTimeout(function() {
            $('.kpi-2').data('easyPieChart').update(40);
        }, 5000);

        setTimeout(function() {
            $('.kpi-2-sm').data('easyPieChart').update(40);
        }, 5000);

        var chart_2 = window.chart = $('.kpi-2').data('easyPieChart');
        $('.js_update_2').on('click', function() {
            chart_2.update(Math.random()*200-100);
        });

        var chart_3 = window.chart = $('.kpi-3').data('easyPieChart');
        $('.js_update_3').on('click', function() {
            chart_3.update(Math.random()*200-100);
        });

        var chart_4 = window.chart = $('.kpi-4').data('easyPieChart');
        $('.js_update_4').on('click', function() {
            chart_4.update(Math.random()*200-100);
        });

        var chart_2_sm = window.chart = $('.kpi-2-sm').data('easyPieChart');
        $('.js_update_2_sm').on('click', function() {
            chart_2_sm.update(Math.random()*200-100);
        });

        var chart_3_sm = window.chart = $('.kpi-3-sm').data('easyPieChart');
        $('.js_update_3_sm').on('click', function() {
            chart_3_sm.update(Math.random()*200-100);
        });

        var chart_4_sm = window.chart = $('.kpi-4-sm').data('easyPieChart');
        $('.js_update_4_sm').on('click', function() {
            chart_4_sm.update(Math.random()*200-100);
        });


        jQuery('.percentage').easyPieChart({
            animate: 2000,
            lineWidth: 4,
            easing: 'easeOutBounce',
            onStep: function(from, to, percent) {
                $(this.el).find('.percent').text(Math.round(percent));
            }
        });


/*                          ==============  ***  ==============                          *
 #  ---------------------             Forms Functions              --------------------  #
 *                          ===================================                          */

                            //   /\  /\  /\  /\  /\  /\  /\ \\
                            //  /  \/  \/  \/  \/  \/  \/  \ \\

/*  _________________________                                  ________________________  */
/*  ========================= !!! ---*** COLLECTIVE ***--- !!! ========================  */


/*  -------------------         *** Temporary AJAX Mocks ***        -------------------  */
        //ajax mocks
        $.mockjaxSettings.responseTime = 500;

        $.mockjax({
            url: '/post',
            response: function(settings) {
                log(settings, this);
            }
        });

        $.mockjax({
            url: '/error',
            status: 400,
            statusText: 'Bad Request',
            response: function(settings) {
                this.responseText = 'Please input correct value';
                log(settings, this);
            }
        });

        $.mockjax({
            url: '/status',
            status: 500,
            response: function(settings) {
                this.responseText = 'Internal Server Error';
                log(settings, this);
            }
        });

        $.mockjax({
            url: '/groups',
            response: function(settings) {
                this.responseText = [
                    {value: 0, text: 'Guest'},
                    {value: 1, text: 'Service'},
                    {value: 2, text: 'Customer'},
                    {value: 3, text: 'Operator'},
                    {value: 4, text: 'Support'},
                    {value: 5, text: 'Admin'}
                ];
                log(settings, this);
            }
        });

        function log(settings, response) {
            var s = [], str;
            s.push(settings.type.toUpperCase() + ' url = "' + settings.url + '"');
            for(var a in settings.data) {
                if(settings.data[a] && typeof settings.data[a] === 'object') {
                    str = [];
                    for(var j in settings.data[a]) {str.push(j+': "'+settings.data[a][j]+'"');}
                    str = '{ '+str.join(', ')+' }';
                } else {
                    str = '"'+settings.data[a]+'"';
                }
                s.push(a + ' = ' + str);
            }
            s.push('RESPONSE: status = ' + response.status);

            if(response.responseText) {
                if($.isArray(response.responseText)) {
                    s.push('[');
                    $.each(response.responseText, function(i, v){
                        s.push('{value: ' + v.value+', text: "'+v.text+'"}');
                    });
                    s.push(']');
                } else {
                    s.push($.trim(response.responseText));
                }
            }
            s.push('--------------------------------------\n');
            $('#console').val(s.join('\n') + $('#console').val());
        }


/*  -------------------           *** Default Settings ***          -------------------  */
        //default post submit URL
        $.fn.editable.defaults.url = '/post';

        //default inline vs. popup forms
        var c = window.location.href.match(/c=inline/i) ? 'inline' : 'popup';
        $.fn.editable.defaults.mode =  'inline' ;

/*  -------------------           *** Settings Toggles ***          -------------------  */
        $('#c').val(c);
        //enable / disable
        $('#enable').click(function() {
            $('#user .editable').editable('toggleDisabled');
        });

/*  -------------------             *** Editable Def ***            -------------------  */

$('.editable').on('hidden', function(e, reason){
    if(reason === 'save' || reason === 'nochange') {
        var $next = $(this).closest('tr').next().find('.editable');
        if($('#autoopen').is(':checked')) {
            setTimeout(function() {
                $next.editable('show');
            }, 300);
        } else {
            $next.focus();
        }
    }
});

/*  -------------------         *** Modify Button Styles ***        -------------------  */
/*
    $.fn.editableform.buttons =
        '<button type="submit" class="btn btn-success editable-submit btn-mini"><i class="icon-ok icon-white"></i></button>' +
        '<button type="button" class="btn editable-cancel btn-mini"><i class="icon-remove"></i></button>';
*/





                                //=======================\\
                               //                         \\
                              //          TEMPLATE         \\
                             //                             \\
                            //   /\  /\  /\  /\  /\  /\  /\  \\
                           //___/  \/  \/  \/  \/  \/  \/  \__\\


/*  ______________________                                         ____________________  */
/*  ====================== !!! ---*** FIELD DEFINITIONS ***--- !!! ====================  */

        $('#username').editable({
            url: '/post',
            type: 'text',
            pk: 1,
            name: 'username',
            title: 'Enter username'
        });

        $('#sex').editable({
            prepend: "not selected",
            source: [
                {value: 1, text: 'Male'},
                {value: 2, text: 'Female'}
            ],
            display: function(value, sourceData) {
                var colors = {"": "gray", 1: "green", 2: "blue"},
                    elem = $.grep(sourceData, function(o){return o.value == value;});

                if(elem.length) {
                    $(this).text(elem[0].text).css("color", colors[value]);
                } else {
                    $(this).empty();
                }
            }
        });

        $('#status').editable();


        $(function () {
            $('#vacation').datetimepicker();
        });

        $('#dob').editable();

        $('#event').editable({
            placement: 'right',
            combodate: {
                firstItem: 'name'
            }
        });

        $('#meeting_start').editable({
            format: 'yyyy-mm-dd hh:ii',
            viewformat: 'dd/mm/yyyy hh:ii',
            validate: function(v) {
                if(v && v.getDate() == 10) return 'Day cant be 10!';
            },
            datetimepicker: {
                todayBtn: 'linked',
                weekStart: 1
            }
        });

        $('#comments').editable({
            showbuttons: 'bottom'
        });

        $('#note').editable();
        $('#pencil').click(function(e) {
            e.stopPropagation();
            e.preventDefault();
            $('#note').editable('toggle');
        });

        $('#state2').editable({
            source: ["Alabama","Alaska","Arizona","Arkansas","California","Colorado","Connecticut","Delaware","Florida","Georgia","Hawaii","Idaho","Illinois","Indiana","Iowa","Kansas","Kentucky","Louisiana","Maine","Maryland","Massachusetts","Michigan","Minnesota","Mississippi","Missouri","Montana","Nebraska","Nevada","New Hampshire","New Jersey","New Mexico","New York","North Dakota","North Carolina","Ohio","Oklahoma","Oregon","Pennsylvania","Rhode Island","South Carolina","South Dakota","Tennessee","Texas","Utah","Vermont","Virginia","Washington","West Virginia","Wisconsin","Wyoming"]
        });


        $('#fruits').editable({
            pk: 1,
            limit: 3,
            source: [
                {value: 1, text: 'banana'},
                {value: 2, text: 'peach'},
                {value: 3, text: 'apple'},
                {value: 4, text: 'watermelon'},
                {value: 5, text: 'orange'}
            ]
        });

        $('#tags').editable({
            inputclass: 'input-large',
            select2: {
                tags: ['html', 'javascript', 'css', 'ajax'],
                tokenSeparators: [",", " "]
            }
        });

        $('#address').editable({
            url: '/post',
            value: {
                city: "Moscow",
                street: "Lenina",
                building: "12"
            },
            validate: function(value) {
                if(value.city == '') return 'city is required!';
            },
            display: function(value) {
                if(!value) {
                    $(this).empty();
                    return;
                }
                var html = $('<div>').text(value.city).html() + '</b>, ' + $('<div>').text(value.street).html() + ' st., bld. ' + $('<div>').text(value.building).html();
                $(this).html(html);
            }
        });





                                     //~~~~~~~~~~~~~~~\\
                                    //                 \\
                                   //      CONTACT      \\
                                  //                     \\
                                 //=======================\\
                                //                         \\
                               //            CRM            \\
                              //                             \\
                             //   /\  /\  /\  /\  /\  /\  /\  \\
                            //___/  \/  \/  \/  \/  \/  \/  \__\\


/*  ______________________                                         ____________________  */
/*  ====================== !!! ---*** FIELD DEFINITIONS ***--- !!! ====================  */


/*  -------------------           *** Personal Details ***          -------------------  */


    /*  ~~~~~~~~~~~~~~~~~~~~~~~~~~
     *  ~~~~~~~~~ GROUP ~~~~~~~~~~
     *  ~~~~~~~~~~~~~~~~~~~~~~~~~~ */

    //


    $(document).on("mouseover", "#display-contact-panel", function(){
        $('#salutation').editable({
            showbuttons: false,
            url: 'storeEditable',
            send: 'always',
            params: {lead: $('#firstName').data("lead")},
            emptytext: 'unknown',
            validate: function(value) {
                if($.trim(value) == '') return 'This field is required';
            }
        });


        $.mockjax({
            url: '/salutations',
            response: function(settings) {
                this.responseText = [
                    {value: 'Mr.', text: 'Mr.'},
                    {value: 'Mrs.', text: 'Mrs.'},
                    {value: 'Ms.', text: 'Ms.'},
                    {value: 'Dr.', text: 'Dr.'},
                    {value: 'Sir', text: 'Sir'},
                    {value: 'Professor', text: 'Professor'}
                ];
                log(settings, this);
            }
        });




        /*  ~~~~~~~~~~~~~~~~~~~~~~~~~~
         *  ~~~~~~~~~~ NAME ~~~~~~~~~~
         *  ~~~~~~~~~~~~~~~~~~~~~~~~~~ */

        $('#firstName').editable({
            validate: function(value) {
                if($.trim(value) == '') return 'This field is required';
            },
            url: 'storeEditable',
            send: 'always',
            params: {lead: $('#firstName').data("lead")}
        }).on('shown', function(ev, editable) {
            setTimeout(function() {
                editable.input.$input.select();
            },0);
        });




        $('#lastName').editable({
            validate: function(value) {
                if($.trim(value) == '') return 'This field is required';
            },
            url: 'storeEditable',
            send: 'always',
            params: {lead: $('#firstName').data("lead")}
        }).on('shown', function(ev, editable) {
            setTimeout(function() {
                editable.input.$input.select();
            },0);
        });


        /*  ~~~~~~~~~~~~~~~~~~~~~~~~~~
         *  ~~~~~~~~~ GENDER ~~~~~~~~~
         *  ~~~~~~~~~~~~~~~~~~~~~~~~~~ */
        $('#gender').editable({
            showbuttons: false,
            emptyText: 'unknown',
            url: 'storeEditable',
            send: 'always',
            params: {lead: $('#firstName').data("lead")}
        });

        $.mockjax({
            url: '/genders',
            response: function(settings) {
                this.responseText = [
                    {value: 'Male', text: 'Male'},
                    {value: 'Female', text: 'Female'},
                    {value: 'Trans', text: 'Trans'},
                    {value: 'Other', text: 'Other'}
                ];
                log(settings, this);
            }
        });



    /*  -------------------         *** Professional Details ***        -------------------  */


        // *** Enable Dependent Lists *** //
        var department_role_sources = {
            'Sales': [{value: 'Sales Development', text: 'Sales Development'}, {value: 'Account Management', text: 'Account Management'}, {value: 'Customer Success', text: 'Customer Success'}],
            'Marketing': [{value: 'Product Marketing', text: 'Product Marketing'}, {value: 'Lead Generation', text: 'Lead Generation'}],
            'Engineering': [{value: 'Product Management', text: 'Product Management'}, {value: 'Software Engineer', text: 'Software Engineer'}, {value: 'Dev Ops', text: 'Dev Ops'}, {value: 'Code Testing', text: 'Code Testing'}, {value: 'IT', text: 'IT'}],
            'Support': [{value: 'Customer Support', text: 'Customer Support'}, {value: 'Onsite Specialist', text: 'Onsite Specialist'}, {value: 'Technical Writing', text: 'Technical Writing'}],
            'Training & Education': [{value: 'Customer Onboarding', text: 'Customer Onboarding'}, {value: 'Job Training', text: 'Job Training'}]
        };


        /*  ~~~~~~~~~~~~~~~~~~~~~~~~~~
         *  ~~~~~~~ DEPARTMENT ~~~~~~~
         *  ~~~~~~~~~~~~~~~~~~~~~~~~~~ */
        $('#department').editable({
            showbuttons: false,
            emptyText: 'unknown',
            url: 'storeEditable',
            send: 'always',
            params: {lead: $('#firstName').data("lead")},
            success: function(response, newValue) {
                $('#jobRole').editable('option', 'source', department_role_sources[newValue]);
                $('#jobRole').editable('setValue', null);
            }
        });

        $.mockjax({
            url: '/departments',
            response: function(settings) {
                this.responseText = [
                    {value: 'Sales', text: 'Sales'},
                    {value: 'Marketing', text: 'Marketing'},
                    {value: 'Engineering', text: 'Engineering'},
                    {value: 'Support', text: 'Support'},
                    {value: 'Training & Education', text: 'Training & Education'}
                ];
                log(settings, this);
            }
        });

        /*  ~~~~~~~~~~~~~~~~~~~~~~~~~~
         *  ~~~~~~~~ JOB ROLE ~~~~~~~~
         *  ~~~~~~~~~~~~~~~~~~~~~~~~~~ */
        $('#jobRole').editable({
            showbuttons: false,
            emptyText: 'unknown',
            url: 'storeEditable',
            send: 'always',
            params: {lead: $('#firstName').data("lead")}
        });

        $.mockjax({
            url: '/roles',
            response: function(settings) {
                this.responseText = [
                    {value: 11, text: 'Sales Development'}, {value: 12, text: 'Account Management'}, {value: 22, text: 'Customer Success'},
                    {value: 21, text: 'Product Marketing'}, {value: 22, text: 'Lead Generation'}, {value: 31, text: 'Product Management'},
                    {value: 32, text: 'Software Engineer'}, {value: 33, text: 'Dev Ops'}, {value: 34, text: 'Code Testing'}, {value: 35, text: 'IT'},
                    {value: 41, text: 'Customer Support'}, {value: 42, text: 'Onsite Specialist'}, {value: 43, text: 'Technical Writing'},
                    {value: 51, text: 'Customer Onboarding'}, {value: 52, text: 'Job Training'}
                ];
                log(settings, this);
            }
        });

        /*  ~~~~~~~~~~~~~~~~~~~~~~~~~~
         *  ~~~~~~~ JOB TITLE ~~~~~~~~
         *  ~~~~~~~~~~~~~~~~~~~~~~~~~~ */

        $('#jobTitle').editable({
            showbuttons: false,
            emptyText: 'unknown',
            url: 'storeEditable',
            send: 'always',
            params: {lead: $('#firstName').data("lead")},
        });

        $.mockjax({
            url: '/titles',
            response: function(settings) {
                this.responseText = [
                    {value: 'Independent Contractor', text: 'Independent Contractor'},
                    {value: 'Entry Level', text: 'Entry Level'},
                    {value: 'Manager', text: 'Manager'},
                    {value: 'Director', text: 'Director'},
                    {value: 'Executive', text: 'Executive'},
                    {value: 'Vice President', text: 'Vice President'},
                    {value: 'C-Level Executive', text: 'C-Level Executive'},
                    {value: 'CEO', text: 'CEO'}
                ];
                log(settings, this);
            }
        });

        /*  ~~~~~~~~~~~~~~~~~~~~~~~~~
         *  ~~~~ JOB DESCRIPTION ~~~~
         *  ~~~~~~~~~~~~~~~~~~~~~~~~~ */
        $('#roleDescription').editable({
            showbuttons: 'bottom',
            url: 'storeEditable',
            send: 'always',
            params: {lead: $('#firstName').data("lead")},
        }).on('shown', function(ev, editable) {
            setTimeout(function() {
                editable.input.$input.select();
            },0);
        });

        /*  ~~~~~~~~~~~~~~~~~~~~~~~~~~
         *  ~~~~~~~~~ COMPANY ~~~~~~~~
         *  ~~~~~~~~~~~~~~~~~~~~~~~~~~ */
        var company = [];
        $.each({"Microsoft": "Microsoft", "Apple": "Apple"}, function(k, v) {
            company.push({id: k, text: v});
        });




        $('#company').editable({
            source: company,
            url: 'storeEditable',
            send: 'always',
            params: {lead: $('#firstName').data("lead")},
            select2: {
                width: 200,
                placeholder: 'Select company',
                allowClear: true
            }
        });

        // Display lead specific content
        $('#company__').on("click", function(event) {
            $.ajax({
                url: 'companyList',
                success: function (response) {
                    console.log(response);
                    //var companys = JSON.parse(response);
                    //$.each(JSON.parse(response), function(k, v) {
                    //    companys.push({id: k, text: v});
                    //});
                    console.log(companyList, this);
                },
                response: function(response) {
                    this.responseText = response;
                }
            });
            return false;
        });



                                         //~~~~~~~~~~~~~~~\\
                                        //                 \\
                                       //   CONTACT FIELDS  \\
                                      //                     \\
                                     //=======================\\
                                    //                         \\
                                   //           MODALS          \\
                                  //                             \\
                                 //   /\  /\  /\  /\  /\  /\  /\  \\
                                //___/  \/  \/  \/  \/  \/  \/  \__\\


    /*  ______________________                                         ____________________  */
    /*  ====================== !!! ---*** FIELD DEFINITIONS ***--- !!! ====================  */



    /*  -------------------           *** Contact Details ***           -------------------  */

        /*  ~~~~~~~~~~~~~~~~~~~~~~~~~~
         *  ~~~~~~~~~ EMAIL ~~~~~~~~~
         *  ~~~~~~~~~~~~~~~~~~~~~~~~~~ */
        $('#emailAddress').editable({
            validate: function(value) {
                if($.trim(value) == '') return 'This field is required';
            }
        }).on('shown', function(ev, editable) {
            setTimeout(function() {
                editable.input.$input.select();
            },0);
        });


        $('#emailType').editable({
            pk: 1,
            limit: 3,
            source: [
                {value: 1, text: 'Primary'},
                {value: 2, text: 'Secondary'},
                {value: 3, text: 'Company'},
                {value: 4, text: 'Personal'},
                {value: 5, text: 'Junk'}
            ]
        });

        $('#emailStatus').editable({
            pk: 1,
            limit: 3,
            value: 'Unverified',
            source: [
                {value: 1, text: 'Unverified'},
                {value: 2, text: 'Verified'},
                {value: 3, text: 'Active'},
                {value: 3, text: 'Inactive'},
                {value: 4, text: 'Unsubscribed'},
            ]
        });



        /*  ~~~~~~~~~~~~~~~~~~~~~~~~~~
         *  ~~~~~~~~~ PHONE ~~~~~~~~~
         *  ~~~~~~~~~~~~~~~~~~~~~~~~~~ */
        $('#phoneNumber').editable({
            tpl: '<input type="text" id ="phone-number-mask" class="mask">',
            validate: function(value) {
                if($.trim(value) == '') return 'This field is required';
            }
        }).on('shown', function(ev, editable) {
            setTimeout(function() {
                editable.input.$input.select();
            },0);
        });

        $(document).on("focus", "#phone-number-mask", function () {
            $(this).mask("(999) 999-9999? x99999");
        });

        $('#phoneType').editable({
            pk: 1,
            limit: 3,
            source: [
                {value: 1, text: 'Primary'},
                {value: 2, text: 'Secondary'},
                {value: 3, text: 'Work'},
                {value: 3, text: 'Operator/Receptionist'},
                {value: 3, text: 'Automated Routing'},
                {value: 4, text: 'Home'},
                {value: 4, text: 'Cell'},
                {value: 4, text: 'Conference Dial-In'},
                {value: 5, text: 'Burner'}
            ]
        });

        $('#phoneStatus').editable({
            pk: 1,
            limit: 3,
            value: 'Unverified',
            source: [
                {value: 1, text: 'Unverified'},
                {value: 2, text: 'Verified'},
                {value: 3, text: 'Active'},
                {value: 4, text: 'Inactive'},
                {value: 5, text: 'Direct to Voicemail'},
                {value: 6, text: 'Unsubscribed'}
            ]
        });

        /*  ~~~~~~~~~~~~~~~~~~~~~~~~~~
         *  ~~~~~ SOCIAL NETWORK ~~~~~
         *  ~~~~~~~~~~~~~~~~~~~~~~~~~~ */
        $('#networkUrl').editable({
            validate: function(value) {
                if($.trim(value) == '') return 'This field is required';
            }
        }).on('shown', function(ev, editable) {
            setTimeout(function() {
                editable.input.$input.select();
            },0);
        });

        $('#networkName').editable({
            showbuttons: 'bottom',
            source: [
                {value: 1, text: 'Linked In'},
                {value: 2, text: 'Twitter'},
                {value: 3, text: 'Facebook'},
                {value: 4, text: 'Instagram'},
                {value: 5, text: 'Snap Chat'},
                {value: 6, text: 'Pinterist'}
            ]
        });

        $('#socialNetworkHandel').editable({
            validate: function(value) {
                if($.trim(value) == '') return 'This field is required';
            }
        }).on('shown', function(ev, editable) {
            setTimeout(function() {
                editable.input.$input.select();
            },0);
        });

        /*  ~~~~~~~~~~~~~~~~~~~~~~~~~~
         *  ~~~~~~ REVIEW SITE ~~~~~~~
         *  ~~~~~~~~~~~~~~~~~~~~~~~~~~ */
        $('#reviewSiteUrl').editable({
            validate: function(value) {
                if($.trim(value) == '') return 'This field is required';
            }
        }).on('shown', function(ev, editable) {
            setTimeout(function() {
                editable.input.$input.select();
            },0);
        });

        $('#reviewSiteName').editable({
            showbuttons: 'bottom',
            source: [
                {value: 1, text: 'G2 Crowd'},
                {value: 2, text: 'Yelp'},
            ]
        });

        $('#reviewSiteHandel').editable({
            validate: function(value) {
                if($.trim(value) == '') return 'This field is required';
            }
        }).on('shown', function(ev, editable) {
            setTimeout(function() {
                editable.input.$input.select();
            },0);
        });

        /*  ~~~~~~~~~~~~~~~~~~~~~~~~~~
         *  ~~~~~~~~ WEB SITE ~~~~~~~~
         *  ~~~~~~~~~~~~~~~~~~~~~~~~~~ */

        $('#webSiteUrl').editable({
            validate: function(value) {
                if($.trim(value) == '') return 'This field is required';
            }
        }).on('shown', function(ev, editable) {
            setTimeout(function() {
                editable.input.$input.select();
            },0);
        });


        $('#webSiteName').editable({
            validate: function(value) {
                if($.trim(value) == '') return 'This field is required';
            }
        }).on('shown', function(ev, editable) {
            setTimeout(function() {
                editable.input.$input.select();
            },0);
        });

        $('#webSiteType').editable({
            showbuttons: 'bottom',
            source: [
                {value: 1, text: 'Living Resume'},
                {value: 2, text: 'Project/Work Portfolio'},
                {value: 3, text: 'Industry Blog'},
                {value: 4, text: 'Personal Blog'},
                {value: 5, text: 'Personal Website'},
                {value: 6, text: 'Hobby / Interest'}
            ]
        });


        /*  ~~~~~~~~~~~~~~~~~~~~~~~~~~
         *  ~~~~~~~~~ ADDRESS ~~~~~~~~
         *  ~~~~~~~~~~~~~~~~~~~~~~~~~~ */
        var countries = [];
        $.each({"BD": "Bangladesh", "BE": "Belgium", "BF": "Burkina Faso", "BG": "Bulgaria", "BA": "Bosnia and Herzegovina", "BB": "Barbados", "WF": "Wallis and Futuna", "BL": "Saint Bartelemey", "BM": "Bermuda", "BN": "Brunei Darussalam", "BO": "Bolivia", "BH": "Bahrain", "BI": "Burundi", "BJ": "Benin", "BT": "Bhutan", "JM": "Jamaica", "BV": "Bouvet Island", "BW": "Botswana", "WS": "Samoa", "BR": "Brazil", "BS": "Bahamas", "JE": "Jersey", "BY": "Belarus", "O1": "Other Country", "LV": "Latvia", "RW": "Rwanda", "RS": "Serbia", "TL": "Timor-Leste", "RE": "Reunion", "LU": "Luxembourg", "TJ": "Tajikistan", "RO": "Romania", "PG": "Papua New Guinea", "GW": "Guinea-Bissau", "GU": "Guam", "GT": "Guatemala", "GS": "South Georgia and the South Sandwich Islands", "GR": "Greece", "GQ": "Equatorial Guinea", "GP": "Guadeloupe", "JP": "Japan", "GY": "Guyana", "GG": "Guernsey", "GF": "French Guiana", "GE": "Georgia", "GD": "Grenada", "GB": "United Kingdom", "GA": "Gabon", "SV": "El Salvador", "GN": "Guinea", "GM": "Gambia", "GL": "Greenland", "GI": "Gibraltar", "GH": "Ghana", "OM": "Oman", "TN": "Tunisia", "JO": "Jordan", "HR": "Croatia", "HT": "Haiti", "HU": "Hungary", "HK": "Hong Kong", "HN": "Honduras", "HM": "Heard Island and McDonald Islands", "VE": "Venezuela", "PR": "Puerto Rico", "PS": "Palestinian Territory", "PW": "Palau", "PT": "Portugal", "SJ": "Svalbard and Jan Mayen", "PY": "Paraguay", "IQ": "Iraq", "PA": "Panama", "PF": "French Polynesia", "BZ": "Belize", "PE": "Peru", "PK": "Pakistan", "PH": "Philippines", "PN": "Pitcairn", "TM": "Turkmenistan", "PL": "Poland", "PM": "Saint Pierre and Miquelon", "ZM": "Zambia", "EH": "Western Sahara", "RU": "Russian Federation", "EE": "Estonia", "EG": "Egypt", "TK": "Tokelau", "ZA": "South Africa", "EC": "Ecuador", "IT": "Italy", "VN": "Vietnam", "SB": "Solomon Islands", "EU": "Europe", "ET": "Ethiopia", "SO": "Somalia", "ZW": "Zimbabwe", "SA": "Saudi Arabia", "ES": "Spain", "ER": "Eritrea", "ME": "Montenegro", "MD": "Moldova, Republic of", "MG": "Madagascar", "MF": "Saint Martin", "MA": "Morocco", "MC": "Monaco", "UZ": "Uzbekistan", "MM": "Myanmar", "ML": "Mali", "MO": "Macao", "MN": "Mongolia", "MH": "Marshall Islands", "MK": "Macedonia", "MU": "Mauritius", "MT": "Malta", "MW": "Malawi", "MV": "Maldives", "MQ": "Martinique", "MP": "Northern Mariana Islands", "MS": "Montserrat", "MR": "Mauritania", "IM": "Isle of Man", "UG": "Uganda", "TZ": "Tanzania, United Republic of", "MY": "Malaysia", "MX": "Mexico", "IL": "Israel", "FR": "France", "IO": "British Indian Ocean Territory", "FX": "France, Metropolitan", "SH": "Saint Helena", "FI": "Finland", "FJ": "Fiji", "FK": "Falkland Islands (Malvinas)", "FM": "Micronesia, Federated States of", "FO": "Faroe Islands", "NI": "Nicaragua", "NL": "Netherlands", "NO": "Norway", "NA": "Namibia", "VU": "Vanuatu", "NC": "New Caledonia", "NE": "Niger", "NF": "Norfolk Island", "NG": "Nigeria", "NZ": "New Zealand", "NP": "Nepal", "NR": "Nauru", "NU": "Niue", "CK": "Cook Islands", "CI": "Cote d'Ivoire", "CH": "Switzerland", "CO": "Colombia", "CN": "China", "CM": "Cameroon", "CL": "Chile", "CC": "Cocos (Keeling) Islands", "CA": "Canada", "CG": "Congo", "CF": "Central African Republic", "CD": "Congo, The Democratic Republic of the", "CZ": "Czech Republic", "CY": "Cyprus", "CX": "Christmas Island", "CR": "Costa Rica", "CV": "Cape Verde", "CU": "Cuba", "SZ": "Swaziland", "SY": "Syrian Arab Republic", "KG": "Kyrgyzstan", "KE": "Kenya", "SR": "Suriname", "KI": "Kiribati", "KH": "Cambodia", "KN": "Saint Kitts and Nevis", "KM": "Comoros", "ST": "Sao Tome and Principe", "SK": "Slovakia", "KR": "Korea, Republic of", "SI": "Slovenia", "KP": "Korea, Democratic People's Republic of", "KW": "Kuwait", "SN": "Senegal", "SM": "San Marino", "SL": "Sierra Leone", "SC": "Seychelles", "KZ": "Kazakhstan", "KY": "Cayman Islands", "SG": "Singapore", "SE": "Sweden", "SD": "Sudan", "DO": "Dominican Republic", "DM": "Dominica", "DJ": "Djibouti", "DK": "Denmark", "VG": "Virgin Islands, British", "DE": "Germany", "YE": "Yemen", "DZ": "Algeria", "US": "United States", "UY": "Uruguay", "YT": "Mayotte", "UM": "United States Minor Outlying Islands", "LB": "Lebanon", "LC": "Saint Lucia", "LA": "Lao People's Democratic Republic", "TV": "Tuvalu", "TW": "Taiwan", "TT": "Trinidad and Tobago", "TR": "Turkey", "LK": "Sri Lanka", "LI": "Liechtenstein", "A1": "Anonymous Proxy", "TO": "Tonga", "LT": "Lithuania", "A2": "Satellite Provider", "LR": "Liberia", "LS": "Lesotho", "TH": "Thailand", "TF": "French Southern Territories", "TG": "Togo", "TD": "Chad", "TC": "Turks and Caicos Islands", "LY": "Libyan Arab Jamahiriya", "VA": "Holy See (Vatican City State)", "VC": "Saint Vincent and the Grenadines", "AE": "United Arab Emirates", "AD": "Andorra", "AG": "Antigua and Barbuda", "AF": "Afghanistan", "AI": "Anguilla", "VI": "Virgin Islands, U.S.", "IS": "Iceland", "IR": "Iran, Islamic Republic of", "AM": "Armenia", "AL": "Albania", "AO": "Angola", "AN": "Netherlands Antilles", "AQ": "Antarctica", "AP": "Asia/Pacific Region", "AS": "American Samoa", "AR": "Argentina", "AU": "Australia", "AT": "Austria", "AW": "Aruba", "IN": "India", "AX": "Aland Islands", "AZ": "Azerbaijan", "IE": "Ireland", "ID": "Indonesia", "UA": "Ukraine", "QA": "Qatar", "MZ": "Mozambique"}, function(k, v) {
            countries.push({id: k, text: v});
        });

        $('#locationName').editable({
            validate: function(value) {
                if($.trim(value) == '') return 'This field is required';
            }
        }).on('shown', function(ev, editable) {
            setTimeout(function() {
                editable.input.$input.select();
            },0);
        });

        $('#locationType').editable({
            value: 1,
            showbuttons: 'bottom',
            source: [
                {value: 1, text: 'Main Office'},
                {value: 2, text: 'Satellite Office'},
                {value: 3, text: 'Home Office'},
                {value: 4, text: 'Conference/Event Hall'},
                {value: 5, text: 'Restaurant'},
                {value: 6, text: 'Meeting Local'}
            ]
        });

        $('#country').editable({
            source: countries,
            value: "United States",
            select2: {
                width: 200,
                placeholder: 'Select country',
                allowClear: true
            }
        });

        $('#state').editable({
            typeahead: {
                name: 'state',
                local: ["Alabama","Alaska","Arizona","Arkansas","California","Colorado","Connecticut","Delaware","Florida","Georgia","Hawaii","Idaho","Illinois","Indiana","Iowa","Kansas","Kentucky","Louisiana","Maine","Maryland","Massachusetts","Michigan","Minnesota","Mississippi","Missouri","Montana","Nebraska","Nevada","New Hampshire","New Jersey","New Mexico","New York","North Dakota","North Carolina","Ohio","Oklahoma","Oregon","Pennsylvania","Rhode Island","South Carolina","South Dakota","Tennessee","Texas","Utah","Vermont","Virginia","Washington","West Virginia","Wisconsin","Wyoming"]
            }
        });

        $('#street').editable({
            validate: function(value) {
                if($.trim(value) == '') return 'This field is required';
            }
        }).on('shown', function(ev, editable) {
            setTimeout(function() {
                editable.input.$input.select();
            },0);
        });

        $('#zip').editable({
            tpl: '<input type="text" id ="zip-code-mask" class="mask">',
            validate: function(value) {
                if($.trim(value) == '') return 'This field is required';
            }
        }).on('shown', function(ev, editable) {
            setTimeout(function() {
                editable.input.$input.select();
            },0);
        });

        $(document).on("focus", "#zip-code-mask", function () {
            $(this).mask("99999-999");
        });



                                             //~~~~~~~~~~~~~~~\\
                                            //                 \\
                                           //      COMPANY      \\
                                          //                     \\
                                         //=======================\\
                                        //                         \\
                                       //            CRM            \\
                                      //                             \\
                                     //   /\  /\  /\  /\  /\  /\  /\  \\
                                    //___/  \/  \/  \/  \/  \/  \/  \__\\


        /*  ______________________                                         ____________________  */
        /*  ====================== !!! ---*** FIELD DEFINITIONS ***--- !!! ====================  */


        /*  -------------------           *** Personal Details ***          -------------------  */


        /*  ~~~~~~~~~~~~~~~~~~~~~~~~~~
         *  ~~~~~~~~~~ NAME ~~~~~~~~~~
         *  ~~~~~~~~~~~~~~~~~~~~~~~~~~ */
        $('#companyName').editable({
            validate: function(value) {
                if($.trim(value) == '') return 'This field is required';
            }
        }).on('shown', function(ev, editable) {
            setTimeout(function() {
                editable.input.$input.select();
            },0);
        });

        /*  ~~~~~~~~~~~~~~~~~~~~~~~~~~
         *  ~~~~~~~~ REVENUE ~~~~~~~~~
         *  ~~~~~~~~~~~~~~~~~~~~~~~~~~ */
        $('#companyRevenue').editable({
            showbuttons: false,
            emptytext: 'unknown',
            validate: function(value) {
                if($.trim(value) == '') return 'This field is required';
            }
        });

        $.mockjax({
            url: '/companyRevenue',
            response: function(settings) {
                this.responseText = [
                    {value: 0, text: '< $10,000 ARR'},
                    {value: 1, text: '< $100,000 ARR'},
                    {value: 2, text: '< $1,000,000 ARR'},
                    {value: 3, text: '< $10,000,000 ARR'},
                    {value: 4, text: '< $100,000,000 ARR'},
                    {value: 5, text: '< $1,000,000,000 ARR'},
                    {value: 6, text: '> $1,000,000,000 ARR'}
                ];
                log(settings, this);
            }
        });


        /*  ~~~~~~~~~~~~~~~~~~~~~~~~~~
         *  ~~~~~~~~ VERTICAL ~~~~~~~~
         *  ~~~~~~~~~~~~~~~~~~~~~~~~~~ */
        $('#marketVertical').editable({
            showbuttons: 'bottom',
            source: [
                {value: 1, text: 'Technology'},
                {value: 2, text: 'Health Care'},
                {value: 3, text: 'Banking & Finance'},
                {value: 4, text: 'Education'},
                {value: 5, text: 'Manufacturing'},
                {value: 6, text: 'eCommerce'}
            ]
        });
    });








                                         //~~~~~~~~~~~~~~~\\
                                        //                 \\
                                       //     SEND EMAIL    \\
                                      //                     \\
                                     //=======================\\
                                    //                         \\
                                   //       ACTIVITY MODALS     \\
                                  //                             \\
                                 //   /\  /\  /\  /\  /\  /\  /\  \\
                                //___/  \/  \/  \/  \/  \/  \/  \__\\


    /*  ______________________                                         ____________________  */
    /*  ====================== !!! ---*** FIELD DEFINITIONS ***--- !!! ====================  */


    /*  -------------------           *** Personal Details ***          -------------------  */


    /*  ~~~~~~~~~~~~~~~~~~~~~~~~~~
     *  ~~~~~~~~~~ NAME ~~~~~~~~~~
     *  ~~~~~~~~~~~~~~~~~~~~~~~~~~ */

    $(document).on("click", "#send-email-submit-button", function(e){
        $('#send-new-email-modal').modal('hide')
    });


    $(document).on("submit", "#send-email-form", function(e){
        e.preventDefault();
        var querystring = $(this).serialize();
        console.log("Query String:" + querystring);

        $.ajax({
            type: "POST",
            url: "sendEmailMessage",
            data : querystring,
            success : function(response) {


                $('#send-new-email-modal').modal('hide');

                $('#send-new-email-modal').on('hidden.bs.modal', function () {



                $('#display-lead-success-messages').append(
                    '<div class="alert alert-success" role="alert">' +
                    '<span onclick="this.parentElement.style.display=\'none\'" class="w3-button w3-green w3-large w3-display-topright">×</span>' +
                    '<h3> Success! </h3><p class="alert-link">A new post was successfully published to your blog.</p>' +
                    '</div>');

                //console.log(response)
                $('#contacts-render-target').html(response);
                });



            },
            error: function () {
                $('#display-lead-error-messages').append('' +
                    '<div class="alert alert-success" role="alert">' +
                    '<span onclick="this.parentElement.style.display=\'none\'" class="w3-button w3-red w3-large w3-display-topright">×</span>' +
                    '<h3> Error! </h3>' +
                    '<p> Something went wrong. Please try again. </p>' +
                    '</div>');
            }
        });

        // Coding

        return false;
    });


    /*  ______________________                                         ____________________  */
    /*  ______________________                                         ____________________  */
    /*  ______________________                                         ____________________  */
    /*  ______________________                                         ____________________  */
    /*  ______________________                                         ____________________  */
    /*  ======================  !!! ---*** AJAX FUNCTIONS ***--- !!!   ====================  */
    /*  ______________________                                         ____________________  */
    /*  ______________________                                         ____________________  */
    /*  ______________________                                         ____________________  */
    /*  ______________________                                         ____________________  */
    /*  ______________________                                         ____________________  */







                                         //~~~~~~~~~~~~~~~\\
                                        //                 \\
                                       //     DASHBOARD     \\
                                      //                     \\
                                     //=======================\\
                                    //                         \\
                                   //         LEAD LIST         \\
                                  //                             \\
                                 //   /\  /\  /\  /\  /\  /\  /\  \\
                                //___/  \/  \/  \/  \/  \/  \/  \__\\


    /*  ______________________                                         ____________________  */
    /*  ====================== !!! ---*** FIELD DEFINITIONS ***--- !!! ====================  */


    /*  -------------------           *** Personal Details ***          -------------------  */


    /*  ~~~~~~~~~~~~~~~~~~~~~~~~~~
     *  ~~~~ OBJECTIFY FORM ~~~~~~
     *  ~~~~~~~~~~~~~~~~~~~~~~~~~~ */
    function objectifyForm(formArray) {//serialize data function
        var returnArray = {};
        for (var i = 0; i < formArray.length; i++){
            returnArray[formArray[i]['name']] = formArray[i]['value'];
        }
        return returnArray;
    }

    /*  ~~~~~~~~~~~~~~~~~~~~~~~~~~
     *  ~~~~ SELECT/SHOW LEAD ~~~~
     *  ~~~~~~~~~~~~~~~~~~~~~~~~~~ */
    //Get all your links


    // Display lead specific content
    $('#master-lead-list li a').on("click", function(event){

        var lead_id = this.id.split("-")[2];
        console.log(lead_id);


        $.ajax({
            type: "POST",
            url: "/dashboard/viewLead",
            data: {'leadIndex': lead_id},
            dataType: 'html',
            success: function (response) {

                $('#display-lead-success-messages').append(
                    '<div class="alert alert-success" role="alert">' +
                    '<span onclick="this.parentElement.style.display=\'none\'" class="w3-button w3-green w3-large w3-display-topright">×</span>' +
                    '<h3> Success! </h3><p class="alert-link">A new post was successfully published to your blog.</p>' +
                    '</div>');

                //console.log(response)
                $('#contacts-render-target').html(response);

            },
                error: function () {
                $('#display-lead-error-messages').append('' +
                    '<div class="alert alert-success" role="alert">' +
                    '<span onclick="this.parentElement.style.display=\'none\'" class="w3-button w3-red w3-large w3-display-topright">×</span>' +
                    '<h3> Error! </h3>' +
                    '<p> Something went wrong. Please try again. </p>' +
                    '</div>');
            }

            //$('#container-details').html(data); }
            //prevent the link from refreshing page

        });


        return false;
    });

    $(document).on("click", ".change-active-contact-button li a", function(){

            var contact_id = this.id.split("-")[2];
            console.log(contact_id);
            var lead_id = this.id.split("-")[3];
            console.log("contact ID shown above");


            $.ajax({
                type: "POST",
                url: "/dashboard/updateContact",
                data: {'leadIndex': lead_id, "contactIndex": contact_id},
                dataType: 'html',
                success: function (response) {

                    $('#display-lead-success-messages').append(
                        '<div class="alert alert-success" role="alert">' +
                        '<span onclick="this.parentElement.style.display=\'none\'" class="w3-button w3-green w3-large w3-display-topright">×</span>' +
                        '<h3> Success! </h3><p class="alert-link">A new post was successfully published to your blog.</p>' +
                        '</div>');

                    //console.log(response)
                    $('#contacts-render-target').html(response);

                },
                error: function () {
                    $('#display-lead-error-messages').append('' +
                        '<div class="alert alert-success" role="alert">' +
                        '<span onclick="this.parentElement.style.display=\'none\'" class="w3-button w3-red w3-large w3-display-topright">×</span>' +
                        '<h3> Error! </h3>' +
                        '<p> Something went wrong. Please try again. </p>' +
                        '</div>');
                }

                //$('#container-details').html(data); }
                //prevent the link from refreshing page

            });
            return false;
    });




    $(document).on({
        mouseenter: function() {
            // click functionality...
        },
        mouseleave: function() {
            // Handle mouseleave...
        },
        click: function() {
            // Handle click...
        }
    }, ".editable");



    //Display contact specific content
    $(document).on("click", ".contact-action-buttons a", function(){
        console.log("HI!!!!!!!!!!");
        var contact_id = this.id.split("-")[2];
        console.log(contact_id);

        var lead_id = this.id.split("-")[3];
        console.log(lead_id);
        //var activeContact = $('.contact-action-buttons').val()

        $.ajax({
            type: "POST",
            url: "/dashboard/activityModals",
            data: {'leadIndex': lead_id, "contactIndex": contact_id},
            dataType: 'html',
            success: function (response) {

                $('#display-lead-success-messages').append(
                    '<div class="alert alert-success" role="alert">' +
                    '<span onclick="this.parentElement.style.display=\'none\'" class="w3-button w3-green w3-large w3-display-topright">×</span>' +
                    '<h3> Success! </h3><p class="alert-link">A new post was successfully published to your blog.</p>' +
                    '</div>');

                //console.log(response)
                $('#new-email-model-body-wrapper').html(response);


            },
            error: function () {
                $('#display-lead-error-messages').append('' +
                    '<div class="alert alert-success" role="alert">' +
                    '<span onclick="this.parentElement.style.display=\'none\'" class="w3-button w3-red w3-large w3-display-topright">×</span>' +
                    '<h3> Error! </h3>' +
                    '<p> Something went wrong. Please try again. </p>' +
                    '</div>');
            }

            //$('#container-details').html(data); }
            //prevent the link from refreshing page
            //$('#new-email-model-render-target').html('<g:render template="/sharedTemplates/modals/new-email-model" model="[leadIndex: lead_id, contactIndex: contact_id]"/>' );
            //$('#send-new-email-modal').modal('show');

        });
        return false;


    });

    //Display contact specific content
    /*
     $(document).on("click", ".contact-action-buttons a", function(){
     console.log("HI!!!!!!!!!!");
     var contact_id = this.id.split("-")[0];
     console.log(contact_id);

     var lead_id = this.id.split("-")[1];
     console.log(lead_id);
     //var activeContact = $('.contact-action-buttons').val()
     $('#activity-modals-render-target').html('<g:render template="/sharedTemplates/modals/activity-modals" model="[leadIndex: lead_id, contactIndex: contact_id]"/>' );

     });

    $(document).on("click", ".contact-action-buttons a", function(){
        var contact_id = $(this).data('id');
        console.log(contact_id);

        var lead_id = $(this).data('id').split("-")[1];
    });


     /*
    $('#show-crm-contact-panel').on('submit', function() {
    var querystring = $("#new-post-form").serialize();
    console.log("Query String:" + querystring);
        $.ajax({
            type: "GET",
            url: "/league/publishPost",
            data : querystring,
            success : function(response) {
                if( response == [] ) {
                    $('#validation-error-messages').append('<div class="w3-panel w3-card-4 w3-red w3-display-container w3-padding w3-margin"><span onclick="this.parentElement.style.display=\'none\'" class="w3-button w3-red w3-large w3-display-topright">×</span><h3> Error! </h3><p> You\'ve encountered a validation error. Please make sure your form contents match the placeholder requirements. </p></div>');
                    return false;
                }
                else {
                    $('#action-results-message').append('<div class="w3-panel w3-card-4 w3-green w3-display-container w3-padding w3-margin"><span onclick="this.parentElement.style.display=\'none\'" class="w3-button w3-green w3-large w3-display-topright">×</span><h3> Success! </h3><p>A new post was successfully published to your blog.</p></div>');
                    $('#postModal').modal('hide');
                    console.log(response)
                    $('#displayPosts').html(response);
                }
            },
            error: function(){
                alert("failure");
            }
        });
        return false;
    });

     */
























/*
    function showSpinner(visible) {
        $('spinner').style.display = visible ? "inline" : "none" {


        Ajax.Responders.register({
            onLoading: function () {
                showSpinner(true);
            },
            onComplete: function () {
                if (!Ajax.activeRequestCount) showSpinner(false);

            }
        });
    }
*/











    $('.summernote').summernote({
        height: 350
    });

    $('.date-picker').datepicker({
        orientation: "top auto",
        autoclose: true
    });

    /*
    $('#cp1').colorpicker({
        format: 'hex'
    });
    $('#cp2').colorpicker();

    $('#timepicker1').timepicker();
    */







    var App = function() {

        // IE mode
        var isRTL = false;
        var isIE8 = false;
        var isIE9 = false;
        var isIE10 = false;

        var resizeHandlers = [];

        var assetsPath = '../assets/';

        var globalImgPath = 'global/img/';

        var globalPluginsPath = 'global/plugins/';

        var globalCssPath = 'global/css/';

        // theme layout color set

        var brandColors = {
            'blue': '#89C4F4',
            'red': '#F3565D',
            'green': '#1bbc9b',
            'purple': '#9b59b6',
            'grey': '#95a5a6',
            'yellow': '#F8CB00'
        };

        // initializes main settings
        var handleInit = function() {

            if ($('body').css('direction') === 'rtl') {
                isRTL = true;
            }

            isIE8 = !!navigator.userAgent.match(/MSIE 8.0/);
            isIE9 = !!navigator.userAgent.match(/MSIE 9.0/);
            isIE10 = !!navigator.userAgent.match(/MSIE 10.0/);

            if (isIE10) {
                $('html').addClass('ie10'); // detect IE10 version
            }

            if (isIE10 || isIE9 || isIE8) {
                $('html').addClass('ie'); // detect IE10 version
            }
        };

        // runs callback functions set by App.addResponsiveHandler().
        var _runResizeHandlers = function() {
            // reinitialize other subscribed elements
            for (var i = 0; i < resizeHandlers.length; i++) {
                var each = resizeHandlers[i];
                each.call();
            }
        };

        var handleOnResize = function() {
            var windowWidth = $(window).width();
            var resize;
            if (isIE8) {
                var currheight;
                $(window).resize(function() {
                    if (currheight == document.documentElement.clientHeight) {
                        return; //quite event since only body resized not window.
                    }
                    if (resize) {
                        clearTimeout(resize);
                    }
                    resize = setTimeout(function() {
                        _runResizeHandlers();
                    }, 50); // wait 50ms until window resize finishes.
                    currheight = document.documentElement.clientHeight; // store last body client height
                });
            } else {
                $(window).resize(function() {
                    if ($(window).width() != windowWidth) {
                        windowWidth = $(window).width();
                        if (resize) {
                            clearTimeout(resize);
                        }
                        resize = setTimeout(function() {
                            _runResizeHandlers();
                        }, 50); // wait 50ms until window resize finishes.
                    }
                });
            }
        };

        // Handles portlet tools & actions
        var handlePortletTools = function() {
            // handle portlet remove
            $('body').on('click', '.portlet > .portlet-title > .tools > a.remove', function(e) {
                e.preventDefault();
                var portlet = $(this).closest(".portlet");

                if ($('body').hasClass('page-portlet-fullscreen')) {
                    $('body').removeClass('page-portlet-fullscreen');
                }

                portlet.find('.portlet-title .fullscreen').tooltip('destroy');
                portlet.find('.portlet-title > .tools > .reload').tooltip('destroy');
                portlet.find('.portlet-title > .tools > .remove').tooltip('destroy');
                portlet.find('.portlet-title > .tools > .config').tooltip('destroy');
                portlet.find('.portlet-title > .tools > .collapse, .portlet > .portlet-title > .tools > .expand').tooltip('destroy');

                portlet.remove();
            });

            // handle portlet fullscreen
            $('body').on('click', '.portlet > .portlet-title .fullscreen', function(e) {
                e.preventDefault();
                var portlet = $(this).closest(".portlet");
                if (portlet.hasClass('portlet-fullscreen')) {
                    $(this).removeClass('on');
                    portlet.removeClass('portlet-fullscreen');
                    $('body').removeClass('page-portlet-fullscreen');
                    portlet.children('.portlet-body').css('height', 'auto');
                } else {
                    var height = App.getViewPort().height -
                        portlet.children('.portlet-title').outerHeight() -
                        parseInt(portlet.children('.portlet-body').css('padding-top')) -
                        parseInt(portlet.children('.portlet-body').css('padding-bottom'));

                    $(this).addClass('on');
                    portlet.addClass('portlet-fullscreen');
                    $('body').addClass('page-portlet-fullscreen');
                    portlet.children('.portlet-body').css('height', height);
                }
            });

            $('body').on('click', '.portlet > .portlet-title > .tools > a.reload', function(e) {
                e.preventDefault();
                var el = $(this).closest(".portlet").children(".portlet-body");
                var url = $(this).attr("data-url");
                var error = $(this).attr("data-error-display");
                if (url) {
                    App.blockUI({
                        target: el,
                        animate: true,
                        overlayColor: 'none'
                    });
                    $.ajax({
                        type: "GET",
                        cache: false,
                        url: url,
                        dataType: "html",
                        success: function(res) {
                            App.unblockUI(el);
                            el.html(res);
                            App.initAjax() // reinitialize elements & plugins for newly loaded content
                        },
                        error: function(xhr, ajaxOptions, thrownError) {
                            App.unblockUI(el);
                            var msg = 'Error on reloading the content. Please check your connection and try again.';
                            if (error == "toastr" && toastr) {
                                toastr.error(msg);
                            } else if (error == "notific8" && $.notific8) {
                                $.notific8('zindex', 11500);
                                $.notific8(msg, {
                                    theme: 'ruby',
                                    life: 3000
                                });
                            } else {
                                alert(msg);
                            }
                        }
                    });
                } else {
                    // for demo purpose
                    App.blockUI({
                        target: el,
                        animate: true,
                        overlayColor: 'none'
                    });
                    window.setTimeout(function() {
                        App.unblockUI(el);
                    }, 1000);
                }
            });

            // load ajax data on page init
            $('.portlet .portlet-title a.reload[data-load="true"]').click();

            $('body').on('click', '.portlet > .portlet-title > .tools > .collapse, .portlet .portlet-title > .tools > .expand', function(e) {
                e.preventDefault();
                var el = $(this).closest(".portlet").children(".portlet-body");
                if ($(this).hasClass("collapse")) {
                    $(this).removeClass("collapse").addClass("expand");
                    el.slideUp(200);
                } else {
                    $(this).removeClass("expand").addClass("collapse");
                    el.slideDown(200);
                }
            });
        };

        // Handlesmaterial design checkboxes
        var handleMaterialDesign = function() {

            // Material design ckeckbox and radio effects
            $('body').on('click', '.md-checkbox > label, .md-radio > label', function() {
                var the = $(this);
                // find the first span which is our circle/bubble
                var el = $(this).children('span:first-child');

                // add the bubble class (we do this so it doesnt show on page load)
                el.addClass('inc');

                // clone it
                var newone = el.clone(true);

                // add the cloned version before our original
                el.before(newone);

                // remove the original so that it is ready to run on next click
                $("." + el.attr("class") + ":last", the).remove();
            });

            if ($('body').hasClass('page-md')) {
                // Material design click effect
                // credit where credit's due; http://thecodeplayer.com/walkthrough/ripple-click-effect-google-material-design
                var element, circle, d, x, y;
                $('body').on('click', 'a.btn, button.btn, input.btn, label.btn', function(e) {
                    element = $(this);

                    if(element.find(".md-click-circle").length == 0) {
                        element.prepend("<span class='md-click-circle'></span>");
                    }

                    circle = element.find(".md-click-circle");
                    circle.removeClass("md-click-animate");

                    if(!circle.height() && !circle.width()) {
                        d = Math.max(element.outerWidth(), element.outerHeight());
                        circle.css({height: d, width: d});
                    }

                    x = e.pageX - element.offset().left - circle.width()/2;
                    y = e.pageY - element.offset().top - circle.height()/2;

                    circle.css({top: y+'px', left: x+'px'}).addClass("md-click-animate");

                    setTimeout(function() {
                        circle.remove();
                    }, 1000);
                });
            }

            // Floating labels
            var handleInput = function(el) {
                if (el.val() != "") {
                    el.addClass('edited');
                } else {
                    el.removeClass('edited');
                }
            }

            $('body').on('keydown', '.form-md-floating-label .form-control', function(e) {
                handleInput($(this));
            });
            $('body').on('blur', '.form-md-floating-label .form-control', function(e) {
                handleInput($(this));
            });

            $('.form-md-floating-label .form-control').each(function(){
                if ($(this).val().length > 0) {
                    $(this).addClass('edited');
                }
            });
        }

        // Handles custom checkboxes & radios using jQuery iCheck plugin
        var handleiCheck = function() {
            if (!$().iCheck) {
                return;
            }

            $('.icheck').each(function() {
                var checkboxClass = $(this).attr('data-checkbox') ? $(this).attr('data-checkbox') : 'icheckbox_minimal-grey';
                var radioClass = $(this).attr('data-radio') ? $(this).attr('data-radio') : 'iradio_minimal-grey';

                if (checkboxClass.indexOf('_line') > -1 || radioClass.indexOf('_line') > -1) {
                    $(this).iCheck({
                        checkboxClass: checkboxClass,
                        radioClass: radioClass,
                        insert: '<div class="icheck_line-icon"></div>' + $(this).attr("data-label")
                    });
                } else {
                    $(this).iCheck({
                        checkboxClass: checkboxClass,
                        radioClass: radioClass
                    });
                }
            });
        };

        // Handles Bootstrap switches
        var handleBootstrapSwitch = function() {
            if (!$().bootstrapSwitch) {
                return;
            }
            $('.make-switch').bootstrapSwitch();
        };

        // Handles Bootstrap confirmations
        var handleBootstrapConfirmation = function() {
            if (!$().confirmation) {
                return;
            }
            $('[data-toggle=confirmation]').confirmation({ btnOkClass: 'btn btn-sm btn-success', btnCancelClass: 'btn btn-sm btn-danger'});
        }

        // Handles Bootstrap Accordions.
        var handleAccordions = function() {
            $('body').on('shown.bs.collapse', '.accordion.scrollable', function(e) {
                App.scrollTo($(e.target));
            });
        };

        // Handles Bootstrap Tabs.
        var handleTabs = function() {
            //activate tab if tab id provided in the URL
            if (encodeURI(location.hash)) {
                var tabid = encodeURI(location.hash.substr(1));
                $('a[href="#' + tabid + '"]').parents('.tab-pane:hidden').each(function() {
                    var tabid = $(this).attr("id");
                    $('a[href="#' + tabid + '"]').click();
                });
                $('a[href="#' + tabid + '"]').click();
            }

            if ($().tabdrop) {
                $('.tabbable-tabdrop .nav-pills, .tabbable-tabdrop .nav-tabs').tabdrop({
                    text: '<i class="fa fa-ellipsis-v"></i>&nbsp;<i class="fa fa-angle-down"></i>'
                });
            }
        };

        // Handles Bootstrap Modals.
        var handleModals = function() {
            // fix stackable modal issue: when 2 or more modals opened, closing one of modal will remove .modal-open class.
            $('body').on('hide.bs.modal', function() {
                if ($('.modal:visible').size() > 1 && $('html').hasClass('modal-open') === false) {
                    $('html').addClass('modal-open');
                } else if ($('.modal:visible').size() <= 1) {
                    $('html').removeClass('modal-open');
                }
            });

            // fix page scrollbars issue
            $('body').on('show.bs.modal', '.modal', function() {
                if ($(this).hasClass("modal-scroll")) {
                    $('body').addClass("modal-open-noscroll");
                }
            });

            // fix page scrollbars issue
            $('body').on('hidden.bs.modal', '.modal', function() {
                $('body').removeClass("modal-open-noscroll");
            });

            // remove ajax content and remove cache on modal closed
            $('body').on('hidden.bs.modal', '.modal:not(.modal-cached)', function () {
                $(this).removeData('bs.modal');
            });
        };

        // Handles Bootstrap Tooltips.
        var handleTooltips = function() {
            // global tooltips
            $('.tooltips').tooltip();

            // portlet tooltips
            $('.portlet > .portlet-title .fullscreen').tooltip({
                trigger: 'hover',
                container: 'body',
                title: 'Fullscreen'
            });
            $('.portlet > .portlet-title > .tools > .reload').tooltip({
                trigger: 'hover',
                container: 'body',
                title: 'Reload'
            });
            $('.portlet > .portlet-title > .tools > .remove').tooltip({
                trigger: 'hover',
                container: 'body',
                title: 'Remove'
            });
            $('.portlet > .portlet-title > .tools > .config').tooltip({
                trigger: 'hover',
                container: 'body',
                title: 'Settings'
            });
            $('.portlet > .portlet-title > .tools > .collapse, .portlet > .portlet-title > .tools > .expand').tooltip({
                trigger: 'hover',
                container: 'body',
                title: 'Collapse/Expand'
            });
        };

        // Handles Bootstrap Dropdowns
        var handleDropdowns = function() {
            /*
             Hold dropdown on click
             */
            $('body').on('click', '.dropdown-menu.hold-on-click', function(e) {
                e.stopPropagation();
            });
        };

        var handleAlerts = function() {
            $('body').on('click', '[data-close="alert"]', function(e) {
                $(this).parent('.alert').hide();
                $(this).closest('.note').hide();
                e.preventDefault();
            });

            $('body').on('click', '[data-close="note"]', function(e) {
                $(this).closest('.note').hide();
                e.preventDefault();
            });

            $('body').on('click', '[data-remove="note"]', function(e) {
                $(this).closest('.note').remove();
                e.preventDefault();
            });
        };

        // Handle textarea autosize
        var handleTextareaAutosize = function() {
            if (typeof(autosize) == "function") {
                autosize(document.querySelectorAll('textarea.autosizeme'));
            }
        }

        // Handles Bootstrap Popovers

        // last popep popover
        var lastPopedPopover;

        var handlePopovers = function() {
            $('.popovers').popover();

            // close last displayed popover

            $(document).on('click.bs.popover.data-api', function(e) {
                if (lastPopedPopover) {
                    lastPopedPopover.popover('hide');
                }
            });
        };

        // Handles scrollable contents using jQuery SlimScroll plugin.
        var handleScrollers = function() {
            App.initSlimScroll('.scroller');
        };

        // Handles Image Preview using jQuery Fancybox plugin
        var handleFancybox = function() {
            if (!jQuery.fancybox) {
                return;
            }

            if ($(".fancybox-button").size() > 0) {
                $(".fancybox-button").fancybox({
                    groupAttr: 'data-rel',
                    prevEffect: 'none',
                    nextEffect: 'none',
                    closeBtn: true,
                    helpers: {
                        title: {
                            type: 'inside'
                        }
                    }
                });
            }
        };

        // Handles counterup plugin wrapper
        var handleCounterup = function() {
            if (!$().counterUp) {
                return;
            }

            $("[data-counter='counterup']").counterUp({
                delay: 10,
                time: 1000
            });
        };

        // Fix input placeholder issue for IE8 and IE9
        var handleFixInputPlaceholderForIE = function() {
            //fix html5 placeholder attribute for ie7 & ie8
            if (isIE8 || isIE9) { // ie8 & ie9
                // this is html5 placeholder fix for inputs, inputs with placeholder-no-fix class will be skipped(e.g: we need this for password fields)
                $('input[placeholder]:not(.placeholder-no-fix), textarea[placeholder]:not(.placeholder-no-fix)').each(function() {
                    var input = $(this);

                    if (input.val() === '' && input.attr("placeholder") !== '') {
                        input.addClass("placeholder").val(input.attr('placeholder'));
                    }

                    input.focus(function() {
                        if (input.val() == input.attr('placeholder')) {
                            input.val('');
                        }
                    });

                    input.blur(function() {
                        if (input.val() === '' || input.val() == input.attr('placeholder')) {
                            input.val(input.attr('placeholder'));
                        }
                    });
                });
            }
        };

        // Handle Select2 Dropdowns
        var handleSelect2 = function() {
            if ($().select2) {
                $.fn.select2.defaults.set("theme", "bootstrap");
                $('.select2me').select2({
                    placeholder: "Select",
                    width: 'auto',
                    allowClear: true
                });
            }
        };

        // handle group element heights
        var handleHeight = function() {
            $('[data-auto-height]').each(function() {
                var parent = $(this);
                var items = $('[data-height]', parent);
                var height = 0;
                var mode = parent.attr('data-mode');
                var offset = parseInt(parent.attr('data-offset') ? parent.attr('data-offset') : 0);

                items.each(function() {
                    if ($(this).attr('data-height') == "height") {
                        $(this).css('height', '');
                    } else {
                        $(this).css('min-height', '');
                    }

                    var height_ = (mode == 'base-height' ? $(this).outerHeight() : $(this).outerHeight(true));
                    if (height_ > height) {
                        height = height_;
                    }
                });

                height = height + offset;

                items.each(function() {
                    if ($(this).attr('data-height') == "height") {
                        $(this).css('height', height);
                    } else {
                        $(this).css('min-height', height);
                    }
                });

                if(parent.attr('data-related')) {
                    $(parent.attr('data-related')).css('height', parent.height());
                }
            });
        }

        //* END:CORE HANDLERS *//

        return {

            //main function to initiate the theme
            init: function() {
                //IMPORTANT!!!: Do not modify the core handlers call order.

                //Core handlers
                handleInit(); // initialize core variables
                handleOnResize(); // set and handle responsive

                //UI Component handlers
                handleMaterialDesign(); // handle material design
                handleiCheck(); // handles custom icheck radio and checkboxes
                handleBootstrapSwitch(); // handle bootstrap switch plugin
                handleScrollers(); // handles slim scrolling contents
                handleFancybox(); // handle fancy box
                handleSelect2(); // handle custom Select2 dropdowns
                handlePortletTools(); // handles portlet action bar functionality(refresh, configure, toggle, remove)
                handleAlerts(); //handle closabled alerts
                handleDropdowns(); // handle dropdowns
                handleTabs(); // handle tabs
                handleTooltips(); // handle bootstrap tooltips
                handlePopovers(); // handles bootstrap popovers
                handleAccordions(); //handles accordions
                handleModals(); // handle modals
                handleBootstrapConfirmation(); // handle bootstrap confirmations
                handleTextareaAutosize(); // handle autosize textareas
                handleCounterup(); // handle counterup instances

                //Handle group element heights
                this.addResizeHandler(handleHeight); // handle auto calculating height on window resize

                // Hacks
                handleFixInputPlaceholderForIE(); //IE8 & IE9 input placeholder issue fix
            },

            //main function to initiate core javascript after ajax complete
            initAjax: function() {
                //handleUniform(); // handles custom radio & checkboxes
                handleiCheck(); // handles custom icheck radio and checkboxes
                handleBootstrapSwitch(); // handle bootstrap switch plugin
                handleScrollers(); // handles slim scrolling contents
                handleSelect2(); // handle custom Select2 dropdowns
                handleFancybox(); // handle fancy box
                handleDropdowns(); // handle dropdowns
                handleTooltips(); // handle bootstrap tooltips
                handlePopovers(); // handles bootstrap popovers
                handleAccordions(); //handles accordions
                handleBootstrapConfirmation(); // handle bootstrap confirmations
            },

            //init main components
            initComponents: function() {
                this.initAjax();
            },

            //public function to remember last opened popover that needs to be closed on click
            setLastPopedPopover: function(el) {
                lastPopedPopover = el;
            },

            //public function to add callback a function which will be called on window resize
            addResizeHandler: function(func) {
                resizeHandlers.push(func);
            },

            //public functon to call _runresizeHandlers
            runResizeHandlers: function() {
                _runResizeHandlers();
            },

            // wrApper function to scroll(focus) to an element
            scrollTo: function(el, offeset) {
                var pos = (el && el.size() > 0) ? el.offset().top : 0;

                if (el) {
                    if ($('body').hasClass('page-header-fixed')) {
                        pos = pos - $('.page-header').height();
                    } else if ($('body').hasClass('page-header-top-fixed')) {
                        pos = pos - $('.page-header-top').height();
                    } else if ($('body').hasClass('page-header-menu-fixed')) {
                        pos = pos - $('.page-header-menu').height();
                    }
                    pos = pos + (offeset ? offeset : -1 * el.height());
                }

                $('html,body').animate({
                    scrollTop: pos
                }, 'slow');
            },

            initSlimScroll: function(el) {
                if (!$().slimScroll) {
                    return;
                }

                $(el).each(function() {
                    if ($(this).attr("data-initialized")) {
                        return; // exit
                    }

                    var height;

                    if ($(this).attr("data-height")) {
                        height = $(this).attr("data-height");
                    } else {
                        height = $(this).css('height');
                    }

                    $(this).slimScroll({
                        allowPageScroll: true, // allow page scroll when the element scroll is ended
                        size: '7px',
                        color: ($(this).attr("data-handle-color") ? $(this).attr("data-handle-color") : '#bbb'),
                        wrapperClass: ($(this).attr("data-wrapper-class") ? $(this).attr("data-wrapper-class") : 'slimScrollDiv'),
                        railColor: ($(this).attr("data-rail-color") ? $(this).attr("data-rail-color") : '#eaeaea'),
                        position: isRTL ? 'left' : 'right',
                        height: height,
                        alwaysVisible: ($(this).attr("data-always-visible") == "1" ? true : false),
                        railVisible: ($(this).attr("data-rail-visible") == "1" ? true : false),
                        disableFadeOut: true
                    });

                    $(this).attr("data-initialized", "1");
                });
            },

            destroySlimScroll: function(el) {
                if (!$().slimScroll) {
                    return;
                }

                $(el).each(function() {
                    if ($(this).attr("data-initialized") === "1") { // destroy existing instance before updating the height
                        $(this).removeAttr("data-initialized");
                        $(this).removeAttr("style");

                        var attrList = {};

                        // store the custom attribures so later we will reassign.
                        if ($(this).attr("data-handle-color")) {
                            attrList["data-handle-color"] = $(this).attr("data-handle-color");
                        }
                        if ($(this).attr("data-wrapper-class")) {
                            attrList["data-wrapper-class"] = $(this).attr("data-wrapper-class");
                        }
                        if ($(this).attr("data-rail-color")) {
                            attrList["data-rail-color"] = $(this).attr("data-rail-color");
                        }
                        if ($(this).attr("data-always-visible")) {
                            attrList["data-always-visible"] = $(this).attr("data-always-visible");
                        }
                        if ($(this).attr("data-rail-visible")) {
                            attrList["data-rail-visible"] = $(this).attr("data-rail-visible");
                        }

                        $(this).slimScroll({
                            wrapperClass: ($(this).attr("data-wrapper-class") ? $(this).attr("data-wrapper-class") : 'slimScrollDiv'),
                            destroy: true
                        });

                        var the = $(this);

                        // reassign custom attributes
                        $.each(attrList, function(key, value) {
                            the.attr(key, value);
                        });

                    }
                });
            },

            // function to scroll to the top
            scrollTop: function() {
                App.scrollTo();
            },

            // wrApper function to  block element(indicate loading)
            blockUI: function(options) {
                options = $.extend(true, {}, options);
                var html = '';
                if (options.animate) {
                    html = '<div class="loading-message ' + (options.boxed ? 'loading-message-boxed' : '') + '">' + '<div class="block-spinner-bar"><div class="bounce1"></div><div class="bounce2"></div><div class="bounce3"></div></div>' + '</div>';
                } else if (options.iconOnly) {
                    html = '<div class="loading-message ' + (options.boxed ? 'loading-message-boxed' : '') + '"><img src="' + this.getGlobalImgPath() + 'loading-spinner-grey.gif" align=""></div>';
                } else if (options.textOnly) {
                    html = '<div class="loading-message ' + (options.boxed ? 'loading-message-boxed' : '') + '"><span>&nbsp;&nbsp;' + (options.message ? options.message : 'LOADING...') + '</span></div>';
                } else {
                    html = '<div class="loading-message ' + (options.boxed ? 'loading-message-boxed' : '') + '"><img src="' + this.getGlobalImgPath() + 'loading-spinner-grey.gif" align=""><span>&nbsp;&nbsp;' + (options.message ? options.message : 'LOADING...') + '</span></div>';
                }

                if (options.target) { // element blocking
                    var el = $(options.target);
                    if (el.height() <= ($(window).height())) {
                        options.cenrerY = true;
                    }
                    el.block({
                        message: html,
                        baseZ: options.zIndex ? options.zIndex : 1000,
                        centerY: options.cenrerY !== undefined ? options.cenrerY : false,
                        css: {
                            top: '10%',
                            border: '0',
                            padding: '0',
                            backgroundColor: 'none'
                        },
                        overlayCSS: {
                            backgroundColor: options.overlayColor ? options.overlayColor : '#555',
                            opacity: options.boxed ? 0.05 : 0.1,
                            cursor: 'wait'
                        }
                    });
                } else { // page blocking
                    $.blockUI({
                        message: html,
                        baseZ: options.zIndex ? options.zIndex : 1000,
                        css: {
                            border: '0',
                            padding: '0',
                            backgroundColor: 'none'
                        },
                        overlayCSS: {
                            backgroundColor: options.overlayColor ? options.overlayColor : '#555',
                            opacity: options.boxed ? 0.05 : 0.1,
                            cursor: 'wait'
                        }
                    });
                }
            },

            // wrApper function to  un-block element(finish loading)
            unblockUI: function(target) {
                if (target) {
                    $(target).unblock({
                        onUnblock: function() {
                            $(target).css('position', '');
                            $(target).css('zoom', '');
                        }
                    });
                } else {
                    $.unblockUI();
                }
            },

            startPageLoading: function(options) {
                if (options && options.animate) {
                    $('.page-spinner-bar').remove();
                    $('body').append('<div class="page-spinner-bar"><div class="bounce1"></div><div class="bounce2"></div><div class="bounce3"></div></div>');
                } else {
                    $('.page-loading').remove();
                    $('body').append('<div class="page-loading"><img src="' + this.getGlobalImgPath() + 'loading-spinner-grey.gif"/>&nbsp;&nbsp;<span>' + (options && options.message ? options.message : 'Loading...') + '</span></div>');
                }
            },

            stopPageLoading: function() {
                $('.page-loading, .page-spinner-bar').remove();
            },

            alert: function(options) {

                options = $.extend(true, {
                    container: "", // alerts parent container(by default placed after the page breadcrumbs)
                    place: "append", // "append" or "prepend" in container
                    type: 'success', // alert's type
                    message: "", // alert's message
                    close: true, // make alert closable
                    reset: true, // close all previouse alerts first
                    focus: true, // auto scroll to the alert after shown
                    closeInSeconds: 0, // auto close after defined seconds
                    icon: "" // put icon before the message
                }, options);

                var id = App.getUniqueID("App_alert");

                var html = '<div id="' + id + '" class="custom-alerts alert alert-' + options.type + ' fade in">' + (options.close ? '<button type="button" class="close" data-dismiss="alert" aria-hidden="true"></button>' : '') + (options.icon !== "" ? '<i class="fa-lg fa fa-' + options.icon + '"></i>  ' : '') + options.message + '</div>';

                if (options.reset) {
                    $('.custom-alerts').remove();
                }

                if (!options.container) {
                    if ($('.page-fixed-main-content').size() === 1) {
                        $('.page-fixed-main-content').prepend(html);
                    } else if (($('body').hasClass("page-container-bg-solid") || $('body').hasClass("page-content-white")) && $('.page-head').size() === 0) {
                        $('.page-title').after(html);
                    } else {
                        if ($('.page-bar').size() > 0) {
                            $('.page-bar').after(html);
                        } else {
                            $('.page-breadcrumb, .breadcrumbs').after(html);
                        }
                    }
                } else {
                    if (options.place == "append") {
                        $(options.container).append(html);
                    } else {
                        $(options.container).prepend(html);
                    }
                }

                if (options.focus) {
                    App.scrollTo($('#' + id));
                }

                if (options.closeInSeconds > 0) {
                    setTimeout(function() {
                        $('#' + id).remove();
                    }, options.closeInSeconds * 1000);
                }

                return id;
            },

            //public function to initialize the fancybox plugin
            initFancybox: function() {
                handleFancybox();
            },

            //public helper function to get actual input value(used in IE9 and IE8 due to placeholder attribute not supported)
            getActualVal: function(el) {
                el = $(el);
                if (el.val() === el.attr("placeholder")) {
                    return "";
                }
                return el.val();
            },

            //public function to get a paremeter by name from URL
            getURLParameter: function(paramName) {
                var searchString = window.location.search.substring(1),
                    i, val, params = searchString.split("&");

                for (i = 0; i < params.length; i++) {
                    val = params[i].split("=");
                    if (val[0] == paramName) {
                        return unescape(val[1]);
                    }
                }
                return null;
            },

            // check for device touch support
            isTouchDevice: function() {
                try {
                    document.createEvent("TouchEvent");
                    return true;
                } catch (e) {
                    return false;
                }
            },

            // To get the correct viewport width based on  http://andylangton.co.uk/articles/javascript/get-viewport-size-javascript/
            getViewPort: function() {
                var e = window,
                    a = 'inner';
                if (!('innerWidth' in window)) {
                    a = 'client';
                    e = document.documentElement || document.body;
                }

                return {
                    width: e[a + 'Width'],
                    height: e[a + 'Height']
                };
            },

            getUniqueID: function(prefix) {
                return 'prefix_' + Math.floor(Math.random() * (new Date()).getTime());
            },

            // check IE8 mode
            isIE8: function() {
                return isIE8;
            },

            // check IE9 mode
            isIE9: function() {
                return isIE9;
            },

            //check RTL mode
            isRTL: function() {
                return isRTL;
            },

            // check IE8 mode
            isAngularJsApp: function() {
                return (typeof angular == 'undefined') ? false : true;
            },

            getAssetsPath: function() {
                return assetsPath;
            },

            setAssetsPath: function(path) {
                assetsPath = path;
            },

            setGlobalImgPath: function(path) {
                globalImgPath = path;
            },

            getGlobalImgPath: function() {
                return assetsPath + globalImgPath;
            },

            setGlobalPluginsPath: function(path) {
                globalPluginsPath = path;
            },

            getGlobalPluginsPath: function() {
                return assetsPath + globalPluginsPath;
            },

            getGlobalCssPath: function() {
                return assetsPath + globalCssPath;
            },

            // get layout color code by color name
            getBrandColor: function(name) {
                if (brandColors[name]) {
                    return brandColors[name];
                } else {
                    return '';
                }
            },

            getResponsiveBreakpoint: function(size) {
                // bootstrap responsive breakpoints
                var sizes = {
                    'xs' : 480,     // extra small
                    'sm' : 768,     // small
                    'md' : 992,     // medium
                    'lg' : 1200     // large
                };

                return sizes[size] ? sizes[size] : 0;
            }
        };

    }();

    <!-- END THEME LAYOUT SCRIPTS -->




});
