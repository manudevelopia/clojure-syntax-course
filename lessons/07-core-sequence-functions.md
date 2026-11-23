# Lesson 07 — map, filter, reduce and threading

## Goal
Use the core functions that appear in everyday Clojure code.

```clojure
(map inc [1 2 3])                 ; => (2 3 4)
(filter even? [1 2 3 4])          ; => (2 4)
(reduce + 0 [1 2 3])              ; => 6

(-> 5
    (* 2)
    (+ 1))                         ; => 11

(->> [1 2 3 4]
     (filter even?)
     (map #(* % %)))               ; => (4 16)
```

`->` inserts the previous result as the first argument. `->>` inserts it as the last argument. Choose the one that makes the data flow easiest to read.

## Exercises

Build small pipelines: filter values, transform them, aggregate results and use threading macros.
