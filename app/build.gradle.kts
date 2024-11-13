plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("kotlin-kapt")
    id("androidx.navigation.safeargs.kotlin") version "2.8.4"
    id("com.google.devtools.ksp") version "2.0.20-1.0.24"
    kotlin("kapt")
}

android {
    namespace = "com.example.newsrepository"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.newsrepository"
        minSdk = 30
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    buildFeatures {
        viewBinding = true
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

    implementation (libs.androidx.lifecycle.livedata.ktx )
    implementation( libs.androidx.lifecycle.viewmodel.ktx )
    implementation (libs.androidx.room.runtime)
    implementation (libs.androidx.room.ktx)
    ksp (libs.androidx.room.compiler )
    implementation (libs.retrofit )
    implementation (libs.converter.gson)

    implementation (libs.okhttp)
    implementation (libs.logging.interceptor)
    implementation (libs.picasso)

    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)
    implementation(libs.androidx.hilt.navigation.compose)
    ksp(libs.androidx.hilt.compiler)

    implementation (libs.androidx.navigation.fragment.ktx)
    implementation (libs.androidx.navigation.ui.ktx)
    implementation (libs.androidx.navigation.dynamic.features.fragment)

    implementation(libs.glide)
    ksp(libs.compiler)
}