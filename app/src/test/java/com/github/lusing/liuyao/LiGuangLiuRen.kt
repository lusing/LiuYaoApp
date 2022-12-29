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
        //LiuYao.makeLiuYao(arrayOf(7, 6, 8, 8, 7, 8), DiZhi.YOU, TianGan.GENG, DiZhi.XU, LiuQin.ZISUN).paiPan()

        // 黎光六冲化六冲
        // 1. 丑月甲寅日，占孩子上学发展如何
        //LiuYao.makeLiuYao(arrayOf(6, 6, 6, 7, 7, 7), DiZhi.CHOU, TianGan.JIA, DiZhi.YIN, LiuQin.ZISUN).paiPan()

        // 2. 辰月丁酉日，占与某女是否能成婚
        //LiuYao.makeLiuYao(arrayOf(8, 8, 8, 7, 7, 7), DiZhi.CHEN, TianGan.DING, DiZhi.YOU, LiuQin.QICAI).paiPan()

        // 3. 卯月乙卯日，占签合同求财结果
        //LiuYao.makeLiuYao(arrayOf(8, 8, 7, 7, 8, 7), DiZhi.MAO, TianGan.YI, DiZhi.MAO, LiuQin.QICAI).paiPan()

        // 4. 辰月甲子日，占坟地
        //LiuYao.makeLiuYao(arrayOf(9,9,9,9,9,9), DiZhi.CHEN, TianGan.JIA, DiZhi.ZI, Yao.SHI_YAO).paiPan()

        // 5. 未月乙亥日，占求财
        //LiuYao.makeLiuYao(arrayOf(7,9,8,7,9,8), DiZhi.WEI, TianGan.YI, DiZhi.HAI, LiuQin.QICAI).paiPan()

        // 6. 午月丙子日，占开店求财
        //LiuYao.makeLiuYao(arrayOf(9,7,7,9,7,7), DiZhi.WU, TianGan.BING, DiZhi.ZI, LiuQin.QICAI).paiPan()

        // 世化用神
        // - 得：世用爻均在月日旺相有气，且又无动变爻来伤克
        // - 失：世或用爻有一个在月日休囚无气，或旬空月破，并受变动爻的克伤

        // 1. 辰月庚午日，占求官应试得失
        LiuYao.hanziLiuYao(arrayOf(8,8,8,6,7,7), "辰月庚午日", LiuQin.QICAI).paiPan()
    }
}