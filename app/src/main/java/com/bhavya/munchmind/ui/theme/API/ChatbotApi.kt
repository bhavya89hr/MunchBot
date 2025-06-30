package com.bhavya.munchmind.ui.theme.API

import com.bhavya.munchmind.ui.theme.models.FoodResponse
import com.bhavya.munchmind.ui.theme.models.MoodRequest
import retrofit2.http.Body
import retrofit2.http.POST

interface ChatbotApi {
    @POST("recommendation/byMood")
    suspend fun getMoodBasedFood(@Body request: MoodRequest): List<FoodResponse>
}
