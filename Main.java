/*
/usr/local/Cellar/openjdk/21.0.2/bin/javac *.java
/usr/local/Cellar/openjdk/21.0.2/bin/java Main
*/

import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) {
        System.out.println("Build Array from Permutation");

        Solution solution = new Solution();

        int[] nums1 = {1,2,3,1,1,3};
        int count1 = solution.numIdenticalPairs(nums1);
        System.out.println("Count = " + count1);

        int[] nums2 = {1,1,1,1};
        int count2 = solution.numIdenticalPairs(nums2);
        System.out.println("Count = " + count2);

    }
}


