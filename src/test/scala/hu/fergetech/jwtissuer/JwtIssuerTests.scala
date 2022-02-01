package hu.fergetech.jwtissuer

import org.scalatra.test.scalatest._

class JwtIssuerTests extends ScalatraFunSuite {

  addServlet(classOf[JwtIssuer], "/*")

  test("GET / on JwtIssuer should return status 200") {
    get("/") {
      status should equal (200)
    }
  }

}
