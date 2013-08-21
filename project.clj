(defproject boardintelligence/ssh-utils-crate "0.1.0-SNAPSHOT"
  :description "Pallet crate with a few utility functions for ssh and ssh keys."
  :url "https://github.com/boardintelligence/ssh-utils-crate"
  :license {:name "MIT"
            :url "http://boardintelligence.mit-license.org"}

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [com.palletops/pallet "0.8.0-RC.1"]
                 [ch.qos.logback/logback-classic "1.0.7"]]

  :profiles {:dev {:plugins [[com.palletops/pallet-lein "0.8.0-alpha.1"]]}})
