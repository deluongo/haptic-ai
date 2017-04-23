package haptic.org

class PrivateDetails {

    def bonusStructure //Needs to support complex formulas entered by user
    Float personalTarget //How is this defined? Where?
    Float personalAchieved //How is this tracked? Must be automated.
    Float earnings
    Integer hapticLevel //represents how engaged they are with the platform. Gamification.

    static constraints = {
    }
}
