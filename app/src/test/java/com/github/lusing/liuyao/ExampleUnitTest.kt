package com.github.lusing.liuyao

import com.github.lusing.qimen.DiZhi
import org.junit.Test

import org.junit.Assert.*

class ExampleUnitTest {
    @Test
    fun testDiZhi() {
        assertEquals(0, DiZhi.getDiZhi("子"))
        assertEquals(1, DiZhi.getDiZhi("丑"))
        assertEquals(2, DiZhi.getDiZhi("寅"))
        assertEquals(3, DiZhi.getDiZhi("卯"))
        assertEquals(4, DiZhi.getDiZhi("辰"))
        assertEquals(5, DiZhi.getDiZhi("巳"))
        assertEquals(6, DiZhi.getDiZhi("午"))
        assertEquals(7, DiZhi.getDiZhi("未"))
        assertEquals(8, DiZhi.getDiZhi("申"))
        assertEquals(9, DiZhi.getDiZhi("酉"))
        assertEquals(10, DiZhi.getDiZhi("戌"))
        assertEquals(11, DiZhi.getDiZhi("亥"))
    }
}