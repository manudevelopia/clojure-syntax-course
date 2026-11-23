# Lesson 03 — Destructuring and sequences

## Goal
Extract values from collections and understand sequence operations.

Destructuring binds parts of a collection to local names:

```clojure
(let [[first-name second-name] ["Ada" "Lovelace"]]
  first-name) ; => "Ada"

(let [{:keys [name age]} {:name "Ada" :age 36}]
  (str name " is " age)) ; => "Ada is 36"
```

Sequence functions:

```clojure
(first [1 2 3]) ; => 1
(rest [1 2 3])  ; => (2 3)
(nth [1 2 3] 1) ; => 2
```

A sequence is an abstraction for sequential access. Vectors, lists and many other collections can be used as sequences.

## Exercises

Implement the functions in `lesson_03_destructuring.clj`, including safe handling of empty collections where specified.
