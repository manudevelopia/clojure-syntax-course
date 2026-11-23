(ns course.lesson-01-values-test
  (:require [clojure.test :refer [deftest is testing]]
            [course.lesson-01-values :as sut]))

(deftest values-and-functions
  (testing "basic arithmetic"
    (is (= 5 (sut/add-two 2 3)))
    (is (= -1 (sut/add-two 2 -3))))
  (testing "strings"
    (is (= "Ada Lovelace" (sut/full-name "Ada" "Lovelace"))))
  (testing "rectangle area"
    (is (= 12 (sut/rectangle-area 3 4))))
  (testing "equality"
    (is (true? (sut/is-same? :a :a)))
    (is (false? (sut/is-same? :a :b)))))
