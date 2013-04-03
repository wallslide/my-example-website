(ns my-example-website.common
  (:use compojure.core)
  (:require [cheshire.core :as json]))

(defn handle-json-file
  [fileinfo]
  (let [songs (json/decode
               (slurp (fileinfo :tempfile)) true)]
    "Response."))