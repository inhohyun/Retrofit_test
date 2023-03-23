package com.example.retrofit_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main
        )

        val goToSecond = findViewById<Button>(R.id.goToSecond)
        goToSecond.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }




//        Log.d("TEST", "START")
//
//        CoroutineScope(Dispatchers.IO).launch{
//            //비동기적으로 실행할 코드(딜레이 걸리면 일단 넘어가고 바로 실행 가능하면 그때 실행됨
//        }
//
//        Log.d("TEST", "END")


//        val api = RetrofitInstance.getInstance().create(MyApi::class.java)
//        api.getPost1().enqueue(object : Callback<Post>{
//            //api 호출 성공시 할 작업
//            override fun onResponse(call: Call<Post>, response: Response<Post>) {
//                Log.d("API1", response.toString())
//                    api.getPostNumber(2).enqueue(object : Callback<Post>{
//                        //api 호출 성공시 할 작업
//                        override fun onResponse(call: Call<Post>, response: Response<Post>) {
//                            Log.d("API2", response.toString())
//                        }
//                        //api 호출 실패시 할 작업
//                        override fun onFailure(call: Call<Post>, t: Throwable) {
//                            Log.d("API2", "fail")
//
//                        }
//                    })
//            }
//            //api 호출 실패시 할 작업
//            override fun onFailure(call: Call<Post>, t: Throwable) {
//                Log.d("API1", "fail")
//
//            }
//
//        })


    }
}