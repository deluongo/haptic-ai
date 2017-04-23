package haptic.fields

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
    Integer zip

    static constraints = {
    }
}
