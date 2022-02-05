package coreJ;

public final class DirectArrayOp {

    // <editor-fold defaultstate="collapsed" desc=" add/addTo ">

    /**
     * Adds values from two Java arrays and returns results as new array object.
     * Assumes that each array is non-null and has same dimensions.
     */
    int[] add(int[] data1, int[] data2) {
        synchronized (data1) {
            synchronized (data2) {
                var c = 0;
                var tempReturn = new int[data1.length];
                while (c < data2.length) {
                    //By using data2.length here, ensures (data1.length == data2.length) is necessary to run correctly
                    tempReturn[c] = data1[c] + data2[c];
                    c += 1;
                }
                return tempReturn;
            }
        }
    }

    void addTo(int[] target, int[] data1) {
        synchronized (target) {
            synchronized (data1) {
                //loggerRequire( data1.length == data2.length, "Data length unequal!" )

                var c = 0;
                while (c < data1.length) {
                    target[c] = target[c] + data1[c];
                    c += 1;
                }
            }
        }
    }

}