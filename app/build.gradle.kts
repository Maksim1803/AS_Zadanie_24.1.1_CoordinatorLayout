plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.zadanie2411_coordinatorlayout"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.zadanie2411_coordinatorlayout"
        minSdk = 31
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildFeatures {
        viewBinding = true // Включаем View Binding
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    implementation ("androidx.coordinatorlayout:coordinatorlayout:1.3.0")
    implementation ("androidx.recyclerview:recyclerview:1.4.0")
    implementation ("com.hannesdorfmann:adapterdelegates4-kotlin-dsl:4.3.2")
    implementation ("com.google.android.material:material:1.13.0-alpha13")
    implementation ("androidx.constraintlayout:constraintlayout:2.2.1")

}