package com.example.sdk

import kotlinx.coroutines.MainScope
import kotlinx.serialization.json.buildJsonObject

class Sdk(val name: String) {
  val json = buildJsonObject { }

  val scope = MainScope()
}