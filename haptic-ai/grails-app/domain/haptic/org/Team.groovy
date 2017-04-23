package haptic.org
import haptic.join.Employee_Team
/*                          ==============  ***  ==============                          *
 #  ---------------------       Class ~Employee~ Definition        --------------------  #
 *                          ===================================                          */


class Team {


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
    static hasMany = [employees: Employee_Team]

/*  -------------------             *** List Transients ***         -------------------  */
    static transients = [
        /* ___  security  ___ */

]
/*  -------------------           *** Transient Functions ***       -------------------  */


}
