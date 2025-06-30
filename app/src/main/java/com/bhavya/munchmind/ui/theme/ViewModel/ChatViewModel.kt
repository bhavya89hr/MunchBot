package com.bhavya.munchmind.ui.theme.ViewModel

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bhavya.munchmind.ui.theme.API.ApiClient
import com.bhavya.munchmind.ui.theme.models.FoodResponse
import com.bhavya.munchmind.ui.theme.models.MoodRequest
import kotlinx.coroutines.launch

class ChatViewModel : ViewModel() {
    var userMood by mutableStateOf("")
    var isLoading by mutableStateOf(false)
    var foodSuggestions = mutableStateListOf<FoodResponse>()
        private set

    fun sendMoodForRecommendation() {
        if (userMood.isBlank()) return

        isLoading = true
        viewModelScope.launch {
            try {
                val response = ApiClient.chatbotApi.getMoodBasedFood(
                    MoodRequest(tableId = "1", mood = userMood.trim())
                )
                foodSuggestions.clear()
                foodSuggestions.addAll(response)
            } catch (e: Exception) {
                Log.e("API_ERROR", "Failed: ${e.message}", e)
            }
            isLoading = false
        }
    }
}
