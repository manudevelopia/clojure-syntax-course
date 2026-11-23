(ns course.lesson-07-pipelines-test
  (:require [clojure.test :refer [deftest is]]
            [course.lesson-07-pipelines :as sut]))

(deftest sequence-pipelines
  (is (= [4 16] (vec (sut/even-squares [1 2 3 4]))))
  (is (= 4 (sut/total-positive [-2 3 -1 1])))
  (is (= 0 (sut/total-positive [-2 -1])))
  (is (= 3 (sut/word-count "Clojure is fun")))
  (is (= 0 (sut/word-count "   ")))
  (is (= #{"clojure" "jvm"} (sut/normalize-tags [" Clojure " "JVM" "clojure" " "]))))
