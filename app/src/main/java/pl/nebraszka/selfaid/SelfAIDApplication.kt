package pl.nebraszka.selfaid

import android.app.Application
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import pl.nebraszka.selfaid.repositories.SelfAIDRepository

class SelfAIDApplication: Application() {

    val applicationScope = CoroutineScope(SupervisorJob())

    val database by lazy{ SelfAIDDatabase.getDatabase(this)}

    val repository by lazy { SelfAIDRepository(
        database.emotionDao(),
        database.exerciseDao(),
        database.answerSuggestionDao()
    )}
}