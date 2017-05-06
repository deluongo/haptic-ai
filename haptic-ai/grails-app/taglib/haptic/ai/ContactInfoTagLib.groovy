package haptic.ai

class ContactInfoTagLib {
    static defaultEncodeAs = [taglib:'html']
    static encodeAsForTags = [allDetails: [taglib:'none'], contactDetails: [taglib:'none'], websiteDetails: [taglib:'none'], allDetailsAsRows: [taglib:'none']]

    static namespace = "contactInfo"

    def contactDetails = {attrs ->
        def parentTable = attrs.source

        def emails = parentTable?.emailAddresses ?: []
        def numbers = parentTable?.phoneNumbers ?: []
        def addresses = parentTable?.addresses ?: []

        def lengthList = [emails.size(), numbers.size(), addresses.size()]
        def numRows = lengthList.max()

        def mb = new groovy.xml.MarkupBuilder(out)

        def dataType = "data-type"
        def dataPk = "data-pk"
        def dataValue = "data-value"
        def dataTitle = "data-title"
        def dataToggle = "data-toggle"
        def dataTarget = "data-target"


        mb.table(class: "table table-bordered table-striped"){
            tr{
                td{ mb.yield "Social" }
                td{ mb.yield "Reviews" }
                td{ mb.yield "Websites" }
            }

            for (def i = 0; i < numRows; i++) {
                tr{
                    td{a(class: "new-tab-link", href: "mailto:${(emails as List)[i]?.emailAddress}"){ mb.yield "${(emails as List)[i]?.emailAddress ?: ''}" } }
                    td{mb.yield "${(numbers as List)[i]?.phoneNumber ?: ''}" }
                    td{a(class: "address-hover-to-expand-details", describeby: "add-hover-view"){ mb.yield "${(addresses as List)[i]?.locName ?: ''}" } }
                }
            }


            tr{
                //td(class:"text-center"){ a( (dataToggle):"modal", (dataTarget):"#add-email-address-modal" ) {span{ i('class': 'fa fa-plus icon-add-contact-method', '') "Email" }  }

                //td(class:"text-center"){ div{ button(class:"btn btn-default btn-addon m-b-sm", (dataToggle):"modal", (dataTarget):"#add-email-address-modal", "+ Email")  } }
                //td(class:"text-center"){ div{ button(class:"btn btn-default btn-addon m-b-sm", (dataToggle):"modal", (dataTarget):"#add-phone-number-modal", "+ Phone")  } }
                //td(class:"text-center"){ div{ button(class:"btn btn-default btn-addon m-b-sm", (dataToggle):"modal", (dataTarget):"#add-social-network-modal", "+ Network")  } }
                //td(class:"text-center"){ div{ button(class:"btn btn-default btn-addon m-b-sm", (dataToggle):"modal", (dataTarget):"#add-review-site-modal", "+ Site")  } }
                //td(class:"text-center"){ div{ button(class:"btn btn-default btn-addon m-b-sm", (dataToggle):"modal", (dataTarget):"#add-web-site-modal", "+ Website")  } }
                //td(class:"text-center"){ div{ button(class:"btn btn-default btn-addon m-b-sm", (dataToggle):"modal", (dataTarget):"#add-address-modal", "+ Address")  } }

                td{ a( (dataToggle):"modal", (dataTarget):"#add-email-address-modal", "Add Email") }
                td{ a( (dataToggle):"modal", (dataTarget):"#add-phone-number-modal", "Add Phone") }
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

    def websiteDetails = {attrs ->
        def parentTable = attrs.source

        def networks = parentTable?.socialNetworks ?: []
        def reviews = parentTable?.reviewSites ?: []
        def sites = parentTable?.webSites ?: []


        def lengthList = [networks.size(), sites.size(), reviews.size()]
        def numRows = lengthList.max()

        def mb = new groovy.xml.MarkupBuilder(out)

        def dataType = "data-type"
        def dataPk = "data-pk"
        def dataValue = "data-value"
        def dataTitle = "data-title"
        def dataToggle = "data-toggle"
        def dataTarget = "data-target"

        mb.table(class: "table table-bordered table-striped"){
            tr{
                td{ mb.yield "Social" }
                td{ mb.yield "Reviews" }
                td{ mb.yield "Websites" }
            }

            for (def i = 0; i < numRows; i++) {
                tr{
                    td{a(class: "new-tab-link", href: "${(networks as List)[i]?.networkUrl}"){ mb.yield "${(networks as List)[i]?.networkUrl ?: ''}" } }
                    td{a(class: "new-tab-link", href: "${(reviews as List)[i]?.reviewSiteUrl}"){ mb.yield "${(reviews as List)[i]?.reviewSiteUrl ?: ''}" } }
                    td{a(class: "new-tab-link", href: "${(sites as List)[i]?.webSiteUrl}"){ mb.yield "${(sites as List)[i]?.webSiteUrl ?: ''}" } }
                }
            }


            tr{
                //td(class:"text-center"){ a( (dataToggle):"modal", (dataTarget):"#add-email-address-modal" ) {span{ i('class': 'fa fa-plus icon-add-contact-method', '') "Email" }  }

                //td(class:"text-center"){ div{ button(class:"btn btn-default btn-addon m-b-sm", (dataToggle):"modal", (dataTarget):"#add-email-address-modal", "+ Email")  } }
                //td(class:"text-center"){ div{ button(class:"btn btn-default btn-addon m-b-sm", (dataToggle):"modal", (dataTarget):"#add-phone-number-modal", "+ Phone")  } }
                //td(class:"text-center"){ div{ button(class:"btn btn-default btn-addon m-b-sm", (dataToggle):"modal", (dataTarget):"#add-social-network-modal", "+ Network")  } }
                //td(class:"text-center"){ div{ button(class:"btn btn-default btn-addon m-b-sm", (dataToggle):"modal", (dataTarget):"#add-review-site-modal", "+ Site")  } }
                //td(class:"text-center"){ div{ button(class:"btn btn-default btn-addon m-b-sm", (dataToggle):"modal", (dataTarget):"#add-web-site-modal", "+ Website")  } }
                //td(class:"text-center"){ div{ button(class:"btn btn-default btn-addon m-b-sm", (dataToggle):"modal", (dataTarget):"#add-address-modal", "+ Address")  } }

                td{ a( (dataToggle):"modal", (dataTarget):"#add-social-network-modal", "Add Network") }
                td{ a( (dataToggle):"modal", (dataTarget):"#add-review-site-modal", "Add Site") }
                td{ a( (dataToggle):"modal", (dataTarget):"#add-web-site-modal", "Add Website") }


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

    def allDetails = {attrs ->
        def parentTable = attrs.source

        def emails = parentTable?.emailAddresses ?: []
        def numbers = parentTable?.phoneNumbers ?: []
        def networks = parentTable?.socialNetworks ?: []
        def reviews = parentTable?.reviewSites ?: []
        def sites = parentTable?.webSites ?: []
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

        print(emails[0])

        mb.table(class: "table table-bordered table-striped"){
            tr{
                td{ mb.yield "Emails" }
                td{ mb.yield "Phones" }
                td{ mb.yield "Social" }
                td{ mb.yield "Reviews" }
                td{ mb.yield "Websites" }
                td{ mb.yield "Locations" }
            }

            for (def i = 0; i < numRows; i++) {
                tr{
                    td{a(class: "new-tab-link", href: "mailto:${(emails as List)[i]?.emailAddress}"){ mb.yield "${(emails as List)[i]?.emailAddress ?: ''}" } }
                    td{mb.yield "${(numbers as List)[i]?.phoneNumber ?: ''}" }
                    td{a(class: "new-tab-link", href: "${(networks as List)[i]?.networkUrl}"){ mb.yield "${(networks as List)[i]?.networkUrl ?: ''}" } }
                    td{a(class: "new-tab-link", href: "${(reviews as List)[i]?.reviewSiteUrl}"){ mb.yield "${(reviews as List)[i]?.reviewSiteUrl ?: ''}" } }
                    td{a(class: "new-tab-link", href: "${(sites as List)[i]?.webSiteUrl}"){ mb.yield "${(sites as List)[i]?.webSiteUrl ?: ''}" } }
                    td{a(class: "address-hover-to-expand-details", describeby: "add-hover-view"){ mb.yield "${(addresses as List)[i]?.locName ?: ''}" } }
                }
            }


            tr{
                //td(class:"text-center"){ a( (dataToggle):"modal", (dataTarget):"#add-email-address-modal" ) {span{ i('class': 'fa fa-plus icon-add-contact-method', '') "Email" }  }

                //td(class:"text-center"){ div{ button(class:"btn btn-default btn-addon m-b-sm", (dataToggle):"modal", (dataTarget):"#add-email-address-modal", "+ Email")  } }
                //td(class:"text-center"){ div{ button(class:"btn btn-default btn-addon m-b-sm", (dataToggle):"modal", (dataTarget):"#add-phone-number-modal", "+ Phone")  } }
                //td(class:"text-center"){ div{ button(class:"btn btn-default btn-addon m-b-sm", (dataToggle):"modal", (dataTarget):"#add-social-network-modal", "+ Network")  } }
                //td(class:"text-center"){ div{ button(class:"btn btn-default btn-addon m-b-sm", (dataToggle):"modal", (dataTarget):"#add-review-site-modal", "+ Site")  } }
                //td(class:"text-center"){ div{ button(class:"btn btn-default btn-addon m-b-sm", (dataToggle):"modal", (dataTarget):"#add-web-site-modal", "+ Website")  } }
                //td(class:"text-center"){ div{ button(class:"btn btn-default btn-addon m-b-sm", (dataToggle):"modal", (dataTarget):"#add-address-modal", "+ Address")  } }

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
                td{ mb.yield "${source?.emailAddresses.fullAddress ?: ''}" }
                td{mb.yield "${source?.phoneNumbers.phoneNumber ?: ''}" }
                td{mb.yield "${source?.socialNetworks.networkUrl ?: ''}" }
                td{mb.yield "${source?.reviewSites.siteUrl ?: ''}" }
                td(class: 'hidden-xs hidden-sm'){mb.yield "${source?.webSites.siteUrl ?: ''}" }
                td{mb.yield "${source?.addresses.fullAddress ?: ''}" }
            }
        }
    }
}
