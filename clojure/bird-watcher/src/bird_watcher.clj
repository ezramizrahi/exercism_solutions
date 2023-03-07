(ns bird-watcher)

(def last-week 
  [0 2 5 3 7 8 4])

(defn today [birds]
  (last birds))

(defn inc-bird [birds] 
  (assoc birds (.indexOf birds (last birds)) (+' (last birds) 1)))

(defn day-without-birds? [birds]
  (contains? (into (sorted-set) birds) 0))

(defn n-days-count [birds n]
  (reduce + 0 (take n birds)))

(defn busy-days [birds]
  (count (filter #(>= % 5) birds)))

;; (defn odd-week? [birds]
;;   (= (partition 2 (drop-last birds)) (vec (repeat 3 '(1 0)))))

(defn odd-week? [birds]
  (= birds [1 0 1 0 1 0 1]))