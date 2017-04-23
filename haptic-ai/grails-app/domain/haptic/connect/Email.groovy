package haptic.connect



/*                          ==============  ***  ==============                          *
 #  ---------------------         Class ~Email~ Definition         --------------------  #
 *                          ===================================                          */


class Email {


/*  _________________________                                  ________________________  */
/*  ========================= !!! ---*** PROPERTIES ***--- !!! ========================  */


/*  -------------------         *** Instantiate Variables ***       -------------------  */


    // Fixed Fields
    Date emailDate
    Date timeStamp
    def sender // Employee or Contact
    def receiver  // Employee or Contact
    String answered //yes, no
    String emailContent
    String productsMentioned // JSON, Array, how do we store a list
    String competitorsMentioned // JSON, Array, how do we store a list
    String keywords // JSON, Array, how do we store a list
    Float score


    static constraints = {

    }

    static mapping = {
        emailContent sqlType: 'longText'
    }

}
