package haptic.eval

import haptic.org.Employee

/*                          ==============  ***  ==============                          *
 #  ---------------------        Class ~Result~ Definition         --------------------  #
 *                          ===================================                          */

class Result {
/*  _________________________                                  ________________________  */
/*  ========================= !!! ---*** PROPERTIES ***--- !!! ========================  */


/*  -------------------         *** Instantiate Variables ***       -------------------  */

    // Fixed Fields
    Date actionDate
    Date timeStamp
    String actionType //call, email, post
    String impotant //yes, no
    String timing //immediate, delayed, triggered, important

    // Possible Mapping, Pivot Table Candidates
    Employee resultAuthor


    static constraints = {
    }

/*  -------------------             *** GORM Mapping ***            -------------------  */
    static hasMany = [notes: Note]
    static belongsTo = [action: Action]
}
