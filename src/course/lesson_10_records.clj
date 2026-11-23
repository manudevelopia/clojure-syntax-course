(ns course.lesson-10-records)

(defprotocol Priced
  (price [item])
  (label [item]))

(defrecord Product [sku name amount]
  Priced
  (price [_]
    ;; TODO: return amount
    nil)
  (label [_]
    ;; TODO: return a readable label containing sku and name
    nil))

(defn make-product
  "Create a Product record from sku, name and amount."
  [sku name amount]
  ;; TODO: use the generated ->Product constructor
  nil)
