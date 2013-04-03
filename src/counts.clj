(use 'clojure.java.io)

(defn line-count [file]
  (count (line-seq (reader file))))

(line-count "/Users/alex/.bash_profile")

(defn file? [file]
  (.isFile file))

(file? (file "/Users/alex"))

(defn file-counts [dir]
  (map line-count
       (filter file? 
               (file-seq (file dir)))))

(file-counts  "/Users/alex/.emacs.d")

;;(reduce + (file-counts  "/Users/alex/personal/presentations/1304EnemyOfTheState/demos"))

(defn file-counts2 [dir]
  (->> dir
       file
       file-seq
       (filter file?)
       (map line-count)))

(file-counts2  "/Users/alex/.emacs.d")
