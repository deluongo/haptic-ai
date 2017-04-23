package haptic.eval

import haptic.org.Employee


/*                          ==============  ***  ==============                          *
 #  ---------------------          Class ~Note~ Definition         --------------------  #
 *                          ===================================                          */


class Note {
/*  _________________________                                  ________________________  */
/*  ========================= !!! ---*** PROPERTIES ***--- !!! ========================  */


/*  -------------------         *** Instantiate Variables ***       -------------------  */


    // Fixed Fields
    Date dateCreated
    Date dateUpdated
    Date timeStamp
    Employee author
    String noteContent


    static constraints = {
    }

    static mapping = {
        noteContent sqlType: 'longText'
    }
}
