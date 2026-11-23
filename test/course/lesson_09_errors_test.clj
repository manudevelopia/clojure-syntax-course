(ns course.lesson-09-errors-test
  (:require [clojure.test :refer [deftest is testing]]
            [course.lesson-09-errors :as sut]))

(deftest nil-and-errors
  (is (= false (sut/value-or-default false :fallback)))
  (is (= :fallback (sut/value-or-default nil :fallback)))
  (is (= 3 (sut/require-positive-quantity 3)))
  (let [error (try
                (sut/require-positive-quantity 0)
                nil
                (catch clojure.lang.ExceptionInfo e e))]
    (is (some? error))
    (is (= {:quantity 0} (ex-data error))))
  (is (= 2 (sut/safe-divide 6 3)))
  (is (nil? (sut/safe-divide 6 0))))
