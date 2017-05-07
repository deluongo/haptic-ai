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
        webSiteUrl matches: /((([A-Za-z]{3,9}:(?:\/\/)?)(?:[-;:&=\+\$,\w]+@)?[A-Za-z0-9.-]+|(?:www.|[-;:&=\+\$,\w]+@)[A-Za-z0-9.-]+)((?:\/[\+~%\/.\w-_]*)?\??(?:[-\+=&;%@.\w_]*)#?(?:[\w]*))?)/
        resourceWeight nullable: true
        traffic nullable: true
        alexaRating nullable: true
    }
    /*  -------------------             *** GORM Mapping ***            -------------------  */
    static hasMany = [notes: Note]
}
