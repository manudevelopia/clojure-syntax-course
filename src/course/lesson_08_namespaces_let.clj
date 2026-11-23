(ns course.lesson-08-namespaces-let
  (:require [clojure.string :as str]))

(defn price-with-tax
  "Calculate price including tax-rate (e.g. 0.2 means 20%)."
  [price tax-rate]
  ;; TODO: use let to name the tax amount
  nil)

(defn normalize-email
  "Trim and lowercase an email address."
  [email]
  ;; TODO: use clojure.string via the str alias
  nil)

(defn describe-order
  "Return a readable description for a map with :id and :total."
  [{:keys [id total]}]
  ;; TODO: use let for any intermediate values
  nil)
