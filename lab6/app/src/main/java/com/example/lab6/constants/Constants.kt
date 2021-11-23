package com.example.lab6.constants

import com.example.lab6.model.Question


object Constants {

    // TODO (STEP 1: Create a constant variables which we required in the result screen.)
    // START
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    // END

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "Who is the developer of Kotlin?",
            "Oracle","JetBrains","Xilinx","Microsoft", 2
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "How to create singleton in Kotlin?",

            "Just use Object", "Just use classes",
            "Inherit from singleton", "Just use singleton class", 1
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "How can you declare a variable in Kotlin?",

            "value my_var: Char", "const my_var;",
            "string my_var;", "x = my_var;", 1
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "WCan you tell me what kinds of programming types does Kotlin support?",
            "Proc. Prog, OPPS", "OOPS",
            "Logic Prog.", "Functional Prog", 1
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "How can you handle null exceptions in Kotlin?",
            "Jackson operator", "continue",
            "break", "Elvis operator", 4
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "Can we migrate code from Java to Kotlin?",
            "Yes", "No",
            "only with an app", "none of these", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "Does Kotlin support primitive Datatypes?",

            "Yes", "No",
            "Yes but only in classes", "None of these", 2
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "Do we have a ternary operator in Kotlin just like java?",

            "Yes", "Yes but only if we import it",
            "No", "None of these", 3
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, " What Are The Modifiers That Are Available In Kotlin?",

            "Private", "Protected",
            "Public, Internal", "All of them", 4
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "Did you like my app?",

            "Absolutely", "Not at all",
            "No", "None of these", 1
        )

        questionsList.add(que10)

        return questionsList
    }

    fun findCorrectAnwer(question: Question): String {
        when (question.correctAnswer) {
            1 -> {
                return question.optionOne;
            }
            2 -> {
                return question.optionTwo;
            }
            3 -> {
                return question.optionThree;
            }
            4 -> {
                return question.optionFour;
            }
            else -> {
                return "not found";
            }
        }

    }
}