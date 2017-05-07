
            <div class="timeline">

                <g:each status="i" in="${activeContact?.communications}" var="action">
                    <g:if test="${action?.comChannel == "email"}">

                        <!-- TIMELINE ITEM -->
                        <div class="timeline-item">
                            <div class="timeline-badge">
                                <img class="timeline-badge-userpic" src="https://cdn4.iconfinder.com/data/icons/happily-colored-snlogo/512/gmail-email-mail-logo-circle-material.png"> </div>
                            <div class="timeline-body">
                                <div class="timeline-body-arrow"> </div>
                                <div class="timeline-body-head">
                                    <div class="timeline-body-head-caption">
                                        <a href="javascript:;" class="timeline-body-title font-blue-madison">${action?.sender?.firstName} ${action?.sender?.lastName}</a>
                                        <span class="timeline-body-time font-grey-cascade">Sent at ${println(action?.comDate?.format('h:mm a MMMM dd, yyyy'))}</span>
                                    </div>
                                    <div class="timeline-body-head-actions">
                                        <div class="btn-group">
                                            <button class="btn btn-circle green btn-outline btn-sm dropdown-toggle" type="button" data-toggle="dropdown" data-hover="dropdown" data-close-others="true" disabled> Actions
                                                <i class="fa fa-angle-down"></i>
                                            </button>
                                            <ul class="dropdown-menu pull-right" role="menu">
                                                <li>
                                                    <a href="javascript:;">Action </a>
                                                </li>
                                                <li>
                                                    <a href="javascript:;">Another action </a>
                                                </li>
                                                <li>
                                                    <a href="javascript:;">Something else here </a>
                                                </li>
                                                <li class="divider"> </li>
                                                <li>
                                                    <a href="javascript:;">Separated link </a>
                                                </li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                <div class="timeline-body-content">
                                    <span class="font-grey-cascade"> ${action?.comContent} </span>
                                </div>
                            </div>
                        </div>
                        <!-- END TIMELINE ITEM -->



                    </g:if>

                </g:each>


                <!-- TIMELINE ITEM -->
                <div class="timeline-item">
                    <div class="timeline-badge">
                        <img class="timeline-badge-userpic" src="http://blog.addthiscdn.com/wp-content/uploads/2015/11/logo-facebook.png"> </div>
                    <div class="timeline-body">
                        <div class="timeline-body-arrow"> </div>
                        <div class="timeline-body-head">
                            <div class="timeline-body-head-caption">
                                <a href="javascript:;" class="timeline-body-title font-blue-madison">Lisa Strong</a>
                                <span class="timeline-body-time font-grey-cascade">Replied at 17:45 PM</span>
                            </div>
                            <div class="timeline-body-head-actions">
                                <div class="btn-group">
                                    <button class="btn btn-circle green btn-outline btn-sm dropdown-toggle" type="button" data-toggle="dropdown" data-hover="dropdown" data-close-others="true"> Actions
                                        <i class="fa fa-angle-down"></i>
                                    </button>
                                    <ul class="dropdown-menu pull-right" role="menu">
                                        <li>
                                            <a href="javascript:;">Action </a>
                                        </li>
                                        <li>
                                            <a href="javascript:;">Another action </a>
                                        </li>
                                        <li>
                                            <a href="javascript:;">Something else here </a>
                                        </li>
                                        <li class="divider"> </li>
                                        <li>
                                            <a href="javascript:;">Separated link </a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <div class="timeline-body-content">
                            <span class="font-grey-cascade"> Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut consectetuer adipiscing elit laoreet dolore magna aliquam erat volutpat. Ut wisi enim
                            ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. </span>
                        </div>
                    </div>
                </div>
                <!-- END TIMELINE ITEM -->

                <!-- TIMELINE ITEM WITH GOOGLE MAP -->
                <div class="timeline-item">
                    <div class="timeline-badge">
                        <img class="timeline-badge-userpic" src="https://www.g2crowd.com/square-logo.png">
                    </div>
                    <div class="timeline-body">
                        <div class="timeline-body-arrow"> </div>
                        <div class="timeline-body-head">
                            <div class="timeline-body-head-caption">
                                <a href="javascript:;" class="timeline-body-title font-blue-madison">Paul Kiton</a>
                                <span class="timeline-body-time font-grey-cascade">Added office location at 2:50 PM</span>
                            </div>
                            <div class="timeline-body-head-actions">
                                <div class="btn-group">
                                    <button class="btn btn-circle red btn-sm dropdown-toggle" type="button" data-toggle="dropdown" data-hover="dropdown" data-close-others="true"> Actions
                                        <i class="fa fa-angle-down"></i>
                                    </button>
                                    <ul class="dropdown-menu pull-right" role="menu">
                                        <li>
                                            <a href="javascript:;">Action </a>
                                        </li>
                                        <li>
                                            <a href="javascript:;">Another action </a>
                                        </li>
                                        <li>
                                            <a href="javascript:;">Something else here </a>
                                        </li>
                                        <li class="divider"> </li>
                                        <li>
                                            <a href="javascript:;">Separated link </a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <div class="timeline-body-content">
                            <div id="gmap_polygons" class="gmaps"> </div>
                        </div>
                    </div>
                </div>
                <!-- END TIMELINE ITEM WITH GOOGLE MAP -->
                <!-- TIMELINE ITEM -->
                <div class="timeline-item">
                    <div class="timeline-badge">
                        <img class="timeline-badge-userpic" src="http://www.techlivewire.com/wp-content/uploads/2014/04/Twitter1.png">
                    </div>
                    <div class="timeline-body">
                        <div class="timeline-body-arrow"> </div>
                        <div class="timeline-body-head">
                            <div class="timeline-body-head-caption">
                                <span class="timeline-body-alerttitle font-red-intense">You have new follower</span>
                                <span class="timeline-body-time font-grey-cascade">at 11:00 PM</span>
                            </div>
                            <div class="timeline-body-head-actions">
                                <div class="btn-group">
                                    <button class="btn btn-circle green btn-outline

                                            btn-sm dropdown-toggle" type="button" data-toggle="dropdown" data-hover="dropdown" data-close-others="true"> Actions
                                        <i class="fa fa-angle-down"></i>
                                    </button>
                                    <ul class="dropdown-menu pull-right" role="menu">
                                        <li>
                                            <a href="javascript:;">Action </a>
                                        </li>
                                        <li>
                                            <a href="javascript:;">Another action </a>
                                        </li>
                                        <li>
                                            <a href="javascript:;">Something else here </a>
                                        </li>
                                        <li class="divider"> </li>
                                        <li>
                                            <a href="javascript:;">Separated link </a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <div class="timeline-body-content">
                            <span class="font-grey-cascade"> You have new follower
                                <a href="javascript:;">Ivan Rakitic</a>
                            </span>
                        </div>
                    </div>
                </div>
                <!-- END TIMELINE ITEM -->
                <!-- TIMELINE ITEM -->
                <div class="timeline-item">
                    <div class="timeline-badge">
                        <img class="timeline-badge-userpic" src="http://www.rpost.com/wp-content/uploads/2016/06/Linkedin_circle.svg_.png">
                    </div>
                    <div class="timeline-body">
                        <div class="timeline-body-arrow"> </div>
                        <div class="timeline-body-head">
                            <div class="timeline-body-head-caption">
                                <span class="timeline-body-alerttitle font-green-haze">Server Report</span>
                                <span class="timeline-body-time font-grey-cascade">Yesterday at 11:00 PM</span>
                            </div>
                            <div class="timeline-body-head-actions">
                                <div class="btn-group dropup">
                                    <button class="btn btn-circle red btn-sm dropdown-toggle" type="button" data-toggle="dropdown" data-hover="dropdown" data-close-others="true"> Actions
                                        <i class="fa fa-angle-down"></i>
                                    </button>
                                    <ul class="dropdown-menu pull-right" role="menu">
                                        <li>
                                            <a href="javascript:;">Action </a>
                                        </li>
                                        <li>
                                            <a href="javascript:;">Another action </a>
                                        </li>
                                        <li>
                                            <a href="javascript:;">Something else here </a>
                                        </li>
                                        <li class="divider"> </li>
                                        <li>
                                            <a href="javascript:;">Separated link </a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <div class="timeline-body-content">
                            <span class="font-grey-cascade"> Lorem ipsum dolore sit amet
                                <a href="javascript:;">Ispect</a>
                            </span>
                        </div>
                    </div>
                </div>
                <!-- END TIMELINE ITEM -->
            </div>
