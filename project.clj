(defproject my-example-website "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [compojure "1.1.5"]
                 [lein-cljsbuild "0.3.0"]
                 [com.taoensso/carmine "1.6.0"]
                 [cheshire "5.0.2"]
                 [enfocus "1.0.1"]]
  :plugins [[lein-ring "0.8.2"]]
  :cljsbuild {
    :builds [{
      ; The path to the top-level ClojureScript source directory:
      :source-paths ["src-cljs"]
      ; The standard ClojureScript compiler options:
      ; (See the ClojureScript compiler documentation for details.)
      :compiler {
        :output-to "resources/js/main.js"
        :optimizations :whitespace
        :pretty-print true}}]}
  :ring {:handler my-example-website.handler/app}
  :profiles
  {:dev {:dependencies [[ring-mock "0.1.3"]]}})