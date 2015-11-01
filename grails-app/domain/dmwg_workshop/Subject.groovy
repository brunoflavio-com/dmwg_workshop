package dmwg_workshop

class Subject {
    String name
    
    static hasMany=[posts: Post]
    
    static constraints = {
        name blank: false, unique: true
    }
}
