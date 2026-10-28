plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
android {
    namespace = "com.antonyhern16.codmtrainer"
    compileSdk = 35
    defaultConfig {
        applicationId = "com.antonyhern16.codmtrainer"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}
