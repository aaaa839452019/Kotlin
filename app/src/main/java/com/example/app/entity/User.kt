package com.example.app.entity

class User {

    var  username:String? = ""

    var password :String ? = ""

    var code :String ? = ""
    constructor(){

    }

    constructor(username:String?,password:String,code :String?){
        this.username= username
        this.password = password
        this.code = code

    }
}