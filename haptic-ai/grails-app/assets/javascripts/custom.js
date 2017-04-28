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

        jQuery('.kpi-4').easyPieChart({
            easing: 'easeOutBounce',
            animate: 2000,
            onStep: function(from, to, percent) {
                $(this.el).find('.kpi-4-value').text(Math.round(percent)).append("%");
            }
        });

        //update instance after 5 sec
        setTimeout(function() {
            $('.kpi-2').data('easyPieChart').update(40);
        }, 5000);

        var chart_2 = window.chart = $('.kpi-2').data('easyPieChart');
        $('.js_update_2').on('click', function() {
            chart_2.update(Math.random()*200-100);
        });

        var chart_4 = window.chart = $('.kpi-4').data('easyPieChart');
        $('.js_update_4').on('click', function() {
            chart_4.update(Math.random()*200-100);
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

        $('#state').editable({
            source: ["Alabama","Alaska","Arizona","Arkansas","California","Colorado","Connecticut","Delaware","Florida","Georgia","Hawaii","Idaho","Illinois","Indiana","Iowa","Kansas","Kentucky","Louisiana","Maine","Maryland","Massachusetts","Michigan","Minnesota","Mississippi","Missouri","Montana","Nebraska","Nevada","New Hampshire","New Jersey","New Mexico","New York","North Dakota","North Carolina","Ohio","Oklahoma","Oregon","Pennsylvania","Rhode Island","South Carolina","South Dakota","Tennessee","Texas","Utah","Vermont","Virginia","Washington","West Virginia","Wisconsin","Wyoming"]
        });

        $('#state2').editable({
            value: 'California',
            typeahead: {
                name: 'state',
                local: ["Alabama","Alaska","Arizona","Arkansas","California","Colorado","Connecticut","Delaware","Florida","Georgia","Hawaii","Idaho","Illinois","Indiana","Iowa","Kansas","Kentucky","Louisiana","Maine","Maryland","Massachusetts","Michigan","Minnesota","Mississippi","Missouri","Montana","Nebraska","Nevada","New Hampshire","New Jersey","New Mexico","New York","North Dakota","North Carolina","Ohio","Oklahoma","Oregon","Pennsylvania","Rhode Island","South Carolina","South Dakota","Tennessee","Texas","Utah","Vermont","Virginia","Washington","West Virginia","Wisconsin","Wyoming"]
            }
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
    $('#salutation').editable({
        showbuttons: false,
        emptytext: 'unknown',
        validate: function(value) {
            if($.trim(value) == '') return 'This field is required';
        }
    });

    $.mockjax({
        url: '/salutations',
        response: function(settings) {
            this.responseText = [
                {value: 0, text: 'Mr.'},
                {value: 1, text: 'Mrs.'},
                {value: 2, text: 'Ms.'},
                {value: 3, text: 'Dr.'},
                {value: 4, text: 'Sir'},
                {value: 5, text: 'Professor'}
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
        }
    }).on('shown', function(ev, editable) {
        setTimeout(function() {
            editable.input.$input.select();
        },0);
    });

    $('#lastName').editable({
        validate: function(value) {
            if($.trim(value) == '') return 'This field is required';
        }
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
        emptyText: 'unknown'
    });

    $.mockjax({
        url: '/genders',
        response: function(settings) {
            this.responseText = [
                {value: 0, text: 'Male'},
                {value: 1, text: 'Female'},
                {value: 2, text: 'Trans'},
                {value: 3, text: 'Other'}
            ];
            log(settings, this);
        }
    });

/*  -------------------         *** Professional Details ***        -------------------  */


    // *** Enable Dependent Lists *** //
    var department_role_sources = {
        1: [{value: 11, text: 'Sales Development'}, {value: 12, text: 'Account Management'}, {value: 22, text: 'Customer Success'}],
        2: [{value: 21, text: 'Product Marketing'}, {value: 22, text: 'Lead Generation'}],
        3: [{value: 31, text: 'Product Management'}, {value: 32, text: 'Software Engineer'}, {value: 33, text: 'Dev Ops'}, {value: 34, text: 'Code Testing'}, {value: 35, text: 'IT'}],
        4: [{value: 41, text: 'Customer Support'}, {value: 42, text: 'Onsite Specialist'}, {value: 43, text: 'Technical Writing'}],
        5: [{value: 51, text: 'Customer Onboarding'}, {value: 52, text: 'Job Training'}]
    };


    /*  ~~~~~~~~~~~~~~~~~~~~~~~~~~
     *  ~~~~~~~ DEPARTMENT ~~~~~~~
     *  ~~~~~~~~~~~~~~~~~~~~~~~~~~ */
    $('#department').editable({
        showbuttons: false,
        emptyText: 'unknown',
        success: function(response, newValue) {
            $('#jobRole').editable('option', 'source', department_role_sources[newValue]);
            $('#jobRole').editable('setValue', null);
        }
    });

    $.mockjax({
        url: '/departments',
        response: function(settings) {
            this.responseText = [
                {value: 1, text: 'Sales'},
                {value: 2, text: 'Marketing'},
                {value: 3, text: 'Engineering'},
                {value: 4, text: 'Support'},
                {value: 5, text: 'Training & Education'}
            ];
            log(settings, this);
        }
    });

    /*  ~~~~~~~~~~~~~~~~~~~~~~~~~~
     *  ~~~~~~~~ JOB ROLE ~~~~~~~~
     *  ~~~~~~~~~~~~~~~~~~~~~~~~~~ */
    $('#jobRole').editable({
        showbuttons: false,
        emptyText: 'unknown'
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
        emptyText: 'unknown'
    });

    $.mockjax({
        url: '/titles',
        response: function(settings) {
            this.responseText = [
                {value: 0, text: 'Independent Contractor'},
                {value: 1, text: 'Entry Level'},
                {value: 2, text: 'Manager'},
                {value: 4, text: 'Director'},
                {value: 5, text: 'Executive'},
                {value: 6, text: 'Vice President'},
                {value: 7, text: 'C-Level Executive'},
                {value: 8, text: 'CEO'}
            ];
            log(settings, this);
        }
    });

    /*  ~~~~~~~~~~~~~~~~~~~~~~~~~
     *  ~~~~ JOB DESCRIPTION ~~~~
     *  ~~~~~~~~~~~~~~~~~~~~~~~~~ */
    $('#jobDescription').editable({
        showbuttons: 'bottom'
    }).on('shown', function(ev, editable) {
        setTimeout(function() {
            editable.input.$input.select();
        },0);
    });

    /*  ~~~~~~~~~~~~~~~~~~~~~~~~~~
     *  ~~~~~~~~~ COMPANY ~~~~~~~~
     *  ~~~~~~~~~~~~~~~~~~~~~~~~~~ */
    var company = [];
    $.each({"MS": "Microsoft", "P&G": "Proctor & Gamble"}, function(k, v) {
        company.push({id: k, text: v});
    });

    $('#company').editable({
        source: company,
        select2: {
            width: 200,
            placeholder: 'Select company',
            allowClear: true
        }
    });


/*  -------------------           *** Contact Details ***           -------------------  */

    /*  ~~~~~~~~~~~~~~~~~~~~~~~~~~
     *  ~~~~~~~~~ EMAIL ~~~~~~~~~
     *  ~~~~~~~~~~~~~~~~~~~~~~~~~~ */
    $('#add-email-address').editable({
        validate: function(value) {
            if($.trim(value) == '') return 'This field is required';
        }
    }).on('shown', function(ev, editable) {
        setTimeout(function() {
            editable.input.$input.select();
        },0);
    });

    /*  ~~~~~~~~~~~~~~~~~~~~~~~~~~
     *  ~~~~~~~~~ PHONE ~~~~~~~~~
     *  ~~~~~~~~~~~~~~~~~~~~~~~~~~ */
    $('#add-phone-number').editable({
        validate: function(value) {
            if($.trim(value) == '') return 'This field is required';
        }
    }).on('shown', function(ev, editable) {
        setTimeout(function() {
            editable.input.$input.select();
        },0);
    });

    /*  ~~~~~~~~~~~~~~~~~~~~~~~~~~
     *  ~~~~~ SOCIAL NETWORK ~~~~~
     *  ~~~~~~~~~~~~~~~~~~~~~~~~~~ */
    $('#add-social-network').editable({
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
    $('#add-review-site').editable({
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
    $('#add-web-site').editable({
        validate: function(value) {
            if($.trim(value) == '') return 'This field is required';
        }
    }).on('shown', function(ev, editable) {
        setTimeout(function() {
            editable.input.$input.select();
        },0);
    });


    /*  ~~~~~~~~~~~~~~~~~~~~~~~~~~
     *  ~~~~~~~~~ ADDRESS ~~~~~~~~
     *  ~~~~~~~~~~~~~~~~~~~~~~~~~~ */
    var countries = [];
    $.each({"BD": "Bangladesh", "BE": "Belgium", "BF": "Burkina Faso", "BG": "Bulgaria", "BA": "Bosnia and Herzegovina", "BB": "Barbados", "WF": "Wallis and Futuna", "BL": "Saint Bartelemey", "BM": "Bermuda", "BN": "Brunei Darussalam", "BO": "Bolivia", "BH": "Bahrain", "BI": "Burundi", "BJ": "Benin", "BT": "Bhutan", "JM": "Jamaica", "BV": "Bouvet Island", "BW": "Botswana", "WS": "Samoa", "BR": "Brazil", "BS": "Bahamas", "JE": "Jersey", "BY": "Belarus", "O1": "Other Country", "LV": "Latvia", "RW": "Rwanda", "RS": "Serbia", "TL": "Timor-Leste", "RE": "Reunion", "LU": "Luxembourg", "TJ": "Tajikistan", "RO": "Romania", "PG": "Papua New Guinea", "GW": "Guinea-Bissau", "GU": "Guam", "GT": "Guatemala", "GS": "South Georgia and the South Sandwich Islands", "GR": "Greece", "GQ": "Equatorial Guinea", "GP": "Guadeloupe", "JP": "Japan", "GY": "Guyana", "GG": "Guernsey", "GF": "French Guiana", "GE": "Georgia", "GD": "Grenada", "GB": "United Kingdom", "GA": "Gabon", "SV": "El Salvador", "GN": "Guinea", "GM": "Gambia", "GL": "Greenland", "GI": "Gibraltar", "GH": "Ghana", "OM": "Oman", "TN": "Tunisia", "JO": "Jordan", "HR": "Croatia", "HT": "Haiti", "HU": "Hungary", "HK": "Hong Kong", "HN": "Honduras", "HM": "Heard Island and McDonald Islands", "VE": "Venezuela", "PR": "Puerto Rico", "PS": "Palestinian Territory", "PW": "Palau", "PT": "Portugal", "SJ": "Svalbard and Jan Mayen", "PY": "Paraguay", "IQ": "Iraq", "PA": "Panama", "PF": "French Polynesia", "BZ": "Belize", "PE": "Peru", "PK": "Pakistan", "PH": "Philippines", "PN": "Pitcairn", "TM": "Turkmenistan", "PL": "Poland", "PM": "Saint Pierre and Miquelon", "ZM": "Zambia", "EH": "Western Sahara", "RU": "Russian Federation", "EE": "Estonia", "EG": "Egypt", "TK": "Tokelau", "ZA": "South Africa", "EC": "Ecuador", "IT": "Italy", "VN": "Vietnam", "SB": "Solomon Islands", "EU": "Europe", "ET": "Ethiopia", "SO": "Somalia", "ZW": "Zimbabwe", "SA": "Saudi Arabia", "ES": "Spain", "ER": "Eritrea", "ME": "Montenegro", "MD": "Moldova, Republic of", "MG": "Madagascar", "MF": "Saint Martin", "MA": "Morocco", "MC": "Monaco", "UZ": "Uzbekistan", "MM": "Myanmar", "ML": "Mali", "MO": "Macao", "MN": "Mongolia", "MH": "Marshall Islands", "MK": "Macedonia", "MU": "Mauritius", "MT": "Malta", "MW": "Malawi", "MV": "Maldives", "MQ": "Martinique", "MP": "Northern Mariana Islands", "MS": "Montserrat", "MR": "Mauritania", "IM": "Isle of Man", "UG": "Uganda", "TZ": "Tanzania, United Republic of", "MY": "Malaysia", "MX": "Mexico", "IL": "Israel", "FR": "France", "IO": "British Indian Ocean Territory", "FX": "France, Metropolitan", "SH": "Saint Helena", "FI": "Finland", "FJ": "Fiji", "FK": "Falkland Islands (Malvinas)", "FM": "Micronesia, Federated States of", "FO": "Faroe Islands", "NI": "Nicaragua", "NL": "Netherlands", "NO": "Norway", "NA": "Namibia", "VU": "Vanuatu", "NC": "New Caledonia", "NE": "Niger", "NF": "Norfolk Island", "NG": "Nigeria", "NZ": "New Zealand", "NP": "Nepal", "NR": "Nauru", "NU": "Niue", "CK": "Cook Islands", "CI": "Cote d'Ivoire", "CH": "Switzerland", "CO": "Colombia", "CN": "China", "CM": "Cameroon", "CL": "Chile", "CC": "Cocos (Keeling) Islands", "CA": "Canada", "CG": "Congo", "CF": "Central African Republic", "CD": "Congo, The Democratic Republic of the", "CZ": "Czech Republic", "CY": "Cyprus", "CX": "Christmas Island", "CR": "Costa Rica", "CV": "Cape Verde", "CU": "Cuba", "SZ": "Swaziland", "SY": "Syrian Arab Republic", "KG": "Kyrgyzstan", "KE": "Kenya", "SR": "Suriname", "KI": "Kiribati", "KH": "Cambodia", "KN": "Saint Kitts and Nevis", "KM": "Comoros", "ST": "Sao Tome and Principe", "SK": "Slovakia", "KR": "Korea, Republic of", "SI": "Slovenia", "KP": "Korea, Democratic People's Republic of", "KW": "Kuwait", "SN": "Senegal", "SM": "San Marino", "SL": "Sierra Leone", "SC": "Seychelles", "KZ": "Kazakhstan", "KY": "Cayman Islands", "SG": "Singapore", "SE": "Sweden", "SD": "Sudan", "DO": "Dominican Republic", "DM": "Dominica", "DJ": "Djibouti", "DK": "Denmark", "VG": "Virgin Islands, British", "DE": "Germany", "YE": "Yemen", "DZ": "Algeria", "US": "United States", "UY": "Uruguay", "YT": "Mayotte", "UM": "United States Minor Outlying Islands", "LB": "Lebanon", "LC": "Saint Lucia", "LA": "Lao People's Democratic Republic", "TV": "Tuvalu", "TW": "Taiwan", "TT": "Trinidad and Tobago", "TR": "Turkey", "LK": "Sri Lanka", "LI": "Liechtenstein", "A1": "Anonymous Proxy", "TO": "Tonga", "LT": "Lithuania", "A2": "Satellite Provider", "LR": "Liberia", "LS": "Lesotho", "TH": "Thailand", "TF": "French Southern Territories", "TG": "Togo", "TD": "Chad", "TC": "Turks and Caicos Islands", "LY": "Libyan Arab Jamahiriya", "VA": "Holy See (Vatican City State)", "VC": "Saint Vincent and the Grenadines", "AE": "United Arab Emirates", "AD": "Andorra", "AG": "Antigua and Barbuda", "AF": "Afghanistan", "AI": "Anguilla", "VI": "Virgin Islands, U.S.", "IS": "Iceland", "IR": "Iran, Islamic Republic of", "AM": "Armenia", "AL": "Albania", "AO": "Angola", "AN": "Netherlands Antilles", "AQ": "Antarctica", "AP": "Asia/Pacific Region", "AS": "American Samoa", "AR": "Argentina", "AU": "Australia", "AT": "Austria", "AW": "Aruba", "IN": "India", "AX": "Aland Islands", "AZ": "Azerbaijan", "IE": "Ireland", "ID": "Indonesia", "UA": "Ukraine", "QA": "Qatar", "MZ": "Mozambique"}, function(k, v) {
        countries.push({id: k, text: v});
    });

    $('#country').editable({
        source: countries,
        select2: {
            width: 200,
            placeholder: 'Select country',
            allowClear: true
        }
    });

    $('#state').editable({
        source: ["Alabama","Alaska","Arizona","Arkansas","California","Colorado","Connecticut","Delaware","Florida","Georgia","Hawaii","Idaho","Illinois","Indiana","Iowa","Kansas","Kentucky","Louisiana","Maine","Maryland","Massachusetts","Michigan","Minnesota","Mississippi","Missouri","Montana","Nebraska","Nevada","New Hampshire","New Jersey","New Mexico","New York","North Dakota","North Carolina","Ohio","Oklahoma","Oregon","Pennsylvania","Rhode Island","South Carolina","South Dakota","Tennessee","Texas","Utah","Vermont","Virginia","Washington","West Virginia","Wisconsin","Wyoming"]
    });

    $('#state2').editable({
        value: 'California',
        typeahead: {
            name: 'state',
            local: ["Alabama","Alaska","Arizona","Arkansas","California","Colorado","Connecticut","Delaware","Florida","Georgia","Hawaii","Idaho","Illinois","Indiana","Iowa","Kansas","Kentucky","Louisiana","Maine","Maryland","Massachusetts","Michigan","Minnesota","Mississippi","Missouri","Montana","Nebraska","Nevada","New Hampshire","New Jersey","New Mexico","New York","North Dakota","North Carolina","Ohio","Oklahoma","Oregon","Pennsylvania","Rhode Island","South Carolina","South Dakota","Tennessee","Texas","Utah","Vermont","Virginia","Washington","West Virginia","Wisconsin","Wyoming"]
        }
    });

    $('#locationType').editable({
        value: 2,
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

    /*  -------------------             *** Editable Def ***            -------------------  */

    $('#user .editable').on('hidden', function(e, reason){
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



});
