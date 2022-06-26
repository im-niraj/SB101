package question3;

import java.io.Serializable;

public class ABC implements Serializable {
    int i = 10;
    transient int j = 20;
    static int k = 120;
    transient static int l = 150;
    final int m = 180;
    transient final int n = 200;
}
