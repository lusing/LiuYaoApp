package com.github.lusing.liuyao

import com.github.lusing.liuyao.LiuYao
import com.github.lusing.qimen.DiZhi
import com.github.lusing.qimen.LiuQin
import com.github.lusing.qimen.TianGan
import org.junit.Test

class LiGuangLiuRen {
    @Test
    fun test() {
        // 黎光六冲化六合
        // 酉月庚戌日，占何年能生儿子
        LiuYao.makeLiuYao(arrayOf(7, 6, 8, 8, 7, 8), DiZhi.YOU, TianGan.GENG, DiZhi.XU, LiuQin.ZISUN).paiPan()

        // 黎光六冲化六冲
    }
}