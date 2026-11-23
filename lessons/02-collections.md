# Lesson 02 — Collections

## Goal
Create, inspect and access Clojure's four fundamental collection types.

```clojure
[10 20 30]                 ; vector: ordered, indexed
'(10 20 30)                ; list: ordered sequence
{:name "Ada" :age 36}      ; map: key/value associations
#{:clojure :java}          ; set: unique values
```

Common operations:

```clojure
(first [10 20 30])         ; => 10
(count [10 20 30])         ; => 3
(get {:a 1} :a)            ; => 1
(contains? #{:a :b} :a)    ; => true
(conj [1 2] 3)             ; => [1 2 3]
(assoc {:a 1} :b 2)        ; => {:a 1 :b 2}
```

`conj` adds an item according to the collection's natural insertion end. For vectors it appends; for lists it prepends.

## Exercises

Implement vector creation/access, map updates, set membership and duplicate removal in `lesson_02_collections.clj`.
