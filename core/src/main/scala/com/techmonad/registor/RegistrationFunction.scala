package com.techmonad.registor


object RegistrationFunction {

  def registor(classURL: String): AnyRef = {
    Class.forName(classURL).newInstance().asInstanceOf[AnyRef]
  }


}
