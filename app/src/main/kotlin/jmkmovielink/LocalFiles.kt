package jmkmovielink

import java.io.File

class LocalFiles {
    companion object : Logging {
        private val logger = logger()
    }

    fun list(root: String) {
        val targetName = Regex("""\[(.*)]-(.*)-([0-9]{4}年[0-9]{2}月[0-9]{2}日[0-9]{2}時[0-9]{2}分)(-.*)?\.(.*)""")
        val groupingMap = File(root).list()
            .map { file -> targetName.find(file) }
            .filter { match -> match != null }
            .groupingBy { match ->
                logger.debug("%s".format(match))
                match!!.groupValues[1]
            }

        println(groupingMap)
    }
}