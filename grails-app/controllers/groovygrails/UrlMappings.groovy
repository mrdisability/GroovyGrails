package groovygrails

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
                "/"(controller:"todo")
            }
        }

//        "/"(view:"/todo/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
