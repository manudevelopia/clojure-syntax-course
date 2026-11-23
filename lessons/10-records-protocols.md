# Lesson 10 — Records and protocols

## Goal
Get an introductory feel for records and protocols, while keeping data-oriented design as the default.

A record is a named map-like value:

```clojure
(defrecord User [id name])
(->User 1 "Ada")
```

A protocol defines a set of operations:

```clojure
(defprotocol Describable
  (describe [this]))
```

A record can implement a protocol:

```clojure
(defrecord User [id name]
  Describable
  (describe [_] (str "User: " name)))
```

Do not reach for records and protocols automatically. Plain maps and functions are often simpler and more flexible.

## Exercises

Create a small product record, implement a protocol operation and test the behaviour.
