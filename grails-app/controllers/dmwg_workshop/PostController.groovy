package dmwg_workshop

class PostController {
    static scaffold = Post
    
    def numberOfPosts() {
        render template:'numberOfPosts', model:[postCount: Post.count()]
    }
}
