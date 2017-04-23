package haptic.fields

import haptic.connect.Call
import haptic.eval.Action


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
    String primary // yes, no
    Date dateCreated
    Date expirationDate

    // Possible transient or service
    Call lastCallAnswered //Last Action
    Call lastCallPlaced  // Reference to linked row in call, email, or post w/ most recent timestamp
    Integer callsSinceLastAnswer
    Integer callsSinceLastResponse
    Float answerRate



    static constraints = {
    }
}
