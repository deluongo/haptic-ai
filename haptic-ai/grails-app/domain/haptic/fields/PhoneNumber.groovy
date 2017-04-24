package haptic.fields

import haptic.connect.Communication
import haptic.eval.Note


/*                          ==============  ***  ==============                          *
 #  ---------------------      Class ~PhoneNumber~ Definition      --------------------  #
 *                          ===================================                          */



class PhoneNumber {

/*  _________________________                                  ________________________  */
/*  ========================= !!! ---*** PROPERTIES ***--- !!! ========================  */


/*  -------------------         *** Instantiate Variables ***       -------------------  */


    // Fixed Fields
    String phoneNumber // 3 digits for country code, 15 digits for number
    String phoneType // e.164 Format: string https://en.wikipedia.org/wiki/E.164 Home, Work, Personal
    Boolean primary // yes, no
    Date dateCreated
    //Date expirationDate

    // Possible transient or service
<<<<<<< HEAD
    Call lastCallAnswered //Last Action
    Call lastCallPlaced  // Reference to linked row in call, email, or post w/ most recent timestamp

    /** TO-DO: Establish logical relationship between callsSinceLastAnswer/Response
=======
    Communication lastCallAnswered //Last Action
    Communication lastCallPlaced  // Reference to linked row in call, email, or post w/ most recent timestamp
>>>>>>> master
    Integer callsSinceLastAnswer
    Integer callsSinceLastResponse
    **/

    /** TO-DO: Formula for answer rate
    Float answerRate
     **/


    static constraints = {
        phoneNumber matches: /^(?:(?:\+?1\s*(?:[.-]\s*)?)?(?:\(\s*([2-9]1[02-9]|[2-9][02-8]1|[2-9][02-8][02-9])\s*\)|([2-9]1[02-9]|[2-9][02-8]1|[2-9][02-8][02-9]))\s*(?:[.-]\s*)?)?([2-9]1[02-9]|[2-9][02-9]1|[2-9][02-9]{2})\s*(?:[.-]\s*)?([0-9]{4})(?:\s*(?:#|x\.?|ext\.?|extension)\s*(\d+))?\u0024/
        phoneType blank: false
    }

/*  -------------------             *** GORM Mapping ***            -------------------  */
    static hasMany = [notes: Note]
}
