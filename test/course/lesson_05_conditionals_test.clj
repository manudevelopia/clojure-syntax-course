(ns course.lesson-05-conditionals-test
  (:require [clojure.test :refer [deftest is]]
            [course.lesson-05-conditionals :as sut]))

(deftest conditionals
  (is (= :negative (sut/number-kind -1)))
  (is (= :zero (sut/number-kind 0)))
  (is (= :positive (sut/number-kind 2)))
  (is (= :not-a-number (sut/number-kind "2")))
  (is (= "Ada" (sut/display-name "Ada")))
  (is (= "Anonymous" (sut/display-name "  ")))
  (is (= "Anonymous" (sut/display-name nil)))
  (is (= :admin (sut/access-level :admin)))
  (is (= :member (sut/access-level :member)))
  (is (= :guest (sut/access-level :other)))
  (is (false? (sut/truthy-value? false)))
  (is (false? (sut/truthy-value? nil)))
  (is (true? (sut/truthy-value? [])))
  (is (true? (sut/truthy-value? 0))))
