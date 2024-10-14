plugins {
    id("ru.vs.convention.kotlin.all")
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(vsComponents.core.logger.api)
            implementation(vsComponents.core.logger.manager)
            implementation(vsComponents.core.logger.platform)
        }
    }
}