(ns dota-api.test
  (:use [clojure.test])
  (:require [dota-api.core :as api]
            [environ.core :refer [env]]))

(def api-key (env :steam-api-key))

(deftest get-heroes-test
  (let [hero-list (api/get-heroes :token api-key)]
    ))

(deftest get-match-history-test
  (is false "TODO: Impl get-match-history test"))

(deftest get-match-details-test
  (is false "TODO: Impl get-match-details test"))
