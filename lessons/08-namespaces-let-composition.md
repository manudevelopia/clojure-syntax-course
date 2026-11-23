# Lesson 08 — Namespaces, let and composition

## Goal
Organise code and name intermediate values clearly.

A namespace is declared with `ns`:

```clojure
(ns my-app.pricing)

(def tax-rate 0.2)
```

`let` introduces lexical local bindings:

```clojure
(defn final-price [net]
  (let [tax (* net tax-rate)]
    (+ net tax)))
```

Compose functions with `comp` (right to left):

```clojure
(def normalize-name
  (comp clojure.string/lower-case clojure.string/trim))
```

## Exercises

Implement functions with clear intermediate bindings, compose simple transformations and use fully qualified core/library names where appropriate.
