package kr.ac.kumoh.s2025111356.w26w10_controller.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SongController {
    @GetMapping("/songs")
    fun getSongs(): String {
        return "Cosmic Echo"
    }
}