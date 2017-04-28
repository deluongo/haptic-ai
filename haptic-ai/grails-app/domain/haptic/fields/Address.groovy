package haptic.fields

import haptic.eval.Note

/*                          ==============  ***  ==============                          *
 #  ---------------------        Class ~Address~ Definition        --------------------  #
 *                          ===================================                          */



class Address {

/*  _________________________                                  ________________________  */
/*  ========================= !!! ---*** PROPERTIES ***--- !!! ========================  */


/*  -------------------         *** Instantiate Variables ***       -------------------  */


    // Fixed Fields
    String locName
    String locType // Main Office, Satelite Office, Home, Restaurant, etc.
    Integer streetNumber
    String streetName
    String city
    String state
    String country
    String zip

    static constraints = {
        locName blank: false
        locType blank: false
        streetName blank: false
        city blank: false
        state blank: false
        country blank: false
        zip matches: /^[0-9]{5}(?:-[0-9]{4})?$/
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






/*  _________________________                                  ________________________  */
/*  ========================= !!! ---*** TRANSIENTS ***--- !!! ========================  */


    /*  ~~~~~~~~~~~~~~~~~~~~~~~~~~
     *  ~~~~~~ FULL ADDRESS ~~~~~~
     *  ~~~~~~~~~~~~~~~~~~~~~~~~~~ */
    def getFullAddress() {
        "${streetNumber} ${streetName} ${city}, ${state}, ${zip}"
    }
}

