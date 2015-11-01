package dmwg_workshop

class Post {
    String content
    
    static belongsTo = [subject: Subject]
    
    static constraints = {
    }
}
