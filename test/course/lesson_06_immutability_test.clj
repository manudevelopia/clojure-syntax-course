(ns course.lesson-06-immutability-test
  (:require [clojure.test :refer [deftest is]]
            [course.lesson-06-immutability :as sut]))

(deftest immutable-transformations
  (let [player {:name "Ada" :score 10}
        updated (sut/add-points player 5)]
    (is (= 15 (:score updated)))
    (is (= 10 (:score player))))
  (let [data {:user {:name "Ada"}}
        updated (sut/rename-user data "Grace")]
    (is (= "Grace" (get-in updated [:user :name])))
    (is (= "Ada" (get-in data [:user :name]))))
  (let [article {:title "Clojure" :tags #{:code :jvm}}
        updated (sut/remove-tag article :jvm)]
    (is (= #{:code} (:tags updated)))
    (is (= #{:code :jvm} (:tags article)))))
