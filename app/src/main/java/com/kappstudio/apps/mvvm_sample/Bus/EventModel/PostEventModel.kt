package com.kappstudio.apps.mvvm_sample.Bus.EventModel

import com.kappstudio.apps.mvvm_sample.Model.Post

/**
 * Created by kanishk on 1/6/17.
 */

class PostEventModel constructor(val postList: ArrayList<Post>) {

    var list : ArrayList<Post>
    get() { return list }
    set(value) { list = postList }


}
