(use 'clojure.core)


(def counter (atom 0))
(defn id [] (swap! counter inc))
(id)
(id)
(id)



