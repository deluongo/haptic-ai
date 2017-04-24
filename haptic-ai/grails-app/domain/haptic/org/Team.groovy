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
        name blank: false
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



    PrivateDetails sumTeamPrivateDetails() {
        Float personalTarget = 0.0
        Float personalAchieved = 0.0
        Float earnings = 0.0
        Integer hapticLevel = 0.0

        for (member in teamMembers) {
            personalTarget+=member.getEmployee().getEmployeeDetails().getPersonalTarget()
            personalAchieved+=member.getEmployee().getEmployeeDetails().getPersonalAchieved()
            earnings+=member.getEmployee().getEmployeeDetails().getEarnings()
            hapticLevel+=member.getEmployee().getEmployeeDetails().getHapticLevel()
        }

        PrivateDetails teamDetails = new PrivateDetails(personalTarget: personalTarget, personalAchieved: personalAchieved,
                                    earnings: earnings, hapticLevel: hapticLevel)

        return teamDetails
    }

}

