(defn neighbors [[x y]]
  (for [dx [-1 0 1]
        dy (if (zero? dx) [-1 1] [-1 0 1])]
    [(+ x dx) (+ y dy)]))

(defn live [n alive?]
  (or (= n 3) 
      (and (= n 2) alive?)))

(defn step [world]
  (set 
   (for [[cell n] (frequencies (mapcat neighbors world))
         :when (live n (world cell))]
     cell)))

(defn life [initial-world]
  (iterate step initial-world))

(def blinker #{[1 0] [1 1] [1 2]})

(take 5 (life blinker))