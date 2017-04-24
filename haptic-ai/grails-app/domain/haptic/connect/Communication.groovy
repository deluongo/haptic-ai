package haptic.connect

import haptic.crm.Contact
import haptic.eval.Note
import haptic.org.Employee


/*                          ==============  ***  ==============                          *
 #  ---------------------      Class ~Communication~ Definition       --------------------  #
 *                          ===================================                          */


class Communication {

/*  _________________________                                  ________________________  */
/*  ========================= !!! ---*** PROPERTIES ***--- !!! ========================  */


/*  -------------------         *** Instantiate Variables ***       -------------------  */


    // Fixed Fields
    String comChannel // call, email, post
    String direction // inbound, outbound

    Date comDate
    Date timeStamp


    String answered //yes, no
    String productsMentioned // JSON, Array, how do we store a list
    String competitorsMentioned // JSON, Array, how do we store a list
    String keywords // JSON, Array, how do we store a list
    Float score
    Float length //Seconds for call, words for email/post
    String title
    String comContent // Call transcript, email/post text,

    // Nullable
    Employee outboundSender
    Contact inboundSender
    Contact outboundReceiver
    Employee inboundReciever

    static constraints = {
    }

    static mapping = {
        comContent sqlType: 'longText'
    }

/*  -------------------             *** GORM Mapping ***            -------------------  */
    static hasMany = [notes: Note]
}

