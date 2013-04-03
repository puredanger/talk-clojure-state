;; primitives 

;; numbers
42
6.3
22/7

false
true

nil  ;; only false and nil are falsey

\a
"abc"

[52 "abc"]

{1 "me", 2 "you"}

{1 [52 "abc"],
 2 "you"}

(def v [1 2 3])

v

(conj v 4)

v
(def v2 (conj v 4))

v2

v

(def s #{1 2 3})
(def s2 (conj s 4))
s2
s

'a

(+ 1 2)

:foo

(= :foo :foo)
(identical? 'foo 'foo)
(= 42 42)
(= 123412341234 123412341234)

(counted? [1 2 3])
(count [1 2 3])

(count {:a 1 :b 2})

(range 10)
(map odd? (range 10))

(source iterator-seq)
(contains? {:a 1} :a)