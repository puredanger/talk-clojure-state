(use 'clojure.core)

;;;; simple

(def r1 (ref [:o]))
(def r2 (ref []))

(defn yoyo []
  (dosync 
   (let [v1 @r1
         v2 @r2]
     (ref-set r1 v2)
     (ref-set r2 v1))
   [@r1 @r2]))

(yoyo)


;;;; entity example

(def talks (ref []))
(def speakers (ref []))

(def speaker {:id 1 :first "Rich" :last "Hickey"})
(def talk {:title "Design, Composition and Performance"
           :speaker 1})

(dosync 
 (alter speakers conj speaker)
 (alter talks conj talk))

@talks
@speakers

;;;; alternate
(def the-conference (ref {:talks [] :speakers []}))

(defn add-talk [conference talk speaker]
  (assoc conference 
         :talks (conj talks talk)
         :speakers (conj speakers speaker)))

(dosync 
 (alter the-conference add-talk talk speaker))


