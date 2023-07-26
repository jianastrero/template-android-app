package com.jianastrero.templateandroidapp.extension

import androidx.navigation.NavController
import com.jianastrero.templateandroidapp.enumeration.Screen
import com.jianastrero.templateandroidapp.type.Argument
import com.jianastrero.templateandroidapp.type.Parameter

fun NavController.navigate(
    screen: Screen,
    arguments: Map<Argument<*>, Any> = emptyMap(),
    parameters: Map<Parameter<*>, Any> = emptyMap()
) {
    navigate(screen.getRoute(arguments, parameters))
}
