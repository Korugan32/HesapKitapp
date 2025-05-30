package com.korugan.expansetrackerapp.presentation.screens.stock_details

import com.korugan.expansetrackerapp.data.remote.stock.recommendation.dto.StockSymbolRecommendationDto

data class StockRecommendationState(
    val isLoading: Boolean = false,
    val stockRecommendation: StockSymbolRecommendationDto? = null,
    val error: String = ""
)
