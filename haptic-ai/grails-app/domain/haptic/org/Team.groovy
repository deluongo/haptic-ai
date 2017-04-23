package haptic.org
import haptic.join.Employee_Team
/*                          ==============  ***  ==============                          *
 #  ---------------------       Class ~Employee~ Definition        --------------------  #
 *                          ===================================                          */


class Team {


/*  _________________________                                  ________________________  */
/*  ========================= !!! ---*** PROPERTIES ***--- !!! ========================  */


/*  -------------------         *** Instantiate Variables ***       -------------------  */

    String name


/*  -------------------              *** Constraints ***            -------------------  */
    static constraints = {

    }


/*  -------------------          *** Database Designations ***      -------------------  */
    static mapping = {

    }

/*  -------------------             *** GORM Mapping ***            -------------------  */
    static hasMany = [teamMembers: Employee_Team]
    static hasOne = [teamLead: Employee_Team]

/*  -------------------             *** List Transients ***         -------------------  */
    static transients = [
        /* ___  security  ___ */

]
/*  -------------------           *** Transient Functions ***       -------------------  */


}

