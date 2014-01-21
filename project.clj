(defproject io.rkn/google-docs-spreadsheets "0.2.0-SNAPSHOT"
  :description "Library to interact with Google spreadsheets"
  :url "http://github.com/rkneufeld/google-docs-spreadsheets.clj"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [com.atlassian.bundles/gdata-java-client "1.41.4"]
                 [com.google.oauth-client/google-oauth-client "1.15.0-rc"]
                 [com.google.http-client/google-http-client "1.15.0-rc"]
                 [com.google.guava/guava "11.0.2"]]
  :repositories [["atlassian" "https://maven.atlassian.com/content/groups/public/"]])

