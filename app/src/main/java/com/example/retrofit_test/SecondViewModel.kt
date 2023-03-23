package com.example.retrofit_test

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SecondViewModel : ViewModel(){

    fun a(){
        CoroutineScope(Dispatchers.IO).launch {

            //1번 돌아갈때마다 1초씩 쉬면서 로그를 찍는 코드드
           for(i in 0..10){
                delay(1000)
                Log.d("SecondViewModel A:", i.toString())
            }
        }
    }

    fun b(){
        viewModelScope.launch {
            for(i in 0..10){
                delay(1000)
                Log.d("SecondViewModel B:", i.toString())
            }
        }
    }

}