package haptic.ai

class ContactInfoTagLib {
    static defaultEncodeAs = [taglib:'html']
    static encodeAsForTags = [seasonStats: [taglib:'none'], perGameStats: [taglib:'none']]

    static namespace = "contactInfo"

    def contactInfo = {attrs ->
        def parentTable = attrs.source

        def mb = new groovy.xml.MarkupBuilder(out)

        mb.table(class: "w3-table w3-bordered w3-striped w3-border test w3-hoverable w3-centered"){
            tr(class: "w3-cyan"){
                th{ mb.yield "Email Addresses" }
                th{ mb.yield "Phone Numbers" }
                th{ mb.yield "Social Networks" }
                th{ mb.yield "Review Sites" }
                th(class: 'hidden-xs hidden-sm'){ mb.yield "Web Sites" }
                th{ mb.yield "Addresses" }
            }

            tr{
                th{ mb.yield "${source.emailAddresses.fullAddress}" }
                td{mb.yield "${player.minutesPlayed}"}
                td{mb.yield "${player.points}"}
                td{mb.yield "${player.assists}"}
                td{mb.yield "${player.rebounds}"}
                td{mb.yield "${player.steals}"}

                td(class: 'hidden-xs hidden-sm'){mb.yield "${player.shotsAttempted}"}
                td(class: 'hidden-xs hidden-sm'){mb.yield "${player.shotsMade}"}
                td(class: 'hidden-xs '){mb.yield "${player.shootingPercentage}%"}
                td(class: 'hidden-xs hidden-sm'){mb.yield "${player.threePointersAttempted}"}
                td(class: 'hidden-xs hidden-sm'){mb.yield "${player.threePointersMade}"}
                td(class: 'hidden-xs '){mb.yield "${player.threePointPercentage}%"}
                td(class: 'hidden-xs '){mb.yield "${player.personalFouls}"}
            }
        }
    }
}
