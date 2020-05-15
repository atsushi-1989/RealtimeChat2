package jp.tominaga.atsushi.realtimechat2

import android.content.Context
import android.widget.Toast

fun makeToast(content: Context, message: String){
    Toast.makeText(content,message,Toast.LENGTH_SHORT).show()
}