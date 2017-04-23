package haptic.eval

import haptic.connect.Communication
import haptic.org.Employee


/*                          ==============  ***  ==============                          *
 #  ---------------------        Class ~Action~ Definition         --------------------  #
 *                          ===================================                          */


class Action {
/*  _________________________                                  ________________________  */
/*  ========================= !!! ---*** PROPERTIES ***--- !!! ========================  */


/*  -------------------         *** Instantiate Variables ***       -------------------  */


    // Fixed Fields
    Date actionDate
    Date timeStamp
    String impotant //yes, no

    String actionType //call, email, post

    // Possible Mapping, Pivot Table Candidates
    Communication actionChannel // Communication call, email, post

    Employee owner


    static constraints = {
    }

/*  -------------------             *** GORM Mapping ***            -------------------  */
    static hasMany = [results: Result, notes: Note]
}
