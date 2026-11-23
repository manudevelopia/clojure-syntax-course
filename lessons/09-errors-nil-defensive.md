# Lesson 09 — Errors, nil and defensive programming

## Goal
Handle missing values and invalid input deliberately.

`nil` represents the absence of a value. `get` can provide a default:

```clojure
(get {:name "Ada"} :role :unknown) ; => :unknown
```

Use `or` for a fallback when a value is falsey:

```clojure
(or nil "fallback") ; => "fallback"
```

Use `ex-info` to throw structured exception data:

```clojure
(throw (ex-info "Invalid quantity" {:quantity -1}))
```

Catch only exceptions you can meaningfully handle. Avoid using exceptions for ordinary branching.

## Exercises

Implement defaults, input validation and one function that throws `ex-info` for invalid input.
