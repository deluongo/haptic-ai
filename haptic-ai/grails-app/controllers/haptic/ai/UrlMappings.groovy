package haptic.ai

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(redirect: "/dashboard")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
