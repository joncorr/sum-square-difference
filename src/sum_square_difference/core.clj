(ns sum-square-difference.core
  (:gen-class))


(defn sum-of-squares [range]
  (reduce +
    (for [number range] (* number number))))

(defn square-of-the-sum [range]
   (let [sum (reduce + range)]
     (* sum sum)))

(defn difference [square-of-sum sum-of-squares]
   (- square-of-sum sum-of-squares))

(defn -main []
   (let [first-hundred (range 1 101)
         square-of-sum (square-of-the-sum first-hundred)
         sum-of-squares (sum-of-squares first-hundred)
         difference (difference square-of-sum sum-of-squares)]
         (prn "The square of the sum for the first 100 natural numbers "
              square-of-sum
              "The sum of squares for the first 100 natural numbers is "
              sum-of-squares
              "The difference is "
              difference
         )))
