package com.abc;

public class TranscriptWithGrade extends Transcript {
    // 建構元(1)
    public TranscriptWithGrade(String stuNo, String stuName, int chi, int eng, int mat) {
        super(stuNo, stuName, chi, eng, mat); // 呼叫父親的建構元
    }

    // 建構元(2)
    public TranscriptWithGrade() {
    }

    // ----------------------------------
    // 等第的備註
    // ---------------------------------- 
    @Override
    public String remark() {
        int totalScore = chi + eng + mat;

        if (totalScore >= 270) {
            return "A";
        } else if (totalScore < 270 && totalScore >= 240) {
            return "B";
        } else if (totalScore < 240 && totalScore >= 210) {
            return "C";
        } else if (totalScore < 210 && totalScore >= 180) {
            return "D";
        } else if (totalScore < 180) {
            return "E";
        } else {
            return "";
        }
    }
    // ----------------------------------      
}