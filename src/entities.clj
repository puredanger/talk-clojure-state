(def alex
     {:first "Alex"
      :last "Miller"
      :twitter "puredanger"
      :email "alex@puredanger.com"
      :bio "I like nachos."
      :picture "alex.jpg"
      :type "Speaker"})

(defn type? [entity-type entity]
  (= (:type entity) entity-type))

(defn speaker? [entity]
  (type? "Speaker" entity))

(speaker? alex)


(def attendee
  {:type "Attendee"
   :first "Peter"
   :last "Gibbons"
   :email "peter@initech.com"})

(def sponsor
  {:type "Sponsor"
   :organization "Initech"
   :level :gold
   :email "marketing@initech.com"})

(def entities [alex attendee sponsor])
(map :email entities)


(def peter {:first "peter"
            :last "gibbons"
            :email "peter@initech.com"})

(assoc peter :twitter "tpsreports")
(get peter :first)
(:first peter)