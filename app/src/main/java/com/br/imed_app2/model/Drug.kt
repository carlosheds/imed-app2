package com.br.imed_app2.model

import java.time.LocalDateTime

class Drug (
    val id: Int = 0,
    val name : String,
    val dosage : String,
    val startTime : String,
    val frequency : String
        )
{
    val creationTimestamp : LocalDateTime

    init {
        creationTimestamp = LocalDateTime.now()
    }
}