package com.cortez.willie.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.cortez.willie.R
import com.cortez.willie.repository.ItunesRepo
import com.cortez.willie.service.ItunesService

class PodcastActivity : AppCompatActivity() {

    private val TAG = javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_podcast)

        val itunesService = ItunesService.instance

        val itunesRepo = ItunesRepo(itunesService)

        itunesRepo.searchByTerm("Android Developer") {
            Log.i(TAG, "Results = $it")
        }
    }
}