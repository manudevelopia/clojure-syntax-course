# Lesson 05 — Predicates, conditionals and truthiness

## Goal
Make decisions using predicates and Clojure's conditional forms.

```clojure
(if (pos? 3)
  :positive
  :not-positive)

(when (string? "hello")
  :text)

(cond
  (neg? -2) :negative
  (zero? 0) :zero
  :else :positive)
```

Only `nil` and `false` are falsey in Clojure. Empty vectors, empty maps, zero and empty strings are truthy.

Predicate function names often end in `?`, for example `empty?`, `nil?`, `string?` and `even?`.

## Exercises

Implement classification, validation and conditional defaults. Pay particular attention to `nil`, `false` and empty collections.
