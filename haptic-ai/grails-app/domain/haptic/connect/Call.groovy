package haptic.connect


/*                          ==============  ***  ==============                          *
 #  ---------------------          Class ~Call~ Definition         --------------------  #
 *                          ===================================                          */


class Call {


/*  _________________________                                  ________________________  */
/*  ========================= !!! ---*** PROPERTIES ***--- !!! ========================  */


/*  -------------------         *** Instantiate Variables ***       -------------------  */


    // Fixed Fields
    Date callDate
    Date timeStamp
    Float length
    def caller // Employee or Contact
    def receiver  // Employee or Contact
    String answered //yes, no
    String productsMentioned // JSON, Array, how do we store a list
    String competitorsMentioned // JSON, Array, how do we store a list
    String keywords // JSON, Array, how do we store a list
    Float score






    static constraints = {
    }
}
