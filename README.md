# Clojure Syntax Course

A practical, exercise-driven introduction to Clojure syntax and core language concepts.

The course is designed for:
- Clojure beginners (no prior Clojure experience required)
- IntelliJ IDEA with the Cursive plugin
- Clojure CLI and `deps.edn`
- Automated feedback with `clojure.test`

## Learning workflow

Each lesson has:
- `src/course/lesson_NN_*.clj`: functions for you to implement
- `test/course/lesson_NN_*_test.clj`: executable tests describing the expected behaviour
- `lessons/NN-*.md`: concise explanations, examples and exercise instructions

Work through the lessons in order:

1. Values, expressions and functions
2. Collections: vectors, lists, maps and sets
3. Destructuring and sequences
4. Functions: arity, variadic functions, higher-order functions
5. Predicates, conditionals and truthiness
6. Immutability and transformations
7. `map`, `filter`, `reduce` and threading macros
8. Namespaces, `let`, local bindings and composing functions
9. Exceptions, `nil` and defensive programming
10. Records, protocols and a small domain model

The first nine lessons focus on everyday Clojure. The final lesson introduces records and protocols without turning the course into an object-oriented design exercise.

## Requirements

Install:
- Java 17 or newer
- Clojure CLI (the `clj` / `clojure` command)
- IntelliJ IDEA
- Cursive plugin for IntelliJ IDEA

No third-party Clojure libraries are required.

## Open in IntelliJ IDEA

1. Extract this repository.
2. Open the project directory in IntelliJ IDEA.
3. Install/enable **Cursive** if it is not already installed.
4. Import the project as a Clojure project using the existing `deps.edn`.
5. Wait for the Clojure dependencies/project model to be loaded.

You can evaluate forms from a `.clj` file in a REPL, or run the test namespace from the IDE.

## Run the tests

From the project root:

```bash
clojure -M:test
```

Run a single lesson's tests:

```bash
clojure -M -e "(require 'course.lesson-01-values-test) (clojure.test/run-tests 'course.lesson-01-values-test)"
```

The tests are expected to fail initially: the exercise functions contain `TODO` placeholders. Implement the functions until the relevant tests pass.

## Recommended routine

For each lesson:

1. Read the lesson's Markdown file.
2. Open its source namespace and inspect the function docstrings.
3. Try the exercise without looking up a complete solution.
4. Run that lesson's tests.
5. When all tests pass, run the full test suite.
6. Use the REPL to experiment with variations.

Do not move the tests to make them pass. The tests are the specification for each exercise.

## Clojure syntax reminders

```clojure
;; A value and a function call
42
(+ 1 2)

;; Define a function
(defn greet [name]
  (str "Hello, " name))

;; A vector, map and set
[1 2 3]
{:name "Ada" :active true}
#{:clojure :java}

;; A sequence transformation
(map inc [1 2 3])

;; Local bindings
(let [price 10
      quantity 3]
  (* price quantity))
```

Clojure uses prefix notation: the operator/function comes first, followed by its arguments.

## Progress tracker

- [ ] 01 — Values, expressions and functions
- [ ] 02 — Collections
- [ ] 03 — Destructuring and sequences
- [ ] 04 — Function definitions and composition
- [ ] 05 — Predicates, conditionals and truthiness
- [ ] 06 — Immutability and transformations
- [ ] 07 — Core sequence functions
- [ ] 08 — Namespaces and local bindings
- [ ] 09 — Errors, nil and defensive programming
- [ ] 10 — Records and protocols

## Course philosophy

Prefer simple functions, immutable data and Clojure's core abstractions. Reach for records or protocols only when they solve a real problem. The purpose is to become comfortable reading and writing idiomatic Clojure.
