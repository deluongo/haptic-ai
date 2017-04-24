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
        siteName blank: false
        siteUrl matches: /(https?:\/\/)?(www\.)?[-a-zA-Z0-9@:%._\+~#=]{2,256}\.[a-z]{2,4}/
        handle blank: false
    }

}
