(ns course.lesson-04-functions-test
  (:require [clojure.test :refer [deftest is]]
            [course.lesson-04-functions :as sut]))

(deftest functions
  (is (= "Hello, Ada!" (sut/welcome "Ada")))
  (is (= "Hello, Ada! Your role is engineer." (sut/welcome "Ada" "engineer")))
  (is (= 10 (sut/sum-all 1 2 3 4)))
  (is (= 0 (sut/sum-all)))
  (is (= 9 (sut/apply-to #(* % 3) 3)))
  (is (= [2 4 6] (vec (sut/double-all [1 2 3])))))
