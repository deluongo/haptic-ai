package haptic.fields

import haptic.connect.Communication
import haptic.eval.Note


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


    Communication lastPost

/*  -------------------             *** GORM Mapping ***            -------------------  */
    static hasMany = [posts: Communication, notes: Note]


    static constraints = {
    }

}
