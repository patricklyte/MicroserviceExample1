package ch.meng.jobeffects;

import org.junit.jupiter.api.Test;

class MyRecordTests {

    @Test
    void accessRecordTest() {
        MyRecord test = new MyRecord(1, "HI");
        test = new MyRecord(test.id(), test.name());
    }


}
