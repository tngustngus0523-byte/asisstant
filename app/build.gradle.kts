plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.myai.assistant"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.myai.assistant"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    // Picovoice 호출어 감지 엔진
    implementation("ai.picovoice:porcupine-android:3.0.1")
    // 통신용 OkHttp (Gemini API 연결)
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
}

