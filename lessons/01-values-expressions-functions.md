# Lesson 01 — Values, expressions and functions

## Goal
Recognise Clojure values, evaluate expressions and define simple functions.

## The essentials

Clojure code is made of forms. A list whose first item is a function is usually a function call:

```clojure
(+ 2 3)          ; => 5
(str "clo" "jure") ; => "clojure"
(= 10 10)        ; => true
```

Unlike many languages, Clojure uses prefix notation: `(function argument-1 argument-2)`.

Define a function with `defn`:

```clojure
(defn square [n]
  (* n n))
```

The vector `[n]` is the parameter list. The last expression in the function body is its return value.

## Exercises

Implement the functions in `lesson_01_values.clj`:
1. `add-two` — add two numbers.
2. `full-name` — join first and last name with one space.
3. `rectangle-area` — calculate width multiplied by height.
4. `is-same?` — return whether two values are equal.

Run the tests and experiment in the REPL. Notice that functions return values; they do not need an explicit `return`.
