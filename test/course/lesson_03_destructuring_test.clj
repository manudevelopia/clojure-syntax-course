(ns course.lesson-03-destructuring-test
  (:require [clojure.test :refer [deftest is]]
            [course.lesson-03-destructuring :as sut]))

(deftest destructuring-and-sequences
  (is (= {:first 1 :last 3} (sut/first-and-last [1 2 3])))
  (is (= {:first nil :last nil} (sut/first-and-last [])))
  (is (= "Ada (36)" (sut/user-summary {:name "Ada" :age 36})))
  (is (= 3 (sut/sum-first-two [1 2 3])))
  (is (= 7 (sut/sum-first-two [7]))))
