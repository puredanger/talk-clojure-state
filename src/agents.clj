(use 'clojure.core)

(def error-log (agent []))

(defn log [msg] (send-off error-log conj msg))

(log "hi")
(log "there")
@error-log

