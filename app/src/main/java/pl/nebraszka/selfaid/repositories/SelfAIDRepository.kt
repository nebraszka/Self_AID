package pl.nebraszka.selfaid.repositories

import androidx.annotation.WorkerThread
import kotlinx.coroutines.flow.Flow
import pl.nebraszka.selfaid.dao.*
import pl.nebraszka.selfaid.entities.*

class SelfAIDRepository(
    private val emotionDao: EmotionDao,
    private val ejExerciseDao: EJExerciseDao,
    private val answerSuggestionDao: AnswerSuggestionDao
    )
{
    val allEmotions: Flow<List<Emotion>> = emotionDao.getAlphabetizedEmotions()
    val allExercises: Flow<List<EJExercise>> = ejExerciseDao.getExercises()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    fun getEmotion(name: String) : Flow<Emotion>{
        return emotionDao.getEmotion(name)
    }

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    fun getAnswerSuggestions(questionId: Int) : Flow<List<AnswerSuggestion>>{
        return answerSuggestionDao.getAllAnswerSuggestions(questionId)
    }

}