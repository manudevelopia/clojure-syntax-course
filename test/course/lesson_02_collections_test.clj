(ns course.lesson-02-collections-test
  (:require [clojure.test :refer [deftest is testing]]
            [course.lesson-02-collections :as sut]))

(deftest collections
  (testing "vectors"
    (is (= [10 20 30] (sut/make-scoreboard [10 20 30])))
    (is (= 20 (sut/score-at [10 20 30] 1)))
    (is (nil? (sut/score-at [10] 4))))
  (testing "maps and sets"
    (is (= {:name "Ada" :email "ada@example.com"}
           (sut/set-user-email {:name "Ada"} "ada@example.com")))
    (is (true? (sut/has-role? #{:admin :editor} :admin)))
    (is (false? (sut/has-role? #{:admin} :guest)))
    (is (= #{1 2 3} (sut/unique-items [1 2 2 3 3])))))
