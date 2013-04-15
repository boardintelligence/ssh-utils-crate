(defproject boardintelligence/ssh-utils-crate "0.1.0-SNAPSHOT"
  :description "Pallet crate with a few utility functions for ssh and ssh keys."
  :url "https://github.com/boardintelligence/ssh-utils-crate"
  :license {:name "MIT"
            :url "http://boardintelligence.mit-license.org"}

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [com.palletops/pallet "0.8.0-beta.5"]
                 [ch.qos.logback/logback-classic "1.0.7"]]

  :dev-dependencies [[com.palletops/pallet "0.8.0-beta.5" :type "test-jar"]
                     [com.palletops/pallet-lein "0.6.0-beta.7"]]

  :profiles {:dev
             {:dependencies [[com.palletops/pallet "0.8.0-beta.5" :classifier "tests"]]
              :plugins [[com.palletops/pallet-lein "0.6.0-beta.7"]]}})
