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


    // Possible Mapping, Pivot Table Candidates
    def touchpoint // Call, Email, Post
    Action actionReferenced
    Employee author


    static constraints = {
    }
}
