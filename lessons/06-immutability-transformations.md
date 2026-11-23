# Lesson 06 — Immutability and transformations

## Goal
Update data without mutating existing values.

Clojure collections are immutable. Functions such as `assoc`, `dissoc`, `update`, `conj` and `disj` return new values.

```clojure
(def original {:score 10})
(def updated (update original :score + 5))
;; original is still {:score 10}
;; updated is {:score 15}
```

Nested data can be changed with `update-in` and `assoc-in`:

```clojure
(assoc-in {:user {:name "Ada"}} [:user :name] "Grace")
```

## Exercises

Transform maps and nested data. Tests verify that the original input remains unchanged.
