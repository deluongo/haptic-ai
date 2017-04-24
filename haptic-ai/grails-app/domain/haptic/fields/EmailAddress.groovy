package haptic.fields

import haptic.connect.Communication
import haptic.eval.Note


/*                          ==============  ***  ==============                          *
 #  ---------------------     Class ~EmailAddress~ Definition      --------------------  #
 *                          ===================================                          */

class EmailAddress {


/*  _________________________                                  ________________________  */
/*  ========================= !!! ---*** PROPERTIES ***--- !!! ========================  */


/*  -------------------         *** Instantiate Variables ***       -------------------  */


    // Fixed Fields
    String emailType
    String emailAddress
    String emailExtension
    Boolean primary // yes, no
    String emailStatus //active, unsubscribed, un-verified, verified
    Boolean unsubscribed //yes, no

    // Possible transient or service
<<<<<<< HEAD
    Email lastEmailAnswered //Last Action
    Email lastEmailSent  // Reference to linked row in call, email, or post w/ most recent timestamp

    /** TO-DO: Establish logical relationship between emailsSinceLastAnswer/Response
=======
    Communication lastEmailAnswered //Last Action
    Communication lastEmailSent  // Reference to linked row in call, email, or post w/ most recent timestamp
>>>>>>> master
    Integer emailsSinceLastAnswer
    Integer emailsSinceLastResponse
     **/

    /** TO-DO: Formula for calcuating answer rate
    Float answerRate
     **/

    static constraints = {
        emailAddress matches: /^[a-zA-Z0-9_.+-]+@([\w-]+\.)+[\w-]{2,4}$/
        emailStatus inList: ['active', 'unsubscribed', 'unverified', 'verified']
    }

/*  -------------------             *** GORM Mapping ***            -------------------  */
    static hasMany = [notes: Note]
}
