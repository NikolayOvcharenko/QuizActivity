package com.example.quizactivity;

public class Question {

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    private int mTextResId;
    private boolean mAnswerTrue;

    public Question(int TextResId, boolean AnswerTrue){
        mTextResId = TextResId;
        mAnswerTrue = AnswerTrue;

    }
}
