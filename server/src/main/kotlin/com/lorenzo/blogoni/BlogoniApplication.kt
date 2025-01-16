package com.lorenzo.blogoni

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BlogoniApplication

fun main(args: Array<String>) {
	runApplication<BlogoniApplication>(*args)
}
