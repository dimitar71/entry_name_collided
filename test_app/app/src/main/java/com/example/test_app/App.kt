package com.example.test_app

import android.app.Application
import com.example.core.Core
import com.example.core2.Core2
import com.example.core3.Core3
import com.example.sdk.Sdk
import kotlinx.coroutines.launch

class App : Application() {
  private lateinit var sdk: Sdk
  private lateinit var core: Core
  private lateinit var core2: Core2
  private lateinit var core3: Core3

  override fun onCreate() {
    super.onCreate()

    sdk = Sdk("Blah")
    core = Core(sdk)
    core2 = Core2(sdk, core)
    core3 = Core3()

    sdk.scope.launch { }
  }
}