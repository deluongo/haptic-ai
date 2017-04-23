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

    // Default
    String salutation //Mr., Mrs., etc.
    String firstName
    String lastName
    String gender
    String jobTitle
    String team



/*  -------------------              *** Constraints ***            -------------------  */
    static constraints = {

    }


/*  -------------------          *** Database Designations ***      -------------------  */
    static mapping = {

    }

/*  -------------------             *** GORM Mapping ***            -------------------  */
    static hasMany = [teams: Employee_Team]
    static belongsTo = [user: User]

/*  -------------------             *** List Transients ***         -------------------  */
    static transients = [
            /* ___  security  ___ */

    ]
/*  -------------------           *** Transient Functions ***       -------------------  */


}
