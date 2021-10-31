package com.gemasr.semitones.data

interface IntervalDataSource {
    suspend fun getAllIntervals(): List<Interval>
    suspend fun getInterval(name: String): Interval
}