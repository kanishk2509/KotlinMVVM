package com.kappstudio.apps.mvvm_sample.Model

/**
 * Created by kanishk on 1/6/17.
 */
class Post constructor(val title : String, val description : String, val postedby : String) {

    var postTitle : String
    get() { return postTitle }
    set(value) { postTitle = title }

    var postDescription : String
    get() { return postDescription }
    set(value) { postDescription = description }

    var postMadeBy : String
    get() { return postMadeBy }
    set(value) { postMadeBy = postedby }

}