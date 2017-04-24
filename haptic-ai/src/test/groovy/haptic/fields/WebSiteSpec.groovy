package haptic.fields

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(WebSite)
class WebSiteSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "Test site name not blank"() {
        when:"Site name blank"
            WebSite testWebSite = new WebSite(  siteName: '',
                                                siteUrl: 'google.com',
                                                resourceWeight: 10.0,
                                                traffic: 5)


        then:"Fail validation"
            !testWebSite.validate()

    }

    void "Test site URL in proper format"() {
        when: "Site URL not in proper format"
            WebSite testWebSite = new WebSite(  siteName: 'Google',
                                                siteUrl: '',
                                                resourceWeight: 10.0,
                                                traffic: 5)

        then: "Fail validation"
            !testWebSite.validate()

    }
}
