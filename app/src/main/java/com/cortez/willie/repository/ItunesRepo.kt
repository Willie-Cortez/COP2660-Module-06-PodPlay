package com.cortez.willie.repository

import com.cortez.willie.service.ItunesService

class ItunesRepo(private val itunesService: ItunesService) {

    fun searchByTerm(term: String) = itunesService.searchPodcastByTerm(term)

}




