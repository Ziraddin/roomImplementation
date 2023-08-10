package com.example.roomimplementation.ViewModel

import android.content.Context
import android.provider.ContactsContract.CommonDataKinds.Note
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(var context: Context) : ViewModel() {
    var notes = MutableLiveData<Note>()


    fun insertNote() {
        CoroutineScope(Dispatchers.IO).launch {

        }
    }

    fun getNotes() {
        CoroutineScope(Dispatchers.IO).launch {

        }
    }

}