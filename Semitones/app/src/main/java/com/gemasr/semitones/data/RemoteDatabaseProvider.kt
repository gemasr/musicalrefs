package com.gemasr.semitones.data

import com.google.firebase.firestore.FirebaseFirestore

class RemoteDatabaseProvider(
    val firestore: FirebaseFirestore
) {

    suspend fun getAllIntervals(): List<Interval> {
        // TODO
    }

    suspend fun getInterval(name: String): Interval {
        // TODO
    }
}