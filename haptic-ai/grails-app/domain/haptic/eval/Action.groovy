package haptic.eval

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
    String actionType //call, email, post


    // Possible Mapping, Pivot Table Candidates
    def touchpoint // Call, Email, Post
    Result result
    Employee owner


    static constraints = {
        actionType inList: ['Call', 'Email', 'Post']
    }
}
