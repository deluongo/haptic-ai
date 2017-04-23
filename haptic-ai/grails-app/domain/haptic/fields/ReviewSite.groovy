package haptic.fields

import haptic.connect.Post


/*                          ==============  ***  ==============                          *
 #  ---------------------      Class ~ReviewSite~ Definition       --------------------  #
 *                          ===================================                          */



class ReviewSite {


/*  _________________________                                  ________________________  */
/*  ========================= !!! ---*** PROPERTIES ***--- !!! ========================  */


/*  -------------------         *** Instantiate Variables ***       -------------------  */


    // Fixed Fields
    String siteName // G2Crowd, Yelp, etc.
    String siteUrl
    String handle //CaptainAwesome650
    Date lastActivity


    Post lastPost

/*  -------------------             *** GORM Mapping ***            -------------------  */
    static hasMany = [posts: Post]


    static constraints = {
    }
}
