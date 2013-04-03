(ns poly)


;;;; Multimethods

(defmulti area :type)

(defmethod area :circle [{radius :radius}]
  (* 3.14159 radius radius))

(defmethod area :square [{:keys (side)}]
  (* side side))

(area {:type :square :side 5})
(area {:type :circle :radius 5})

;;;; Protocols

(defprotocol Shape
  (area [shape]))

(defrecord Circle [radius])
(defrecord Square [side])

(extend-protocol Shape
  Circle 
  (area [{radius :radius}]
    (* 3.14159 radius radius))
  Square
  (area [{side :side}]
    (* side side)))

(area (->Square 5))
(area (->Circle 5))