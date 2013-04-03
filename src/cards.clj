(ns cards
  (:use [clojure.core]))

;; Define a record to represent a single card
(defrecord Card [suit value])
(defn ->Card [suit value]
  {:suit suit :value value})

;; Helper functions to stringify cards for concise printing
(defn p1 [{:keys (suit value)}] 
  (str (name value) "-" (name suit)))
(defn p [cards] (map p1 cards))

;; Create cards
(def suits [:heart :spade :diamond :club])
(def values (map keyword (concat (map str (range 2 11)) ["J" "Q" "K" "A"])))
(def full-deck (for [suit suits,
                value values]
            (->Card suit value)))

(p full-deck)

;; Check out the deck
(count full-deck)
(p full-deck)

;; Shuffle the deck (hey, it's built-in!)
(p (shuffle full-deck))

;; Cut the deck
(defn cut [deck]
  (concat (drop 26 deck) (take 26 deck)))

(p (cut full-deck))

;; Check we didn't lose any cards
(= (set full-deck) (set (cut (shuffle full-deck))))

;; Alternate cut based on split-at
(defn cut2 [deck]
  (apply concat (reverse (split-at 26 deck))))

(p (cut2 full-deck))