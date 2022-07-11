package com.zww.sample

import android.app.Application
import android.widget.Toast
import io.github.devzwy.nsfw.NSFWHelper

class KtApp : Application() {
    override fun onCreate() {
        super.onCreate()

        //开启日志输出，可选
        NSFWHelper.openDebugLog()

        //扫描前必须初始化
        NSFWHelper.initHelper(
            context = this)

        //初始化api原型
        /* NSFW初始化函数 内部日志默认关闭，调试环境可使用openDebugLog()开启日志*/
//        fun initHelper(
//            context: Context, //建议传入application,传入activity可能会有内存泄漏
//            modelPath: String? = null,//模型文件路径，为空时将默认从Assets下读取
//            isOpenGPU: Boolean = true, //是否开启GPU扫描加速，部分机型兼容不友好的可关闭。默认开启
//            numThreads: Int = 4 //扫描数据时内部分配的线程 默认4
//        )
    }
}
//2022-07-08 11:00:05 add ~
//2022-07-08 11:40:04 add ~
//2022-07-08 12:00:04 add ~
//2022-07-08 12:40:06 add ~
//2022-07-08 13:00:04 add ~
//2022-07-08 13:40:04 add ~
//2022-07-08 14:00:04 add ~
//2022-07-08 14:40:04 add ~
//2022-07-08 15:00:05 add ~
//2022-07-08 15:40:05 add ~
//2022-07-08 16:00:04 add ~
//2022-07-08 16:40:05 add ~
//2022-07-08 17:00:05 add ~
//2022-07-08 17:40:05 add ~
//2022-07-08 18:00:04 add ~
//2022-07-08 18:40:05 add ~
//2022-07-08 19:00:04 add ~
//2022-07-08 19:40:05 add ~
//2022-07-08 20:00:05 add ~
//2022-07-08 20:40:05 add ~
//2022-07-08 21:00:04 add ~
//2022-07-08 21:40:05 add ~
//2022-07-08 22:00:05 add ~
//2022-07-08 22:40:05 add ~
//2022-07-08 23:00:06 add ~
//2022-07-08 23:40:06 add ~
//2022-07-09 00:00:06 add ~
//2022-07-09 00:40:06 add ~
//2022-07-09 01:00:05 add ~
//2022-07-09 01:40:04 add ~
//2022-07-09 02:00:04 add ~
//2022-07-09 02:40:04 add ~
//2022-07-09 03:00:04 add ~
//2022-07-09 03:40:04 add ~
//2022-07-09 04:00:05 add ~
//2022-07-09 04:40:04 add ~
//2022-07-09 05:00:05 add ~
//2022-07-09 05:40:04 add ~
//2022-07-09 06:00:04 add ~
//2022-07-09 06:40:05 add ~
//2022-07-09 07:00:05 add ~
//2022-07-09 07:40:04 add ~
//2022-07-09 08:00:04 add ~
//2022-07-09 08:40:05 add ~
//2022-07-09 09:00:05 add ~
//2022-07-09 09:40:04 add ~
//2022-07-09 10:00:04 add ~
//2022-07-09 10:40:04 add ~
//2022-07-09 11:00:04 add ~
//2022-07-09 11:40:04 add ~
//2022-07-09 12:00:05 add ~
//2022-07-09 12:40:04 add ~
//2022-07-09 13:00:05 add ~
//2022-07-09 13:40:04 add ~
//2022-07-09 14:00:04 add ~
//2022-07-09 14:40:04 add ~
//2022-07-09 15:00:05 add ~
//2022-07-09 15:40:05 add ~
//2022-07-09 16:00:04 add ~
//2022-07-09 16:40:05 add ~
//2022-07-09 17:00:04 add ~
//2022-07-09 17:40:04 add ~
//2022-07-09 18:00:04 add ~
//2022-07-09 18:40:04 add ~
//2022-07-09 19:00:04 add ~
//2022-07-09 19:40:05 add ~
//2022-07-09 20:00:04 add ~
//2022-07-09 20:40:05 add ~
//2022-07-09 21:00:04 add ~
//2022-07-09 21:40:04 add ~
//2022-07-09 22:00:04 add ~
//2022-07-09 22:40:05 add ~
//2022-07-09 23:00:05 add ~
//2022-07-09 23:40:07 add ~
//2022-07-10 00:00:05 add ~
//2022-07-10 00:40:05 add ~
//2022-07-10 01:00:05 add ~
//2022-07-10 01:40:04 add ~
//2022-07-10 02:00:05 add ~
//2022-07-10 02:40:04 add ~
//2022-07-10 03:00:04 add ~
//2022-07-10 03:40:04 add ~
//2022-07-10 04:00:04 add ~
//2022-07-10 04:40:04 add ~
//2022-07-10 05:00:04 add ~
//2022-07-10 05:40:05 add ~
//2022-07-10 06:00:05 add ~
//2022-07-10 06:40:04 add ~
//2022-07-10 07:00:04 add ~
//2022-07-10 07:40:05 add ~
//2022-07-10 08:00:05 add ~
//2022-07-10 08:40:04 add ~
//2022-07-10 09:00:04 add ~
//2022-07-10 09:40:05 add ~
//2022-07-10 10:00:04 add ~
//2022-07-10 10:40:04 add ~
//2022-07-10 11:00:05 add ~
//2022-07-10 11:40:05 add ~
//2022-07-10 12:00:04 add ~
//2022-07-10 12:40:04 add ~
//2022-07-10 13:00:06 add ~
//2022-07-10 13:40:05 add ~
//2022-07-10 14:00:07 add ~
//2022-07-10 14:40:04 add ~
//2022-07-10 15:00:05 add ~
//2022-07-10 15:40:06 add ~
//2022-07-10 16:00:04 add ~
//2022-07-10 16:40:04 add ~
//2022-07-10 17:00:05 add ~
//2022-07-10 17:40:04 add ~
//2022-07-10 18:00:04 add ~
//2022-07-10 18:40:04 add ~
//2022-07-10 19:00:04 add ~
//2022-07-10 19:40:04 add ~
//2022-07-10 20:00:04 add ~
//2022-07-10 20:40:04 add ~
//2022-07-10 21:00:04 add ~
//2022-07-10 21:40:05 add ~
//2022-07-10 22:00:04 add ~
//2022-07-10 22:40:04 add ~
//2022-07-10 23:00:06 add ~
//2022-07-10 23:40:05 add ~
//2022-07-11 00:00:05 add ~
//2022-07-11 00:40:04 add ~
//2022-07-11 01:00:06 add ~
//2022-07-11 01:40:04 add ~
//2022-07-11 02:00:04 add ~
//2022-07-11 02:40:04 add ~
//2022-07-11 03:00:05 add ~
//2022-07-11 03:40:04 add ~
//2022-07-11 04:00:04 add ~
//2022-07-11 04:40:04 add ~
//2022-07-11 05:00:04 add ~
//2022-07-11 05:40:05 add ~
//2022-07-11 06:00:04 add ~
//2022-07-11 06:40:04 add ~
//2022-07-11 07:00:04 add ~
//2022-07-11 07:40:05 add ~
//2022-07-11 08:00:05 add ~
//2022-07-11 08:40:04 add ~
//2022-07-11 09:00:05 add ~
//2022-07-11 09:40:04 add ~
//2022-07-11 10:00:04 add ~
//2022-07-11 10:40:04 add ~
//2022-07-11 11:00:04 add ~
//2022-07-11 11:40:04 add ~
//2022-07-11 12:00:04 add ~
//2022-07-11 12:40:04 add ~
//2022-07-11 13:00:04 add ~
//2022-07-11 13:40:05 add ~
//2022-07-11 14:00:06 add ~
//2022-07-11 14:40:05 add ~
//2022-07-11 15:00:05 add ~
//2022-07-11 15:40:05 add ~
//2022-07-11 16:00:05 add ~
//2022-07-11 16:40:05 add ~
//2022-07-11 17:00:04 add ~
//2022-07-11 17:40:46 add ~
//2022-07-11 18:00:04 add ~
//2022-07-11 18:40:05 add ~
//2022-07-11 19:00:05 add ~
//2022-07-11 19:40:05 add ~
//2022-07-11 20:00:05 add ~
//2022-07-11 20:40:05 add ~
//2022-07-11 21:00:05 add ~
//2022-07-11 21:40:05 add ~
//2022-07-11 22:00:05 add ~
//2022-07-11 22:40:06 add ~
//2022-07-11 23:00:06 add ~
//2022-07-11 23:40:06 add ~
//2022-07-12 00:00:06 add ~
//2022-07-12 00:40:05 add ~
//2022-07-12 01:00:05 add ~
//2022-07-12 01:40:04 add ~
//2022-07-12 02:00:05 add ~
//2022-07-12 02:40:04 add ~
//2022-07-12 03:00:04 add ~
//2022-07-12 03:40:05 add ~
//2022-07-12 04:00:04 add ~
//2022-07-12 04:40:05 add ~
//2022-07-12 05:00:04 add ~
//2022-07-12 05:40:05 add ~
