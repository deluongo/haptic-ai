package haptic.fields

import grails.test.mixin.TestFor
import haptic.connect.Post
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(ReviewSite)
class ReviewSiteSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "Test site name not blank"() {
        when: "Site name blank"
            ReviewSite testReviewSite = new ReviewSite( siteName: '',
                                                        siteUrl: 'yelp.com',
                                                        handle: 'HarvardU',
                                                        lastActivity: new Date(),
                                                        lastPost: new Post(),
                                                        posts: new HashSet<Post>())

        then: "Fail validation"
            !testReviewSite.validate()

    }

    void "Test handle not blank"() {
        when: "Handle blank"
            ReviewSite testReviewSite = new ReviewSite( siteName: 'Yelp',
                                                        siteUrl: 'yelp.com',
                                                        handle: '',
                                                        lastActivity: new Date(),
                                                        lastPost: new Post(),
                                                        posts: new HashSet<Post>())

        then: "Fail validation"
            !testReviewSite.validate()

    }

    void "Test site URL in proper format"() {
        when:"Site URL not in proper format"
            ReviewSite testReviewSite = new ReviewSite( siteName: 'Yelp',
                                                        siteUrl: '',
                                                        handle: 'HarvardU',
                                                        lastActivity: new Date(),
                                                        lastPost: new Post(),
                                                        posts: new HashSet<Post>())
        then:"Fail validation"
            !testReviewSite.validate()
    }
}
