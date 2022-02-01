package hu.fergetech.jwtissuer

import org.scalatra._

class JwtIssuer extends ScalatraServlet {

  get("/") {
    views.html.hello()
  }

}
