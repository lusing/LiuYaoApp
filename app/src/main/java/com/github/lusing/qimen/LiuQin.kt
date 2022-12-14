package com.github.lusing.qimen

import com.github.lusing.liuyao.Yao


open class LiuQin constructor(lq: Int) {
    var liuqin = Yao.SHI_YAO

    init {
        this.liuqin = lq
    }

    fun getName(): String {
        when (this.liuqin) {
            FUMU -> return "父母"

            ZISUN -> return "子孙"

            GUANGUI -> return "官鬼"

            QICAI -> return "妻财"

            XIONGDI -> return "兄弟"

            Yao.SHI_YAO -> return "世爻"

            Yao.YING_YAO -> return "应爻"
        }
        return ""
    }

    override fun equals(other: Any?): Boolean {
        return if (other!! is LiuQin) {
            this.liuqin == (other as LiuQin).liuqin
        } else {
            false
        }
    }

    companion object {
        const val XIONGDI = 0
        const val FUMU = 1
        const val ZISUN = 2
        const val GUANGUI = 3
        const val QICAI = 4

    }
}