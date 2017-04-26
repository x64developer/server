/**
 * This is demo project how to compile kotlin code to js and run it on node.
 * We use express minimalistic web framework
 * Created by sauliuxx on 4/23/2017.
 */

external fun require(module: String):dynamic

/**
 * Entry point
 */
fun main(args: Array<String>){
    println("Starting server.")

    //Fast, minimalist web framework for node. More info https://www.npmjs.com/package/express
    val express = require("express")
    val app = express()

    app.get("/status", {req, res ->
        res.type("text/plain")
        res.send("sever is up!")
    })

    val port = 8998
    app.listen(port, {
        println("Listening on port: " + port)
    })
}