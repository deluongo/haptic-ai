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
    String alexaRating


    static constraints = {
    }

    /*  -------------------             *** GORM Mapping ***            -------------------  */
    static hasMany = [notes: Note]
}
