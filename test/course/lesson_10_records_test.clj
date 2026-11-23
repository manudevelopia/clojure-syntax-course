(ns course.lesson-10-records-test
  (:require [clojure.test :refer [deftest is]]
            [course.lesson-10-records :as sut]))

(deftest records-and-protocols
  (let [product (sut/make-product "SKU-1" "Keyboard" 49.99)]
    (is (instance? course.lesson_10_records.Product product))
    (is (= 49.99 (sut/price product)))
    (is (= "SKU-1 - Keyboard" (sut/label product)))))
