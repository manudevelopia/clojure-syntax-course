(ns course.lesson-09-errors)

(defn value-or-default
  "Return value unless it is nil; otherwise return default. false is a valid value."
  [value default]
  ;; TODO: do not use `or` here: false must be preserved
  nil)

(defn require-positive-quantity
  "Return quantity when positive; otherwise throw ex-info with :quantity in ex-data."
  [quantity]
  ;; TODO: implement
  nil)

(defn safe-divide
  "Divide numerator by denominator. Return nil when denominator is zero."
  [numerator denominator]
  ;; TODO: implement
  nil)
