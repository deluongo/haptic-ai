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
    String webSiteName
    String webSiteUrl
    String webSiteType
    Float resourceWeight //for lead scoring
    Integer traffic
    String alexaRating


    static constraints = {
        webSiteName blank: false
        webSiteUrl matches: /(https?:\/\/)?(www\.)?[-a-zA-Z0-9@:%._\+~#=]{2,256}\.[a-z]{2,4}/
    }
    /*  -------------------             *** GORM Mapping ***            -------------------  */
    static hasMany = [notes: Note]
}
