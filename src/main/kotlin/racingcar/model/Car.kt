package racingcar.model

import racingcar.DriveRule

/**
 * 자동차 객체
 * */
data class Car(
    var movement: Int = 0
) {
    fun move(): Car {
        return when (DriveRule().isForward()) {
            true -> forward()
            false -> stop()
        }
    }

    fun forward(): Car = copy(movement = movement + 1)
    fun stop(): Car = copy(movement = movement)
}
