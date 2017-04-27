$( document ).ready(function() {

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
                    $(this.el).find('.percent').text(Math.round(percent));
                }
        });

        jQuery('.kpi-4').easyPieChart({
            easing: 'easeOutBounce',
            animate: 2000,
            onStep: function(from, to, percent) {
                $(this.el).find('.percent').text(Math.round(percent)).append("%");
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


});
