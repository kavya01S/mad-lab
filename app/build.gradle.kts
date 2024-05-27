plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.googleGmsGoogleServices)

}

android {
    namespace = "com.example.login"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.login"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    implementation ("com.android.tools.build:gradle:7.3.0")
    implementation("com.google.gms:google-services:4.3.14")

    // Firebase SDKs
    implementation ("com.google.firebase:firebase-analytics:21.3.0") // Use the latest version
    implementation ("com.google.firebase:firebase-auth:22.1.0") // Use the latest version

    // Testing dependencies
    testImplementation ("junit:junit:4.13.2") // Use the latest version
    androidTestImplementation ("androidx.test.ext:junit:1.1.5") // Use the latest version
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.1") // Use the latest version
    implementation("com.google.firebase:firebase-firestore-ktx:24.2.2")

}