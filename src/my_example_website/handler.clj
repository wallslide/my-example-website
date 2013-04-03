(ns my-example-website.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [ring.util.response :as resp]
            [my-example-website.common :as common]))

(defroutes app-routes
  (GET "/" [] (resp/resource-response "index.html" {:root "public"}))
  (POST "/uploadfile" [jsonfile] (common/handle-json-file jsonfile))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
