package com.borshevskiy.mvvp_practice.utils

import com.borshevskiy.mvvp_practice.MainActivity
import com.borshevskiy.mvvp_practice.database.DatabaseRepo

lateinit var ACTIVITY_APP:MainActivity
lateinit var REPOSITORY: DatabaseRepo
const val TYPE_DATABASE = "type_database"
const val TYPE_ROOM = "type_room"