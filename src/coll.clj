(ns coll
  (:use [clojure.core]))

;;;; Vectors

;; Create new vector
(def v [1 2])

;; Add item with conj
(conj v 3)

;; Check original vector
v

;;;; Maps 

;; Create favorite fruit - name, kinds
(def apple {:name "apple" :kinds ["Fuji", "Golden Delicious"]})

;; Add shape
(assoc apple :shape "round")

;; Check original fruit
apple

;; Keys, vals
(keys apple)
(vals apple)

;; Retrieving values
(get apple :name)
(:name apple)

;; Check key with contains?
(contains? apple :kinds)

