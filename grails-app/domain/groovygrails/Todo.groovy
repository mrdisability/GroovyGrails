package groovygrails

@SuppressWarnings('GrailsDomainReservedSqlKeywordName')
class Todo {
    String title
    Boolean completed

    static constraints = {
        title maxSize: 255
    }
}
