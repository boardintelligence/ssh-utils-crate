(ns ssh-utils-crate.ssh-utils
  "Utility functions for working with ssh."
  (:require [pallet.actions :as actions])
  (:use [pallet.crate :only [defplan]]))

(defplan add-host-to-known-hosts
  [hostname & {:keys [for-user]
               :or {for-user "root"}}]
  (let [remove-sig (format "su -l -c \"ssh-keygen -R %s\" %s" hostname for-user)
        add-sig  (format "su -l -c \"ssh-keyscan -H %s >> ~/.ssh/known_hosts\" %s" hostname for-user)]
    (actions/exec-checked-script
     "Add a host to ~/.ssh/known_hosts"
     (~remove-sig)
     (~add-sig))))
