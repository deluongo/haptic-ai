package haptic.fields

import haptic.connect.Communication
import haptic.eval.Note


/*                          ==============  ***  ==============                          *
 #  ---------------------     Class ~SocialNetwork~ Definition     --------------------  #
 *                          ===================================                          */



class SocialNetwork {

/*  _________________________                                  ________________________  */
/*  ========================= !!! ---*** PROPERTIES ***--- !!! ========================  */


/*  -------------------         *** Instantiate Variables ***       -------------------  */


    // Fixed Fields
    String networkName //Facebook, Twitter, LinkedIn, Pintrist, GitHub, Google, etc.
    String networkUrl
    String handle //CaptainAwesome650
    Date lastActivity
    Communication lastPost
    Date lastOnline

/*  -------------------             *** GORM Mapping ***            -------------------  */
    static hasMany = [posts: Communication, notes: Note]


    static constraints = {
    }

}
