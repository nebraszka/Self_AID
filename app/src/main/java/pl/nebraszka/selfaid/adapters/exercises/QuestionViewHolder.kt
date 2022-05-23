package pl.nebraszka.selfaid.adapters.exercises

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import pl.nebraszka.selfaid.enums.ExerciseType

class QuestionViewHolder(parent: ViewGroup) : ExerciseViewHolderGenerator(parent) {
    lateinit var view: View

    override fun createViewHolder(): ExerciseViewHolder {
        layoutId = ExerciseType.VIEW_QUESTION.layoutId
        view = inflateLayout()

        return ExerciseViewHolder(view)
    }
}
