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
    String type

    String fromField
    String toField

    Date comDate
    //Date timeStamp //use transient to pull from date


    String answered //yes, no
    String productsMentioned // JSON, Array, how do we store a list
    String competitorsMentioned // JSON, Array, how do we store a list
    String keywords // JSON, Array, how do we store a list
    Float score
    Float length //Seconds for call, words for email/post
    String comTitle
    String comContent // Call transcript, email/post text,

    // Nullable
    def sender
    def receiver



    static constraints = {
        keywords nullable: true
        length nullable: true
        score nullable: true
        answered nullable: true
        productsMentioned nullable: true
        competitorsMentioned nullable: true
        fromField nullable: true
        toField nullable: true
        type nullable: true
        comTitle nullable: true
        comContent nullable: true
    }

    static mapping = {
        comContent sqlType: 'longText'
    }

/*  -------------------             *** GORM Mapping ***            -------------------  */
    static hasMany = [notes: Note]
}

