package haptic.fields

import haptic.eval.Note


/*                          ==============  ***  ==============                          *
 #  ---------------------        Class ~Website~ Definition        --------------------  #
 *                          ===================================                          */



class WebSite {


/*  _________________________                                  ________________________  */
/*  ========================= !!! ---*** PROPERTIES ***--- !!! ========================  */


/*  -------------------         *** Instantiate Variables ***       -------------------  */


    // Fixed Fields
    String siteName
    String siteUrl
    Float resourceWeight //for lead scoring
    Integer traffic

    /** TO-DO: Add constraint for alexa rating
    String alexaRating
    **/

    static constraints = {
        siteName blank: false
        siteUrl matches: /(https?:\/\/)?(www\.)?[-a-zA-Z0-9@:%._\+~#=]{2,256}\.[a-z]{2,4}/
    }
    /*  -------------------             *** GORM Mapping ***            -------------------  */
    static hasMany = [notes: Note]
}
