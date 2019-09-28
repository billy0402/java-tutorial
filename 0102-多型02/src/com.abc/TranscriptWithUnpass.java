package com.abc;

public class TranscriptWithUnpass extends Transcript {
    // 建構元(1)
    public TranscriptWithUnpass(String stuNo, String stuName, int chi, int eng, int mat) {
        super(stuNo, stuName, chi, eng, mat); // 呼叫父親的建構元
    }

    // 建構元(2)
    public TranscriptWithUnpass() {
    }

    // ----------------------------------
    // 不及格統計的備註
    // ---------------------------------- 
    @Override
    public String remark() {
        int cnt = 0;

        if (chi < 60) {
            cnt++;
        }
        if (eng < 60) {
            cnt++;
        }
        if (mat < 60) {
            cnt++;
        }
        return Integer.toString(cnt);
    }
    // ----------------------------------    
}