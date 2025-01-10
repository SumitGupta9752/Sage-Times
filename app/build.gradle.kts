plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
}
// razorpay repository
//repositories {
//    mavenCentral()
//flatDir{
//    dirs 'libs'
//}
//}


android {
    namespace = "com.example.sagetimes"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.sagetimes"
        minSdk = 24
        targetSdk = 34
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
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.firebase:firebase-auth:22.3.1")
    implementation("com.google.firebase:firebase-storage:20.3.0")
    implementation("com.google.firebase:firebase-firestore:24.10.2")
    implementation("androidx.activity:activity:1.8.0")
    implementation("androidx.navigation:navigation-fragment:2.6.0")
    implementation("androidx.navigation:navigation-ui:2.6.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

//firebase dependencies
    implementation(platform("com.google.firebase:firebase-bom:32.7.2"))
    implementation("com.google.firebase:firebase-analytics")

//google dependencies
    implementation("com.google.android.gms:play-services-auth:21.0.0")


//    implementation ("com.facebook.android:facebook-login:latest.release")

        //lottie dependency
    implementation ("com.airbnb.android:lottie:6.3.0")


    //razorpay dependency
//    implementation ("com.razorpay:checkout:1.6.33")

    //calculator dependency

    implementation ("com.faendir.rhino:rhino-android:1.5.2")

//    third party dep
//    implementation("com.github.Shashank02051997:FancyAboutPage-Android:2.8")
}
