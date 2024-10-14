package ru.vs.homify.server

import ru.vs.core.logger.api.logger
import ru.vs.core.logger.manager.LoggerManager
import ru.vs.core.logger.platform.initDefault

fun main() {
    LoggerManager.initDefault()
    val logger = logger("Main")
    logger.i("Hello homify server")
}