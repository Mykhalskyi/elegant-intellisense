package com.github.mykhalskyi.elegantintellisense.services

import com.intellij.openapi.project.Project
import com.github.mykhalskyi.elegantintellisense.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
