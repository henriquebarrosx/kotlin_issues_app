package com.example.github_issues.entity

data class User(val avatar_url: String)

data class Issue(
    val user: User,
    val body: String,
    val title: String,
    val state: String,
    val html_url: String,
    val created_at: String
)