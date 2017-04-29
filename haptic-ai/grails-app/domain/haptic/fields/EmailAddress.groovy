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
    String emailStatus //active, unsubscribed, un-verified, verified

    Date dateCreated

    /*** UNCOMMENT BELOW ***/
//    // Possible transient or service
//    Communication lastEmailAnswered //Last Action
//    Communication lastEmailSent  // Reference to linked row in call, email, or post w/ most recent timestamp
//    Integer emailsSinceLastAnswer
//    Integer emailsSinceLastResponse
//    Float answerRate

    static constraints = {
        emailAddress matches: /^[a-zA-Z0-9_.+-]+@([\w-]+\.)+[\w-]{2,4}$/, blank: false
        emailExtension blank: false
        emailStatus inList: ['Active', 'Inactive', 'Unsubscribed', 'Unverified', 'Verified']

        notes nullable: true
        lastEmailAnswered nullable: true
        lastEmailSent nullable: true


    }

/*  -------------------             *** GORM Mapping ***            -------------------  */
    static hasMany = [notes: Note]

/*  -------------------             *** List Transients ***         -------------------  */
    static transients = [
            /* ___  stats | totals  ___ */
            'fullAddress'
    ]

/*                          ==============  ***  ==============                          *
 #  ---------------------                Functions                 --------------------  #
 *                          ===================================                          */

/////  TO DO
//     -----
//     - Create function of service to parse email address for DB storage




/*  _________________________                                  ________________________  */
/*  ========================= !!! ---*** TRANSIENTS ***--- !!! ========================  */


/*  ~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  ~~~~~~ FULL ADDRESS ~~~~~~
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~ */
    def getFullAddress() {
        emailAddress + emailExtension
    }
}
