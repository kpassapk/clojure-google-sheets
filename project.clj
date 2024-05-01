(defproject clojure-google-sheets "0.1.0-SNAPSHOT"
  :description "clojure google sheets api integration"
  :url "https://github.com/pvgomes/clojure-google-sheets"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [clj-time "0.12.2"]
                 [prismatic/schema "1.1.12"]
                 [com.google.api-client/google-api-client "2.0.0"]
                 [com.google.oauth-client/google-oauth-client-jetty "1.34.1"]
                 [com.google.apis/google-api-services-sheets "v4-rev20220927-2.0.0"]
                 [org.clojure/tools.cli "0.4.1"]
                 [org.clojure/data.json "1.0.0"]]
  :aliases {"lint"            ["do" ["cljfmt" "check"] ["nsorg"]]
            "lint-fix"        ["do" ["cljfmt" "fix"] ["nsorg" "--replace"]]}
  :main ^:skip-aot clojure-google-sheets.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
