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
    String socialNetworkHandle //CaptainAwesome650
    Date lastActivity
    Communication lastPost
    Date lastOnline

/*  -------------------             *** GORM Mapping ***            -------------------  */
    static hasMany = [posts: Communication, notes: Note]


    static constraints = {
        networkName blank: false
        networkUrl matches: /(https?:\/\/)?(www\.)?[-a-zA-Z0-9@:%._\+~#=]{2,256}\.[a-z]{2,4}/
        socialNetworkHandle blank: false
    }

}
