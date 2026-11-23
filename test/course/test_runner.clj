(ns course.test-runner
  (:require [clojure.test :as test]
            [course.lesson-01-values-test]
            [course.lesson-02-collections-test]
            [course.lesson-03-destructuring-test]
            [course.lesson-04-functions-test]
            [course.lesson-05-conditionals-test]
            [course.lesson-06-immutability-test]
            [course.lesson-07-pipelines-test]
            [course.lesson-08-namespaces-let-test]
            [course.lesson-09-errors-test]
            [course.lesson-10-records-test]))

(def test-namespaces
  '[course.lesson-01-values-test
    course.lesson-02-collections-test
    course.lesson-03-destructuring-test
    course.lesson-04-functions-test
    course.lesson-05-conditionals-test
    course.lesson-06-immutability-test
    course.lesson-07-pipelines-test
    course.lesson-08-namespaces-let-test
    course.lesson-09-errors-test
    course.lesson-10-records-test])

(defn -main [& _]
  (let [result (apply test/run-tests test-namespaces)]
    (when (pos? (+ (:fail result) (:error result)))
      (System/exit 1))))
