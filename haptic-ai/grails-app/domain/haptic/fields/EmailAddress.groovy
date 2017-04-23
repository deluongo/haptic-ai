package haptic.fields

import haptic.connect.Email


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
    String primary // yes, no
    String emailStatus //active, unsubscribed, un-verified, verified
    String unsubsribed //yes, no

    // Possible transient or service
    Email lastEmailAnswered //Last Action
    Email lastEmailSent  // Reference to linked row in call, email, or post w/ most recent timestamp
    Integer emailsSinceLastAnswer
    Integer emailsSinceLastResponse
    Float answerRate

    static constraints = {
    }
}
