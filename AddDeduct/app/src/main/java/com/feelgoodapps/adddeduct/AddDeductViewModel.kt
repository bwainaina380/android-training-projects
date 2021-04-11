package com.feelgoodapps.adddeduct

import android.util.Log
import androidx.lifecycle.ViewModel

class AddDeductViewModel : ViewModel() {
    init {
        Log.i("AddDeductViewModel", "AddDeductViewModel Created")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("AddDeductViewModel", "AddDeductViewModel Destroyed")
    }
}