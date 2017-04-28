package haptic.ai

class ContactInfoTagLib {
    static defaultEncodeAs = [taglib:'html']
    static encodeAsForTags = [allDetails: [taglib:'none'], allDetailsAsRows: [taglib:'none']]

    static namespace = "contactInfo"

    def allDetails = {attrs ->
        def parentTable = attrs.source

        def emails = parentTable?.emailAddresses ?: []
        def numbers = parentTable?.phoneNumbers ?: []
        def networks = parentTable?.socialNetworks ?: []
        def sites = parentTable?.reviewSites ?: []
        def reviews = parentTable?.webSites ?: []
        def addresses = parentTable?.addresses ?: []

        def lengthList = [emails.size(), numbers.size(), networks.size(), sites.size(), reviews.size(), addresses.size()]
        def numRows = lengthList.max()

        def mb = new groovy.xml.MarkupBuilder(out)

        def dataType = "data-type"
        def dataPk = "data-pk"
        def dataValue = "data-value"
        def dataTitle = "data-title"
        def dataToggle = "data-toggle"
        def dataTarget = "data-target"

        mb.table(class: "table table-bordered table-striped"){
            tr(class: "w3-cyan"){
                th{ mb.yield "Email Addresses" }
                th{ mb.yield "Phone Numbers" }
                th{ mb.yield "Social Networks" }
                th{ mb.yield "Review Sites" }
                th(class: 'hidden-xs hidden-sm'){ mb.yield "Web Sites" }
                th{ mb.yield "Addresses" }
            }

            numRows.times{
                tr{
                    td{mb.yield "${parentTable?.emailAddresses.fullAddress ?: ''}" }
                    td{mb.yield "${parentTable?.phoneNumbers.phoneNumber ?: ''}" }
                    td{mb.yield "${parentTable?.socialNetworks.networkUrl ?: ''}" }
                    td{mb.yield "${parentTable?.reviewSites.siteUrl ?: ''}" }
                    td{mb.yield "${parentTable?.webSites.siteUrl ?: ''}" }
                    td{mb.yield "${parentTable?.addresses.fullAddress ?: ''}" }
                }
            }


            tr{
                td{ a( (dataToggle):"modal", (dataTarget):"#add-email-address-modal", "Add Email") }
                td{ a( (dataToggle):"modal", (dataTarget):"#add-phone-number-modal", "Add Phone") }
                td{ a( (dataToggle):"modal", (dataTarget):"#add-social-network-modal", "Add Network") }
                td{ a( (dataToggle):"modal", (dataTarget):"#add-review-site-modal", "Add Site") }
                td{ a( (dataToggle):"modal", (dataTarget):"#add-web-site-modal", "Add Website") }
                td{ a( (dataToggle):"modal", (dataTarget):"#add-address-modal", "Add Address") }


                //SINGLE FIELD ENTRY
                //td{ a(href:"#", id:"add-email-address", class:"editable editable-click editable-empty", (dataType): "text", (dataPk): "2", (dataValue): "", (dataTitle): "Add email", "Add Email") }
                //td{ a(href:"#", id:"add-phone-number", class:"editable editable-click editable-empty", (dataType): "text", (dataPk): "2", (dataValue): "", (dataTitle): "Add phone", "Add Phone") }
                //td{ a(href:"#", id:"add-social-network", class:"editable editable-click", (dataType): "select2", (dataPk): "2", (dataValue): "BS", (dataTitle): "Add social network", "Add Network")  }
                //td{ a(href:"#", id:"add-review-site", class:"editable editable-click", (dataType): "select2", (dataPk): "2", (dataValue): "BS", (dataTitle): "Add review site", "Add Site")  }
                //td{ a(href:"#", id:"add-web-site", class:"editable editable-click", (dataType): "select2", (dataPk): "2", (dataValue): "BS", (dataTitle): "Add web site", "Add Site")  }
                //td{ a(href:"#", id:"address", class:"editable editable-click", (dataType): "select2", (dataPk): "2", (dataValue): "BS", (dataTitle): "Add address", "Add Address")  }
            }

        }
    }

    def allDetailsAsRows = {attrs ->
        def parentTable = attrs.source

        def emails = parentTable?.emailAddresses ?: []
        def numbers = parentTable?.phoneNumbers ?: []
        def networks = parentTable?.socialNetworks ?: []
        def sites = parentTable?.reviewSites ?: []
        def reviews = parentTable?.webSites ?: []
        def addresses = parentTable?.addresses ?: []

        def lengthList = [emails.size(), numbers.size(), networks.size(), sites.size(), reviews.size(), addresses.size()]
        def numRows = lengthList.max()

        def mb = new groovy.xml.MarkupBuilder(out)

        tr(class: "w3-cyan"){
            th{ mb.yield "Email Addresses" }
            th{ mb.yield "Phone Numbers" }
            th{ mb.yield "Social Networks" }
            th{ mb.yield "Review Sites" }
            th(class: 'hidden-xs hidden-sm'){ mb.yield "Web Sites" }
            th{ mb.yield "Addresses" }
        }

        numRows.times{
            tr{
                th{ mb.yield "${source?.emailAddresses.fullAddress ?: ''}" }
                td{mb.yield "${source?.phoneNumbers.phoneNumber ?: ''}" }
                td{mb.yield "${source?.socialNetworks.networkUrl ?: ''}" }
                td{mb.yield "${source?.reviewSites.siteUrl ?: ''}" }
                td{mb.yield "${source?.webSites.siteUrl ?: ''}" }
                td{mb.yield "${source?.addresses.fullAddress ?: ''}" }
            }
        }
    }
}
