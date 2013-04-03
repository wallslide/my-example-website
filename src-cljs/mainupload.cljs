(ns mainupload
  (:require-macros [enfocus.macros :as em])
  (:require [enfocus.core :as ef]))

(em/defaction
 update-sad-text
 []
 ["#inputtext"]
 (em/content 
  "Yay! I'm happy!"))

(em/defaction
 make-happy-face 
 []
 ["#inputrow"]
 (em/html-content 
  "<img src='/images/smiley_3357_or.png' width='100px' height='100px'></img>"))

(defn start []
  (em/at js/document
         [".uploadbutton"] 
         (em/listen :click 
                    #(do
                       (make-happy-face)
                       (update-sad-text)))))

(set! (.-onload js/window) start)