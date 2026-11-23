(ns course.lesson-08-namespaces-let-test
  (:require [clojure.test :refer [deftest is]]
            [course.lesson-08-namespaces-let :as sut]))

(deftest local-bindings-and-namespaces
  (is (= 120.0 (double (sut/price-with-tax 100 0.2))))
  (is (= "ada@example.com" (sut/normalize-email " ADA@EXAMPLE.COM ")))
  (is (= "Order #42: 19.5" (sut/describe-order {:id 42 :total 19.5}))))
