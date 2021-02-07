package jmkmovielink

import kotlin.test.Test

internal class LocalFilesTest {

    @Test fun testList() {
        val target = LocalFiles()
        target.list("""W:\movie_temp\encoded\アニメ／特撮""")
    }
}