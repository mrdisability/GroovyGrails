package groovygrails

import groovy.transform.CompileStatic

@CompileStatic
class BootStrap {

    TodoService todoService

    def init = { servletContext ->
        todoService.save(new Todo(title: "First Todo", completed: false))
    }

    def destroy = {
    }
}
