package student

class UrlMappings {

    static mappings = {

        "/api/students/$id/courses"(controller: "studentRest", action: "courses", method: "GET")

        "/api/students/$id/gpa"(controller:"studentRest",action:"gpa",method:"GET")

        "/$controller/$action?/$id?(.$format)?"{
            constraints {
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
