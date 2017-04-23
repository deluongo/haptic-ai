package haptic.org
import haptic.app.User
import haptic.join.Employee_Team
/*                          ==============  ***  ==============                          *
 #  ---------------------       Class ~Employee~ Definition        --------------------  #
 *                          ===================================                          */

class Employee {

/*  _________________________                                  ________________________  */
/*  ========================= !!! ---*** PROPERTIES ***--- !!! ========================  */


/*  -------------------         *** Instantiate Variables ***       -------------------  */

    // Fixed Fields
    String salutation //Mr., Mrs., etc.
    String firstName
    String lastName
    String gender
    String jobTitle
    String team


/*  -------------------             *** GORM Mapping ***            -------------------  */
    static hasMany = [teams: Employee_Team]
    static belongsTo = [user: User]




/*  -------------------              *** Constraints ***            -------------------  */
    static constraints = {

    }

/*  -------------------          *** Database Designations ***      -------------------  */
    static mapping = {

    }

/*  -------------------             *** List Transients ***         -------------------  */
    static transients = [
            /* ___  security  ___ */

    ]
/*  -------------------           *** Transient Functions ***       -------------------  */


}
