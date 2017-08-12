(ns sum-square-difference.core-test
  (:require [clojure.test :refer :all]
            [sum-square-difference.core :refer :all]))


(deftest sum-of-squares-1through10-385
  (testing "Sum of squares for 1 through 10 numbers is 385"
    (is (= (sum-of-squares (range 1 11)) 385))))

(deftest square-of-the-sum-1through10-3025
 (testing "Square of the sum for 1 through 10 is 3025"
    (is (= (square-of-the-sum (range 1 11)) 3025))))

 (deftest difference-3025and385-2640
  (testing "3025 - 385 is 2640"
    (is (= (difference 3025 385) 2640))))

;(run-tests 'sum-square-difference.core-test)
