# Lesson 04 — Functions

## Goal
Work with multiple arities, optional numbers of arguments, anonymous functions and functions as values.

```clojure
(defn describe
  ([name] (describe name "unknown"))
  ([name role] (str name " is a " role)))

(defn total [& numbers]
  (reduce + 0 numbers))

(map (fn [n] (* n 2)) [1 2 3])
(map #(* % 2) [1 2 3]) ; shorthand anonymous function
```

`&` collects remaining arguments into a sequence. Functions can be passed to and returned from other functions.

## Exercises

Implement a function with multiple arities, a variadic sum, an anonymous-function-based transformation and a function that accepts another function.
