package com.laf.lafh.utils

import android.util.Log
import com.laf.lafh.BuildConfig

class LafStdLog {
    companion object {
        private val isDebug = BuildConfig.DEBUG

        fun debug(base: String, vararg args: Any) {
            if (!isDebug) { return }
            Log.d("<LAFH>", base.format(*args))
        }

        fun debugFuncCalled(context: Any, func: String) {
            debug("%s<%s> :: %s", context.javaClass.simpleName, System.identityHashCode(context), func)
        }
    }
}